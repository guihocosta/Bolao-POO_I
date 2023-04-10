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
public class Jogador extends Pessoa{
    private String pix;

    public Jogador() {
        super();
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite a chave pix: ");
        this.pix = s.next();
    }
    
    public void listarDados(){
        super.listarDados();
        System.out.println("Pix: " + this.pix);
    }
    
}
