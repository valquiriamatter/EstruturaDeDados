public class TestaFila {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());

        System.out.println("Espiando o primeiro da fila: " + fila.espiar());

        System.out.println("Desenfileirando... " + fila.desenfileirar());

        System.out.println(fila.toString());

        System.out.println("Desenfileirando... " + fila.desenfileirar());

        System.out.println(fila.toString());
    }





}
