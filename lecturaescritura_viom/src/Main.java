import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Lectura del archivo
        //Representacion del archivo en una ubicacion
        File file = new File("C:\\Users\\Gommez15_\\OneDrive\\Desktop\\archivo.docx");
        File escritura = new File("C:\Users\Gommez15_\OneDrive\Desktop\fechastexto.docx")
        String linea= "";
        int dia=0;
        int mes = 0;
        String año ="";
        String[] dias ={
        }
        String [] numeros ={

        }
        String[] meses ={

        }
        try {
            FileReader fr = new FileReader(file); //cache (RAM)
            BufferedReader br = new BufferedReader(fr); //lector
            FileWriter fw = new FileWriter(escritura);

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

                dia = Integer.parseInt(linea.substring(0,2));
                mes = Integer.parseInt(linea.substring(2,4));

                if (linea.substring(4,9).equals("19")){
                    año = "mil novecientos " + numeros[Integer.parseInt(linea.substring(6))-1];

                }else{
                    año = "dos mil " + numeros[Integer.parseInt(linea.substring(6))-1];
                }
                System.out.println(dias[dia-1]+ " de"+meses[mes-1]+ año);
                String fechaConvertida = (dias[dia-1]+ " de"+meses[mes-1]+ año);
                fw.write(fechaConvertida+"\n");

            }
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}

