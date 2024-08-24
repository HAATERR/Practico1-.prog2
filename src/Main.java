import java.time.LocalDate;

public class Main {
 public static void main(String[] args) {
     Persona p1 = new Persona("N",4,5,1,1,"masculino",LocalDate.of(2000,1,1));
     System.out.println(p1.toString());
 }
}
