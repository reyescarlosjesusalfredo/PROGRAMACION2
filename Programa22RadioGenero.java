import javax.swing.*; 
import java.awt.*; 
 
public class Programa22RadioGenero extends JFrame { 
    public Programa22RadioGenero() { 
        setTitle("RadioButton"); 
        setSize(350, 200); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(new FlowLayout()); 
 
        JRadioButton m = new JRadioButton("Masculino"); 
        JRadioButton f = new JRadioButton("Femenino"); 
        ButtonGroup grupo = new ButtonGroup(); 
        grupo.add(m); grupo.add(f); 
        JButton btn = new JButton("Aceptar"); 
 
        btn.addActionListener(e -> { 
            String g = m.isSelected() ? "Masculino" : f.isSelected() ? "Femenino" : "No seleccionado"; 
            JOptionPane.showMessageDialog(this, "Género: " + g); 
        }); 
 
        add(m); add(f); add(btn); 
        setVisible(true); 
    } 
    public static void main(String[] args) { SwingUtilities.invokeLater(() -> new 
Programa22RadioGenero()); } 
} 