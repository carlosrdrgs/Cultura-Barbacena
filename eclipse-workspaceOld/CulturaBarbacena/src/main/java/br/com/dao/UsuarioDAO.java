package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.model.Usuario;

public class UsuarioDAO {
	public boolean existe(Usuario usuario) {
		EntityManager entityManager = new JPAUtil().getEntityManager();
		
		try {
			
			String jpql = "select u from Usuario u where u.login = :pLogin and u.senha = :pSenha";
			
			TypedQuery<Usuario> query = entityManager.createQuery(jpql, Usuario.class);
			
			query.setParameter("pLogin", usuario.getLogin());
			query.setParameter("pSenha", usuario.getSenha());
			
			query.getSingleResult();
			
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			entityManager.close();
		}
	}
}
