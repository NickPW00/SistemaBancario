public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Banco banco1 = new Banco("Banco do Brasil");
        Cliente cliente1 = new Cliente("Joao");
        Conta conta1 = new Conta("Conta1", cliente1, banco1, 2000);

        GerenciadorDeIntegracoes.adicionarClientesEmBanco(cliente1, banco1);

        System.out.println(banco1.getClientes().stream().count() + " " + conta1.getNome());

        // A ideia é juntar o addBanco e o addCliente, mas estou pensando fazer uma classe só para isso
    }
}