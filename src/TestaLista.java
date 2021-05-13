import java.util.Scanner;

public class TestaLista {

    public static void main(String[] args) {

        /*
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Val");
        arrayList.add("Caleb");
        arrayList.add("Murilo");
        arrayList.add("Lais");

        arrayList.lastIndexOf("Val");
        arrayList.remove("Lais");
        arrayList.get(0);
        arrayList.clear();*/

        // 1-criar um menu pro cliente escolher a opção que deseja

        Scanner scanner = new Scanner(System.in);

        Lista<Contato> arrayList = new Lista<Contato>(20);
        criarContatosDinamicamente(5, arrayList);

        int opcao = 1;

        while (opcao!=0){
            opcao = obterOpcaoMenu(scanner);

           switch (opcao){
               case 1: adicionarContatoFinal(scanner, arrayList); break;
               case 2: adicionarContatoPosicao(scanner, arrayList); break;
               case 3: obtemContatoPosicao(scanner, arrayList); break;
               case 4: obtemContato(scanner, arrayList); break;
               case 5: pesquisarUltimoIndice(scanner, arrayList); break;
               case 6: pesquisarContatoExiste(scanner, arrayList); break;
               case 7: excluirPorPosicao(scanner, arrayList); break;
               case 8: excluirContato(scanner, arrayList); break;
               case 9: imprimeTamanhoVetor(arrayList); break;
               case 10: limparVetor(arrayList); break;
               case 11: imprimirVetor(arrayList); break;
            }


        }

        System.out.println("Você digitou 0, programa encerrado");





    }


    private static void imprimirVetor(Lista<Contato> arrayList){

        System.out.println(arrayList);
    }

    private static void limparVetor(Lista<Contato> arrayList){

        arrayList.limpar();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }


    private static void imprimeTamanhoVetor(Lista<Contato> arrayList){

        System.out.println("Tamanho do vetor é de: " + arrayList.tamanho());
    }

    private static String leInformacao(String msg, Scanner scanner){

        System.out.println(msg);
        String entrada = scanner.nextLine();

        return entrada;

    }

    private static int leInformacaoInt(String msg, Scanner scanner){

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida){
            try{
                System.out.println(msg);
                String entrada = scanner.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;

            }catch (Exception ex){
                System.out.println("Entrada Inválida, digite novamente");
            }
        }



        return num;

    }

    private static void adicionarContatoPosicao(Scanner scanner, Lista<Contato> arrayList){
        System.out.println("Criando um contato, entre com as informações");

        String nome = leInformacao("Entre com o nome", scanner);
        String telefone = leInformacao("Entre com o telefone", scanner);
        String email = leInformacao("Entre com o email", scanner);

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);

        int pos = leInformacaoInt("Entre com a posição" , scanner);

        try{
            arrayList.adiciona(pos,contato);
            System.out.println("Contato Adicionado com Sucesso!");
            System.out.println(contato);

        }catch (Exception e){
            System.out.println("Posição inválida, não adicionado.");
        }

    }

    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> arrayList){

        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o telefone", scan);
        String email = leInformacao("Entre com o email", scan);

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);

        arrayList.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> arrayList){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = arrayList.busca(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scan, Lista<Contato> arrayList){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = arrayList.busca(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do contato encontrado...");
            pos = arrayList.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> arrayList){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = arrayList.busca(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do último índice do contato encontrado...");
            pos = arrayList.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> arrayList){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = arrayList.busca(pos);

            boolean existe = arrayList.contem(contato);

            if (existe){
                System.out.println("Contato existe, seguem dados:");
                System.out.println(contato);
            }else {
                System.out.println("Contato não existe.");
            }


        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner scan, Lista<Contato> arrayList){

        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            arrayList.remove(pos);
            System.out.println("Contato Excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(Scanner scan, Lista<Contato> arrayList){

        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            Contato contato = arrayList.busca(pos);

            arrayList.remove(contato);

            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    protected static int obterOpcaoMenu(Scanner scanner){

        int opcao = 0;
        boolean entradaValida = false;
        String entrada;

        while (!entradaValida){

            System.out.println("Digite a opção desejada:\n");

            System.out.println("1: Adicionar no final");
            System.out.println("2: Adicionar em uma posição");
            System.out.println("3: Consultar contato de uma posição");
            System.out.println("4: Consultar contato");
            System.out.println("5: Consultar último contato");
            System.out.println("6: Verificar se contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verificar tamanho");
            System.out.println("10: Excluir tudo");
            System.out.println("11: Ver Contados");
            System.out.println("0: Sair");

            try{
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if(opcao >= 0 && opcao <=11){
                    entradaValida = true;
                }else {
                    throw new Exception();
                }

            }catch (Exception ex){
                System.out.println("Entrada inválida, digite novamente.\n\n");
            }




        }



        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> arrayList) {

        Contato contato;

        for (int i = 0; i <= quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("0000-000" + i);
            contato.setEmail("contato" + i + "@gmail.com");

            arrayList.adiciona(contato);
        }
    }


}
