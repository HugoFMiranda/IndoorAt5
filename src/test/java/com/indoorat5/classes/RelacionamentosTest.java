/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.indoorat5.classes;

import com.indoorat5.datas.Data;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diogo Magalhães
 */
public class RelacionamentosTest {
    
    public RelacionamentosTest() {
    }

    /**
     * Test of getData method, of class Relacionamentos.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Relacionamentos instance = new Relacionamentos();
        Data expResult = null;
        instance.setData(expResult);
        Data result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getUser method, of class Relacionamentos.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Relacionamentos instance = new Relacionamentos();
        Utilizador expResult = null;
        instance.setUser(expResult);
        Utilizador result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getUa method, of class Relacionamentos.
     */
    @Test
    public void testGetUa() {
        System.out.println("getUa");
        Relacionamentos instance = new Relacionamentos();
        Utilizador expResult = null;
        Utilizador result = instance.getUa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setUa method, of class Relacionamentos.
     */
    @Test
    public void testSetUa() {
        System.out.println("setUa");
        Utilizador ua = null;
        Relacionamentos instance = new Relacionamentos();
        instance.setUa(ua);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTipo method, of class Relacionamentos.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Relacionamentos instance = new Relacionamentos();
        String expResult = "";
        instance.setTipo(expResult);
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTipoami method, of class Relacionamentos.
     */
    @Test
    public void testGetTipoami() {
        System.out.println("getTipoami");
        ArrayList<String> expResult = null;
        Relacionamentos.setTipoami(expResult);
        ArrayList<String> result = Relacionamentos.getTipoami();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTIPO_POR_OMISSAO method, of class Relacionamentos.
     */
    @Test
    public void testGetTIPO_POR_OMISSAO() {
        System.out.println("getTIPO_POR_OMISSAO");
        String expResult = "Desconhecido";
        String result = Relacionamentos.getTIPO_POR_OMISSAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setData method, of class Relacionamentos.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Data data = null;
        Relacionamentos instance = new Relacionamentos();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setUser method, of class Relacionamentos.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Utilizador user = null;
        Relacionamentos instance = new Relacionamentos();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setTipo method, of class Relacionamentos.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Relacionamentos instance = new Relacionamentos();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setTipoami method, of class Relacionamentos.
     */
    @Test
    public void testSetTipoami() {
        System.out.println("setTipoami");
        ArrayList<String> tipoami = null;
        Relacionamentos.setTipoami(tipoami);
        // TODO review the generated test code and remove the default call to fail.
       
    }

   

    /**
     * Test of equals method, of class Relacionamentos.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Relacionamentos instance = new Relacionamentos();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

   

   
    
}
