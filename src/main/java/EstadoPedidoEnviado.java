 public class EstadoPedidoEnviado extends EstadoPedido {
    private EstadoPedidoEnviado() {}
    private static final EstadoPedidoEnviado instance = new EstadoPedidoEnviado();
    public static EstadoPedidoEnviado getInstance() {
        return instance;
    }
    public String getEstado() {
        return "Enviado";
    }

    public boolean fechar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoEnviado.getInstance());
        return true;
    }
}
