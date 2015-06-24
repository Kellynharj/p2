package persistence;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Dentista;

public class DentistaBanco {
	

	/**
	 *
	  * Classe que faz o acesso ao Banco CRUD e testes.
	  * @author Kelly Cristina  * 
	  *
	  *
	  */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Session s;
			
			Transaction t;

			
			//Gravando Dentista no banco de dados
			

			Dentista dt = new Dentista();
			
			dt.setCpf("789");
			dt.setNome("Kelly Cristina");
			
			s = HibernateUtil.getSessionFactory().openSession();
			
			t = s.beginTransaction();			
			
			s.save(dt);
			
			t.commit();
			
			//s.close();
			
			
			 
			
			// Buscando Todos os Dentistas do Banco
			
			s = HibernateUtil.getSessionFactory().openSession();
			org.hibernate.Query query = s.createQuery("from Dentista");
		    List<Dentista> dentistas = query.list();
		    
		    for (Dentista dentista : dentistas) {
		    	System.out.println("Dentistas : " + dentista.getNome());
			}
		    
		    
		    
		 // Filtrando Dentistas do Banco
			
		 	s = HibernateUtil.getSessionFactory().openSession();
		 	org.hibernate.Query buscaum = s.createQuery("from Dentista where cpf = :cpf");
		 	buscaum.setParameter("cpf", "789");
		    List<Dentista> dentistas2 = buscaum.list();
		 		    
		    for (Dentista dentista2 : dentistas2) {
		    System.out.println("Busca por um Dentista " + dentista2.getNome());
		 	}
		
		
		    
		 // Deletando Dentista
		    
		    
		    s = HibernateUtil.getSessionFactory().openSession();
		 	org.hibernate.Query consultarRemover = s.createQuery("from Dentista where cpf = :cpf");
		 	consultarRemover.setParameter("cpf", "789");
		    List<Dentista> dentistas3 = consultarRemover.list();
		 		    
		    for (Dentista dentista3 : dentistas3) {
		    System.out.println("Dentista para Exlusão " + dentista3.getIdDentista());
		    
		    t = s.beginTransaction();			
			
			s.delete(dentista3);
			
			t.commit();
		    
		 	}
		    
			
			
		
		}

		

		
		

	
	
	
	
	



	
	

	

}
