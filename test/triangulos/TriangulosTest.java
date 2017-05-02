/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camila
 */
public class TriangulosTest {

    Triangulos t;

    public TriangulosTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        t = new Triangulos();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of validacaoDeTriangulos method, of class Triangulos.
     */
    @Test
    public void testValidacaoDeTriangulos() {
        assertEquals(true, t.validacaoDeTriangulos(6, 6, 6));
        assertEquals(true, t.validacaoDeTriangulos(5, 6, 6));
        assertEquals(true, t.validacaoDeTriangulos(3, 3, 4));
        assertEquals(true, t.validacaoDeTriangulos(5, 4, 7));
        assertEquals(false, t.validacaoDeTriangulos(1, 2, 3));
    }

    /**
     * Test of main method, of class Triangulos.
     */
    @Test
    public void testMain() {

    }

}
