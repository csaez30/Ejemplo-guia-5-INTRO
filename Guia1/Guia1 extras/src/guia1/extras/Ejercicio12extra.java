package guia1.extras;
/**
 *
 * @author juanj
 */
public class Ejercicio12extra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cad="";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (String.valueOf(i).equals("3")) cad += "E-";
                    else cad += i+"-";
                    if (Integer.toString(j).equals("3")) cad += "E-";  // alternativa
                    else cad += j+"-";
                    if (String.valueOf(k).equals("3")) cad += "E \r\n";
                    else cad += k;
                    System.out.println(cad);
                    cad="";
                }
             }
        }
    }
    
}
