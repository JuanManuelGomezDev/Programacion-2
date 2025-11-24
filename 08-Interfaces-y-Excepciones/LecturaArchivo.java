
package tp8_programacion2_gomezjuanmanuel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        // Definir la ruta completa de tu archivo en el escritorio
        String rutaArchivo = "\"C:\\Users\\juanm\\OneDrive\\Escritorio\\TPS_Programacion2\\TP8_Programacion2_GomezJuanManuel\\build\\classes\\archivo.txt.txt\""; // Reemplaza "TuUsuario" con tu nombre de usuario de Windows.

        try {
            // Intentar abrir el archivo
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);
            
            // Leer el archivo línea por línea
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);  // Mostrar cada línea del archivo en la consola
            }
            lector.close(); // Cerrar el lector del archivo
        } catch (FileNotFoundException e) {
            // Manejar la excepción si el archivo no se encuentra
            System.out.println("Error: El archivo no se encontró.");
        }
    }
}
