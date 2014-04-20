/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.persistence;

import java.util.List;
import net.vo.Creancier;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author brahim
 */
public class CreancierHibernateDao implements CreancierDao{

    private List<Creancier> creancierList;
    private Creancier creancier;
    
    @Override
    public List getAllCreanciers() {
        
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            creancierList = session.createQuery("from Creancier").list();
            return creancierList;
        } catch (HibernateException e) {
            throw e;
        } finally {
            session.close();
        }
        
    }

    @Override
    public Creancier getCreancier(Integer id) {
        
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            Query q = session.createQuery("from Creancier as c where c.id=:creancierid");
            q.setInteger("creancierid", id);
            return (Creancier) q.uniqueResult();
        }finally {
            session.close();
        }
        
    }

    @Override
    public void update(Creancier creancier) {
        
        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        try {
            tx=session.beginTransaction();
            session.update(creancier);
            tx.commit();
        }catch (RuntimeException e) {
            if(tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
        
    }

    @Override
    public void insert(Creancier creancier) {
        
        Session session = HibernateUtil.getSession();
        Transaction tx=null;
        try {
            tx = session.beginTransaction();
            session.save(creancier);
            tx.commit();
        } catch (RuntimeException e) {
            if(tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    
    }

    @Override
    public void delete(Integer id) {
    
        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            creancier = (Creancier)session.get(Creancier.class, id);
            session.delete(creancier);
            tx.commit();
        } catch (RuntimeException e) {
            if(tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    
    }
    
}
