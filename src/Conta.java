public class Conta extends Produto{
    private float saldo;

    public Conta(String nome, Cliente cliente, Banco banco, float saldo) {
        super(nome, cliente, banco);
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
