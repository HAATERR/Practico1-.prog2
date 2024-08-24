import java.time.LocalDate;
import java.time.Period;

public class Persona {
    String nombre;
    int edad;
    int DNI;
    double peso;
    double altura;
    LocalDate fechaNacimiento;
    String sexo;
    double indice_min = 18.5;
    double indice_max = 25;
    int mayor = 18;
    int min_votar = 16;



    public Persona(String nombre, int edad, int DNI, double peso, double altura, String sexo,LocalDate fechaNacimiento) {
            this.nombre = nombre;
            this.edad = edad;
            this.DNI = DNI;
            this.peso = peso;
            this.altura = altura;
            this.sexo = sexo;
            this.fechaNacimiento = fechaNacimiento;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getDNI() {
        return DNI;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getIndiceMasaCorporal(){
        double masa = getPeso()/(getAltura()*getAltura());
        return masa;
    }
    public boolean enForma(){
        return getIndiceMasaCorporal() >= indice_min && getIndiceMasaCorporal() <= indice_max;
    }
    public boolean cumple(LocalDate fechaNacimiento) {
        LocalDate hoy = LocalDate.now();
        return  hoy.getDayOfMonth() == fechaNacimiento.getDayOfMonth() &&
                hoy.getMonth() == fechaNacimiento.getMonth();
    }
    public boolean esMayor(){
        return getEdad() >= mayor;
    }
    public boolean puedeVotar(){
        return getEdad() >= min_votar;
    }
    public boolean esCoherente(){
        int anios = Period.between(fechaNacimiento, LocalDate.now()).getYears();

        return anios == getEdad();
    }
}





