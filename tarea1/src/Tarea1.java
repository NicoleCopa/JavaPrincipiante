import javax.swing.JOptionPane;

public class Tarea1 {
    public static void main(String[] args) throws Exception {
        //declaramos la variable saludo como string
        String saludo = "¡Hello, World!";
        //insertamos un método que muestra una ventana con un mensaje pidiendo una confirmación al usuario
        JOptionPane.showMessageDialog(null, saludo);
    }
}