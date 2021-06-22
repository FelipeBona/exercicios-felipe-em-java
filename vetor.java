import java.util.Scanner;
public class vetor {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        int x = numeros.length-1;
        while( x >= 0){
            System.out.println("Informe numero inteiro ("+x+")"); 
            numeros[x] = new Scanner(System.in).nextInt();
            x--;
        }
        
        //ordenar vetor
        boolean trocou=true;
        while(trocou){
           trocou=false;
            //
            for(int i = 0;i<numeros.length-1; i ++){
               int aux = 0;
               if(numeros[i] > numeros[i+1]){
                 aux = numeros[i] ;
                 numeros[i] = numeros[i+1];
                 numeros[i+1] = aux;
                 trocou = true;                 
               } 
            }
        }
        //imprime vetor ordenado
        for(int z : numeros){
            System.out.println(z); 
        }
    }
    
} 

