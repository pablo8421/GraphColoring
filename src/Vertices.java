
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PabloJavier
 */
public class Vertices extends javax.swing.JFrame {
    
    public JScrollPane scroll;
    public JPanel panel;
    public JCheckBox lista[][];
    private int cant;
    public int resultado[][];
        
    public Vertices (int cant, Coloracion otro){
        setTitle("Vertices");
        setResizable(false);
        setLayout(null);
        lista = new JCheckBox[cant][cant];
        this.cant = cant;

        panel = new JPanel();
        panel.setLayout(null);
        
        initComponents();
        panel.setSize(new Dimension(50*cant + 50,50*cant + 50));
        
        
        scroll = new JScrollPane(panel);
        if(cant > 12){
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        }
        else{
            
        }
        this.setContentPane(scroll);

        if(cant > 12){
            setSize(new Dimension(650,650));
            panel.setPreferredSize(new Dimension(650, 650));
        }else{
            setSize(new Dimension(50*cant + 50,50*cant + 50));
            panel.setSize(new Dimension(50*cant + 50,50*cant + 50));
        }
        

        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                llenarArray();
                otro.matriz = resultado;
                e.getWindow().setVisible(false);
                otro.generarResultado();
            }
        });
        
        setVisible(true);
    }

    private void llenarArray(){
        resultado = new int[cant][cant];
        for (int i = 0; i < cant; i++)
        {
            for (int j = 0; j < cant; j++)
            {
                if(lista[i][j].isSelected()){
                    resultado[i][j] = 1;
                }
                else{
                    resultado[i][j] = 0;
                }
            }
        }
    }
    
    private void initComponents()
    {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JCheckBox checkBox = (JCheckBox) actionEvent.getSource();
                for (int i = 0; i < cant; i++)
                {
                    for (int j = 0; j < cant; j++)
                    {
                        if(lista[i][j] == checkBox){
                            lista[j][i].setSelected(checkBox.isSelected());
                        }
                    }
                }
            }
        };
        
        Dimension size;
        Insets insets = panel.getInsets();
        
        for(int i = 0; i < cant; i++){
            for(int j = 0; j < cant; j++){
                
                lista[i][j] = new JCheckBox();
                lista[i][j].setText(i+","+j);
                
                panel.add(lista[i][j]);
                
                size = lista[i][j].getPreferredSize();
                int x = 50 * i +  25;
                int y = 50 * j +  25;
                lista[i][j].setBounds(x, y, size.width, size.height);
                
                lista[i][j].addActionListener(actionListener);
                
                if(i == j){
                    lista[i][j].setEnabled(false);
                }
                
            }            
        }
        panel.repaint();
        this.repaint();
        this.validate();
    }
}
