/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ejemplo.Springboot2.Service;

import com.ejemplo.Springboot2.Entity.Persona;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author diego
 */
public class ImpPersonaServiceTest {
    
    public ImpPersonaServiceTest() {
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
     * Test of getPersona method, of class ImpPersonaService.
     */
    @Test
    public void testGetPersona() {
        System.out.println("getPersona");
        ImpPersonaService instance = new ImpPersonaService();
        List<Persona> expResult = null;
        List<Persona> result = instance.getPersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePersona method, of class ImpPersonaService.
     */
    @Test
    public void testSavePersona() {
        System.out.println("savePersona");
        Persona persona = null;
        ImpPersonaService instance = new ImpPersonaService();
        instance.savePersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePersona method, of class ImpPersonaService.
     */
    @Test
    public void testDeletePersona() {
        System.out.println("deletePersona");
        Long id = null;
        ImpPersonaService instance = new ImpPersonaService();
        instance.deletePersona(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPersona method, of class ImpPersonaService.
     */
    @Test
    public void testFindPersona() {
        System.out.println("findPersona");
        Long id = null;
        ImpPersonaService instance = new ImpPersonaService();
        Persona expResult = null;
        Persona result = instance.findPersona(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
