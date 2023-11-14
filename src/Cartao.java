public class Cartao extends Produto{
    private String numeracao;

    public Cartao(String nome, Cliente cliente, Banco banco) {
        super(nome, cliente, banco);
    }
}
