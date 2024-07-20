package com.softgraf.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.softgraf.entity.Aluno;
import com.softgraf.util.JpaUtil;

import jakarta.inject.Named;

// Um repositorio representa uma coleção de objetos de um tipo especifico
// é um medidor entrea camada de negócios e acesso a dados
// Deve fornecer metodos para adicionar,rmeover,busar, etc...



@Named // notação do cdi

public class AlunoRepository {

	
	// gerenciador de entidades JPA(container JPA)
	private EntityManager em;
	
	//construtor padrão
	public AlunoRepository() {
	
		// tmeporário 
		this.em = JpaUtil.getEntityManager();
		
	}
	
	
	public AlunoRepository(EntityManager em) {
		
		this.em = em;
	}
	
	
	
	public void adicionar(Aluno aluno) {
		
		//código JPA para salvar aluno 
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(aluno);
		tx.commit();
		
		
	}
		
	public void removerPorId(Integer id) {
		
	}
	
	public Aluno buscarPorId(Integer id) {
		
		return null;
	}
	
	public List<Aluno> getTodos(){
		
		//JPQL = Java Persistence Query language
		TypedQuery<Aluno> query = em.createQuery("SELECT a FROM Aluno a", Aluno.class);
		List<Aluno> lista = query.getResultList();
		em.createQuery("SELECT a FROM Aluno a");
		return lista;
		
	}
	
}
