
public class PrincipalYOU {
public static void main(String[] args) {
	Video v[] = new Video[3];
	v[0] = new Video("Aula 1 de Poo");
	v[1] = new Video("Aula 212de PHP");
	v[2] = new Video("Aula 10 de Html");

    Gafanhoto g[] = new Gafanhoto[2];
    g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
    g[0] = new Gafanhoto("Creuza", 29, "F", "creuzita");
	
    
    System.out.println(v[0].toString());
    System.out.println(g[0].toString());
     
}
}
