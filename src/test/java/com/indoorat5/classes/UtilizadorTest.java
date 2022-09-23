/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import com.indoorat5.datas.Data;
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
public class UtilizadorTest {
    
    public UtilizadorTest() {
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
    public void testGetDatadecriacao() {
        System.out.println("getDatadecriacao");
        Utilizador instance = new Utilizador();
        Data expResult = null;
        instance.setDatadecriacao(expResult);
        Data result = instance.getDatadecriacao();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetDatadecriacao() {
        System.out.println("setDatadecriacao");
        Data Datadecriacao = null;
        Utilizador instance = new Utilizador();
        instance.setDatadecriacao(Datadecriacao);
        
    }

   
    @Test
    public void testGetId() {
        System.out.println("getId");
        Utilizador instance = new Utilizador();
        int expResult = 0;
        instance.setId(expResult);
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

   

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Utilizador instance = new Utilizador();
        instance.setId(id);
        
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Utilizador instance = new Utilizador();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Utilizador instance = new Utilizador();
        instance.setEmail(email);
        
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Utilizador instance = new Utilizador();
        String expResult = "";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetSTRING_POR_OMISSAO() {
        System.out.println("getSTRING_POR_OMISSAO");
        String expResult = "";
        String result = Utilizador.getSTRING_POR_OMISSAO();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String Username = "";
        Utilizador instance = new Utilizador();
        instance.setUsername(Username);
        
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String Password = "";
        Utilizador instance = new Utilizador();
        instance.setPassword(Password);
        
    }

    @Test
    public void testSetTipoDeUtilizador() {
        System.out.println("setTipoDeUtilizador");
        String TipoDeUtilizador = "";
        Utilizador instance = new Utilizador();
        instance.setTipoDeUtilizador(TipoDeUtilizador);
        
    }

    @Test
    public void testSetModalidades() {
        System.out.println("setModalidades");
        String Modalidades = "";
        Utilizador instance = new Utilizador();
        instance.setModalidades(Modalidades);
        
    }

    @Test
    public void testSetModalidadesdispo() {
        System.out.println("setModalidadesdispo");
        ArrayList<String> Modalidadesdispo = null;
        Utilizador.setModalidadesdispo(Modalidadesdispo);
        
    }

    @Test
    public void testSetTipouserdispo() {
        System.out.println("setTipouserdispo");
        ArrayList<String> tipouserdispo = null;
        Utilizador.setTipouserdispo(tipouserdispo);
        
    }

    @Test
    public void testSetDatadeNascimento() {
        System.out.println("setDatadeNascimento");
        Data DatadeNascimento = null;
        Utilizador instance = new Utilizador();
        instance.setDatadeNascimento(DatadeNascimento);
        
    }

    @Test
    public void testGetModalidadesdispo() {
        System.out.println("getModalidadesdispo");
        ArrayList<String> expResult = Utilizador.getModalidadesdispo();
        ArrayList<String> result = Utilizador.getModalidadesdispo();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetTipouserdispo() {
        System.out.println("getTipouserdispo");
        ArrayList<String> expResult = Utilizador.getTipouserdispo();
        ArrayList<String> result = Utilizador.getTipouserdispo();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetTipoDeUtilizador() {
        System.out.println("getTipoDeUtilizador");
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.getTipoDeUtilizador();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetModalidades() {
        System.out.println("getModalidades");
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.getModalidades();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetDatadeNascimento() {
        System.out.println("getDatadeNascimento");
        Utilizador instance = new Utilizador();
        Data expResult = null;
        instance.setDatadeNascimento(expResult);
        Data result = instance.getDatadeNascimento();
        assertEquals(expResult, result);
        
    }
    
}
