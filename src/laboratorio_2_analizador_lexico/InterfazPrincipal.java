package laboratorio_2_analizador_lexico;

import java.util.ArrayList;
import java.util.Set;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class InterfazPrincipal extends javax.swing.JFrame {

    public InterfazPrincipal() {
        initComponents();
    }
    ArrayList<String> PalabrasReservadas = new ArrayList<>();
    ArrayList<String> Operadores = new ArrayList<>();
    ArrayList<Integer> Numeros = new ArrayList<>();
    ArrayList<String> Identificadores = new ArrayList<>();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Codigo = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_PR = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton_analizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Resultado = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_Numeros = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_R_PR = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea_Identificadores = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea_Operadores = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Roboto Slab", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Laboratorio N2 - Analizador Léxico");

        jLabel2.setFont(new java.awt.Font("Lobster", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ronald Juárez - Eugenio Pérez");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_2_analizador_lexico/programacion.png"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_2_analizador_lexico/robot.png"))); // NOI18N
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(179, 179, 179)))
                .addComponent(jLabel11)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea_Codigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea_Codigo.setColumns(20);
        jTextArea_Codigo.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jTextArea_Codigo.setForeground(new java.awt.Color(0, 51, 51));
        jTextArea_Codigo.setLineWrap(true);
        jTextArea_Codigo.setRows(5);
        jTextArea_Codigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 51, 51)));
        jScrollPane1.setViewportView(jTextArea_Codigo);

        jLabel3.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Introduzca su código aquí");

        jLabel4.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Alfabeto");

        jTextArea_PR.setEditable(false);
        jTextArea_PR.setColumns(20);
        jTextArea_PR.setRows(5);
        jTextArea_PR.setBorder(javax.swing.BorderFactory.createTitledBorder("Palabras Reservadas"));
        jScrollPane3.setViewportView(jTextArea_PR);

        jButton1.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jButton1.setText("Limpiar");

        jButton_analizar.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jButton_analizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio_2_analizador_lexico/analizar.png"))); // NOI18N
        jButton_analizar.setText("Analizar");
        jButton_analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_analizarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cadena Analizada");

        jTextArea_Resultado.setEditable(false);
        jTextArea_Resultado.setColumns(20);
        jTextArea_Resultado.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jTextArea_Resultado.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Resultado);

        jLabel6.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Lexémas");

        jLabel7.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Palabras reservadas detectadas");

        jLabel8.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Identificadores");

        jLabel9.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Operadores");

        jLabel10.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Números");

        jTextArea_Numeros.setEditable(false);
        jTextArea_Numeros.setColumns(20);
        jTextArea_Numeros.setRows(5);
        jScrollPane4.setViewportView(jTextArea_Numeros);

        jTextArea_R_PR.setEditable(false);
        jTextArea_R_PR.setColumns(20);
        jTextArea_R_PR.setRows(5);
        jScrollPane5.setViewportView(jTextArea_R_PR);

        jTextArea_Identificadores.setColumns(20);
        jTextArea_Identificadores.setRows(5);
        jScrollPane6.setViewportView(jTextArea_Identificadores);

        jTextArea_Operadores.setEditable(false);
        jTextArea_Operadores.setColumns(20);
        jTextArea_Operadores.setRows(5);
        jScrollPane7.setViewportView(jTextArea_Operadores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(151, 151, 151)
                                        .addComponent(jLabel9))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(80, 80, 80))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_analizar)
                                        .addGap(68, 68, 68))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(105, 105, 105))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(84, 84, 84)))))))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(398, 398, 398))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(433, 433, 433))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_analizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_analizarActionPerformed
        //Palabras reservadas
        PalabrasReservadas.add("if");
        PalabrasReservadas.add("else");
        PalabrasReservadas.add("double");
        PalabrasReservadas.add("for");
        PalabrasReservadas.add("while");
        PalabrasReservadas.add("int");
        
        //Operadores y simbolos
        Operadores.add("+");
        Operadores.add("(");
        Operadores.add(")");
        Operadores.add("-");
        Operadores.add("/");
        Operadores.add("*");
        Operadores.add("==");
        Operadores.add("&&");
        Operadores.add("||");
        Operadores.add("=");
        Operadores.add("!=");
        
        for(int i = 0; i < PalabrasReservadas.size(); i++){
            jTextArea_PR.append(PalabrasReservadas.get(i) + "\n");
        }
        //Declaración de los tonkens
         StringTokenizer st;
         st = new StringTokenizer(jTextArea_Codigo.getText(),"\n");
         int c = 92;
         
        //Analisis linea a linea del JtextArea Principal
        
         while (st.hasMoreTokens()){
             String line = st.nextToken();
             int numero = 0;
             String Cad_num = "";
             String Variable = "";
             /*for(int i = 0; i < PalabrasReservadas.size(); i++){
                 if(line.contains(PalabrasReservadas.get(i))){
                    jTextArea_R_PR.append(PalabrasReservadas.get(i)+"\n");
                }
             }*/
             
             for(int i = 0; i < Operadores.size(); i++){
                 if(line.contains(Operadores.get(i))){
                     jTextArea_Operadores.append(Operadores.get(i)+ "\n");  
                 }
             }
             
             char detector = 'F';
             for(int i = 0; i< line.length(); i++){
                //Analizador de digitos
                 if(Character.isDigit(line.charAt(i)) && line.charAt(i-1) != '_'){
                    Cad_num = Cad_num + String.valueOf(line.charAt(i));
                    numero = Integer.parseInt(Cad_num);
                    detector = 'C';
                }
                if(i < (line.length()-1)){
                     if(line.charAt(i) == '-' && Character.isDigit(line.charAt(i+1))){
                        Cad_num = Cad_num + String.valueOf(line.charAt(i));
                    }
                }
                if((Character.isDigit(line.charAt(i)) == false || i == line.length()-1) && detector == 'C'){
                    Numeros.add(numero);
                    detector = 'F';
                    numero = 0;
                    Cad_num = "";
                }
                //Detector de variables
                line  = line.replace("\t",(char)c + "t");
                if((((line.charAt(i)>= 'A' && line.charAt(i)<= 'Z') || (line.charAt(i)>= 'a' && line.charAt(i)<= 'z')) || line.contains("_") || line.charAt(i) == c ) && line.charAt(i) != '=' && line.charAt(i) != ' '){
                    Variable = Variable + String.valueOf(line.charAt(i));
                    //JOptionPane.showMessageDialog(null,Variable);
                    /*for(int j = 0; j < PalabrasReservadas.size(); j++){
                        if(Variable.contains(PalabrasReservadas.get(j))){
                        //jTextArea_R_PR.append(PalabrasReservadas.get(i)+"\n");
                        Variable = "";
                    }
                }*/
                    JOptionPane.showMessageDialog(null,Variable);
                    
                    
                }
                if(line.charAt(i) == ' ' || line.charAt(i) == '=' || line.charAt(i) == ';' ){
                    Variable = Variable.replace((char)c + "t","");
                    if(Variable != "" && comprobador(Variable)==false && comprobador_reservadas(Variable) == false){
                        Identificadores.add(Variable);
                        jTextArea_Identificadores.append(Variable + "\n");
                    }
                    for(int k = 0; k < PalabrasReservadas.size(); k++){
                        if(Variable.equals(PalabrasReservadas.get(k))){
                            jTextArea_R_PR.append(PalabrasReservadas.get(k)+"\n");
                        }
                    }
                    Variable = "";
                    
                }
                //Detector de tabulaciones
                 /*if(line.charAt(i) == '\t'){
                 //jTextArea_Resultado.append((char)c + "t");
                 }*/
                 //line  = line.replace("\t",(char)c + "t");
                 if (i == line.length() -1){
                     line  = line.replace(" ","");
                 }
             }
             
                //Numeros.add(numero);
             //Imprime la cadena resultante
             jTextArea_Resultado.append(line + (char)c + "n");
         }
         
         //Imprimir los numeros detectados
         for(int i = 0; i < Numeros.size(); i++){
             jTextArea_Numeros.append(String.valueOf(Numeros.get(i))+ "\n");
         }
         //JOptionPane.showMessageDialog(null,lines);
        
    }//GEN-LAST:event_jButton_analizarActionPerformed
    
    public boolean comprobador(String valor_actual){
        boolean bandera = false;
            for(int i = 0; i < Identificadores.size(); i++){
                if(Identificadores.get(i).equals(valor_actual)){
                    bandera = true;
                }
            }
        return bandera;
    }
    public boolean comprobador_reservadas(String valor_actual){
        boolean bandera = false;
            for(int i = 0; i < PalabrasReservadas.size(); i++){
                if(PalabrasReservadas.get(i).equals(valor_actual)){
                    bandera = true;
                }
            }
        return bandera;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_analizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea_Codigo;
    private javax.swing.JTextArea jTextArea_Identificadores;
    private javax.swing.JTextArea jTextArea_Numeros;
    private javax.swing.JTextArea jTextArea_Operadores;
    private javax.swing.JTextArea jTextArea_PR;
    private javax.swing.JTextArea jTextArea_R_PR;
    private javax.swing.JTextArea jTextArea_Resultado;
    // End of variables declaration//GEN-END:variables
}
