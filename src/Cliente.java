import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final String nome;
    private final List<Produto> produtos = new ArrayList<>();
    private final List<Banco> bancos = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    public void removeProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public List<Banco> getBancos() {
        return bancos;
    }

    public void addBanco(Banco banco) {
        this.bancos.add(banco);
    }

    public void removeBanco(Banco banco) {
        this.bancos.remove(banco);
    }
}
