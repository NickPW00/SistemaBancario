public class Conta extends Produto{
    private float saldo;

    public Conta(String nome, float saldo) {
        super(nome);
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
