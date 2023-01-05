package com.qsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class deleteCar {
public static void main(String []arg) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Komal");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransction=entityManager.getTransaction();

	
	Car car=entityManager.find(Car.class,4);
			if(car!=null) {
				entityTransction.begin();
				entityManager.remove(car);
				entityTransction.commit();
				System.out.println("object with above it deleted");
			}else
			{
				System.out.println("no such id found");
			

				
			}
}
}
