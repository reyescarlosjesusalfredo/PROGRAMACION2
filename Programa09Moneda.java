import javax.swing.*;
import java.awt.*;
public class Programa09Moneda extends JFrame {
 public Programa09Moneda() {
 setTitle("Conversor soles a dólares");
 setSize(380, 180);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setLayout(new GridLayout(3, 2, 5, 5));
 JTextField soles = new JTextField();
 JLabel resultado = new JLabel("Dólares: ");
 JButton btn = new JButton("Convertir");
 btn.addActionListener(e -> {
 try {
 double s = Double.parseDouble(soles.getText());
 double tipoCambio = 3.70;
 resultado.setText("Dólares: " + (s / tipoCambio));
 } catch (Exception ex) {
 JOptionPane.showMessageDialog(this, "Dato inválido");
 }
 });
 add(new JLabel("Soles:")); add(soles);
 add(btn); add(resultado);
 setVisible(true);
 }
 public static void main(String[] args) { SwingUtilities.invokeLater(() -> new
Programa09Moneda()); }
}