package org.example;

import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperacionesMatematicasTest {

    @Test
    void calcularRaizCuadrada() {
        OperacionesMatematicas operaciones = new OperacionesMatematicas();

        // Caso de prueba: número positivo
        assertEquals(2.0, operaciones.calcularRaizCuadrada(4.0), 0.0001);

        // Caso de prueba: cero
        assertEquals(0.0, operaciones.calcularRaizCuadrada(0.0), 0.0001);

        // Caso de prueba: número negativo (debe lanzar una excepción)
        assertThrows(IllegalArgumentException.class, () -> {
            operaciones.calcularRaizCuadrada(-1.0);
        });
    }


}
