
package tp8_programacion2_gomezjuanmanuel;
import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("String rutaArchivo = C:/Users/juanm/OneDrive/Escritorio/archivo.txt\""))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
