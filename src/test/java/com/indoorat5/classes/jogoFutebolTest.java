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
public class jogoFutebolTest {
    
    public jogoFutebolTest() {
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
    public void testGetNjogadores() {
        System.out.println("getNjogadores");
        jogoFutebol instance = new jogoFutebol();
        int expResult = 0;
        instance.setNjogadores(expResult);
        int result = instance.getNjogadores();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetNjogadoresmaximo() {
        System.out.println("getNjogadoresmaximo");
        jogoFutebol instance = new jogoFutebol();
        int expResult = 27;
        int result = instance.getNjogadoresmaximo();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetNjogadoresmaximo() {
        System.out.println("setNjogadoresmaximo");
        int njogadoresmaximo = 0;
        jogoFutebol instance = new jogoFutebol();
        instance.setNjogadoresmaximo(njogadoresmaximo);
        
    }

    @Test
    public void testGetNJOGADORES_OMISSAO() {
        System.out.println("getNJOGADORES_OMISSAO");
        int expResult = 22;
        int result = jogoFutebol.getNJOGADORES_OMISSAO();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetNjogadores() {
        System.out.println("setNjogadores");
        int njogadores = 0;
        jogoFutebol instance = new jogoFutebol();
        instance.setNjogadores(njogadores);
        
    }


    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        jogoFutebol instance = new jogoFutebol();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }

    
}
