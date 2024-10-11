

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque(new ArrayList<>());

        Produto celular = new Eletronico("Celular", 1200.00);
        Produto camiseta = new Vestuario("Camiseta", 50.00);

        estoque.adicionarProduto(celular);
        estoque.adicionarProduto(camiseta);

        System.out.println("Preços com desconto:");
        estoque.exibirPrecosComDesconto(10);
    }
}