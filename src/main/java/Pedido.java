public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        this.estado = EstadoPedidoCriado.getInstance();
    }
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
    public boolean criar() {
        return estado.criar(this);
    }
    public boolean pagar() {
        return estado.pagar(this);
    }
    public boolean enviar() {
        return estado.enviar(this);
    }
    public boolean fechar() {
        return estado.fechar(this);
    }
    public EstadoPedido getEstado() {
        return estado;
    }
}
