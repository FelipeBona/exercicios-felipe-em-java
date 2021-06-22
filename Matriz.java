
public class Matriz {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            int[][] dados = new int[3][4];
            dados[0][0] = 10;
            dados[0][3] = 20;
            
            System.out.println(dados[0][0]);
            System.out.println(dados[0][3]);
            
            ///preenchar a primeira linha com o valor 2
            for(int i = 0; i < dados[0].length; i++){
                dados[0][i] = 2;
            }
            ///preenchar a primeira linha com o valor 2
            for(int i = 0; i < dados[1].length; i++){
                dados[1][i] = 3;
            }
            
            ///preenchar a primeira linha com o valor 2
            for(int i = 0; i < dados[2].length; i++){
                dados[2][i] = 4;
            }
            
            //listar dados da matriz
            for(int linha = 0; linha < dados.length; linha++){
                System.out.println("");
                for(int coluna = 0; coluna < dados[linha].length; coluna++){
                    System.out.print(dados[linha][coluna]+ " ");  
                }
            }
        } 
    }

