public class EstadoPedidoFechado extends EstadoPedido {
    private EstadoPedidoFechado() {}
    private static final EstadoPedidoFechado instance = new EstadoPedidoFechado();
    public static EstadoPedidoFechado getInstance() {
        return instance;
    }
    public String getEstado() {
        return "Fechado";
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoEnviado.getInstance());
        return true;
    }
}
