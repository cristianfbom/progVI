package main.java.com.backend.prog.dao;

import java.util.List;

import javax.persistence.EntityManager;

import main.java.com.backend.prog.util.JPAUtil;



public abstract class GenericDao<T> {

    public void save(T t) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        em.close();
    }
    
    public void update(T t) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
        em.close();
    }
    
    public void remove(T t) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(t));
        em.getTransaction().commit();
        em.close();
    }
    
    public List<T> getAll () {
    	EntityManager em = JPAUtil.getEntityManager();
    	return em.createNativeQuery("").getResultList();
    }
    
}
