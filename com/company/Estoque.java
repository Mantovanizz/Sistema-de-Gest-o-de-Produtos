package com.company;

import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
        System.out.println(produto.getNome() + ": R$ " + produto.calcularDesconto(porcentagem));
        }
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
}
