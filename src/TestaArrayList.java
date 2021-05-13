import java.util.ArrayList;
import java.util.Scanner;

public class TestaArrayList extends TestaLista {

    public static void main(String[] args) {

        // 1-criar um menu pro cliente escolher a opção que deseja
        Scanner scanner = new Scanner(System.in);

        ArrayList<Contato> arrayList = new ArrayList<Contato>(20);
        criarContatosDinamicamente(5, arrayList);

        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(scanner);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(scanner, arrayList);
                    break;
                case 2:
                    adicionarContatoPosicao(scanner, arrayList);
                    break;
                case 3:
                    obtemContatoPosicao(scanner, arrayList);
                    break;
                case 4:
                    obtemContato(scanner, arrayList);
                    break;
                case 5:
                    pesquisarUltimoIndice(scanner, arrayList);
                    break;
                case 6:
                    pesquisarContatoExiste(scanner, arrayList);
                    break;
                case 7:
                    excluirPorPosicao(scanner, arrayList);
                    break;
                case 8:
                    excluirContato(scanner, arrayList);
                    break;
                case 9:
                    imprimeTamanhoVetor(arrayList);
                    break;
                case 10:
                    limparVetor(arrayList);
                    break;
                case 11:
                    imprimirVetor(arrayList);
                    break;
            }


        }

        System.out.println("Você digitou 0, programa encerrado");


    }


    private static void imprimirVetor(ArrayList<Contato> arrayList) {

        System.out.println(arrayList);
    }

    private static void limparVetor(ArrayList<Contato> arrayList) {

        arrayList.clear();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }


    private static void imprimeTamanhoVetor(ArrayList<Contato> arrayList) {

        System.out.println("Tamanho do vetor é de: " + arrayList.size());
    }

    private static void adicionarContatoPosicao(Scanner scanner, ArrayList<Contato> arrayList) {
        System.out.println("Criando um contato, entre com as informações");

        String nome = leInformacao("Entre com o nome", scanner);
        String telefone = leInformacao("Entre com o telefone", scanner);
        String email = leInformacao("Entre com o email", scanner);

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);

        int pos = leInformacaoInt("Entre com a posição", scanner);

        try {
            arrayList.add(pos, contato);
            System.out.println("Contato Adicionado com Sucesso!");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida, não adicionado.");
        }

    }

    private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> arrayList) {

        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o telefone", scan);
        String email = leInformacao("Entre com o email", scan);

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);

        arrayList.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> arrayList) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = arrayList.get(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scan, ArrayList<Contato> arrayList) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = arrayList.get(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do contato encontrado...");
            pos = arrayList.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> arrayList) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = arrayList.get(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do último índice do contato encontrado...");
            pos = arrayList.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> arrayList) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = arrayList.get(pos);

            boolean existe = arrayList.contains(contato);

            if (existe) {
                System.out.println("Contato existe, seguem dados:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe.");
            }


        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    protected static void excluirPorPosicao(Scanner scan, ArrayList<Contato> arrayList) {

        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            arrayList.remove(pos);
            System.out.println("Contato Excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(Scanner scan, ArrayList<Contato> arrayList) {

        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            Contato contato = arrayList.get(pos);

            arrayList.remove(contato);

            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }


    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> arrayList) {

        Contato contato;

        for (int i = 0; i <= quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("0000-000" + i);
            contato.setEmail("contato" + i + "@gmail.com");

            arrayList.add(contato);
        }
    }

    private static String leInformacao(String msg, Scanner scanner) {

        System.out.println(msg);
        String entrada = scanner.nextLine();

        return entrada;

    }

    private static int leInformacaoInt(String msg, Scanner scanner) {

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scanner.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;

            } catch (Exception ex) {
                System.out.println("Entrada Inválida, digite novamente");
            }
        }


        return num;

    }


}



