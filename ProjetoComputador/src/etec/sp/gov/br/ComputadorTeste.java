package etec.sp.gov.br;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ComputadorTeste {

    public static void main(String[] args) {
	// write your code here
        Computador Intel1 = new Computador();
        Intel1.marca = "HP";
        Computador Intel2 = new Computador();
        Intel2.marca = "IBM";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cor: ");
        Intel1.cor = sc.nextLine();
        System.out.println("Digite o modelo: ");
        Intel1.modelo = sc.nextLine();
        System.out.println("Digite o numero de serie: ");
        Intel1.numeroSerie = Long.parseLong(sc.nextLine());
        System.out.println("Digite o preço: ");
        Intel1.preco = Double.parseDouble(sc.nextLine());
        Intel1.imprimir();
        Intel1.calcularValor();
        Intel1.imprimir();

        System.out.println("Digite a cor: ");
        Intel2.cor = sc.nextLine();
        System.out.println("Digite o modelo: ");
        Intel2.modelo = sc.nextLine();
        System.out.println("Digite o numero de serie: ");
        Intel2.numeroSerie = Long.parseLong(sc.nextLine());
        System.out.println("Digite o preço: ");
        Intel2.preco = Double.parseDouble(sc.nextLine());
        Intel2.imprimir();
        Intel2.calcularValor();
        Intel2.imprimir();
        int receber = Intel2.alterarValor(4500);
        if(receber == 1){
            System.out.println("Valor Alterado");
        }else{
            System.out.println("Valor NAO alterado");
        }
        Intel2.imprimir();
    }
}
