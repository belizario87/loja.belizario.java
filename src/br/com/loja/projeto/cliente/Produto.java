package br.com.loja.projeto.cliente;

public class Produto {
    private String nome;
    private String descricaoProduto;

    public Produto(String nome, String descricaoProduto) {
        this.nome = nome;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
}

