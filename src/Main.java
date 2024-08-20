public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    String nome = "Jão";
    int id = 25; //idade
    double sal = 1300;// salario
    double desc = 1500;// desconto no salario
    int meses = 12;
    int prodComp = 5;// produtos comprados
    double valorComp = 3000;//valor comprado



    double salAn = sal * meses;// salAn = sálario anual
    double salLiq = salAn - desc;// salLiq = sálario liquido
    double medValorGast = valorComp/prodComp;// medValorGast = média Valor Gasto
    double rest = salLiq - valorComp;// rest = restante
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