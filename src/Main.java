public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    String nome = "Jão";
    int id = 25;
    double sal = 1300;
    double desc = 1500;
    int meses = 12;
    int prodComp = 5;
    double valorComp = 3000;



    double salAn = sal * meses;
    double salLiq = salAn - desc;
    double medValorGast = valorComp/prodComp;
    double rest = salLiq - valorComp;
    String informacao = nome + "," + salLiq + "Isto é oque sobrou!!";

    System.out.println("Nome: " + nome);
    System.out.println("Sálario: " + sal);
    System.out.println("Desconto Anual: " + desc);
    System.out.println("Sálario Anual: " + salAn);
    System.out.println("Sálario Liquido Anual: " + salLiq);
    System.out.println("Quantidade de Produtos Comprados:" + prodComp);
    System.out.println("Valor total gasto em produtos: " + valorComp);
    System.out.println("Média de valor gasto: " + medValorGast);
   System.out.println("Restante:" + rest);









    }
}