package app;

/**
 * UsoArrays2
 */
public class UsoArrays2 {

    public static void main(String[] args) {
        String paises[] = {"España","México","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela"};
        
        // paises[0] = "España";
        // paises[1] = "México";
        // paises[2] = "Colombia";
        // paises[3] = "Perú";
        // paises[4] = "Chile";
        // paises[5] = "Argentina";
        // paises[6] = "Ecuador";
        // paises[7] = "Venezuela";


        // for (int i = 0; i < paises.length; i++) {
        //     System.out.println("País "+ (i+1)+" "+paises[i]);
        // }
        for (String elemento : paises) {
            System.out.println("País "+elemento);
            
        }
    }
}