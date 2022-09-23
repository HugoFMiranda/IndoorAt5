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
public class NotificacaoTest {

    public NotificacaoTest() {
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
        Notificacao instance = new Notificacao();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Notificacao instance = new Notificacao();

        HashSet<Utilizador> expResult = null;
        instance.setUser(expResult);
        HashSet<Utilizador> result = instance.getUser();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetStr() {
        System.out.println("getStr");
        Notificacao instance = new Notificacao();
        String expResult = "";
        String result = instance.getStr();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Notificacao instance = new Notificacao();
        instance.setId(id);

    }

    @Test
    public void testSetDataCriacao_DataHora() {
        System.out.println("setDataCriacao");
        DataHora dataCriacao = null;
        Notificacao instance = new Notificacao();
        instance.setDataCriacao(dataCriacao);

    }

    @Test
    public void testSetUser() {
        System.out.println("setUser");
        HashSet<Utilizador> user = null;
        Notificacao instance = new Notificacao();
        instance.setUser(user);

    }

    @Test
    public void testGetDataCriacao() {
        System.out.println("getDataCriacao");
        Notificacao instance = new Notificacao();
        Data expResult = null;
        instance.setDataCriacao(expResult);
        Data result = instance.getDataCriacao();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetDataCriacao_Data() {
        System.out.println("setDataCriacao");
        Data dataCriacao = null;
        Notificacao instance = new Notificacao();
        instance.setDataCriacao(dataCriacao);

    }

    @Test
    public void testSetStr() {
        System.out.println("setStr");
        String str = "";
        Notificacao instance = new Notificacao();
        instance.setStr(str);

    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Notificacao instance = new Notificacao();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }


}
