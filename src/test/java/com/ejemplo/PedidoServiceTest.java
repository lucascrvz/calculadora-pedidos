package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoServiceTest {

    PedidoService service = new PedidoService();

    @Test
    void testSinDEscuentoYEnvioNormal() {
        double total = service.calcularTotal(100.0, "PROMO", false);
        assertEquals(110.0, total);
    }
    
    @Test
    void testConDescuentoYEnvioExpress() {
        double total = service.calcularTotal(100.0, "PROMO10", true);
        assertEquals(110.0, total);
    }

    @Test
    void testCondescuentoYEnvioNormal() {
        double total = service.calcularTotal(200.0, "PROMO10", false);
        assertEquals(190.0, total);
    }

    @Test
    void testSinDescuentoYEnvioExpress() {
        double total = service.calcularTotal(150.0, "PROMO", true);
        assertEquals(170.0, total);
    }

}
