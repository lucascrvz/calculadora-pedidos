package com.ejemplo;

public class PedidoService {
    
    private DescuentoRepository repository;

    public PedidoService() {
        this.repository = new DescuentoRepository();
    }

    public double calcularTotal(double subtotal, String codigoDescuento, boolean envioExpress) {
        double descuento = repository.obtenerPorcentaje(codigoDescuento);
        double envio = envioExpress ? 20.0 : 10.0;
    return (subtotal * (1 - descuento)) + envio;
    }
}
