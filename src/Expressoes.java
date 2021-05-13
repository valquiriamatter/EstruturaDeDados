import java.util.Stack;

public class Expressoes {


    public static void main(String[] args) {

        imprimeResultado("A+B");
        imprimeResultado("A + B (C - D)");
        imprimeResultado("A + B (C - D)]");
        imprimeResultado("A + B {C - D)]");
        imprimeResultado("A + B {C - D}");
    }




    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static void imprimeResultado(String expressao){
        System.out.println(expressao + " Está balanceado ? " + verificaSimbolosBalanceados(expressao));
    }


    public static boolean verificaSimbolosBalanceados(String expressao) {

        boolean balanceado = true;
        Stack<Character> pilha = new Stack<>();
        int index = 0;
        char simbolo;
        char topo;

        while (index < expressao.length()){
            simbolo = expressao.charAt(index);

            if(ABRE.indexOf(simbolo) > -1){
                pilha.push(simbolo);
            } else if(FECHA.indexOf(simbolo) > -1){
                if(pilha.isEmpty()){
                    return false;
                }else {
                    topo = pilha.pop();
                    if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }

            index++;
        }

        return true;

    }

}
