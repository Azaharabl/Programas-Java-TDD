package azahara;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("test de azahara")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ejercicio_azaharaTest {

    @Test
    @Order(1)
    public void cantidadAMandarPermitidaTest(){
        //prepararar
        float cantidadCorecta1 = 0.50f;
        float cantidadCorecta2 = 500.00f;
        float cantidadIncorrecta1 = 0.49f;
        float cantidadIncorrecta2 = 500.01f;

        //atuar verificar

        assertFalse(ejercicio_azahara.cantidadAMandarPermitida(cantidadIncorrecta1),"la cantidad es menor a la permitida");
        assertFalse(ejercicio_azahara.cantidadAMandarPermitida(cantidadIncorrecta2),"la cantidad es mayor a la permitida");
        assertTrue(ejercicio_azahara.cantidadAMandarPermitida(cantidadCorecta1),"la es permitida");
        assertTrue(ejercicio_azahara.cantidadAMandarPermitida(cantidadCorecta2),"la es permitida");
    }

    @Test
    @Order(2)
    public void cantidadAMandarMenorASaldoTest(){
        //prepararar
        //saldo
        float saldoDisponible = 350.20f;
        //cantidad pedida
        float cantidadCorecta1 = 0.50f;
        float cantidadCorecta2 = 350.20f;
        float cantidadIncorrecta1 = 350.21f;
        float cantidadIncorrecta2 = 400.00f;

        //atuar verificar

        assertFalse(ejercicio_azahara.cantidadAMandarMenorASaldo(cantidadIncorrecta1,saldoDisponible),"la cantidad es menor al saldo");
        assertFalse(ejercicio_azahara.cantidadAMandarMenorASaldo(cantidadIncorrecta2,saldoDisponible),"la cantidad es mayor al saldo");
        assertTrue(ejercicio_azahara.cantidadAMandarMenorASaldo(cantidadCorecta1,saldoDisponible),"la es permitida con el saldo disponible");
        assertTrue(ejercicio_azahara.cantidadAMandarMenorASaldo(cantidadCorecta2,saldoDisponible),"la es permitida con el saldo disponible");
    }
    @Test
    @Order(3)
    public void primerNumero6Test(){
        //prepararar

        //cantidad pedida
        String telefonoCorecto1 = "605198617";
        String telefonoIncorrecto1 = "505198617";
        String telefonoIncorrecto2 = "705198617";
        String telefonoIncorrecto3 = "905198617";

        //atuar verificar

        assertTrue(ejercicio_azahara.primerNumero6(telefonoCorecto1),"el primer numero es un 6");
        assertFalse(ejercicio_azahara.primerNumero6(telefonoIncorrecto1),"el primer numero no es un 6");
        assertFalse(ejercicio_azahara.primerNumero6(telefonoIncorrecto2),"el primer numero  no es un 6");
        assertFalse(ejercicio_azahara.primerNumero6(telefonoIncorrecto3),"el primer numero  no es un 6");
    }
    @Test
    @Order(4)
    public void largoEs9Test(){
        //prepararar

        //cantidad pedida
        String telefonoCorecto1 = "605198617";
        String telefonoIncorrecto1 = "65198617";
        String telefonoIncorrecto2 = "6205198617";


        //atuar verificar

        assertTrue(ejercicio_azahara.largoEs9(telefonoCorecto1),"el numero tiene 9 cifras");
        assertFalse(ejercicio_azahara.largoEs9(telefonoIncorrecto1),"el numero tiene 9 cifras");
        assertFalse(ejercicio_azahara.largoEs9(telefonoIncorrecto2),"el numero tiene 9 cifras");

    }

}


