import java.util.Stack;

public class Palindromo {

    public static void main(String[] args) {

        String palavra = "abcd";
        System.out.println(palavra);
        System.out.println(testaPalindromo(palavra));

    }


    public static boolean testaPalindromo(String palavra){

        Stack<Character> pilha = new Stack<>();

        for(int i=0; i<palavra.length(); i++){
            pilha.push(palavra.charAt(i));
        }

        String palavraInversa = "";

        while (!pilha.empty()){
            palavraInversa += pilha.pop();
        }

        if(palavra.equalsIgnoreCase(palavraInversa)){
            System.out.println("É um palíndromo!");
            return true;
        }
        System.out.println("Não é um palíndromo!");
        return false;
    }

}
