import java.util.Scanner;

public class exercicioifelse {
    public static void main(String[] args) {
        String msg="";
        
         Scanner tela = new Scanner(System.in);
         System.out.println("Informe nome: ");
         String nome = tela.nextLine();
         
         System.out.println("Informe idade");
         int idade = tela.nextInt();
         
         if(idade < 11){
             msg = "criança";
         }
         else if(idade < 15){
             msg = "pré-adolescente";
         } 
         else if(idade < 18){
             msg = "adolescente";
         }
         else if(idade < 51){
             msg = "adulto";
         }else
             msg ="Terceira idade";
         
         System.out.println(nome + " você é " + msg);
        
     }
     
 }  

