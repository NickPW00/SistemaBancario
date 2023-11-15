public class GerenciadorDeIntegracoes {
    public static void adicionarClientesEmBanco(Cliente cliente, Banco banco) {
        cliente.addBanco(banco);
        banco.addClientes(cliente);
    }

    public static void adicionarProdutos(Cliente cliente, Banco banco, Produto conta) {
        cliente.addProdutos(conta);
        banco.addProdutos(conta);
    }
}