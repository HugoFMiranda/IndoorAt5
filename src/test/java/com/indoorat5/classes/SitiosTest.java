/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.indoorat5.classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diogo Magalhães
 */
public class SitiosTest {
    
    public SitiosTest() {
    }

    /**
     * Test of setCod method, of class Sitios.
     */
    @Test
    public void testSetCod() {
        System.out.println("setCod");
        int cod = 0;
        Sitios instance = new Sitios();
        instance.setCod(cod);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    /**
     * Test of getCod method, of class Sitios.
     */
    @Test
    public void testGetCod() {
        System.out.println("getCod");
        Sitios instance = new Sitios();
        int expResult = 0;
        int result = instance.getCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }



    /**
     * Test of getPRECO_OMISSAO method, of class Sitios.
     */
    @Test
    public void testGetPRECO_OMISSAO() {
        System.out.println("getPRECO_OMISSAO");
        int expResult = 40;
        
        int result = Sitios.getPRECO_OMISSAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNome method, of class Sitios.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Sitios instance = new Sitios();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMorada method, of class Sitios.
     */
    @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        Sitios instance = new Sitios();
        String expResult = "";
        String result = instance.getMorada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPrecoh method, of class Sitios.
     */
    @Test
    public void testGetPrecoh() {
        System.out.println("getPrecoh");
        Sitios instance = new Sitios();
        int expResult = 40;
        int result = instance.getPrecoh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getOrganizador method, of class Sitios.
     */
    @Test
    public void testGetOrganizador() {
        System.out.println("getOrganizador");
        Sitios instance = new Sitios();
        Utilizador expResult = null;
        instance.setOrganizador(expResult);
        Utilizador result = instance.getOrganizador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSTRING_POR_OMISSAO method, of class Sitios.
     */
    @Test
    public void testGetSTRING_POR_OMISSAO() {
        System.out.println("getSTRING_POR_OMISSAO");
        String expResult = "";
        String result = Sitios.getSTRING_POR_OMISSAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNome method, of class Sitios.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Sitios instance = new Sitios();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMorada method, of class Sitios.
     */
    @Test
    public void testSetMorada() {
        System.out.println("setMorada");
        String morada = "";
        Sitios instance = new Sitios();
        instance.setMorada(morada);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPrecoh method, of class Sitios.
     */
    @Test
    public void testSetPrecoh() {
        System.out.println("setPrecoh");
        int precoh = 0;
        Sitios instance = new Sitios();
        instance.setPrecoh(precoh);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOrganizador method, of class Sitios.
     */
    @Test
    public void testSetOrganizador() {
        System.out.println("setOrganizador");
        Utilizador organizador = null;
        Sitios instance = new Sitios();
        instance.setOrganizador(organizador);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    

   
    /**
     * Test of equals method, of class Sitios.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Sitios instance = new Sitios();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
