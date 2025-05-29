public class Mac {

    //static   no cambia
    //define valores o atributos de clase
    public static final String SISTEMA_OPERATIVO = "Macintosh"; //constante
    public static final String MARCA = "Apple";

    //ha ido cambiando
    //valores de instancia
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

    public String SISTEMA_OPERATIVO() {
        return SISTEMA_OPERATIVO;
    }
}
