
import model.*;
import model.RepetidosException;


public class Main {

    public static void main(String[] args) {
            Mercado mercado = new Mercado("Teste");

            try {

                    // adicionando o item banana
                    Alimentos alimento = new Hortifruti("banana", 20.0);
                    alimento.setQuantidade(10);
                    mercado.addItem(alimento);

                    // mostrando o item
                    mercado.mostrarItens();

                    // adicionando item
                    Alimentos alimento3 = new Padaria("Pao", 15.0);
                    alimento3.setQuantidade(10);
                    mercado.addItem(alimento3);

                    // mostrando item
                    mercado.mostrarItens();

                    // adicionando mesmo tipo de item
                    Alimentos alimento2 = new Hortifruti("banana", 20.0);
                    alimento2.setQuantidade(10);
                    mercado.addItem(alimento2);


            }catch (RepetidosException ex){
                    ex.printStackTrace();
            }


            // mostrando item
            mercado.mostrarItens();

            // removendo item
            mercado.removerItem("banana");
            // mostrando item
            mercado.mostrarItens();

            if (true) {
                System.exit(0);
            }

        }
    }

