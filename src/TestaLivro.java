import java.util.Scanner;

public class TestaLivro {

    public static void main(String[] args) {

        Pilha<Livro> livros = new Pilha<>(20);
        Livro livro;

        Scanner scanner = new Scanner(System.in);


        for(int i=0; i<=6;i++){
            livro = new Livro("nome " + i, 2020 + i, 1000 + i, "João " +i);
            System.out.println("Empilhando..." + livro);
            livros.empilha(livro);

        }

        System.out.println("\nO livro do topo é: " + livros.topo());

        while (!livros.estaVazia()){
            System.out.println("\nDesempilhando...");
            System.out.println(livros.desempilha());
        }




    }



}
