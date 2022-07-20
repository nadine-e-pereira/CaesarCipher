package seguranca_cifra_de_cesar;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class SegurancaCifraDeCesar {
    public static void main (String [] args){
    Scanner ler = new
      Scanner (System.in);
    String mensagem;
    int chave;

    String [] cifra;
    String [] mensagemcifrada;
    String [] mensagemdecifrada;
    String [] referencia={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    
    int letras;

    System.out.println("Digite a mensagem a ser encaminhada: ");
    mensagem = ler.nextLine();

    System.out.println("Digite a chave (inteira): ");
    chave = ler.nextInt();

    letras = mensagem.length();

    System.out.println(letras);
    cifra = mensagem.split("");

    System.out.println("-----Mensagem Original:-----");
      for (int i=0;i<letras;i++) {
      System.out.println(cifra[i]);
      }

    mensagemcifrada=cifra;
    
    System.out.println("-----Mensagem Cifrada:-----");
    int ref=0, r=0; int x=0;
    
    for (int j=0;j<letras;j++) {
      
    while (x<26){
      r = cifra[j].compareTo(referencia[x]);
      //System.out.println(r);
      if (r==0){
        if (x+chave<26){
          ref=x+chave;}
        else {
          ref=(x+chave)-26;}
          }
      mensagemcifrada[j]=referencia[ref];
      x=26;
        }
      x++;
    
    ref=0;
    r=0; x=0;
    System.out.println(mensagemcifrada[j]);   
   }
    
    mensagemdecifrada = mensagemcifrada;
    
    System.out.println("---Mensagem Decifrada:----");
    ref=0; r=0; x=0;
    
    for (int k=0;k<letras;k++){
    while (x<26){
        r=mensagemdecifrada[k].compareTo(referencia[x]);
        if (r==0){
            if(x-chave>=0){
                ref=x-chave;
            }
            else{
                ref=26+(x-chave);
            }
        mensagemdecifrada[k]=referencia[ref];
        x=26;
        }
     x++;
     }
    ref=0;
    r=0;x=0;
    System.out.println(mensagemdecifrada[k]);
   }
  }
 }
