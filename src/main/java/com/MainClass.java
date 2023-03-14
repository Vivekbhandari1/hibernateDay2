package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		//----------------------------
				SessionFactory sf= new Configuration().configure().buildSessionFactory();		
				// obtains the session
				Session session = sf.openSession();
				session.beginTransaction();
				//-------------------------
				
				 Student st=new Student("Raj","Research",1111);
			        session.save(st);
			
			     Student st2=new Student("Lok Adhikari","Medicine",1111);
			        session.save(st2);
			        
			        
			        
			      //persist()---insert a record
					//----->persist() does not return anything
				Student st3=new Student("Bibek","management",53321);
					    session.persist(st3);
					
					
					//----->save() returns a primary key value
					Student st4=new Student("Nutan","Engineering",33333);
					int primaryKeyValue=(int) session.save(st4);
					System.out.println("------------= "+primaryKeyValue);   //7
			        
			        
			        
				//-------------
				session.getTransaction().commit();
				session.close();
				//--------------

	}

}
