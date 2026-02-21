package com.test;

  

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class Storemovie {
	
			public static void main(String[] args) {
				Configuration cfg=new Configuration();
				cfg.configure("hibernate.cfg.xml");
				SessionFactory sf=cfg.buildSessionFactory();
				Session session=sf.openSession();
				Transaction t=session.beginTransaction();
				Movie obj=new Movie();
				obj.setM_name("Dhurandhar");
				obj.setHero("Ranveer Singh");
				obj.setGenres("Action");
				
				/*Movie dt=session.get(Movie.class, 1);
				System.out.println(dt.getM_name()+" "+dt.getB_name()+" "+dt.getB_author());
				dt.setM_name("Dhurandhar");
				dt.setHero("Ranveer Singh");
				dt.setGenres("Action");
				*/
				session.persist(obj);
				t.commit();
				
				/*Query<Movie> q=session.createQuery("from Book");
				List<Book> list=q.list();
				for(Book b: list)
				{
					System.out.println(b.getId()+" "+b.getB_name()+" "+b.getB_price());
				}
				//session.persist(dt);
				//session.remove(dt);
				*/
				
				System.out.println("Done.");
			}
	
}

