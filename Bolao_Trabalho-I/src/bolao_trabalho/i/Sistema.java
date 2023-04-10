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
public class Sistema {
    private Aposta a;

    public Sistema() {
        this.a = new Aposta();
    }
    
    public void sorteio(){
        Scanner s = new Scanner(System.in);
        int[] nums;
        nums = new int[6];
        System.out.println("Digite os valores sorteados: ");
        
        for(int i = 0; i < 6; i++){
            System.out.print((i+1) + ": ");
            nums[i] = s.nextInt();    
        }
        
        System.out.printf("Digite o valor do premio: ");
        double valor = s.nextDouble();
        System.out.println("");
        
        if (this.a.vencedora(nums)){
            this.a.exibirPremio(valor);
        }
        else{
            System.out.println("Nao houveram vencedores");
        }
    }
    
    
}
