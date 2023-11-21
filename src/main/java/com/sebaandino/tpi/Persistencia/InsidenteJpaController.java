/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaandino.tpi.Persistencia;

import com.sebaandino.tpi.Models.Insidente;
import com.sebaandino.tpi.Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Seba
 */
public class InsidenteJpaController implements Serializable {

    public InsidenteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public InsidenteJpaController() {
       emf = Persistence.createEntityManagerFactory("tpiPU") ;
    
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Insidente insidente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(insidente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Insidente insidente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            insidente = em.merge(insidente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = insidente.getId_insidente();
                if (findInsidente(id) == null) {
                    throw new NonexistentEntityException("The insidente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Insidente insidente;
            try {
                insidente = em.getReference(Insidente.class, id);
                insidente.getId_insidente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The insidente with id " + id + " no longer exists.", enfe);
            }
            em.remove(insidente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Insidente> findInsidenteEntities() {
        return findInsidenteEntities(true, -1, -1);
    }

    public List<Insidente> findInsidenteEntities(int maxResults, int firstResult) {
        return findInsidenteEntities(false, maxResults, firstResult);
    }

    private List<Insidente> findInsidenteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Insidente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Insidente findInsidente(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Insidente.class, id);
        } finally {
            em.close();
        }
    }

    public int getInsidenteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Insidente> rt = cq.from(Insidente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
