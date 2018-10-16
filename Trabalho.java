/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoEstrutura;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Trabalho {
    
    public static void main(String[] args) {
           int opcao =0;
           int opcao2=0;
           int opcao3 = 0;
        
            Pilha p = new Pilha();
            Fila f = new Fila();
            Scanner s = new Scanner(System.in);
           
            
         do {  
                  System.out.println("1 - Pilha");
                  System.out.println("2 - Fila");
                  System.out.println("Digite o que deseja:");
                  opcao = Integer.parseInt(s.nextLine());
                  
                  
                  if (opcao == 1){ do { 
                      
                System.out.println("1 - Inserir elementos");
                System.out.println("2 - Remover elementos");
                System.out.println("3 - Imprime Pilha");
                System.out.println("4 - Ver topo pilha");
        
                opcao2 = Integer.parseInt(s.nextLine());
                
                 if(opcao2 == 1){
                        System.out.println("Digite um elemento: ");
                         p.insereNome(s.nextLine());
                        System.out.println("Elemento inserido");
                      
                 
                 }
                 
                 if(opcao2 == 2){
                   p.removeNome();
                  
                 }
                 
                 if (opcao2 == 3){
                 p.imprimePilha();
                 
                 }
                 
                 if(opcao2 == 4){
                 p.verTopo();
                 }
                 
                 
                
                 
              
            
                      
                      
                      
                      
                      
                          
                      } while (opcao2 != 5);
                  
                  
                  
                  
                  }
                  
                  if(opcao == 2){ 
                     do { 
                         System.out.println("1 - Inserir elementos: ");
                         System.out.println("2 - Remover elementos: ");
                         System.out.println("3 - Imprimir Fila: ");
                         opcao3 = Integer.parseInt(s.nextLine());
                         if (opcao3 == 1){
                             System.out.println("Insira um elemento: ");
                             f.insereNome(s.nextLine());
                             System.out.println("Inserido com sucesso ");
                         }
                         
                  if(opcao3 == 2){
                      f.removeNome();
                  
                  }
                  
                  if(opcao3 == 3){
                     f.imprimeFila();
                  }


                         
                         
                     } while (opcao3 != 4);
                  }
             
             
             
             
            
        } while (opcao != 3);
            
   
    

        
    }}
    
    

