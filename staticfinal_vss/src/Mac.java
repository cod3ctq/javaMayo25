public class Mac {


    //static
    //valores o atrinutos de clase
    //define valores de clase
    public static final String SISTEMA_OPERATIVO = "Macintosh"; //CONSTANTE
    public static final String MARCA = "Apple";


    //Valores de instancia
    private String color;
    private double precio;

    public Mac(){

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
