public class Pilha<T> extends EstruturaEstatica {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public Object topo() {

        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[tamanho - 1];

    }

    public T desempilha() {
        if (this.estaVazia()){
            return null;
        }
        return (T) this.elementos[--tamanho];
    }



}
