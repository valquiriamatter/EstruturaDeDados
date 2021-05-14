import java.util.PriorityQueue;
import java.util.Queue;

public class TestaFilaComPrioridade {

    public static void main(String[] args) {

        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
        Queue<Integer> queue = new PriorityQueue<>();

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(2);

        queue.add(1);
        queue.add(3);
        queue.add(2);


        System.out.println(fila);
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(fila.desenfileirar());



    }




}
