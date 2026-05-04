import javax.swing.*;
import java.awt.*;
public class Programa05Multiplicacion extends JFrame {
 public Programa05Multiplicacion() {
 setTitle("Multiplicación");
 setSize(350, 200);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setLayout(new GridLayout(4, 2, 5, 5));
 JTextField a = new JTextField();
 JTextField b = new JTextField();
 JLabel r = new JLabel("Resultado: ");
 JButton btn = new JButton("Multiplicar");
 btn.addActionListener(e -> {
 try { r.setText("Resultado: " + (Integer.parseInt(a.getText()) *
Integer.parseInt(b.getText()))); }
 catch (Exception ex) { JOptionPane.showMessageDialog(this, "Datos inválidos"); }
 });
 add(new JLabel("Número 1:")); add(a);
 add(new JLabel("Número 2:")); add(b);
 add(btn); add(r);
 setVisible(true);
 }
 public static void main(String[] args) { SwingUtilities.invokeLater(() -> new
Programa05Multiplicacion()); }
}