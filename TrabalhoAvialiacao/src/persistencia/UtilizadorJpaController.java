/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import models.Utilizador;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author a
 */
public class UtilizadorJpaController implements Serializable {

    public UtilizadorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Utilizador utilizador) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(utilizador);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findUtilizador(utilizador.getId()) != null) {
                throw new PreexistingEntityException("Utilizador " + utilizador + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Utilizador utilizador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            utilizador = em.merge(utilizador);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = utilizador.getId();
                if (findUtilizador(id) == null) {
                    throw new NonexistentEntityException("The utilizador with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Utilizador utilizador;
            try {
                utilizador = em.getReference(Utilizador.class, id);
                utilizador.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The utilizador with id " + id + " no longer exists.", enfe);
            }
            em.remove(utilizador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Utilizador> findUtilizadorEntities() {
        return findUtilizadorEntities(true, -1, -1);
    }

    public List<Utilizador> findUtilizadorEntities(int maxResults, int firstResult) {
        return findUtilizadorEntities(false, maxResults, firstResult);
    }

    private List<Utilizador> findUtilizadorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Utilizador.class));
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

    public Utilizador findUtilizador(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Utilizador.class, id);
        } finally {
            em.close();
        }
    }

    public int getUtilizadorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Utilizador> rt = cq.from(Utilizador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
