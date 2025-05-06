import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<usuarios>usuarios=new ArrayList<>();
    public static void main(String[] args) {

        int opcao;
        //System.out.println("\\n=====BEM VINDO A LOJINHO DO TADEU =====");
        //System.out.println("1-ENTRAR NA CONTA.");
        //System.out.println("2-CRIAR USUARIO.");
        //System.out.println("3-DELETAR USUARIO.");
        //System.out.println("4-SAIR.");
        do {
            System.out.println("\n CENTRAL DE CONTROLE DE ESTOQUES.");
            System.out.println("1-CRIAR PRODUTOS");
            System.out.println("2-LISTA DE PRODUTOS E INFORMAÇÕES DE MERCADORIA.");
            System.out.println("3-EDITAR INFORMAÇÕES DE PRODUTOS");
            System.out.println("0-SAIR");
            System.out.print("ESCOLHA UMA OPÇÃO:");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch  (opcao) {
                case 1 ->operacoesdeestoque.adicionarprodutos();
                //case 2 -> listarSuplementos();
                //case 3 -> editarQuantidade();
                //case 4 -> removerSuplemento();
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while(opcao !=0)  ;
    }
}