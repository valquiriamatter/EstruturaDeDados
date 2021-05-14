public class FilaComPrioridade<T> extends Fila<T>{


    public void enfileirar(T elemento){

        Comparable<Object> chave = (Comparable<Object>) elemento;

        int i;
        for (i=0; i<this.tamanho; i++){
            if (chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.adiciona(i, elemento);
    }
}
