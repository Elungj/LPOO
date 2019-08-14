package com.company.Produto;

import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        int opc=0;
        Scanner sc = new Scanner(System.in);
	    ProdutoTeste pp = new ProdutoTeste();
	    do{
            System.out.println("Digite 1... para cadastrar");
            System.out.println("Digite 2... para dar entrada de produtos");
            System.out.println("Digite 3... para dar a retirada de produtos");
            System.out.println("Digite 4... para listar os produtos");
            System.out.println("Digite 9... para sair");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    pp.cadastrarP();
                    break;
                case 2:
                    pp.entrada();
                    break;
                case 3:
                    pp.saida();
                    break;
                case 4:
                    pp.listarDados();
                    break;
                case 9:
                    System.out.println("Preparando pra sair");
                    break;
                    default:
                        System.out.println("Opçao invalida");
            }
        }while (opc!=9);
    }
}
