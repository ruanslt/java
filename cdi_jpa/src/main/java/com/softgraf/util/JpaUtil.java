package com.softgraf.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory emf;
	
	
	// inicializador estático 
	static {
		//cria uma fábrica de gerenciadores
		emf = Persistence.createEntityManagerFactory("softgraf_pu");		
		
	}
	
	//retorna um gerenciador de entidades (container JPA)
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
		
	}
	
	//fecha a fábriaca de gerenciadores
	public static void close() {
		emf.close();
	}
	
	
}
