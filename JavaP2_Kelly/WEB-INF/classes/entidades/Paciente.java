package entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




/**
*
 * Classe que contém a classe entidade, classe que irá se tornar objeto.
 * @author Kelly Cristina  * 
 *
 *
 */




@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPaciente;
	
	@Column(unique = true)
	private Integer cpf;	
	
	private String nome;
	
	
	@ManyToOne
	private Dentista dentista;
	
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}


	public Paciente(Integer idPaciente, Integer cpf, String nome) {
		super();
		this.idPaciente = idPaciente;
		this.cpf = cpf;
		nome = nome;
	}


	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", cpf=" + cpf
				+ ", Data=" + nome + "]";
	}


	public Integer getIdPaciente() {
		return idPaciente;
	}


	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}


	public Integer getCpf() {
		return cpf;
	}


	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}


	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Dentista getDentista() {
		return dentista;
	}


	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}

	

	
	
	
	
	
	
}