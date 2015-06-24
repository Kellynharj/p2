package persistence;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Dentista;
import entidades.Paciente;


/**
*
 * Classe que Acessa o banco de dados para consultar as informações dos pacientes atraves de JPQL.
 * @author Kelly Cristina  * 
 *
 *
 */



public class PacienteConsultas{

	public static void main(String[] args) {
		
		Session s;
		
		Transaction t;
		
			
		
		
		s = HibernateUtil.getSessionFactory().openSession();
	 	org.hibernate.Query consultapaciente = s.createQuery("from Paciente");
	 	
	    List<Paciente> pcs = consultapaciente.list();
	 		    
	    for (Paciente paciente : pcs) {
	    System.out.println("Busca por um paciente " + paciente.getNome());
	 	}
		
		

	}

}
