package com.qsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetCar {
	public static void main(String []args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Komal");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTranscation= entityManager.getTransaction();


Car car=entityManager.find(Car.class,2);
{
if(car!=null)
{
	System.out.println(car.getName());
	System.out.println(car.getBrand());
	System.out.println(car.getId());
}
else
{
	System.out.println("no car object found");
}
}
}
}


