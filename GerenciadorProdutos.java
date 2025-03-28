import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    
 private List<Produto> produtos;

    public GerenciadorProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public String listarProdutos() {
        if (produtos.isEmpty()) {
            return "Nenhum produto cadastrado.";
        }

        StringBuilder lista = new StringBuilder();
        for (Produto p : produtos) {
            lista.append(p.toString());
        }
        return lista.toString();
    }
}

