/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cliente;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class GUICliente extends javax.swing.JFrame {

    /**
     * Creates new form GUICliente
     */
    public GUICliente() {
        initComponents();
        setVisible(true);
    }

    public void addListener(GerenciadorCliente gc) {
        JBTcadastrar.addActionListener(gc);
        JBTdeletar.addActionListener(gc);
        JBTalterar.addActionListener(gc);
        JBTconsultar.addActionListener(gc);
    }

    public Cliente getCliente() {
        Cliente c = new Cliente();
        c.setIDCliente(Integer.parseInt(JTFid.getText()));
        c.setNome(JTFnome.getText());
        c.setCpf(Long.parseLong(JTFcpf.getText()));
        c.setEmail(JTFemail.getText());
        return c;
    }

    public void setCliente(Cliente c) {
        JTFid.setText(String.valueOf(c.getIDCliente()));
        JTFnome.setText(c.getNome());
        JTFemail.setText(c.getEmail());
        JTFcpf.setText(String.valueOf(c.getCpf()));
    }
    
    public int getID(){
        return Integer.parseInt(JTFid.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtitulo = new javax.swing.JLabel();
        JLid = new javax.swing.JLabel();
        JLnome = new javax.swing.JLabel();
        JLemail = new javax.swing.JLabel();
        JTFid = new javax.swing.JTextField();
        JTFnome = new javax.swing.JTextField();
        JTFemail = new javax.swing.JTextField();
        JBTcadastrar = new javax.swing.JButton();
        JBTdeletar = new javax.swing.JButton();
        JBTalterar = new javax.swing.JButton();
        JLcpf = new javax.swing.JLabel();
        JTFcpf = new javax.swing.JTextField();
        JBTconsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTBcliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");

        JLtitulo.setText("Cliente");

        JLid.setText("ID Cliente:");

        JLnome.setText("Nome:");

        JLemail.setText("E-Mail:");

        JTFid.setName("JTFid"); // NOI18N
        JTFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidActionPerformed(evt);
            }
        });

        JBTcadastrar.setText("Cadastrar");
        JBTcadastrar.setName("cadastrar"); // NOI18N
        JBTcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTcadastrarActionPerformed(evt);
            }
        });

        JBTdeletar.setText("Deletar");
        JBTdeletar.setName("deletar"); // NOI18N
        JBTdeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTdeletarActionPerformed(evt);
            }
        });

        JBTalterar.setText("Alterar");
        JBTalterar.setName("alterar");
        JBTalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTalterarActionPerformed(evt);
            }
        });

        JLcpf.setText("CPF:");

        JBTconsultar.setText("Consultar");
        JBTconsultar.setName("mostrar"); // NOI18N
        JBTconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTconsultarActionPerformed(evt);
            }
        });

        JTBcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTBcliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(JLtitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLemail)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLid)
                                    .addComponent(JLnome))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JTFemail)
                                            .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTFcpf, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))))
                            .addComponent(JLcpf)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(JBTcadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(JBTdeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBTalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBTconsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLid)
                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnome)
                    .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLemail)
                    .addComponent(JTFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcpf)
                    .addComponent(JTFcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTdeletar)
                    .addComponent(JBTcadastrar)
                    .addComponent(JBTalterar)
                    .addComponent(JBTconsultar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        JBTcadastrar.getAccessibleContext().setAccessibleName("cadastrar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidActionPerformed

    private void JBTcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTcadastrarActionPerformed

    private void JBTalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTalterarActionPerformed
        Update();
    }//GEN-LAST:event_JBTalterarActionPerformed

    private void JBTdeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTdeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTdeletarActionPerformed

    private void JBTconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTconsultarActionPerformed
       //consult();
    }//GEN-LAST:event_JBTconsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    private void Update() {
        int cli_id;
        String cli_nome, cli_email;
        long cli_cpf;

        cli_id = Integer.parseInt(JTFid.getText());
        cli_nome = JTFnome.getText();
        cli_email = JTFemail.getText();
        try {
            cli_cpf = Long.parseLong(JTFcpf.getText());
        } catch (NumberFormatException e) {
            // Handle parsing error for cli_cpf, e.g., show an error message
            // or set a default value.
            cli_cpf = 0L; // Default value, you can choose an appropriate default.
        }

        Cliente objcliente = new Cliente();
        objcliente.setIDCliente(cli_id);
        objcliente.setNome(cli_nome);
        objcliente.setEmail(cli_email);
        objcliente.setCpf(cli_cpf);

        DAOCliente objClienteDAO = new DAOCliente();
        objClienteDAO.Update(objcliente);
    }
    /*
    private void consult() {
        try {
            DAOCliente objclientedao = new DAOCliente();
            Cliente objcliente = new Cliente();
            
            DefaultTableModel model = (DefaultTableModel) JTBcliente.getModel();

            ArrayList<Cliente> lista = objclientedao.Display(this.getID());

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getIDCliente(),
                    lista.get(num).getNome(),
                    lista.get(num).getEmail(),
                    lista.get(num).getCpf()
                });
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
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
            java.util.logging.Logger.getLogger(GUICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICliente().setVisible(true);
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
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLnome;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JTable JTBcliente;
    private javax.swing.JTextField JTFcpf;
    private javax.swing.JTextField JTFemail;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFnome;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
