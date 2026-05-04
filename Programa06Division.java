import javax.swing.*;
import java.awt.*;
public class Programa06Division extends JFrame {
 public Programa06Division() {
 setTitle("División");
 setSize(350, 200);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setLayout(new GridLayout(4, 2, 5, 5));
 JTextField a = new JTextField();
 JTextField b = new JTextField();
 JLabel r = new JLabel("Resultado: ");
 JButton btn = new JButton("Dividir");
 btn.addActionListener(e -> {
 try {
 double n1 = Double.parseDouble(a.getText());
 double n2 = Double.parseDouble(b.getText());
 r.setText("Resultado: " + (n1 / n2));
 } catch (Exception ex) { JOptionPane.showMessageDialog(this, "Datos inválidos"); }
 });
 add(new JLabel("Número 1:")); add(a);
 add(new JLabel("Número 2:")); add(b);
 add(btn); add(r);
 setVisible(true);
 }
 public static void main(String[] args) { SwingUtilities.invokeLater(() -> new
Programa06Division()); }
}