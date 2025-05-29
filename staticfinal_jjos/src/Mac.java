public class Mac {
    //static
    //Valores o atributos de clase (Valores de clase)
    //Static: Sirve para definir valores de clase

    /*
    Los valores staticos si pueden ser modificados
    public static String sistemaOperativo = "Macintosh";
    public static String marca = "Apple";
     */


    public static final String SISTEMA_OPERATIVO = "Macintosh"; //CONSTANTE
    public static final String MARCA = "Apple";//CONSTANTE

    //Valores de instancia
    private String color;
    private double precio;

    public Mac (){
    }

    public Mac(String color, double precio) {
        this.color = color;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mac{" +
                "color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }

}
