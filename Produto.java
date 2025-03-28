
package produto;


public class Produto {

     private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "\nPreço: R$" + String.format("%.2f", preco) + 
               "\nQuantidade: " + quantidade + "\nTotal: R$" + String.format("%.2f", calcularTotal()) + 
               "\n--------------------------\n";
    }
}
