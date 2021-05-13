import java.util.Stack;

public class ConversaoDecimalBinario {

    public static void main(String[] args) {

        imprimeResultado(2);
        imprimeResultado(4);
        imprimeResultado(10);
        imprimeResultado(25);
        imprimeResultado(10035);

        imprimeResultadoQualquer(25,16);
        imprimeResultadoQualquer(10035,8);
        imprimeResultadoQualquer(10035,16);
    }

    public static void imprimeResultado(int numero){
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static void imprimeResultadoQualquer(int numero, int base){
        System.out.println(numero + " em base " + base +  " é: " + decimalQualquerBase(numero, base));
    }

    public static String decimalBinario(int numero){

        Stack<Integer> pilha = new Stack<>();
        String numeroBinario = "";
        int resto;

        while (numero > 0){
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.isEmpty()){
            numeroBinario += pilha.pop();
        }
        return numeroBinario;
    }

    public static String decimalQualquerBase(int numero, int base){

        if (base > 16) {
            throw new  IllegalArgumentException();
        }

        Stack<Integer> pilha = new Stack<>();
        String numeroBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0){
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.isEmpty()){
            numeroBase += bases.charAt(pilha.pop());
        }
        return numeroBase;
    }



}
