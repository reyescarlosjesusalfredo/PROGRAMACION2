import javax.swing.*;
public class Programa10Contador extends JFrame {
 private int contador = 0;
 public Programa10Contador() {
 setTitle("Contador de clics");
 setSize(300, 180);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 JButton btn = new JButton("Clic aquí");
 JLabel lbl = new JLabel("Clics: 0", SwingConstants.CENTER);
 btn.addActionListener(e -> {
 contador++;
 lbl.setText("Clics: " + contador);
 });
 setLayout(new java.awt.BorderLayout());
 add(lbl, java.awt.BorderLayout.CENTER);
 add(btn, java.awt.BorderLayout.SOUTH);
 setVisible(true);
 }
 public static void main(String[] args) { SwingUtilities.invokeLater(() -> new
Programa10Contador()); }
}