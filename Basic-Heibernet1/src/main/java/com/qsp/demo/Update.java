package com.qsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args)
	{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Komal");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTranscation= entityManager.getTransaction();


	Car car=entityManager.find(Car.class,5);
	{
		car.setName("X5");
	if(car!=null)
		{
		entityTranscation.begin();
		entityManager.merge(car);
		entityTranscation.commit();
		System.out.println("value update");
		}
	else
	{
		System.out.println("value not update");
		
		
    }
	}
	}
	}
	

	

