/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoEstrutura;

/**
 *
 * @author Pichau
 */
public class Pilha {
    String[] vetor = new String[15];
    private int topoPilha = -1;
  
  public void insereNome(String nome){
      if(topoPilha == vetor.length-1){
          System.out.println("Pilha Cheia");
      } 
      else
      {
          topoPilha++;
          vetor[topoPilha] = nome;
      }
  
  }
  public void removeNome(){
      if(topoPilha < 0){
          System.out.println("Pilha esta vazia");
      }
      else{
          
       vetor[topoPilha] = null;
       --topoPilha;
      }
  }
  
  public void imprimePilha(){
  
  for(int x = 0; x<vetor.length; x++){
      System.out.println("Item ["+ (x+1) + "] = "+ vetor[x]);
  }
  }
  
  public void pesquisaPilha(String nome){
  for (int x = 0; x<vetor.length - 1; x++){
    if(vetor[x].equals(nome)) {
    
        System.out.println("Encontrado Item[" + (x+1) + "] = "+ vetor[x]);}
  }
  }
  
  public void verTopo(){
      
      if(topoPilha > 0){
      System.out.println(vetor[topoPilha]);}else 
      {System.out.println("vetor vazio");}
          
  }
         
   
  
  
  
  
  
        
}
