//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        //Lectura del archivo
        //Representacion del archivo en una ubicacion
        File file = new File("C:\\Users\\Allan Ortiz\\OneDrive\\Escritorio\\TESIS.txt");
        File escritura = new File("C:\\Users\\Allan Ortiz\\OneDrive\\Escritorio\\fechatexto.txt");
        String linea = "";
        int dia = 0;
        int mes = 0;
        String año = "";

        String[] dias = {
                "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince",
                "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
                "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco",
                "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta",
                "treinta y uno"
        };

        String[] meses = {
                "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        String[] numeros = {
                "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince",
                "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
                "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco",
                "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta",
                "treinta y uno", "treinta y dos", "treinta y tres", "treinta y cuatro", "treinta y cinco",
                "treinta y seis", "treinta y siete", "treinta y ocho", "treinta y nueve", "cuarenta",
                "cuarenta y uno", "cuarenta y dos", "cuarenta y tres", "cuarenta y cuatro", "cuarenta y cinco",
                "cuarenta y seis", "cuarenta y siete", "cuarenta y ocho", "cuarenta y nueve", "cincuenta",
                "cincuenta y uno", "cincuenta y dos", "cincuenta y tres", "cincuenta y cuatro", "cincuenta y cinco",
                "cincuenta y seis", "cincuenta y siete", "cincuenta y ocho", "cincuenta y nueve", "sesenta",
                "sesenta y uno", "sesenta y dos", "sesenta y tres", "sesenta y cuatro", "sesenta y cinco",
                "sesenta y seis", "sesenta y siete", "sesenta y ocho", "sesenta y nueve", "setenta",
                "setenta y uno", "setenta y dos", "setenta y tres", "setenta y cuatro", "setenta y cinco",
                "setenta y seis", "setenta y siete", "setenta y ocho", "setenta y nueve", "ochenta",
                "ochenta y uno", "ochenta y dos", "ochenta y tres", "ochenta y cuatro", "ochenta y cinco",
                "ochenta y seis", "ochenta y siete", "ochenta y ocho", "ochenta y nueve", "noventa",
                "noventa y uno", "noventa y dos", "noventa y tres", "noventa y cuatro", "noventa y cinco",
                "noventa y seis", "noventa y siete", "noventa y ocho", "noventa y nueve", "cien"
        };

        try { //Para leer o escribir archivos se usa try and catch
            FileReader fr = new FileReader(file); // cache (RAM)
            BufferedReader br = new BufferedReader(fr); //Lector

            FileWriter fw = new FileWriter(escritura);


            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

                dia = Integer.parseInt(linea.substring(0, 2));
                mes = Integer.parseInt(linea.substring(2, 4));

                if (linea.substring(4, 6).equals("19")) {
                    año = "mil novecientos " + numeros[Integer.parseInt(linea.substring(6)) - 1];
                } else {
                    año = "dosmil" + numeros[Integer.parseInt(linea.substring(6)) - 1];
                }
                System.out.println(dias[dia - 1] + " de " + meses[mes - 1] + " de " + año);
                //System.out.println(dias[dia-1]+" de "+ meses[mes-1]+ " de "+ linea.substring(4,linea.length()));

                String fechaConvertida = dias[dia - 1] + " de " + meses[mes - 1] + " de " + año;
                fw.write(fechaConvertida+"\n");
            }
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}