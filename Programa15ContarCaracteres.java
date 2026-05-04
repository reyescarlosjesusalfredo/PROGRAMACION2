import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class Programa15ContarCaracteres extends JFrame {
 public Programa15ContarCaracteres() {
 setTitle("Contador de caracteres");
 setSize(400, 300);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 JTextArea area = new JTextArea();
 JLabel lbl = new JLabel("Caracteres: 0");
 area.getDocument().addDocumentListener(new DocumentListener() {
 public void insertUpdate(DocumentEvent e) { actualizar(); }
 public void removeUpdate(DocumentEvent e) { actualizar(); }
 public void changedUpdate(DocumentEvent e) { actualizar(); }
 private void actualizar() { lbl.setText("Caracteres: " + area.getText().length());
}
 });
 add(new JScrollPane(area), BorderLayout.CENTER);
 add(lbl, BorderLayout.SOUTH);
 setVisible(true);
 }
 public static void main(String[] args) { SwingUtilities.invokeLater(() -> new
Programa15ContarCaracteres()); }
}
