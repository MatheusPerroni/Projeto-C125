package model;

import java.util.HashMap;
import java.util.Map;

public abstract class Alimentos {

    private String nome;
    private Double custo;
    private int quantidade;

    public static boolean containsKey(String nomeDoProjeto) {
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Alimentos(String nome, Double custo) {

        this.nome = nome;
        this.custo = custo;

    }

    public abstract void RemoverItem(String nome);

}
