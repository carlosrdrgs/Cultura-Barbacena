package br.com.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Agendamento {
	@Id
	@SequenceGenerator(name = "agendamento_gen", sequenceName = "agendamento_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agendamento_gen")
	private Long id;
	private String emailResponsavel;
	@Temporal(TemporalType.DATE)
	private Calendar dataVisita;
	@Temporal(TemporalType.TIME)
	private Calendar horarioVisita;
	private String codigoConfirmacao;
	@ManyToOne
	private Museu museu;
	@OneToMany(mappedBy = "agendamento")
	private List<PessoaAgendada> pessoas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmailResponsavel() {
		return emailResponsavel;
	}
	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}
	public Calendar getHorarioVisita() {
		return horarioVisita;
	}
	public void setHorarioVisita(Calendar horarioVisita) {
		this.horarioVisita = horarioVisita;
	}
	public Calendar getDataVisita() {
		return dataVisita;
	}
	public void setDataVisita(Calendar dataVisita) {
		this.dataVisita = dataVisita;
	}
	public String getCodigoConfirmacao() {
		return codigoConfirmacao;
	}
	public void setCodigoConfirmacao(String codigoConfirmacao) {
		this.codigoConfirmacao = codigoConfirmacao;
	}
	public Museu getMuseu() {
		return museu;
	}
	public void setMuseu(Museu museu) {
		this.museu = museu;
	}
	public List<PessoaAgendada> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<PessoaAgendada> pessoas) {
		this.pessoas = pessoas;
	}
}
