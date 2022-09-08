package com.ojas.hibernate;
import org.hibernate.Session;
		import org.hibernate.SessionFactory;
		import org.hibernate.Transaction;
		import org.hibernate.cfg.Configuration;
public class insertclass {

	public static void main(String[] args) {
		

				Configuration cfg = new Configuration();
				cfg.configure();
				SessionFactory sf = cfg.buildSessionFactory();
				Session s = sf.openSession();
				customer c=new customer();
				c.setCustomerId(21398);
				c.setCustomerName("Hari");
				c.setCustomerMobile(995929344);
				c.setAddress("Hyderabad");
				s.beginTransaction();
				s.save(c);
				
				s.getTransaction().commit();
			
			

			}

		}


