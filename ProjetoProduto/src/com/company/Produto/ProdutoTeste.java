package com.company.Produto;

import java.util.Scanner;

public class ProdutoTeste {
    public String nome;
    public int qtd;
    public double preço;
    public int cod;

    public void listarDados(){
        System.out.println("nome do produto: " + nome);
        System.out.println("codigo do produto: " + cod);
        System.out.println("quantidade do produro: " + qtd);
        System.out.println("preço unico do produto" + preço);
    }

    public void entrada(){
        Scanner sc = new Scanner(System.in);
        int adc=0;
        System.out.println("Digite a quantidade de entrada:");
        adc = Integer.parseInt(sc.nextLine());
        qtd += adc;
    }

    public void saida(){
        Scanner sc = new Scanner(System.in);
        int sub=0;
        System.out.println("Digite a quantidade da saida:");
        sub = Integer.parseInt(sc.nextLine());
        if (sub < qtd){
            qtd -= sub;
        }else{
            System.out.println("Quantidade invalida");
        }
    }

    public void cadastrarP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        nome = sc.nextLine();
        System.out.println("Digite o codigo do produto");
        cod = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a quantidade do produto");
        qtd = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o preço unico do produto");
        preço = Double.parseDouble(sc.nextLine());
    }
}
