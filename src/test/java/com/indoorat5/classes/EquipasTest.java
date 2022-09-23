/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

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
public class EquipasTest {
    
    /**
     *
     */
    public EquipasTest() {
    }
    
    /**
     *
     */
    @BeforeAll
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterAll
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @BeforeEach
    public void setUp() {
    }
    
    /**
     *
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     *
     */
    @Test
    public void testGetNumeroDeJogadoresMax() {
        System.out.println("getNumeroDeJogadoresMax");
        Equipas instance = new Equipas();
        int expResult = 11;
        int result = instance.getNumeroDeJogadoresMax();
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testGetModalidades() {
        System.out.println("getModalidades");
        Equipas instance = new Equipas();
        String expResult = "";
        String result = instance.getModalidades();
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Equipas instance = new Equipas();
        instance.setNome(nome);
        
    }

    /**
     *
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Equipas instance = new Equipas();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        
    }

    /**
     *
     */
    @Test
    public void testAdicionarUtilizador() {
        System.out.println("adicionarUtilizador");
        Utilizador u = null;
        Equipas instance = new Equipas();
        instance.adicionarUtilizador(u);
        
    }

    /**
     *
     */
    @Test
    public void testRemoverUtilizador() {
        System.out.println("removerUtilizador");
        Utilizador u = null;
        Equipas instance = new Equipas();
        instance.removerUtilizador(u);
        
    }

    /**
     *
     */
    @Test
    public void testGetSTRING_OMISSAO() {
        System.out.println("getSTRING_OMISSAO");
        Equipas instance = new Equipas();
        String expResult = "";
        String result = instance.getSTRING_OMISSAO();
        assertEquals(expResult, result);
        
    }

    /**
     *
     */
    @Test
    public void testGetNumeroJogadoresMaxOmissao() {
        System.out.println("getNumeroJogadoresMaxOmissao");
        Equipas instance = new Equipas();
        int expResult = 11;
        int result = instance.getNumeroJogadoresMaxOmissao();
        assertEquals(expResult, result);
        
    }

    /**
     *
     */
    @Test
    public void testGetIdequipa() {
        System.out.println("getIdequipa");
        Equipas instance = new Equipas();
        int expResult = 0;
        instance.setIdequipa(expResult);
        int result = instance.getIdequipa();
        assertEquals(expResult, result);
        
    }

    /**
     *
     */
    @Test
    public void testGetNumeroDeEquipas() {
        System.out.println("getNumeroDeEquipas");
        Equipas instance = new Equipas();
        int expResult = instance.getNumeroDeEquipas();
        int result = instance.getNumeroDeEquipas();
        assertEquals(expResult, result);
        
    }

    /**
     *
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        Equipas instance = new Equipas();
        HashSet<Utilizador> expResult = null;
        instance.setUtilizador(expResult);
        HashSet<Utilizador> result = instance.getUtilizador();
        assertEquals(expResult, result);
        
    }

    /**
     *
     */
    @Test
    public void testSetUtilizador() {
        System.out.println("setUtilizador");
        HashSet<Utilizador> utilizador = null;
        Equipas instance = new Equipas();
        instance.setUtilizador(utilizador);
        
    }

    /**
     *
     */
    @Test
    public void testSetNumeroDeJogadoresMax() {
        System.out.println("setNumeroDeJogadoresMax");
        int NumeroDeJogadoresMax = 0;
        Equipas instance = new Equipas();
        instance.setNumeroDeJogadoresMax(NumeroDeJogadoresMax);
        
    }

    /**
     *
     */
    @Test
    public void testSetModalidades() {
        System.out.println("setModalidades");
        String Modalidades = "";
        Equipas instance = new Equipas();
        instance.setModalidades(Modalidades);
        
    }

    /**
     *
     */
    @Test
    public void testSetIdequipa() {
        System.out.println("setIdequipa");
        int idequipa = 0;
        Equipas instance = new Equipas();
        instance.setIdequipa(idequipa);
        
    }

    /**
     *
     */
    @Test
    public void testSetNumeroDeEquipas() {
        System.out.println("setNumeroDeEquipas");
        int numeroDeEquipas = 0;
        Equipas instance = new Equipas();
        instance.setNumeroDeEquipas(numeroDeEquipas);
        
    }

    /**
     *
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Equipas instance = new Equipas();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }
    
}
