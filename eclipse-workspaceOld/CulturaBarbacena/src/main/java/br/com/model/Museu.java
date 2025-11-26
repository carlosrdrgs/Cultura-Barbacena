package br.com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Museu {
	@Id
	@SequenceGenerator(name = "museu_gen", sequenceName = "museu_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "museu_gen")
	private Long id;
	private String nome;
	@OneToMany(mappedBy = "museu")
	private List<Agendamento> agedamentos;
	
	public List<Agendamento> getAgedamentos() {
		return agedamentos;
	}
	public void setAgedamentos(List<Agendamento> agedamentos) {
		this.agedamentos = agedamentos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
