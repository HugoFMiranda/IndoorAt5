/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import java.util.ArrayList;
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
public class ReacoesTest {
    
    public ReacoesTest() {
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
    public void testGetReacao() {
        System.out.println("getReacao");
        Reacoes instance = new Reacoes();
        String expResult = "";
        instance.setReacao(expResult);
        String result = instance.getReacao();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetTiporeacao() {
        System.out.println("getTiporeacao");
        ArrayList<String> expResult = Reacoes.tiporeacao;
        ArrayList<String> result = Reacoes.getTiporeacao();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Reacoes instance = new Reacoes();
        Utilizador expResult = null;
        instance.setUser(expResult);
        Utilizador result = instance.getUser();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetReacao() {
        System.out.println("setReacao");
        String reacao = "";
        Reacoes instance = new Reacoes();
        instance.setReacao(reacao);
        
    }


    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Utilizador user = null;
        Reacoes instance = new Reacoes();
        instance.setUser(user);
        
    }


    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Reacoes instance = new Reacoes();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }

    
}
