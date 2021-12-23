package junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    private Calculadora objCalculadora;

    @BeforeClass
    public static void beforeClass(){

        System.out.println("beforeClass()");

    }

    @AfterClass
    public static void afterClass(){

        System.out.println("afterClass()");

    }

    @Before
    public void before(){
        System.out.println("before()");
        objCalculadora = new Calculadora(); // inicializar
    }

    @After
    public void after(){
        System.out.println("after()");
    }

    @Test
    public void testSum(){
        System.out.println("testSum");
        int resultado = objCalculadora.add(3,2);
        int resultadoEsperado = 5;
        assertEquals(resultadoEsperado,resultado);
    }

    @Test
    public void testAnsSum(){
        System.out.println("testAnsSum");
        objCalculadora.add(3,2);
        int resultado = objCalculadora.ans();
        int resultadoEsperado = 5;
        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void testSub(){
        System.out.println("testSub");
        objCalculadora.sub(10,2);
        int resultado = objCalculadora.ans();
        int resultadoEsperado = 8;
        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void testSumAgain(){
        System.out.println("testSumAgain");
        objCalculadora.add(3,2);
        int resultado = objCalculadora.add(10);
        int resultadoEsperado = 15;
        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void testDiv(){
        System.out.println("testDiv");
        objCalculadora.div(10,2);
        int resultado = objCalculadora.ans();
        int resultadoEsperado = 5;
        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void testMulti(){
        System.out.println("testMulti");
        objCalculadora.mult(10,2);
        int resultado = objCalculadora.ans();
        int resultadoEsperado = 20;
        assertEquals(resultadoEsperado, resultado);

    }

}
