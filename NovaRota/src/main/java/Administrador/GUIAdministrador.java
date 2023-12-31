/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Administrador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class GUIAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form GUICliente
     */
    public GUIAdministrador() {
        initComponents();
        setVisible(true);
    }

    public void addListener(GerenciadorAdministrador ga) {
        JBTcadastrar.addActionListener(ga);
        JBTdeletar.addActionListener(ga);
        JBTalterar.addActionListener(ga);
        JBTconsultar.addActionListener(ga);
    }

    public Administrador getAdministrador() {
        Administrador a = new Administrador();
        a.setIDAdministrador(Integer.parseInt(JTFid.getText()));
        a.setNome(JTFnome.getText());
        a.setCpf(Long.parseLong(JTFcpf.getText()));
        a.setEmail(JTFemail.getText());
        a.setSenha(JTFsenha.getText());
        return a;
    }

    public int getID() {
        return Integer.parseInt(JTFid.getText());
    }
    
    public void limpar() {
        JTFid.setText("");
        JTFnome.setText("");
        JTFcpf.setText("");
        JTFemail.setText("");
        JTFsenha.setText("");
    }

    public void consultar() {
        try {
            DAOAdministrador objadministradordao = new DAOAdministrador();
            DefaultTableModel model = (DefaultTableModel) JTBcliente.getModel();
            ArrayList<Administrador> lista = objadministradordao.Display();
            model.setRowCount(0);
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getIDAdministrador(),
                    lista.get(num).getNome(),
                    lista.get(num).getCpf(),
                    lista.get(num).getEmail()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JBTcadastrar = new javax.swing.JButton();
        JBTdeletar = new javax.swing.JButton();
        JBTalterar = new javax.swing.JButton();
        JLcpf = new javax.swing.JLabel();
        JLtitulo = new javax.swing.JLabel();
        JTFcpf = new javax.swing.JTextField();
        JLid = new javax.swing.JLabel();
        JBTconsultar = new javax.swing.JButton();
        JLnome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTBcliente = new javax.swing.JTable();
        JLemail = new javax.swing.JLabel();
        JTFid = new javax.swing.JTextField();
        JTFnome = new javax.swing.JTextField();
        JTFemail = new javax.swing.JTextField();
        JTFsenha = new javax.swing.JTextField();
        JLemail1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador");

        jPanel1.setBackground(new java.awt.Color(36, 123, 160));

        JBTcadastrar.setBackground(new java.awt.Color(247, 255, 247));
        JBTcadastrar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        JBTcadastrar.setForeground(new java.awt.Color(36, 123, 160));
        JBTcadastrar.setText("Cadastrar");
        JBTcadastrar.setName("cadastrar"); // NOI18N
        JBTcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTcadastrarActionPerformed(evt);
            }
        });

        JBTdeletar.setBackground(new java.awt.Color(247, 255, 247));
        JBTdeletar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        JBTdeletar.setForeground(new java.awt.Color(36, 123, 160));
        JBTdeletar.setText("Deletar");
        JBTdeletar.setName("deletar"); // NOI18N
        JBTdeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTdeletarActionPerformed(evt);
            }
        });

        JBTalterar.setBackground(new java.awt.Color(247, 255, 247));
        JBTalterar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        JBTalterar.setForeground(new java.awt.Color(36, 123, 160));
        JBTalterar.setText("Alterar");
        JBTalterar.setName("alterar");
        JBTalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTalterarActionPerformed(evt);
            }
        });

        JLcpf.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        JLcpf.setForeground(new java.awt.Color(247, 255, 247));
        JLcpf.setText("CPF:");

        JLtitulo.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        JLtitulo.setForeground(new java.awt.Color(247, 255, 247));
        JLtitulo.setText("Gerenciamento de Administradores");

        JLid.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        JLid.setForeground(new java.awt.Color(247, 255, 247));
        JLid.setText("ID Administrador:");

        JBTconsultar.setBackground(new java.awt.Color(247, 255, 247));
        JBTconsultar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        JBTconsultar.setForeground(new java.awt.Color(36, 123, 160));
        JBTconsultar.setText("Consultar");
        JBTconsultar.setName("mostrar"); // NOI18N
        JBTconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTconsultarActionPerformed(evt);
            }
        });

        JLnome.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        JLnome.setForeground(new java.awt.Color(247, 255, 247));
        JLnome.setText("Nome:");

        JTBcliente.setBackground(new java.awt.Color(247, 255, 247));
        JTBcliente.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        JTBcliente.setForeground(new java.awt.Color(36, 123, 160));
        JTBcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "E-Mail"
            }
        ));
        JTBcliente.setSelectionForeground(new java.awt.Color(36, 123, 160));
        JTBcliente.setShowGrid(true);
        jScrollPane1.setViewportView(JTBcliente);

        JLemail.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        JLemail.setForeground(new java.awt.Color(247, 255, 247));
        JLemail.setText("E-Mail:");

        JTFid.setName("JTFid"); // NOI18N
        JTFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidActionPerformed(evt);
            }
        });

        JLemail1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        JLemail1.setForeground(new java.awt.Color(247, 255, 247));
        JLemail1.setText("Senha:");

        jLabel2.setFont(new java.awt.Font("Impact", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 255, 247));
        jLabel2.setText("NovaRota");

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JLtitulo)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLcpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFcpf))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JLid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLnome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFnome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLemail)
                                    .addComponent(JLemail1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFemail)
                                    .addComponent(JTFsenha))))
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JBTcadastrar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JBTdeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBTalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBTconsultar)))
                        .addGap(152, 152, 152))))
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(JLtitulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(JLid))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnome)
                    .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcpf)
                    .addComponent(JTFcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLemail)
                    .addComponent(JTFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLemail1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTdeletar)
                    .addComponent(JBTcadastrar)
                    .addComponent(JBTalterar)
                    .addComponent(JBTconsultar))
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        JBTcadastrar.getAccessibleContext().setAccessibleName("cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidActionPerformed

    private void JBTcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcadastrarActionPerformed
        
    }//GEN-LAST:event_JBTcadastrarActionPerformed

    private void JBTalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTalterarActionPerformed
        
    }//GEN-LAST:event_JBTalterarActionPerformed

    private void JBTdeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTdeletarActionPerformed
        
    }//GEN-LAST:event_JBTdeletarActionPerformed

    private void JBTconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTconsultarActionPerformed
        
    }//GEN-LAST:event_JBTconsultarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTalterar;
    private javax.swing.JButton JBTcadastrar;
    private javax.swing.JButton JBTconsultar;
    private javax.swing.JButton JBTdeletar;
    private javax.swing.JLabel JLcpf;
    private javax.swing.JLabel JLemail;
    private javax.swing.JLabel JLemail1;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLnome;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JTable JTBcliente;
    private javax.swing.JTextField JTFcpf;
    private javax.swing.JTextField JTFemail;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFnome;
    private javax.swing.JTextField JTFsenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
