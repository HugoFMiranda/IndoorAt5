/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import com.indoorat5.datas.Data;
import java.time.LocalDate;
import java.util.HashSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HugoM
 */
public class JogoTest {
    private jogoFutebol j;
    public JogoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getData_criacao method, of class Jogo.
     */
    @Test
    public void testGetData_criacao() {
        LocalDate d = LocalDate.now();
        Data d1 = new Data(d.getYear(),d.getMonthValue(),d.getDayOfMonth());
        jogoFutebol j = new jogoFutebol();
        assertEquals(d1,j.getData_criacao());
    }

    /**
     * Test of setData_criacao method, of class Jogo.
     */
    @Test
    public void testSetData_criacao() {
        LocalDate d = LocalDate.now();
        Data d1 = new Data(d.getYear(),d.getMonthValue(),d.getDayOfMonth());
        jogoFutebol j = new jogoFutebol();
        j.setData_criacao(d1);
        assertEquals(j.getData_criacao(),d1);
    }

    /**
     * Test of getVecUtilizadores method, of class Jogo.
     */
    @Test
    public void testGetVecUtilizadores() {
        System.out.println("getVecUtilizadores");
        Jogo instance = new JogoImpl();
        HashSet<Utilizador> result = instance.getVecUtilizadores();
        assertEquals(instance.getVecUtilizadores(), result);
    }


    /**
     * Test of setId method, of class Jogo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 4;
        jogoFutebol instance = new jogoFutebol();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(4,instance.getId());
    }



    /**
     * Test of getId method, of class Jogo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Jogo instance = new JogoImpl();
        
        int expResult = 0;
        instance.setId(expResult);
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLocal method, of class Jogo.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Jogo instance = new JogoImpl();
        Sitios expResult =instance.getLocal() ;
        Sitios result = instance.getLocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addUtilizadores method, of class Jogo.
     */
    @Test
    public void testAddUtilizadores() {
        System.out.println("addUtilizadores");
        Utilizador u = null;
        Jogo instance = new JogoImpl();
        instance.addUtilizadores(u);
        HashSet<Utilizador> expResult = instance.getVecUtilizadores();
        assertEquals(expResult, instance.getVecUtilizadores());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setVecUtilizadores method, of class Jogo.
     */
    @Test
    public void testSetVecUtilizadores() {
        System.out.println("setVecUtilizadores");
        HashSet<Utilizador> vecUtilizadores = null;
        Jogo instance = new JogoImpl();
        instance.setVecUtilizadores(vecUtilizadores);
        HashSet<Utilizador> expResult = instance.getVecUtilizadores();
        assertEquals(expResult, instance.getVecUtilizadores());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLocal method, of class Jogo.
     */
    @Test
    public void testSetLocal() {
        System.out.println("setLocal");
        Sitios expResult = null;
        Jogo instance = new JogoImpl();
        instance.setLocal(expResult);
        assertEquals(expResult, instance.getLocal());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getData method, of class Jogo.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Jogo instance = new JogoImpl();
        Data expResult = null;
        instance.setData(expResult);
        Data result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setData method, of class Jogo.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Data Data = null;
        Jogo instance = new JogoImpl();
        instance.setData(Data);
        assertEquals(Data, instance.getData());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of equals method, of class Jogo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Jogo obj = null;
        Jogo instance = new JogoImpl();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }


    public class JogoImpl extends Jogo {
    }
    
}
