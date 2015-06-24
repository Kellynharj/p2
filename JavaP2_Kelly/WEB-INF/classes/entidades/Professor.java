package entidades;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
*
 * Classe que contém a classe entidade, classe que irá se tornar objeto.
 * Essa classe ainda contem as consultas nomeadas com JPQL
 * @author Kelly  * 
 *
 *
 */


@Entity
@NamedQueries({
    @NamedQuery(name = "buscarTodos", query = "select p from Professor p"),
    @NamedQuery(name = "buscarPorChapeira", query = "select p from Professor p where p.chapeira = '5825'"),
    @NamedQuery(name = "encontrarPorParam", query = "select p from Produto p where p.chapeira = :pchapeira")
})

public class Professor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProduto;
	
	
	private Integer codigo;
		
	private String nomeProfessor;
	
	private Date nascimento;
	
	private Integer chapeira;
	
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}


	public Professor(Integer idProduto, Integer codigo, String nomeProfessor,
			Date nascimento, Integer chapeira) {
		super();
		this.idProduto = idProduto;
		this.codigo = codigo;
		this.nomeProfessor = nomeProfessor;
		this.nascimento = nascimento;
		this.chapeira = chapeira;
	}


	@Override
	public String toString() {
		return "Professor [idProduto=" + idProduto + ", codigo=" + codigo
				+ ", nomeProfessor=" + nomeProfessor + ", nascimento="
				+ nascimento + ", chapeira=" + chapeira + "]";
	}


	public Integer getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNomeProfessor() {
		return nomeProfessor;
	}


	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public Integer getChapeira() {
		return chapeira;
	}


	public void setChapeira(Integer chapeira) {
		this.chapeira = chapeira;
	}
	
	
	
	

}
