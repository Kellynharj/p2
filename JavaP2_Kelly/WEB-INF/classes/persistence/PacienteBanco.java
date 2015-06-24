package persistence;


import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Paciente;

/**
*
 * Classe que faz o acesso ao Banco para gravar as informacoes.
 * @author Kelly Cristina  * 
 *
 *
 */

public class PacienteBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		Session s;
		
		Transaction t;

		
		 
				//Gravando Nota Fiscal    

	    
	    Paciente pc = new Paciente();
		
		pc.setCpf(5102);
		pc.setNome("Bruno Penha");
		
		pc.setDentista(null);
		
			    
		
		s = HibernateUtil.getSessionFactory().openSession();
		
		t = s.beginTransaction();			
		
		s.save(pc);
		
		t.commit();
		s.close();
	    
		System.out.println("Dados do Dentista " + pc.getNome()  + " Gravados com Exito!");
		
		
		 
	    }
		
		

		
		
	}

