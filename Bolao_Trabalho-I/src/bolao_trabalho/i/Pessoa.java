/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bolao_trabalho.i;

import java.util.Scanner;

/**
 *
 * @author 20221TIIMI0050
 */
public class Pessoa {
    protected String nome, cpf;

    public Pessoa() {
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite o nome: ");
        this.nome = s.nextLine();
        System.out.printf("Digite o cpf: ");
        this.cpf = s.next();
    }
    
    public void listarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
    
}
