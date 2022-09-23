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
public class ComentarioTest {

    public ComentarioTest() {
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
    public void testGetTexto() {
        System.out.println("getTexto");
        Comentario instance = new Comentario();
        String expResult = "";
        String result = instance.getTexto();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Comentario instance = new Comentario();
        Utilizador expResult = null;
        instance.setUser(expResult);
        Utilizador result = instance.getUser();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetTexto() {
        System.out.println("setTexto");
        String texto = "";
        Comentario instance = new Comentario();
        instance.setTexto(texto);
        assertEquals(texto, instance.getTexto());

    }

    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Utilizador user = null;
        Comentario instance = new Comentario();
        instance.setUser(user);
        assertEquals(user, instance.getUser());

    }

}
