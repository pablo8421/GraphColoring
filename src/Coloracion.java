
import java.util.Formatter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PabloJavier
 */
public class Coloracion extends javax.swing.JFrame {

    Vertices vertices;
    public int matriz[][];
    
    public int uno[][] = new int[][]{{0,1,1,1},
                                     {1,0,1,0},
                                     {1,1,0,1},
                                     {1,0,1,0}};
    
    public int dos[][] = new int[][]{{0,1,0,0,1,1,0,0,0,0},
                                     {1,0,1,0,0,0,1,0,0,0},
                                     {0,1,0,1,0,0,0,1,0,0},
                                     {0,0,1,0,1,0,0,0,1,0},
                                     {1,0,0,1,0,0,0,0,0,1},
                                     {1,0,0,0,0,0,0,1,1,0},
                                     {0,1,0,0,0,0,0,0,1,1},
                                     {0,0,1,0,0,1,0,0,0,1},
                                     {0,0,0,1,0,1,1,0,0,0},
                                     {0,0,0,0,1,0,1,1,0,0}};
    
    public int tres[][] = new int[][]{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

    public int cuatro[][] = new int[][]{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                     {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};


    public int cinco[][];
    
    public int seis[][];
    
    /**
     * Creates new form Coloracion
     */
    public Coloracion()
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Coloracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        generarNauruIncompleto();
        generarNauru();
        generarSeis();
        
        initComponents();
    }

    private void generarSeis(){
        seis = new int[8][8];
        
        int[][] lista = {{1,4},
                         {1,8},
                         {1,6},
                         {2,3},
                         {2,5},
                         {2,7},
                         {3,6},
                         {3,8},
                         {4,5},
                         {4,7},
                         {5,8},
                         {6,7}};
        
        for(int i=0; i < lista.length; i++){
            seis[lista[i][0]-1][lista[i][1]-1] = 1;
            seis[lista[i][1]-1][lista[i][0]-1] = 1;
        }        
    }
    
    private void generarNauruIncompleto(){
        for(int i=0; i < 24; i++){
            for(int j=0; j < 24; j++){ 
                if(i % 2 == 1 && i == (j-1)){
                    tres[i][j] = 1;
                    tres[j][i] = 1;
                    
                    if(i % 3 == 0){
                        tres[i-1][j] = 1;
                        tres[i][j+1] = 1;

                        tres[j][i-1] = 1;
                        tres[j+1][i] = 1;
                        
                        tres[i+2][j-2] = 1;
                        tres[j-2][i+2] = 1;
                    }
                }
            }
        }
    }
    
    private void generarNauru(){
        for(int i=0; i < 24; i++){
            for(int j=0; j < 24; j++){ 
                if(i % 2 == 1 && i == j){
                    cuatro[i][j-1] = 1;
                    cuatro[j-1][i] = 1;
                    
                    if(i % 3 == 0){
                        cuatro[i+1][j-1] = 1;
                        cuatro[i-1][j+1] = 1;

                        cuatro[i][j-2] = 1;
                        cuatro[j-2][i] = 1;
                        
                        cuatro[i+1][j-2] = 1;
                        cuatro[j-2][i+1] = 1;
                    }
                }
            }
        }
        cuatro[9][3] = 1;
        cuatro[3][9] = 1;
        cuatro[11][5] = 1;
        cuatro[5][11] = 1;
        cuatro[13][7] = 1;
        cuatro[7][13] = 1;
        cuatro[1][15] = 1;
        cuatro[15][1] = 1;
        cuatro[16][10] = 1;
        cuatro[10][16] = 1;
        cuatro[17][4] = 1;
        cuatro[4][17] = 1;
        cuatro[18][12] = 1;
        cuatro[12][18] = 1;
        cuatro[19][6] = 1;
        cuatro[6][19] = 1;
        cuatro[20][14] = 1;
        cuatro[14][20] = 1;
        cuatro[21][0] = 1;
        cuatro[0][21] = 1;
        cuatro[22][8] = 1;
        cuatro[8][22] = 1;
        cuatro[23][2] = 1;
        cuatro[2][23] = 1;
        
    }

    private void generarCinco(){
        int num;
        Random rambo = new Random();
        try{
            num = (int) spinerNum.getValue();
        }catch(Exception e){
            num = 25;
        }
        cinco = new int[num][num];
        for(int i=0;i < num;i++){
            for(int j=0;j <= i;j++){
                if(j != i && rambo.nextBoolean()){
                    cinco[i][j] = 1;
                    cinco[j][i] = 1;
                }
                else{
                    cinco[i][j] = 0;
                    cinco[j][i] = 0;
                }
            }
        }
        
    }
    
    private void agregarMatriz(){
        String grafo = "\n\n";
        for(int i= 0;i < matriz.length;i++){
            grafo += "\t";
            for(int j= 0;j < matriz.length;j++){
                grafo += matriz[i][j] + "  ";
            }
            grafo += "\n";
        }
        
        textResultado.setText(textResultado.getText() + grafo);
    }
    
    private void llenarResultados(int backtraking[][], int coloresB, long tBacktraking,int greedy[][], int coloresG, long tGreedy){
        String formato = "\t\t (%-5.5s) \t (%-5.5s)\n";
        Formatter fmt = new Formatter();
        for(int i =0; i < backtraking[0].length; i++){
            String back = backtraking[0][i] + ", " + backtraking[1][i];
            String greed = greedy[0][i] + ", " + greedy[1][i];
            fmt.format(formato, back, greed);            
        }
        String titulo = "\t    Backtraking \t Greedy\n";
        formato= "\t\t %5s           %5s\n";
        fmt.format(formato, "C: "+ coloresB, "C: "+ coloresG);
        formato= "\t\t %5s   %5s\n";
        fmt.format(formato, "T: "+ tBacktraking + " ns  ", "T: "+ tGreedy + " ns  ");
        fmt.format(formato, "T: "+ tBacktraking/1000000.0 + " ms  ", "T: "+ tGreedy/1000000.0 + " ms  ");
        
        textResultado.setText(titulo + fmt.toString());
        agregarMatriz();
    }
    
    public void generarResultado(){

        //Greedy
        long tiempoG;
        
        GreedyColorer greedy = new GreedyColorer(matriz);

        tiempoG = System.nanoTime();
        greedy.colorear();
        tiempoG = System.nanoTime() - tiempoG;

        System.out.println("Greedy termino, " + tiempoG);
        
        //BACKTRAKING
        long tiempoB = 0;
        
        //Crear la clase
        BacktrackingColorer colorador = new BacktrackingColorer();
        colorador.encontrado = false;
        colorador.llenarGrafo(matriz);
        
        //Ciclo iterando desde un color
        boolean sinColorear = true;
        int num = 0;
        tiempoB = System.nanoTime();
        while(sinColorear){
            colorador.mColoring(1);
            
            if(colorador.encontrado){
                tiempoB = System.nanoTime() - tiempoB;
                sinColorear = false;
            }
            else{
                colorador.reiniciar();
            }
        }
        
        llenarResultados(colorador.resultado, colorador.m, tiempoB,
                            greedy.resultado, greedy.colores, tiempoG);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        labelVertices = new javax.swing.JLabel();
        btnVertices = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textResultado = new javax.swing.JTextArea();
        lablePredefinidos = new javax.swing.JLabel();
        spinerNum = new javax.swing.JSpinner();
        comboPred = new javax.swing.JComboBox();
        btnPred = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelVertices.setText("Cantidad de vertices:");

        btnVertices.setText("Ingresar Vertices");
        btnVertices.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVerticesActionPerformed(evt);
            }
        });

        textResultado.setEditable(false);
        textResultado.setColumns(20);
        textResultado.setRows(5);
        jScrollPane1.setViewportView(textResultado);

        lablePredefinidos.setText("Predefinidos");

        spinerNum.setValue(4);

        comboPred.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4 Vertices", "10 Vertices", "Nauru Inc", "Nauru Ish", "Random", "Grafo bipartido" }));

        btnPred.setText("Ejecutar Predefinido");
        btnPred.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPredActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lablePredefinidos)
                            .addComponent(btnVertices))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelVertices)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinerNum))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboPred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPred)))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVertices)
                    .addComponent(btnVertices)
                    .addComponent(spinerNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lablePredefinidos)
                    .addComponent(comboPred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPred))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerticesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVerticesActionPerformed
    {//GEN-HEADEREND:event_btnVerticesActionPerformed
        if(vertices != null){
            vertices.dispose();
        }
        int num;
        try{
            num = (int) spinerNum.getValue();
        }catch(Exception e){
            num = 4;
        }
        vertices= new Vertices(num, this);
    }//GEN-LAST:event_btnVerticesActionPerformed

    private void btnPredActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPredActionPerformed
    {//GEN-HEADEREND:event_btnPredActionPerformed
        int seleccionado = comboPred.getSelectedIndex();
        seleccionado++;
        
        switch(seleccionado){
            case 1:
                matriz = uno;
                break;
            case 2: 
                matriz = dos;
                break;
            case 3: 
                matriz = tres;
                break;
            case 4: 
                matriz = cuatro;
                break;
            case 5:
                generarCinco();
                matriz = cinco;
                break;
            case 6:
                matriz = seis;
                break;
        }
        generarResultado();
    }//GEN-LAST:event_btnPredActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Coloracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Coloracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Coloracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Coloracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new Coloracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPred;
    private javax.swing.JButton btnVertices;
    private javax.swing.JComboBox comboPred;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelVertices;
    private javax.swing.JLabel lablePredefinidos;
    private javax.swing.JSpinner spinerNum;
    private javax.swing.JTextArea textResultado;
    // End of variables declaration//GEN-END:variables
}
