import javax.swing.*;
import java.awt.*;
public class Programa07Calculadora extends JFrame {
 public Programa07Calculadora() {
 setTitle("Calculadora básica");
 setSize(400, 250);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setLayout(new GridLayout(5, 2, 5, 5));
 JTextField a = new JTextField();
 JTextField b = new JTextField();
 JComboBox<String> op = new JComboBox<>(new String[]{"+", "-", "*", "/"});
 JLabel r = new JLabel("Resultado: ");
 JButton btn = new JButton("Calcular");
 btn.addActionListener(e -> {
 try {
 double x = Double.parseDouble(a.getText());
 double y = Double.parseDouble(b.getText());
 String o = (String) op.getSelectedItem();
 double res = 0;
 switch (o) {
 case "+": res = x + y; break;
 case "-": res = x - y; break;
 case "*": res = x * y; break;
 case "/": res = x / y; break;
 }
 r.setText("Resultado: " + res);
 } catch (Exception ex) {
 JOptionPane.showMessageDialog(this, "Ingrese valores válidos");
 }
 });
 add(new JLabel("Número 1:")); add(a);
 add(new JLabel("Número 2:")); add(b);
 add(new JLabel("Operación:")); add(op);
 add(btn); add(r);
 setVisible(true);
 }
 public static void main(String[] args) { SwingUtilities.invokeLater(() -> new
Programa07Calculadora()); }
}
