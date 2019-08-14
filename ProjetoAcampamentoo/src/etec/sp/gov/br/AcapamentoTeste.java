package etec.sp.gov.br;

import java.util.Scanner;

public class AcapamentoTeste {

    public static void main(String[] args) {
	// write your code here
        Acampamento membro = new Acampamento();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        membro.nome = sc.nextLine();
        System.out.println("Digite a sua idade: ");
        membro.idade = Integer.parseInt(sc.nextLine());
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();


    }
}
