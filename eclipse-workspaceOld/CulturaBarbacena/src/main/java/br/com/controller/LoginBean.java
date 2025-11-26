package br.com.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.dao.UsuarioDAO;
import br.com.model.Usuario;
import br.com.util.EncryptUtil;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario = new Usuario();
	
	public String efetuarLogin() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		String senha = EncryptUtil.sha256(this.usuario.getSenha());
		this.usuario.setSenha(senha);
		
		if(usuarioDAO.existe(usuario)) {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
			.put("usuarioLogado", this.usuario);
			
			return "index?faces-redirect=true";
		} else {
            this.usuario = new Usuario();
            
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login ou Senha inválidos", "Erro"));
            
            return null;
		}
	}

	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "login?faces-redirect=true";
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
