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
public class PaginaPessoalTest {
    
    public PaginaPessoalTest() {
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
    public void testGetModalidade() {
        System.out.println("getModalidade");
        PaginaPessoal instance = new PaginaPessoal();
        String expResult = "";
        instance.setModalidade(expResult);
        String result = instance.getModalidade();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetPublicacao() {
        System.out.println("setPublicacao");
        HashSet<Publicacao> Publicacao = null;
        PaginaPessoal instance = new PaginaPessoal();
        instance.setPublicacao(Publicacao);
        
    }

    @Test
    public void testSetModalidade() {
        System.out.println("setModalidade");
        String Modalidade = "";
        PaginaPessoal instance = new PaginaPessoal();
        instance.setModalidade(Modalidade);
        
    }

    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        PaginaPessoal instance = new PaginaPessoal();
        Utilizador expResult = null;
        instance.setUtilizador(expResult);
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        PaginaPessoal instance = new PaginaPessoal();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetRelacionamento() {
        System.out.println("getRelacionamento");
        PaginaPessoal instance = new PaginaPessoal();
        HashSet<Relacionamentos> expResult = null;
        instance.setRelacionamento(expResult);
        HashSet<Relacionamentos> result = instance.getRelacionamento();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetInteresses() {
        System.out.println("getInteresses");
        PaginaPessoal instance = new PaginaPessoal();
        HashSet<Interesses> expResult = null;
        instance.setInteresses(expResult);
        HashSet<Interesses> result = instance.getInteresses();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetNumeroamigos() {
        System.out.println("getNumeroamigos");
        PaginaPessoal instance = new PaginaPessoal();
        int expResult = 0;
        int result = instance.getNumeroamigos();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetNumeroPublicacoes() {
        System.out.println("getNumeroPublicacoes");
        PaginaPessoal instance = new PaginaPessoal();
        int expResult = 0;
        int result = instance.getNumeroPublicacoes();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetUtilizador() {
        System.out.println("setUtilizador");
        Utilizador Utilizador = null;
        PaginaPessoal instance = new PaginaPessoal();
        instance.setUtilizador(Utilizador);
        
    }

    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String Descricao = "";
        PaginaPessoal instance = new PaginaPessoal();
        instance.setDescricao(Descricao);
        
    }

    @Test
    public void testSetRelacionamento() {
        System.out.println("setRelacionamento");
        HashSet<Relacionamentos> Relacionamento = null;
        PaginaPessoal instance = new PaginaPessoal();
        instance.setRelacionamento(Relacionamento);
        
    }

    @Test
    public void testSetInteresses() {
        System.out.println("setInteresses");
        HashSet<Interesses> Interesses = null;
        PaginaPessoal instance = new PaginaPessoal();
        instance.setInteresses(Interesses);
        
    }

    @Test
    public void testSetNumeroamigos() {
        System.out.println("setNumeroamigos");
        int Numeroamigos = 0;
        PaginaPessoal instance = new PaginaPessoal();
        instance.setNumeroamigos(Numeroamigos);
        
    }

    @Test
    public void testSetNumeroPublicacoes() {
        System.out.println("setNumeroPublicacoes");
        int NumeroPublicacoes = 0;
        PaginaPessoal instance = new PaginaPessoal();
        instance.setNumeroPublicacoes(NumeroPublicacoes);
        
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        PaginaPessoal instance = new PaginaPessoal();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetDESCRICAO_OMISSAO() {
        System.out.println("getDESCRICAO_OMISSAO");
        String expResult = "";
        String result = PaginaPessoal.getDESCRICAO_OMISSAO();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetINT_OMISSAO() {
        System.out.println("getINT_OMISSAO");
        int expResult = 0;
        int result = PaginaPessoal.getINT_OMISSAO();
        assertEquals(expResult, result);
        
    }

    
}
