package model;

public class Acougue extends Alimentos {

    public Acougue(String nome, Double custo){
        super(nome, custo);

    }

    @Override
    public void RemoverItem(String nome) {
        System.out.println("Item removido");
    }
}
