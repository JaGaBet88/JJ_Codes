import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Calcu_Time {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now(); // Fecha actual
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        
        LocalTime horaActual = LocalTime.now();  // Hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now(); // Fecha y hora actual
        

        String fechaFormateada = fechaActual.format(formato);
        

    }
}