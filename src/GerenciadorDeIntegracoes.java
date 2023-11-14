public class GerenciadorDeIntegracoes {
    public static void adicionarClientesEmBanco(Cliente cliente, Banco banco) {
        cliente.addBanco(banco);
        banco.addClientes(cliente);
    }
}