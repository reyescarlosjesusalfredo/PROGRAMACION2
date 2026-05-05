import javax.swing.*; 
import java.awt.*; 
 
public class Programa19Tareas extends JFrame { 
    public Programa19Tareas() { 
        setTitle("Lista de tareas"); 
        setSize(400, 300); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
 
        DefaultListModel<String> modelo = new DefaultListModel<>(); 
        JList<String> lista = new JList<>(modelo); 
        JTextField tarea = new JTextField(); 
        JButton agregar = new JButton("Agregar"); 
        JButton eliminar = new JButton("Eliminar"); 
 
        agregar.addActionListener(e -> { 
            if (!tarea.getText().trim().isEmpty()) { 
                modelo.addElement(tarea.getText()); 
                tarea.setText(""); 
            } 
        }); 
        eliminar.addActionListener(e -> { 
            int i = lista.getSelectedIndex(); 
            if (i != -1) modelo.remove(i); 
        }); 
 
        JPanel arriba = new JPanel(new BorderLayout()); 
        arriba.add(tarea, BorderLayout.CENTER); 
        arriba.add(agregar, BorderLayout.EAST); 
 
        add(arriba, BorderLayout.NORTH); 
        add(new JScrollPane(lista), BorderLayout.CENTER); 
        add(eliminar, BorderLayout.SOUTH); 
        setVisible(true); 
    } 
    public static void main(String[] args) { SwingUtilities.invokeLater(() -> new 
Programa19Tareas()); } 
} 