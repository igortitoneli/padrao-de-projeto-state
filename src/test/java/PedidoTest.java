import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void DeveCriarPedido() {
        Pedido pedido = new Pedido();
        assertEquals("Criado", pedido.getEstado().getEstado());
    }

    @Test
    public void DevePagarPedido() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.pagar());
    }
    @Test
    public void DeveEnviarPedido() {
        Pedido pedido = new Pedido();
        pedido.pagar();
        assertTrue(pedido.enviar());
    }
    @Test
    public void DeveFecharPedido() {
        Pedido pedido = new Pedido();
        pedido.pagar();
        pedido.enviar();
        assertTrue(pedido.fechar());
    }
}
