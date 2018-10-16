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
public class Fila {
    
    String[] vetor1 = new String[15];
    private int fimFila = -1;
    
    public void insereNome(String nome){
    if (fimFila == vetor1.length - 1){
      
        System.out.println("Nao inserido, fila cheia");
    
    } else {
      fimFila++; // se o comentario acima for usado nao precisa desta linha\
      vetor1[fimFila] = nome;
    
    }
    
    }
    
    public void removeNome(){
    if (fimFila <0) {
        System.out.println("nao removido, fila esta vazia");
    } else{
    vetor1[0] = null;
        System.out.println("removido com sucesso");
        for (int i = 0; i < fimFila; i++) {
            vetor1[i] = vetor1[i+1];
            
        }
        vetor1[fimFila] = null;
        --fimFila;
    
    }
    
    }
    
    public void imprimeFila(){
        System.out.println("\nTamanho maximo da fila:" + vetor1.length + "\nFim da fila: " + (fimFila + 1));
        System.out.println("Primeiro da fila  "+ vetor1[0]+ "  O ultimo da fila:  "+ vetor1[fimFila]);
        for(int x = 0; x < vetor1.length; x++){
            System.out.println("Item [" + (x+1) + "] = " + vetor1[x]);
        
        }
    
    }
    
    
    
}
