import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TestaFila {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();
        Queue<Integer> filaq = new LinkedList<>();


        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);

        filaq.add(1);
        filaq.add(2);
        filaq.add(3);
        filaq.add(4);

        System.out.println(fila.estaVazia());
        System.out.println(filaq.isEmpty());

        System.out.println(fila.tamanho());
        System.out.println(filaq.size());

        System.out.println("Espiando o primeiro da fila: " + fila.espiar());
        System.out.println("Espiando o primeiro da fila: " + filaq.peek());

        System.out.println("Desenfileirando... " + fila.desenfileirar());
        System.out.println("Desenfileirando... " + filaq.remove());

        System.out.println(fila.toString());
        System.out.println(filaq.toString());

        System.out.println("Desenfileirando... " + fila.desenfileirar());
        System.out.println("Desenfileirando... " + filaq.remove());

        System.out.println(fila.toString());
        System.out.println(filaq.toString());
    }





}
