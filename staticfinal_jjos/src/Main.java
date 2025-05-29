//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mac m1 = new Mac();
        Mac m2 = new Mac();
        Mac m3 = new Mac();
        Mac m4 = new Mac();

        //Se modifican los valores de instancia
        m1.setColor("Azul");
        m2.setColor("Verde");
        m3.setColor("Morado");
        m4.setColor("Gris");

        System.out.println(m1.getColor());
        System.out.println(m2.getColor());
        System.out.println(m3.getColor());
        System.out.println(m4.getColor());

        //Se modifica el valor de clase
        System.out.println(m1.SISTEMA_OPERATIVO);
        System.out.println(m2.SISTEMA_OPERATIVO);
        System.out.println(m3.SISTEMA_OPERATIVO);
        System.out.println(m4.SISTEMA_OPERATIVO);

        //Los miembros estaticos pueden ser accedidos a traves de solo llamar a la clase.
        System.out.println(Mac.SISTEMA_OPERATIVO);
        //Mac.setSistemaOperativo("Ububu");

        Mac m5 = new Mac();
        Mac m6 = new Mac();
        Mac m7 = new Mac();
        Mac m8 = new Mac();

        System.out.println(m5.SISTEMA_OPERATIVO);
        System.out.println(m6.SISTEMA_OPERATIVO;
        System.out.println(m7.SISTEMA_OPERATIVO);
        System.out.println(m8.SISTEMA_OPERATIVO);



    }
}