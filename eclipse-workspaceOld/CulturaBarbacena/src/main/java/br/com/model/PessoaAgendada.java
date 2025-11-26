package br.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class PessoaAgendada {
	@Id
	@SequenceGenerator(name = "pessoaagendada_gen", sequenceName = "pessoaagendada_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoaagendada_gen")
	private Long id;
	private String nome;
	private String cpf;
	private TipoIngresso tipoIngresso;
	@ManyToOne
	private Agendamento agendamento;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public TipoIngresso getTipoIngresso() {
		return tipoIngresso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipoIngresso(TipoIngresso tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
	public Agendamento getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}
}
