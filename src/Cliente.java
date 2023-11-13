import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Produto> produtos = new ArrayList<>();
    private List<Banco> bancos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProdutos(List<Produto> produtos) {
        this.produtos = produtos.add();
    }

    public void removeProdutos(List<Produto> produtos) {
        this.produtos = produtos.remove();
    }

    public List<Banco> getBancos() {
        return bancos;
    }

    public void addBancos(List<Banco> bancos) {
        this.bancos = bancos.add();
    }

    public void removeBancos(List<Banco> bancos) {
        this.bancos = bancos.remove();
    }
}
