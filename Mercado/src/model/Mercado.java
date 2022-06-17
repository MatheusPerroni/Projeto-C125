package model;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

    private String nome;
    private List<Alimentos> produtos = new ArrayList<Alimentos>();

    public Mercado(String nome) {
        this.nome = nome;
    }

    public void addItem(Alimentos alimento) throws RepetidosException{

               for (Alimentos produto : produtos) {
            if (produto.getNome().equals(alimento.getNome())) {
                throw new RepetidosException("Produto já cadastrado.");

            }
        }
           produtos.add(alimento);


    }

    public void mostrarItens() {

        System.out.println("Quantidade de itens:" + produtos.size());

        for (Alimentos produto : produtos) {
            System.out.println("Nome:" + produto.getNome());
            System.out.println("Preço:" + produto.getCusto());
            System.out.println("Quantidade:" + produto.getQuantidade());
        }
    }

    public void removerItem(String nomeDoItem) {

        for (Alimentos produto : produtos) {
            if (produto.getNome().equals(nomeDoItem)) {
                produtos.remove(produto);
                break;
            }
        }

    }


}
