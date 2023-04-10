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
public class Aposta {
    private int n;
    private int[] numeros;
    private Jogador organizador;
    private Jogador jog1;
    private Jogador jog2;

    public Aposta() {
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite a quantidade de numeros do cartao: ");
        int num = s.nextInt();
        
        while (num < 6 || num > 15) {
            System.out.println("Digita uma quantidade valida, criatura!");
            System.out.printf("Digite a quantidade de numeros do cartao: ");
            num = s.nextInt();
        }
        
        this.n = num;
        this.numeros = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.printf("Digite o " + (i+1) +" (Valores entre 1 e 60): ");
            int n = s.nextInt(); 
            
            while(n < 1 || n > 60 || verificaList(this.numeros, n)){
                System.out.println("Digita um numero valido, criatura!");
                System.out.printf("Digite o " + (i+1) +" (Valores entre 1 e 60): ");
                n = s.nextInt(); 
            }
            
            this.numeros[i] = n;
        }
        
        this.jog1 = new Jogador();
        this.jog2 = new Jogador();
        this.organizador = new Jogador();
        
    }
    
    public boolean vencedora(int[] nums){
        int cont = 0;
        for (int i = 0; i < this.n; i++){
            for(int j = 0; j < nums.length; j++){
                if(this.numeros[i] == nums[j]){
                    cont += 1;
                }
            }
        }
        return cont == nums.length;
    }
    
    public void exibirPremio(double valor){
        System.out.println("Vencedores\n");
                
        double valorOrg = valor * 0.1;
        valor = (valor * 0.9) / 3;
        
        this.organizador.listarDados();
        System.out.println("Premio: " + (valorOrg + valor) + "\n");
        this.jog1.listarDados();
        System.out.println("Premio: " + valor + "\n");
        this.jog2.listarDados();
        System.out.println("Premio: " + valor);
        
    }
   
    public static boolean verificaList(int[] list, int num){
        for(int i = 0; i < list.length; i++){
            if(list[i] == num){
                return true;
            }
        }
        return false;
    }
}
