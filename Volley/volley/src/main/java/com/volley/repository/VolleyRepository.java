package com.volley.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.volley.entity.VolleyEntity;

@Repository
public abstract class VolleyRepository{
	
	@Autowired
	private EntityManager entityManager;
	
	public <T extends VolleyEntity> T persist(T entity) {
		entityManager.persist(entity);
		return entity;
	}
	
	public <T extends VolleyEntity> T merge(T entity) {
		entityManager.merge(entity);
		return entity;
	}
	
	public abstract <T extends VolleyEntity> T findById(String idEntity);
}
