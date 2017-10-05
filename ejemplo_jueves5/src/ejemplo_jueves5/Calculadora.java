
package ejemplo_jueves5;

public class Calculadora extends javax.swing.JFrame {

    
    public Calculadora() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Suma = new javax.swing.JToggleButton();
        Multiplica = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        lblMuestraOperacion = new javax.swing.JLabel();
        Borrar = new javax.swing.JButton();
        variable_1 = new javax.swing.JTextField();
        variable_2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        Multiplica.setText("*");
        Multiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicaActionPerformed(evt);
            }
        });

        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        Borrar.setText("C");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        variable_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variable_1ActionPerformed(evt);
            }
        });

        variable_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variable_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMuestraOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(variable_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(variable_2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Suma)
                        .addGap(18, 18, 18)
                        .addComponent(Resta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Multiplica)
                        .addGap(10, 10, 10)
                        .addComponent(Divide)
                        .addGap(58, 58, 58)
                        .addComponent(Borrar)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMuestraOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Suma)
                    .addComponent(Resta)
                    .addComponent(Multiplica)
                    .addComponent(Divide)
                    .addComponent(Borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(variable_2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(variable_1))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// ESTOS SON LOS BOTONES DE LA CALCULADORA
    
    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
       
        // TODO add your handling code here:
        // toma los valores del campo de texto 1 y lo parsea
        String variable1;
        float aux_numero1;
        variable1 = variable_1.getText();
        aux_numero1 = Float.parseFloat(variable1);
        
        //toma los valores del campo de texto 2 y lo parsea
        String variable2;
        float aux_numero2;
        variable2 = variable_2.getText();
        aux_numero2 = Float.parseFloat(variable2);
        this.lblMuestraOperacion.setText("la suma es :"+(aux_numero1+aux_numero2));
        
    }//GEN-LAST:event_SumaActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        // TODO add your handling code here:
           String variable1;
        float aux_numero1;
        variable1 = variable_1.getText();
        aux_numero1 = Float.parseFloat(variable1);
        
        //toma los valores del campo de texto 2 y lo parsea
        String variable2;
        float aux_numero2;
        variable2 = variable_2.getText();
        aux_numero2 = Float.parseFloat(variable2);
        if(aux_numero2==0){
            this.lblMuestraOperacion.setText("no se puede dividir por cero");
        }
        else 
            this.lblMuestraOperacion.setText("la division es :"+(aux_numero1/aux_numero2));
    }//GEN-LAST:event_DivideActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        // TODO add your handling code here:
         this.lblMuestraOperacion.setText("ingrese operacion");
         
         this.variable_1.setText("");
         this.variable_2.setText("");
    }//GEN-LAST:event_BorrarActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        // toma los valores del campo de texto 1 y lo parsea
        String variable1;
        float aux_numero1;
        variable1 = variable_1.getText();
        aux_numero1 = Float.parseFloat(variable1);
        
        //toma los valores del campo de texto 2 y lo parsea
        String variable2;
        float aux_numero2;
        variable2 = variable_2.getText();
        aux_numero2 = Float.parseFloat(variable2);
        this.lblMuestraOperacion.setText("la resta es :"+(aux_numero1-aux_numero2));
    }//GEN-LAST:event_RestaActionPerformed

    private void MultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicaActionPerformed
        // TODO add your handling code here:
           String variable1;
        float aux_numero1;
        variable1 = variable_1.getText();
        aux_numero1 = Float.parseFloat(variable1);
        
        //toma los valores del campo de texto 2 y lo parsea
        String variable2;
        float aux_numero2;
        variable2 = variable_2.getText();
        aux_numero2 = Float.parseFloat(variable2);
        this.lblMuestraOperacion.setText("la multiplicacion es"+(aux_numero1*aux_numero2));
    }//GEN-LAST:event_MultiplicaActionPerformed
// ESTOS SON LOS CAMPOS DE TEXTO DONDE SE TOMA LA VARIABLE
    private void variable_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variable_1ActionPerformed
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_variable_1ActionPerformed

    private void variable_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variable_2ActionPerformed
        // TODO add your handling code here:
        String variable2;
        float aux_numero2;
        variable2 = variable_2.getText();
        aux_numero2 = Float.parseFloat(variable2);

    }//GEN-LAST:event_variable_2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Multiplica;
    private javax.swing.JButton Resta;
    private javax.swing.JToggleButton Suma;
    private javax.swing.JLabel lblMuestraOperacion;
    private javax.swing.JTextField variable_1;
    private javax.swing.JTextField variable_2;
    // End of variables declaration//GEN-END:variables
}
