/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eventoappcourse.eventoapp.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author KaioA
 */
public class EventoTest {
    
    public EventoTest() {
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

    /**
     * Test of getCodigo method, of class Evento.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Evento instance = new Evento();
        Long expResult = null;
        Long result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Evento.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocal method, of class Evento.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getLocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Evento.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorario method, of class Evento.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getHorario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Evento.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Long codigo = null;
        Evento instance = new Evento();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Evento.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Evento instance = new Evento();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocal method, of class Evento.
     */
    @Test
    public void testSetLocal() {
        System.out.println("setLocal");
        String local = "";
        Evento instance = new Evento();
        instance.setLocal(local);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Evento.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        Evento instance = new Evento();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorario method, of class Evento.
     */
    @Test
    public void testSetHorario() {
        System.out.println("setHorario");
        String horario = "";
        Evento instance = new Evento();
        instance.setHorario(horario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Evento.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Evento instance = new Evento();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class Evento.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Evento instance = new Evento();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Evento.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Evento instance = new Evento();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Evento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
