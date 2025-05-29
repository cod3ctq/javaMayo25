public class Mac {

    //static
    //valores o atributos de clase
    //define valores de clase
    public static final String SISTEMA_OPERATIVO = "Macintosh"; //CONSTANTE
    public static final String marca = "Apple";

    //valores de instancia
    private String color;
    private double precio;

    public Mac(){
    }

    public Mac(String color, double precio) {
        this.color = color;
        this.precio = precio;
    }

    public static String getSistemaOperativo() {
        return SISTEMA_OPERATIVO;
    }

    public static void setSistemaOperativo(String sistemaOperativo) {
        sistemaOperativo = sistemaOperativo;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        marca = marca;
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
                "color='" + getColor() + '\'' +
                ", precio=" + getPrecio() +
                '}';
    }
}
