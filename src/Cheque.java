public class Cheque extends Produto{
    private final String TIPO_PRODUTO = "CHEQUE";

    public Cheque(String nome, Cliente cliente, Banco banco) {
        super(nome, cliente, banco);
        GerenciadorDeIntegracoes.adicionarProdutos(cliente, banco, this);
    }

    public String getTipo() {
        return TIPO_PRODUTO;
    }
}
