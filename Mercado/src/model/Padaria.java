package model;

public class Padaria extends Alimentos {

    public Padaria(String nome, Double custo){
        super(nome, custo);

    }

    @Override
    public void RemoverItem(String nome) {
        System.out.println("Item Removido");
    }
}
