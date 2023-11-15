public class Cartao extends Produto{
    private final String numeracao;
    private final Conta conta;
    private final String TIPO_PRODUTO = "CARTÃO";

    public Cartao(String numeracao, String nome, Conta conta, Cliente cliente, Banco banco) {
        super(nome, cliente, banco);
        this.numeracao = numeracao;
        this.conta = conta;
        GerenciadorDeIntegracoes.adicionarProdutos(cliente, banco, this);
    }

    public void pagar(double valorDesejado, String tipoPagamento) {
        if (this.conta != null) {
            if ("debito".equals(tipoPagamento)) {
                if (this.conta.getSaldo() >= valorDesejado) {
                    this.conta.setSaldo(this.conta.getSaldo() - valorDesejado);
                } else {
                    System.out.println("Saldo Indisponível para débito.");
                }
            } else if ("credito".equals(tipoPagamento)) {
                if (this.conta.getCredito() >= valorDesejado) {
                    this.conta.setCredito(this.conta.getCredito() - valorDesejado);
                } else {
                    System.out.println("Saldo Indisponível para crédito.");
                }
            } else {
                System.out.println("Tipo de pagamento inválido.");
            }
        } else {
            System.out.println("Cartão não está vinculado a uma conta.");
        }
    }

    public String getNumeracao() {
        return numeracao;
    }

    public String getTipo() {
        return TIPO_PRODUTO;
    }
}
