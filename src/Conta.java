import java.util.Objects;

public class Conta extends Produto{
    private double saldo;
    private double credito;
    private boolean isCreditoLiberado = false;
    private final String TIPO_PRODUTO = "CONTA";
    public Conta(String nome, Cliente cliente, Banco banco, double saldo) {
        super(nome, cliente, banco);
        this.saldo = saldo;
        GerenciadorDeIntegracoes.adicionarClientesEmBanco(cliente, banco);
        GerenciadorDeIntegracoes.adicionarProdutos(cliente, banco, this);
    }
    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    public void liberarCredito(double valor) {
        this.isCreditoLiberado = true;
        this.credito = valor;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void receberDeposito(double valorDesejado) {
        this.saldo += valorDesejado;
    }

    public void fazerTransferencia(double valorDesejado, Conta conta, String formaDeTransacao) {
        if ("debito".equals(formaDeTransacao)){
            if (this.saldo >= valorDesejado){
                this.saldo -= valorDesejado;
                if(conta != null) conta.receberDeposito(valorDesejado);
                else System.out.println("Transferencia feita, mas nenhum destinatário definido.");
            }
            else System.out.println("Saldo Indisponivel.");
        }
        else if("credito".equals(formaDeTransacao) && isCreditoLiberado)
        {
            if (this.credito >= valorDesejado){
                this.credito -= valorDesejado;
                if(conta != null) conta.receberDeposito(valorDesejado);
                else System.out.println("Transferencia feita, mas nenhum destinatário definido.");
            }
            else System.out.println("Saldo Indisponivel.");
        }
        else if (!isCreditoLiberado) System.out.println("Credito não liberado.");
        else if(formaDeTransacao == null) System.out.println("Selecione a forma de pagamento.");
    }

    public String getTipo() {
        return TIPO_PRODUTO;
    }

    public boolean isCreditoLiberado() {
        return isCreditoLiberado;
    }
}
