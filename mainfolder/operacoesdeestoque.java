
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalDateTime;

public class operacoesdeestoque {
    private String produtonome;
    private int quantidade;
    private int ID;
    private String tipodeproduto;
    private String composicao;
    private double preco;
    private String fornecedor;
    private String marca;
    private int recevement;

    public int getRecevement() {
        return recevement;
    }

    public void setRecevement(int recevement) {
        this.recevement = recevement;
    }

    public operacoesdeestoque() {

    }
    public operacoesdeestoque(int ID){
        this.ID=ID;
   }


    public int getID(int ID){
        return ID;
    }

    public void setID(int ID){
        this.ID=ID;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao= composicao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProdutonome(String produtonome){
        this.produtonome = produtonome;
    }

    public String getProdutonome(){
        return produtonome;
    }

    public void setTipodeproduto(String tipodeproduto) {
        this.tipodeproduto = tipodeproduto;
    }

    public String getTipodeproduto() {
        return tipodeproduto;
    }

    public void setCafeina(boolean cafeina) {
    }
    public boolean getCafeina(boolean cafeina){
       return cafeina;
    }

    public static void adicionarprodutos(){

  Scanner scanner=new Scanner(System.in);
        ArrayList<operacoesdeestoque>bank=new ArrayList<>();
      Random random=new Random();
        operacoesdeestoque add=new operacoesdeestoque();
        bank.add(add);

        System.out.print("qual o tipo de suplemento:");
        String tipodeproduto= scanner.nextLine();
        add.setTipodeproduto(tipodeproduto);
        scanner.nextLine();

        System.out.println("qual o nome do suplemento:");
        String produto=scanner.nextLine();
        add.setProdutonome(produto);
        scanner.nextLine();

  /* System.out.println("composição:");
        String composicoes=scanner.nextLine();
            String[] componentes=composicoes.split(",");
               add.setComposicao(componentes);
                    if (composicoes.contains("cafe")){
                        add.setCafeina(true);
                        scanner.nextLine();
                    }
                        else{
                            add.setCafeina(false);
                        scanner.nextLine();
                        }*/
        System.out.println("quantidade comprada:");
        int quantidade= scanner.nextInt();
        add.setQuantidade(quantidade);


        add.setID(random.nextInt(999999)+100000);
        add.setRecevement(LocalDateTime.now());

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime=add.format(formatter);

        System.out.println(newDateTime+" "+ add.ID);








    }
}