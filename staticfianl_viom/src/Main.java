public class Main {
    public static void main(String[] args) {

     Mac m1 = new Mac ();
     Mac m2 = new Mac ();
     Mac m3 = new Mac ();
     Mac m4 = new Mac ();

     m1.setColor("Azul");
     m2.setColor("Gris");
     m3.setColor("Blanco");
     m4.setColor("Negro");

     
     System.out.println(m1.SISTEMA_OPERATIVO());

     System.out.println(Mac.SISTEMA_OPERATIVO());
     Mac.SISTEMA_OPERATIVO("Ubuntu");

        Mac m5 = new Mac ();
        Mac m6 = new Mac ();
        Mac m7 = new Mac ();
        Mac m8 = new Mac ();

     System.out.println(m1.getColor());
     System.out.println(m2.getColor());
     System.out.println(m3.getColor());
     System.out.println(m4.getColor());


    }
    }
