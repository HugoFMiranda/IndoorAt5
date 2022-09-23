/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import com.indoorat5.datas.Data;
import com.indoorat5.datas.DataHora;
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
public class ConviteTest {

    public ConviteTest() {
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
    public void testGetData() {
        System.out.println("getData");
        Convite instance = new Convite();
        Data expResult = null;
        Data result = instance.getData();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetData() {
        System.out.println("setData");
        DataHora data = null;
        Convite instance = new Convite();
        instance.setData(data);
        assertEquals(data, instance.getData());
    }

    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Convite instance = new Convite();
        Utilizador expResult = null;
        instance.setUser(expResult);
        Utilizador result = instance.getUser();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Utilizador user = null;
        Convite instance = new Convite();
        instance.setUser(user);
        assertEquals(user, instance.getUser());
    }

    @Test
    public void testGetEquipa() {
        System.out.println("getEquipa");
        Convite instance = new Convite();
        Equipas expResult = null;
        instance.setEquipa(expResult);
        Equipas result = instance.getEquipa();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEquipa() {
        System.out.println("setEquipa");
        Equipas equipa = null;
        Convite instance = new Convite();
        instance.setEquipa(equipa);
        assertEquals(equipa, instance.getEquipa());
    }

    @Test
    public void testGetUserp() {
        System.out.println("getUserp");
        Convite instance = new Convite();
        HashSet<Utilizador> expResult = null;
        instance.setUserp(expResult);
        HashSet<Utilizador> result = instance.getUserp();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUserp() {
        System.out.println("setUserp");
        HashSet<Utilizador> userp = null;
        Convite instance = new Convite();
        instance.setUserp(userp);
        assertEquals(null, instance.getUserp());
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Convite instance = new Convite();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

}
