/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.indoorat5.classes;

import com.indoorat5.datas.Data;
import java.util.ArrayList;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diogo Magalhães
 */
public class PublicacaoTest {
    
    public PublicacaoTest() {
    }

    /**
     * Test of adicionarUsers method, of class Publicacao.
     */
    @Test
    public void testAdicionarUsers() {
        System.out.println("adicionarUsers");
        Utilizador u = null;
        Publicacao instance = new Publicacao();
        instance.adicionarUsers(u);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of adicionarReacao method, of class Publicacao.
     */
    @Test
    public void testAdicionarReacao() {
        System.out.println("adicionarReacao");
        Reacoes u = null;
        Publicacao instance = new Publicacao();
        instance.adicionarReacao(u);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of adicionarComentario method, of class Publicacao.
     */
    @Test
    public void testAdicionarComentario() {
        System.out.println("adicionarComentario");
        Comentario u = null;
        Publicacao instance = new Publicacao();
        instance.adicionarComentario(u);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getUser method, of class Publicacao.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Publicacao instance = new Publicacao();
        Utilizador expResult = null;
        instance.setUser(expResult);
        Utilizador result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTitulo method, of class Publicacao.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Publicacao instance = new Publicacao();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    /**
     * Test of setUsersp method, of class Publicacao.
     */
    @Test
    public void testSetUsersp() {
        System.out.println("setUsersp");
        HashSet<Utilizador> usersp = null;
        Publicacao instance = new Publicacao();
        instance.setUsersp(usersp);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTitulo method, of class Publicacao.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Publicacao instance = new Publicacao();
        String expResult = "";
        instance.setTitulo(expResult);
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    /**
     * Test of getUsersp method, of class Publicacao.
     */
    @Test
    public void testGetUsersp() {
        System.out.println("getUsersp");
        Publicacao instance = new Publicacao();
        HashSet<Utilizador> expResult = null;
        instance.addUsersp(expResult);
        HashSet<Utilizador> result = instance.getUsersp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDataDeCriacao method, of class Publicacao.
     */
    @Test
    public void testGetDataDeCriacao() {
        System.out.println("getDataDeCriacao");
        Publicacao instance = new Publicacao();
        Data expResult = null;
        instance.setDataDeCriacao(expResult);
        Data result = instance.getDataDeCriacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTextoPub method, of class Publicacao.
     */
    @Test
    public void testGetTextoPub() {
        System.out.println("getTextoPub");
        Publicacao instance = new Publicacao();
        String expResult = "";
        String result = instance.getTextoPub();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getModalidades method, of class Publicacao.
     */
    @Test
    public void testGetModalidades() {
        System.out.println("getModalidades");
        Publicacao instance = new Publicacao();
        String expResult = "";
        String result = instance.getModalidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCodigoDePub method, of class Publicacao.
     */
    @Test
    public void testGetCodigoDePub() {
        System.out.println("getCodigoDePub");
        Publicacao instance = new Publicacao();
        int expResult = 0;
        instance.setCodigoDePub(expResult);
        int result = instance.getCodigoDePub();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getVecComentario method, of class Publicacao.
     */
    @Test
    public void testGetVecComentario() {
        System.out.println("getVecComentario");
        Publicacao instance = new Publicacao();
        ArrayList<Comentario> expResult = null;
        instance.setVecComentario(expResult);
        ArrayList<Comentario> result = instance.getVecComentario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNccomentarios method, of class Publicacao.
     */
    @Test
    public void testGetNccomentarios() {
        System.out.println("getNccomentarios");
        Publicacao instance = new Publicacao();
        int expResult = 0;
        int result = instance.getNccomentarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getVecReacao method, of class Publicacao.
     */
    @Test
    public void testGetVecReacao() {
        System.out.println("getVecReacao");
        Publicacao instance = new Publicacao();
        HashSet<Reacoes> expResult = null;
        instance.setVecReacao(expResult); 
        HashSet<Reacoes> result = instance.getVecReacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSTRING_POR_OMISSAO method, of class Publicacao.
     */
    @Test
    public void testGetSTRING_POR_OMISSAO() {
        System.out.println("getSTRING_POR_OMISSAO");
        String expResult = "";
        String result = Publicacao.getSTRING_POR_OMISSAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getINT_POR_OMISSAO method, of class Publicacao.
     */
    @Test
    public void testGetINT_POR_OMISSAO() {
        System.out.println("getINT_POR_OMISSAO");
        int expResult = 0;
        int result = Publicacao.getINT_POR_OMISSAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setUser method, of class Publicacao.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Utilizador User = null;
        Publicacao instance = new Publicacao();
        instance.setUser(User);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDataDeCriacao method, of class Publicacao.
     */
    @Test
    public void testSetDataDeCriacao() {
        System.out.println("setDataDeCriacao");
        Data DataDeCriacao = null;
        Publicacao instance = new Publicacao();
        instance.setDataDeCriacao(DataDeCriacao);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTextoPub method, of class Publicacao.
     */
    @Test
    public void testSetTextoPub() {
        System.out.println("setTextoPub");
        String TextoPub = "";
        Publicacao instance = new Publicacao();
        instance.setTextoPub(TextoPub);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setModalidades method, of class Publicacao.
     */
    @Test
    public void testSetModalidades() {
        System.out.println("setModalidades");
        String Modalidades = "";
        Publicacao instance = new Publicacao();
        instance.setModalidades(Modalidades);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCodigoDePub method, of class Publicacao.
     */
    @Test
    public void testSetCodigoDePub() {
        System.out.println("setCodigoDePub");
        int CodigoDePub = 0;
        Publicacao instance = new Publicacao();
        instance.setCodigoDePub(CodigoDePub);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setVecComentario method, of class Publicacao.
     */
    @Test
    public void testSetVecComentario() {
        System.out.println("setVecComentario");
        ArrayList<Comentario> vecComentario = null;
        Publicacao instance = new Publicacao();
        instance.setVecComentario(vecComentario);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNccomentarios method, of class Publicacao.
     */
    @Test
    public void testSetNccomentarios() {
        System.out.println("setNccomentarios");
        int nccomentarios = 0;
        Publicacao instance = new Publicacao();
        instance.setNccomentarios(nccomentarios);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setVecReacao method, of class Publicacao.
     */
    @Test
    public void testSetVecReacao() {
        System.out.println("setVecReacao");
        HashSet<Reacoes> vecReacao = null;
        Publicacao instance = new Publicacao();
        instance.setVecReacao(vecReacao);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of hashCode method, of class Publicacao.
     */
    

    /**
     * Test of equals method, of class Publicacao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Publicacao instance = new Publicacao();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Publicacao.
     */
    @Test
  

    /**
     * Test of getVecusersp method, of class Publicacao.
     */
   
    public void testGetVecusersp() {
        System.out.println("getVecusersp");
        Publicacao instance = new Publicacao();
        HashSet<Utilizador> expResult = null;
        instance.setVecusersp(expResult);
        HashSet<Utilizador> result = instance.getVecusersp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addUsersp method, of class Publicacao.
     */
    @Test
    public void testAddUsersp() {
        System.out.println("addUsersp");
        HashSet<Utilizador> us = null;
        Publicacao instance = new Publicacao();
        instance.addUsersp(us);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setVecusersp method, of class Publicacao.
     */
    @Test
    public void testSetVecusersp() {
        System.out.println("setVecusersp");
        HashSet<Utilizador> vecusersp = null;
        Publicacao instance = new Publicacao();
        instance.setVecusersp(vecusersp);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of compareTo method, of class Publicacao.
     */
    
    
}
