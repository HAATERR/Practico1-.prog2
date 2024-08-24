public class Electrodomesticos {
    String color;
    int consumo;
    int precio;
    int peso;
    int bajoConsumo = 45;
    int balanceAltaGama = 3;


    public Electrodomesticos(String color, int consumo, int precio, int peso) {
        this.color = color;
        this.consumo = consumo;
        this.precio = precio;
        this.peso = peso;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getConsumo() {
        return consumo;
    }
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public boolean bajoConsumo() {
        return getConsumo() < bajoConsumo;
    }
    public int balance() {
        return getPrecio() / getPeso();
    }
    public boolean esAltaGama() {
        return balance() > balanceAltaGama;
    }
}
