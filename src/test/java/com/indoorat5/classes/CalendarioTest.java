/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import com.indoorat5.datas.Data;
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
public class CalendarioTest {

    public CalendarioTest() {
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

    @Test
    public void testGetId() {
        System.out.println("getId");
        Calendario instance = new Calendario();
        int expResult = instance.getId();
        int result = instance.getId();
        assertEquals(expResult, result);
    }



    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Calendario instance = new Calendario();
        Utilizador expResult = null;
        instance.setUser(expResult);
        Utilizador result = instance.getUser();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetData() {
        System.out.println("getData");
        Calendario instance = new Calendario();
        Data expResult = null;
        instance.setData(expResult);
        Data result = instance.getData();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetVecJogos() {
        System.out.println("getVecJogos");
        Calendario instance = new Calendario();
        HashSet<Jogo> expResult = null;
        instance.setVecJogos(expResult);
        HashSet<Jogo> result = instance.getVecJogos();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSitio() {
        System.out.println("getSitio");
        Calendario instance = new Calendario();
        Sitios expResult = null;
        instance.setSitio(expResult);
        Sitios result = instance.getSitio();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int Id = 0;
        Calendario instance = new Calendario();
        instance.setId(Id);
        assertEquals(0, instance.getId());
    }

    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Utilizador user = null;
        Calendario instance = new Calendario();
        instance.setUser(user);
        assertEquals(null, instance.getUser());
    }

    @Test
    public void testSetData() {
        System.out.println("setData");
        Data data = null;
        Calendario instance = new Calendario();
        instance.setData(data);
        assertEquals(null, instance.getData());
    }

    @Test
    public void testSetVecJogos() {
        System.out.println("setVecJogos");
        HashSet<Jogo> vecJogos = null;
        Calendario instance = new Calendario();
        instance.setVecJogos(vecJogos);
        assertEquals(null, instance.getVecJogos());
    }

    @Test
    public void testSetSitio() {
        System.out.println("setSitio");
        Sitios sitio = null;
        Calendario instance = new Calendario();
        instance.setSitio(sitio);
        assertEquals(null, instance.getSitio());
    }
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Calendario instance = new Calendario();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

}
