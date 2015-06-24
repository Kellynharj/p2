package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Professor;

/**
*
 * Classe que Executa as consultas nomeadas da classe Professor
 * @author Kelly Cristina  * 
 *
 *
 */


public class ProfessorNomeadas {

	
	public static void main(String[] args) {
		
		// 2 - Obtem um gerenciador de entidades e uma transação
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("cmJavaJPA");

	    EntityManager em = emf.createEntityManager();
		
		Professor pd = new Professor();
		
	    pd = em.createNamedQuery("buscarPorNCM", Professor.class).getSingleResult();
	    
	    
	    List<Professor> pf = em.createQuery("Select from Professor", Professor.class).getResultList();
		
	}
	
	
	
	
	
	
    
    
	
	
}
