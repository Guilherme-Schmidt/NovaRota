/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Locacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class GUILocacao extends javax.swing.JFrame {
    /**
     * Creates new form GUICliente
     */
    public GUILocacao() {
        initComponents();
        setVisible(true);
    }

    public void addListener(GerenciadorLocacao gl) {
        JBTcadastrar.addActionListener(gl);
        JBTdeletar.addActionListener(gl);
        JBTconsultar.addActionListener(gl);
    }

    public Locacao getLocacao() {
        Locacao l = new Locacao();
        l.setIdlocacao(Integer.parseInt(JTFidlocacao.getText()));
        l.setIdfuncionario(Integer.parseInt(JTFidfuncionario.getText()));
        l.setIdcliente(Integer.parseInt(JTFidcliente.getText()));
        l.setPlaca(JTFplaca.getText());
        l.setDatalocacao(dataLocacao());
        l.setDatadevolucao(dataDevolucao());
        return l;
    }
    
    public String dataLocacao(){
        String datalocacao;
        
        datalocacao = JTFlocano.getText() + "-" + JTFlocmes.getText() + "-" + JTFlocdia.getText();
        
        return datalocacao;
    }
    
    public String dataDevolucao(){
        String datadevolucao;
        
        datadevolucao = JTFdevano.getText() + "-" + JTFdevmes.getText() + "-" + JTFdevdia.getText();
        
        return datadevolucao;
    }
    
    public int getID(){
        return Integer.parseInt(JTFidlocacao.getText());
    }

    public void limpar(){
        JTFidlocacao.setText("");
        JTFidfuncionario.setText("");
        JTFidcliente.setText("");
        JTFplaca.setText("");
        JTFlocano.setText("");
        JTFlocmes.setText("");
        JTFlocdia.setText("");
        JTFdevano.setText("");
        JTFdevmes.setText("");
        JTFdevdia.setText("");
    }
    
    public void consultar() {
        try {
            DAOLocacao objlocacaodao = new DAOLocacao();
            DefaultTableModel model = (DefaultTableModel) JTBcliente.getModel();
            ArrayList<Locacao> lista = objlocacaodao.Display();
            model.setRowCount(0);
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getIdlocacao(),
                    lista.get(num).getIdfuncionario(),
                    lista.get(num).getIdcliente(),
                    lista.get(num).getPlaca(),
                    lista.get(num).getDatalocacao(),
                    lista.get(num).getDatadevolucao()
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
        JLcpf = new javax.swing.JLabel();
        JLtitulo = new javax.swing.JLabel();
        JTFidcliente = new javax.swing.JTextField();
        JLid = new javax.swing.JLabel();
        JBTconsultar = new javax.swing.JButton();
        JLnome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTBcliente = new javax.swing.JTable();
        JLemail = new javax.swing.JLabel();
        JTFidlocacao = new javax.swing.JTextField();
        JTFidfuncionario = new javax.swing.JTextField();
        JTFplaca = new javax.swing.JTextField();
        JTFlocano = new javax.swing.JTextField();
        JLemail1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JTFlocmes = new javax.swing.JTextField();
        JTFlocdia = new javax.swing.JTextField();
        JTFdevdia = new javax.swing.JTextField();
        JTFdevmes = new javax.swing.JTextField();
        JTFdevano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locação");

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

        JLcpf.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        JLcpf.setForeground(new java.awt.Color(247, 255, 247));
        JLcpf.setText("ID Cliente:");

        JLtitulo.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        JLtitulo.setForeground(new java.awt.Color(247, 255, 247));
        JLtitulo.setText("Gerenciamento de Locação");

        JLid.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        JLid.setForeground(new java.awt.Color(247, 255, 247));
        JLid.setText("ID Locação:");

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
        JLnome.setText("ID Funcionário:");

        JTBcliente.setBackground(new java.awt.Color(247, 255, 247));
        JTBcliente.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        JTBcliente.setForeground(new java.awt.Color(36, 123, 160));
        JTBcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Locação", "ID Funcionário", "ID Cliente", "Placa", "Data de Locação", "Data de Devolução"
            }
        ));
        JTBcliente.setSelectionForeground(new java.awt.Color(36, 123, 160));
        JTBcliente.setShowGrid(true);
        jScrollPane1.setViewportView(JTBcliente);

        JLemail.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        JLemail.setForeground(new java.awt.Color(247, 255, 247));
        JLemail.setText("Placa:");

        JTFidlocacao.setName("JTFidlocacao"); // NOI18N
        JTFidlocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidlocacaoActionPerformed(evt);
            }
        });

        JTFlocano.setForeground(new java.awt.Color(36, 123, 160));
        JTFlocano.setText("Ano");

        JLemail1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        JLemail1.setForeground(new java.awt.Color(247, 255, 247));
        JLemail1.setText("Data de Locação:");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 255, 247));
        jLabel1.setText("Data de Devolução:");

        JTFlocmes.setForeground(new java.awt.Color(36, 123, 160));
        JTFlocmes.setText("Mês");

        JTFlocdia.setForeground(new java.awt.Color(36, 123, 160));
        JTFlocdia.setText("Dia");

        JTFdevdia.setForeground(new java.awt.Color(36, 123, 160));
        JTFdevdia.setText("Dia");

        JTFdevmes.setForeground(new java.awt.Color(36, 123, 160));
        JTFdevmes.setText("Mês");

        JTFdevano.setForeground(new java.awt.Color(36, 123, 160));
        JTFdevano.setText("Ano");

        jLabel2.setFont(new java.awt.Font("Impact", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 255, 247));
        jLabel2.setText("NovaRota");

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(JLcpf)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(JTFidcliente, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(JLemail)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(JTFplaca)))
                                    .addGap(74, 74, 74))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(JLid)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFidlocacao))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(JLnome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFidfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFdevano, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFdevmes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFdevdia, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(JLemail1)
                                        .addGap(35, 35, 35)
                                        .addComponent(JTFlocano)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFlocmes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFlocdia, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLtitulo)
                                .addGap(42, 42, 42)))
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JBTcadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(JBTdeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBTconsultar)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLtitulo)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFidlocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnome)
                    .addComponent(JTFidfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcpf)
                    .addComponent(JTFidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLemail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFlocano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLemail1)
                    .addComponent(JTFlocmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFlocdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFdevdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFdevmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFdevano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTdeletar)
                    .addComponent(JBTcadastrar)
                    .addComponent(JBTconsultar))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        JBTcadastrar.getAccessibleContext().setAccessibleName("cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFidlocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidlocacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidlocacaoActionPerformed

    private void JBTcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTcadastrarActionPerformed

    private void JBTdeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTdeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTdeletarActionPerformed

    private void JBTconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTconsultarActionPerformed
      
    }//GEN-LAST:event_JBTconsultarActionPerformed

  
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
            java.util.logging.Logger.getLogger(GUILocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GUILocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField JTFdevano;
    private javax.swing.JTextField JTFdevdia;
    private javax.swing.JTextField JTFdevmes;
    private javax.swing.JTextField JTFidcliente;
    private javax.swing.JTextField JTFidfuncionario;
    private javax.swing.JTextField JTFidlocacao;
    private javax.swing.JTextField JTFlocano;
    private javax.swing.JTextField JTFlocdia;
    private javax.swing.JTextField JTFlocmes;
    private javax.swing.JTextField JTFplaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
