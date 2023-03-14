package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass2 {

	public static void main(String[] args) {
		
		//----------------------------
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		//-------------------------
		//Retrieval operation-----> two methods for it--  1.load()   2.get()
		
		//fetch student by using rollNo(primary key)=6
		//load()
		
		Student st=session.load(Student.class, 5);
		//System.out.println(st);
		System.out.println(st.getName()+"    "+st.getSsn()+"   "+st.getBranch());
		
		//get()
		Student st2=session.get(Student.class, 5);
		System.out.println(st2.getName()+"    "+st2.getSsn()+"   "+st.getBranch());
		
		

		//-------------
		session.getTransaction().commit();
		session.close();
		//--------------

		

	}

}
