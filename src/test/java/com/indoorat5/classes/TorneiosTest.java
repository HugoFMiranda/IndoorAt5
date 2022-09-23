/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import java.util.ArrayList;
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
public class TorneiosTest {
    
    public TorneiosTest() {
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
    public void testGetEquipa() {
        System.out.println("getEquipa");
        Torneios instance = new Torneios();
        HashSet<Equipas> expResult = new HashSet<>();
        HashSet<Equipas> result = instance.getEquipa();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetModalidades() {
        System.out.println("getModalidades");
        Torneios instance = new Torneios();
        String expResult = "";
        String result = instance.getModalidades();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetModalidades() {
        System.out.println("setModalidades");
        String Modalidades = "";
        Torneios instance = new Torneios();
        instance.setModalidades(Modalidades);
        
    }
    
    @Test
    public void testGetTipotorneio() {
        System.out.println("getTipotorneio");
        Torneios instance = new Torneios();
        ArrayList<String> expResult = Torneios.tipotorneio;
        ArrayList<String> result = instance.getTipotorneio();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Torneios instance = new Torneios();
        instance.setTipo(tipo);
        
    }

    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Torneios instance = new Torneios();
        String expResult = "";
        instance.setTipo(expResult);
        String result = instance.getTipo();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Torneios instance = new Torneios();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Torneios instance = new Torneios();
        instance.setNome(nome);
        
    }

    @Test
    public void testGetPrizePool() {
        System.out.println("getPrizePool");
        Torneios instance = new Torneios();
        int expResult = 500;
        int result = instance.getPrizePool();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetArbitros() {
        System.out.println("getArbitros");
        Torneios instance = new Torneios();
        HashSet<Utilizador> expResult = new HashSet<>();
        HashSet<Utilizador> result = instance.getArbitros();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetPrizePoolOmissao() {
        System.out.println("getPrizePoolOmissao");
        Torneios instance = new Torneios();
        int expResult = 500;
        int result = instance.getPrizePoolOmissao();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetIdtorneios() {
        System.out.println("getIdtorneios");
        Torneios instance = new Torneios();
        int expResult = 0;
        instance.setIdtorneios(expResult);
        int result = instance.getIdtorneios();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetNumeroTorneios() {
        System.out.println("getNumeroTorneios");
        Torneios instance = new Torneios();
        int expResult = 0;
        instance.setNumeroTorneios(expResult);
        int result = instance.getNumeroTorneios();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testAdicionarEquipas() {
        System.out.println("adicionarEquipas");
        Equipas e = null;
        Torneios instance = new Torneios();
        instance.adicionarEquipas(e);
        
    }

    @Test
    public void testAdicionarUsers() {
        System.out.println("adicionarUsers");
        Utilizador e = null;
        Torneios instance = new Torneios();
        instance.adicionarUsers(e);
        
    }

    @Test
    public void testSetEquipa() {
        System.out.println("setEquipa");
        HashSet<Equipas> equipa = null;
        Torneios instance = new Torneios();
        instance.setEquipa(equipa);
        
    }

    @Test
    public void testSetPrizePool() {
        System.out.println("setPrizePool");
        int PrizePool = 0;
        Torneios instance = new Torneios();
        instance.setPrizePool(PrizePool);
        
    }

    @Test
    public void testSetArbitros() {
        System.out.println("setArbitros");
        HashSet<Utilizador> arbitros = null;
        Torneios instance = new Torneios();
        instance.setArbitros(arbitros);
        
    }

    @Test
    public void testSetIdtorneios() {
        System.out.println("setIdtorneios");
        int idtorneios = 0;
        Torneios instance = new Torneios();
        instance.setIdtorneios(idtorneios);
        
    }

    @Test
    public void testSetNumeroTorneios() {
        System.out.println("setNumeroTorneios");
        int NumeroTorneios = 0;
        Torneios instance = new Torneios();
        instance.setNumeroTorneios(NumeroTorneios);
        
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Torneios instance = new Torneios();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }
    
}
