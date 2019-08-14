package etec.sp.gov.br;

import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();
    double valor;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ContaTeste ct = new ContaTeste();
	int opção;
	    do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Pressione.. 1 para Cadastrar");
            System.out.println("Pressione.. 2 para Consultar");
            System.out.println("Pressione.. 3 para Sacar");
            System.out.println("Pressione.. 4 para Depositar");
            System.out.println("Pressione.. 0 para Sair");
            opção = Integer.parseInt(sc.nextLine());
            switch (opção) {
                case 1:
                    ct.execCadastrar();
                    break;
                case 2:
                    ct.execConsultar();
                    break;
                case 3:
                    ct.execSacar();
                    break;
                case 4:
                    ct.execDepositar();
                    break;
                case 0:
                    System.out.println("Preparando para sair");
                    break;
                    default:
                        System.out.println("Opçao invalida");
            }
        } while (opção != 0);
    }

    public void execCadastrar() {
        System.out.println("A sua conta");
        cc.conta = sc.nextLine();
        System.out.println("A sua Agencia");
        cc.agencia = sc.nextLine();
        System.out.println("O seu saldo");
        cc.saldo = Double.parseDouble(sc.nextLine());
        System.out.println("O seu nome");
        cc.nomeCliente = sc.nextLine();
    }

    public void execConsultar() {
        cc.imprimir();
    }

    public void execSacar() {
        System.out.println("Digite o valor do Saque");
        valor = Double.parseDouble(sc.nextLine());
        cc.sacar(valor);
        if(cc.saldo == 1){
            System.out.println("Saque realizado");
        }else{
            System.out.println("Saque nao realizado");
        }
    }

    public void execDepositar() {
        System.out.println("Digite o valor do deposito");
        valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
    }

}
