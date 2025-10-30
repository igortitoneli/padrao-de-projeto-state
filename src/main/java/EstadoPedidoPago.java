public class EstadoPedidoPago extends EstadoPedido {
    private EstadoPedidoPago() {}
    private static final EstadoPedidoPago instance = new EstadoPedidoPago();
    public static EstadoPedidoPago getInstance() {
        return instance;
    }
    public String getEstado() {
        return "Pago";
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoEnviado.getInstance());
        return true;
    }
}
