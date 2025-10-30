public abstract class EstadoPedido {
    public abstract String getEstado();
    public boolean criar(Pedido pedido) {
        return false;
    }
    public boolean pagar(Pedido pedido) {
        return false;
    }
    public boolean enviar(Pedido pedido) {
        return false;
    }
    public boolean fechar(Pedido pedido) {
        return false;
    }
}
