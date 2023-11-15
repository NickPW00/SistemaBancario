public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Banco banco1 = new Banco("Banco do Brasil");
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Pedro");
        Conta conta1 = new Conta("Conta1", cliente1, banco1, 2000, 3000);
        Conta conta2 = new Conta("Conta2", cliente2, banco1, 2000, 4000);
        Cartao cartao1 = new Cartao("1234567-89", "Cartão do Joao", conta1, cliente1, banco1);

        cartao1.pagar(200, "debito");

        conta1.fazerTransferencia(3000, conta2, "credito");

        System.out.println("Clientes no banco1:" + banco1.getClientes().stream().count());
        System.out.println("Produtos no banco1:" + banco1.getProdutos().stream().count());
        System.out.println("Nome do Cliente1: " + cliente1.getNome());
        System.out.println("Saldo do cliente1: " + conta1.getSaldo());
        System.out.println("Saldo do cliente2: " + conta2.getSaldo());
        System.out.println("Saldo de credito do cliente2: " + conta2.getCredito());

        // A ideia é juntar o addBanco e o addCliente, mas estou pensando fazer uma classe só para isso. Feito.
    }
}