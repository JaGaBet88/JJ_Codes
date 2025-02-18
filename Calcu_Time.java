import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Calcu_Time {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Definir formato de fecha y hora
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    // Leer fecha del usuario
    System.out.print("Ingrese la fecha (yyyy-MM-dd): ");
    String fechaStr = sc.nextLine();
    LocalDate fecha = LocalDate.parse(fechaStr, dateFormatter);

    // Leer hora del usuario
    System.out.print("Ingrese la hora (HH:mm): ");
    String horaStr = sc.nextLine();
    LocalTime hora = LocalTime.parse(horaStr, timeFormatter);

    // Mostrar los valores obtenidos
    System.out.println("Fecha ingresada: " + fecha);
    System.out.println("Hora ingresada: " + hora);

    sc.close(); // Cerrar el scanner para evitar fugas de recursos

    }
}