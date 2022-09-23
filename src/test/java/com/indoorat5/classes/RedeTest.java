/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import com.indoorat5.datas.Data;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
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
public class RedeTest {

    /**
     *
     */
    public RedeTest() {
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
    public void testGetVecSitios() {
        System.out.println("getVecSitios");
        Rede instance = new Rede();
        ArrayList<Sitios> expResult = null;
        instance.setVecSitios(expResult);
        ArrayList<Sitios> result = instance.getVecSitios();
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testGetVecTorneios() {
        System.out.println("getVecTorneios");
        Rede instance = new Rede();
        HashSet<Torneios> expResult = null;
        instance.setVecTorneios(expResult);
        HashSet<Torneios> result = instance.getVecTorneios();
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testGetVecNotify() {
        System.out.println("getVecNotify");
        Rede instance = new Rede();
        HashSet<Notificacao> expResult = null;
        instance.setVecNotify(expResult);
        HashSet<Notificacao> result = instance.getVecNotify();
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testSetVecNotify() {
        System.out.println("setVecNotify");
        HashSet<Notificacao> vecNotify = null;
        Rede instance = new Rede();
        instance.setVecNotify(vecNotify);
        assertEquals(null, instance.getVecNotify());
    }

    /**
     *
     */
    @Test
    public void testGetVecConvite() {
        System.out.println("getVecConvite");
        Rede instance = new Rede();
        HashSet<Convite> expResult = null;
        instance.setVecConvite(expResult);
        HashSet<Convite> result = instance.getVecConvite();
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testSetVecConvite() {
        System.out.println("setVecConvite");
        HashSet<Convite> vecConvite = null;
        Rede instance = new Rede();
        instance.setVecConvite(vecConvite);
        assertEquals(null, instance.getVecConvite());
    }

    /**
     *
     */
    @Test
    public void testGetVecEquipas() {
        System.out.println("getVecEquipas");
        Rede instance = new Rede();
        HashSet<Equipas> expResult = null;
        instance.setVecEquipas(expResult);
        HashSet<Equipas> result = instance.getVecEquipas();
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testGetVecUtilizadores() {
        System.out.println("getVecUtilizadores");
        Rede instance = new Rede();
        HashSet<Utilizador> expResult = null;
        instance.setVecUtilizadores(expResult);
        HashSet<Utilizador> result = instance.getVecUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testSetVecTorneios() {
        System.out.println("setVecTorneios");
        HashSet<Torneios> vecTorneios = null;
        Rede instance = new Rede();
        instance.setVecTorneios(vecTorneios);
        assertEquals(null, instance.getVecTorneios());
    }

    /**
     *
     */
    @Test
    public void testSetVecEquipas() {
        System.out.println("setVecEquipas");
        HashSet<Equipas> vecEquipas = null;
        Rede instance = new Rede();
        instance.setVecEquipas(vecEquipas);
        assertEquals(null, instance.getVecEquipas());
    }

    /**
     *
     */
    @Test
    public void testSetIn() {
        System.out.println("setIn");
        Scanner in = null;
        Rede.setIn(in);
        assertEquals(null, Rede.getIn());
    }

    /**
     *
     */
    @Test
    public void testSetOut() {
        System.out.println("setOut");
        Formatter out = null;
        Rede.setOut(out);
        assertEquals(null, Rede.getOut());
    }

    /**
     *
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Rede instance = new Rede();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testVerf0s() {
        System.out.println("verf0s");
        String e = "";
        Rede instance = new Rede();
        boolean expResult = false;
        boolean result = instance.verf0s(e);
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testVerf0ss() {
        System.out.println("verf0ss");
        String e = "";
        Rede instance = new Rede();
        boolean expResult = false;
        boolean result = instance.verf0ss(e);
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testGetVecPublicacoes() {
        System.out.println("getVecPublicacoes");
        Rede instance = new Rede();
        ArrayList<Publicacao> expResult = null;
        instance.setVecPublicacoes(expResult);
        ArrayList<Publicacao> result = instance.getVecPublicacoes();
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testGetVecJogos() {
        System.out.println("getVecJogos");
        Rede instance = new Rede();
        ArrayList<Jogo> expResult = null;
        instance.setVecJogos(expResult);
        ArrayList<Jogo> result = instance.getVecJogos();
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testGetVecPagPessoal() {
        System.out.println("getVecPagPessoal");
        Rede instance = new Rede();
        ArrayList<PaginaPessoal> expResult = null;
        instance.setVecPagPessoal(expResult);
        ArrayList<PaginaPessoal> result = instance.getVecPagPessoal();
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testProcurarlocal() {
        System.out.println("procurarlocal");
        int i = 0;
        Rede instance = new Rede();
        Sitios expResult = null;
        Sitios result = instance.procurarlocal(i);
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testExistelocalua() {
        System.out.println("existelocalua");
        Utilizador u = null;
        Rede instance = new Rede();
        boolean expResult = false;
        boolean result = instance.existelocalua(u);
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testVerf0i() {
        System.out.println("verf0i");
        int e = 0;
        Rede instance = new Rede();
        boolean expResult = true;
        boolean result = instance.verf0i(e);
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testProcurarUser_String() {
        System.out.println("procurarUser");
        String source = "";
        Rede instance = new Rede();
        Utilizador expResult = null;
        Utilizador result = instance.procurarUser(source);
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testProcurarUser_int() {
        System.out.println("procurarUser");
        int source = 0;
        Rede instance = new Rede();
        Utilizador expResult = null;
        Utilizador result = instance.procurarUser(source);
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testProcurarpublicacao() {
        System.out.println("procurarpublicacao");
        int i = 0;
        Rede instance = new Rede();
        Publicacao expResult = null;
        Publicacao result = instance.procurarpublicacao(i);
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testVerfrelacionamentoentreUsers() {
        System.out.println("verfrelacionamentoentreUsers");
        Utilizador ua = null;
        Utilizador u = null;
        Rede instance = new Rede();
        boolean expResult = false;
        boolean result = instance.verfrelacionamentoentreUsers(ua, u);
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testGetVecCalendario() {
        System.out.println("getVecCalendario");
        Rede instance = new Rede();
        HashSet<Calendario> expResult = new HashSet<>();
        HashSet<Calendario> result = instance.getVecCalendario();
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testContarRelacionamentos() {
        System.out.println("contarRelacionamentos");
        Utilizador u = null;
        Rede instance = new Rede();
        int expResult = 0;
        int result = instance.contarRelacionamentos(u);
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testContarPublicacoes() {
        System.out.println("contarPublicacoes");
        Utilizador u = null;
        Rede instance = new Rede();
        int expResult = 0;
        int result = instance.contarPublicacoes(u);
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testJogosCriadosPorAmigos() {
        System.out.println("jogosCriadosPorAmigos");
        Utilizador u = null;
        Rede instance = new Rede();
        ArrayList<Jogo> expResult = new ArrayList<>();
        ArrayList<Jogo> result = instance.jogosCriadosPorAmigos(u);
        assertEquals(expResult, result);

    }

    /**
     *
     */
    @Test
    public void testProcurarconvite() {
        System.out.println("procurarconvite");
        int i = 0;
        Rede instance = new Rede();
        Convite expResult = null;
        Convite result = instance.procurarconvite(i);
        assertEquals(expResult, result);

    }

}
