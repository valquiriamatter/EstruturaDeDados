public class Fila<T> extends EstruturaEstatica {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento){
        //this.elementos[this.tamanho] = elemento;
        //this.tamanho++;

        //this.elementos[this.tamanho++] = elemento;
        this.adiciona(elemento);
    }

    public T espiar(){
        if(this.estaVazia()){
            System.out.println("Fila está vazia...");
            return null;
        }

        return (T) this.elementos[0];
    }

    public T desenfileirar(){

        final int POS = 0;

        if(this.estaVazia()){
            System.out.println("Fila está vazia...");
            return null;
        }

        T elementoARemover = (T) this.elementos[POS];
        this.remove(POS);

        return elementoARemover;

    }


}
