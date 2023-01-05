package com.qsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class CarDriver {
public static void main(String[]args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Komal");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransction=entityManager.getTransaction();



Car car=new Car();
car.setName("bmw");
car.setBrand("honda");


entityTransction.begin();
entityManager.persist(car);
entityTransction.commit();
System.out.println("All good");
}
}
