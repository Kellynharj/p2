package entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
*
 * Classe que contém a classe entidade, classe que irá se tornar objeto.
 * @author Kelly Cristina  * 
 *
 *
 */


@Entity
public class Dentista {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idDentista;
	
	@Column(unique = true)
	private String cpf;
	
	private String nome;
	
	@OneToMany(mappedBy = "dentista")
	private List<Paciente> paciente;
	
	
	public Dentista() {
		// TODO Auto-generated constructor stub
	}

	

	public Dentista(Integer idCliente, String cpf, String nome) {
		super();
		this.idDentista = idCliente;
		this.cpf = cpf;
		this.nome = nome;
	}


	

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idDentista + ", cpf=" + cpf + ", nome="
				+ nome + "]";
	}



	public Integer getIdDentista() {
		return idDentista;
	}


	public void setIdDentista(Integer idCliente) {
		this.idDentista = idCliente;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public List<Paciente> getpaciente() {
		return paciente;
	}



	public void setNf(List<Paciente> paciente) {
		this.paciente = paciente;
	}
	
	
	
	
	
	
}
