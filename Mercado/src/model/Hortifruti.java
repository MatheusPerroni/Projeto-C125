package model;


public class Hortifruti extends Alimentos {

    public Hortifruti(String nome, Double custo) {
        super(nome, custo);

    }

    @Override
    public void RemoverItem(String nome) {
        System.out.println("Item removido");

    }

}