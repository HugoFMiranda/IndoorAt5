/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

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
public class InteressesTest {
    
    public InteressesTest() {
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
    public void testGetDesignacao() {
        System.out.println("getDesignacao");
        Interesses instance = new Interesses();
        String expResult="";
        String result = instance.getDesignacao();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetDESIGNACAO_POR_OMISSAO() {
        System.out.println("getDESIGNACAO_POR_OMISSAO");
        String expResult = "";
        String result = Interesses.getDESIGNACAO_POR_OMISSAO();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetDesignacao() {
        System.out.println("setDesignacao");
        String designacao = "";
        Interesses instance = new Interesses();
        instance.setDesignacao(designacao);
        
    }

    @Test
    public void testSetDESIGNACAO_POR_OMISSAO() {
        System.out.println("setDESIGNACAO_POR_OMISSAO");
        String DESIGNACAO_POR_OMISSAO = "";
        Interesses.setDESIGNACAO_POR_OMISSAO(DESIGNACAO_POR_OMISSAO);
        
    }


    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Interesses instance = new Interesses();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }
    
}
