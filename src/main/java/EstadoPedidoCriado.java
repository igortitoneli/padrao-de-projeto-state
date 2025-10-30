public class EstadoPedidoCriado extends EstadoPedido {
    private EstadoPedidoCriado() {}
    private static final EstadoPedidoCriado instance = new EstadoPedidoCriado();
    public static EstadoPedidoCriado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Criado";
    }

    public boolean pagar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoPago.getInstance());
        return true;
    }
}
