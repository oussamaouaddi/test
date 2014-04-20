/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.persistence;

import java.util.List;
import net.vo.Creancier;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oussama
 */
public class CreancierHibernateDaoTest {
    
    public CreancierHibernateDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllCreanciers method, of class CreancierHibernateDao.
     */
    @Test
    public void testGetAllCreanciers() {
        System.out.println("getAllCreanciers");
        CreancierHibernateDao instance = new CreancierHibernateDao();
        List expResult = null;
        List result = instance.getAllCreanciers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreancier method, of class CreancierHibernateDao.
     */
    @Test
    public void testGetCreancier() {
        System.out.println("getCreancier");
        Integer id = null;
        CreancierHibernateDao instance = new CreancierHibernateDao();
        Creancier expResult = null;
        Creancier result = instance.getCreancier(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CreancierHibernateDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Creancier creancier = null;
        CreancierHibernateDao instance = new CreancierHibernateDao();
        instance.update(creancier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class CreancierHibernateDao.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Creancier creancier = null;
        CreancierHibernateDao instance = new CreancierHibernateDao();
        instance.insert(creancier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CreancierHibernateDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = null;
        CreancierHibernateDao instance = new CreancierHibernateDao();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
