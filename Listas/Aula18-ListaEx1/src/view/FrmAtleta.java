/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.AtletaController;
import model.Atleta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NegativeNumberException;
import model.StringVaziaException;

/**
 *
 * @author aluno
 */

public class FrmAtleta extends javax.swing.JFrame {

    private AtletaController atletaController; 
    private DefaultTableModel tbl;
    /**
     * Creates new form FrmAtleta
     */
    public FrmAtleta() {
        atletaController = new AtletaController();
        tbl = new DefaultTableModel();
            tbl.addColumn("Código");
            tbl.addColumn("Nome");
            tbl.addColumn("Idade");
            tbl.addColumn("Peso");
            tbl.addColumn("Altura");
            tbl.setNumRows(0);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdade = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        labelPeso = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        btnMedia = new javax.swing.JButton();
        btnMaisAlto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAtletas = new javax.swing.JTable();
        btnMenorIdade = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        btnBuscarCodigo = new javax.swing.JButton();
        btnBuscarNome = new javax.swing.JButton();
        btnBuscarIdade = new javax.swing.JButton();
        btnBuscarPeso = new javax.swing.JButton();
        btnBuscarAltura = new javax.swing.JButton();
        txtBuscarCodigo = new javax.swing.JTextField();
        txtBuscarNome = new javax.swing.JTextField();
        txtBuscarIdade = new javax.swing.JTextField();
        txtBuscarPeso = new javax.swing.JTextField();
        txtBuscarAltura = new javax.swing.JTextField();
        txtExcluir = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIdade.setName("Txt2"); // NOI18N

        labelNome.setText("Nome:");

        labelIdade.setText("Idade:");

        txtAltura.setName("Txt2"); // NOI18N

        txtPeso.setName("Txt1"); // NOI18N

        labelPeso.setText("Peso:");

        labelAltura.setText("Altura:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtCodigo.setName("Txt1"); // NOI18N

        labelCodigo.setText("Código:");

        btnMedia.setText("Média");
        btnMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaActionPerformed(evt);
            }
        });

        btnMaisAlto.setText("Mais alto");
        btnMaisAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisAltoActionPerformed(evt);
            }
        });

        tblAtletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Idade", "Peso", "Altura"
            }
        ));
        tblAtletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAtletasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAtletas);

        btnMenorIdade.setText("Menor de idade");
        btnMenorIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorIdadeActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        txtNome.setName("Txt1"); // NOI18N

        btnBuscarCodigo.setText("Buscar por código");
        btnBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodigoActionPerformed(evt);
            }
        });

        btnBuscarNome.setText("Buscar por nome");
        btnBuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNomeActionPerformed(evt);
            }
        });

        btnBuscarIdade.setText("Buscar por idade");
        btnBuscarIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdadeActionPerformed(evt);
            }
        });

        btnBuscarPeso.setText("Buscar por peso");
        btnBuscarPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPesoActionPerformed(evt);
            }
        });

        btnBuscarAltura.setText("Buscar por altura");
        btnBuscarAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlturaActionPerformed(evt);
            }
        });

        txtBuscarCodigo.setName("Txt1"); // NOI18N

        txtBuscarNome.setName("Txt1"); // NOI18N

        txtBuscarIdade.setName("Txt1"); // NOI18N

        txtBuscarPeso.setName("Txt1"); // NOI18N

        txtBuscarAltura.setName("Txt1"); // NOI18N

        txtExcluir.setName("Txt1"); // NOI18N

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelIdade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelPeso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMenorIdade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMedia)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMaisAlto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBuscarCodigo)
                                            .addComponent(txtBuscarNome)
                                            .addComponent(txtBuscarIdade, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtBuscarPeso, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtBuscarAltura, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnBuscarNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBuscarIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBuscarAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBuscarPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBuscarCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtExcluir)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIdade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAltura)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPeso)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar)
                            .addComponent(btnMedia)
                            .addComponent(btnMaisAlto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMenorIdade)
                            .addComponent(btnMostrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarCodigo)
                            .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarNome)
                            .addComponent(txtBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarIdade)
                            .addComponent(txtBuscarIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarPeso)
                            .addComponent(txtBuscarPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarAltura)
                            .addComponent(txtBuscarAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluir)
                            .addComponent(txtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try{
            String nome  = txtNome.getText();
            int codigo = Integer.parseInt(txtCodigo.getText());
            int idade = Integer.parseInt(txtIdade.getText());
            double peso = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            
            if(nome.equals ("")){
                throw new StringVaziaException();
            }else if(codigo<0 || idade<0 || peso<0 || altura<0 ){
                throw new NegativeNumberException();
            }else{
                atletaController.cadastrar(codigo, nome, peso, idade, altura);
                JOptionPane.showMessageDialog(null, "Atleta cadastrado com sucesso!");
                txtCodigo.requestFocus();
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O código, a idade, o peso e a altura precisam ser um número!");
            txtCodigo.requestFocus();
        }catch(NegativeNumberException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            txtCodigo.requestFocus();
        }catch(StringVaziaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            txtNome.requestFocus();
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaActionPerformed
        int n = 0;
        double mediaAtl = 0;
        double peso = Double.parseDouble(txtPeso.getText());
        atletaController.media(peso, mediaAtl, n);
        
    }//GEN-LAST:event_btnMediaActionPerformed

    private void btnMaisAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisAltoActionPerformed
        String nome  = txtNome.getText();
        double altura = Double.parseDouble(txtAltura.getText());
        atletaController.maisAlto(altura, nome);
    }//GEN-LAST:event_btnMaisAltoActionPerformed

    private void btnMenorIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorIdadeActionPerformed
        String nome  = txtNome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        atletaController.menorIdade(idade, nome);
    }//GEN-LAST:event_btnMenorIdadeActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        tbl.setNumRows(0);
        
        ArrayList<Atleta> lista = atletaController.getLista();
        String result = new String();
        
        for(Atleta a: lista){
            tbl.addRow(new Object[]{a.getCodigo(), a.getNome(), a.getIdade(), a.getPeso(), a.getAltura()});
        }
        tblAtletas.setModel(tbl);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodigoActionPerformed
        tbl.setNumRows(0);
       
        int buscacod = Integer.parseInt(txtBuscarCodigo.getText());
        ArrayList<Atleta> lista = atletaController.getLista();
        String result = new String();
        
        for(Atleta a: lista){
            if(buscacod == a.getCodigo()){
            tbl.addRow(new Object[]{a.getCodigo(), a.getNome(), a.getIdade(), a.getPeso(), a.getAltura()});
            }
            
        }
        tblAtletas.setModel(tbl);
    }//GEN-LAST:event_btnBuscarCodigoActionPerformed

    private void btnBuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNomeActionPerformed
        tbl.setNumRows(0);
       
        String buscarnome  = txtBuscarNome.getText();
        ArrayList<Atleta> lista = atletaController.getLista();
        String result = new String();
        
        for(Atleta a: lista){
            if(buscarnome.equals(a.getNome())){
                tbl.addRow(new Object[]{a.getCodigo(), a.getNome(), a.getIdade(), a.getPeso(), a.getAltura()});
            }
        }
        tblAtletas.setModel(tbl);
    }//GEN-LAST:event_btnBuscarNomeActionPerformed

    private void btnBuscarIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdadeActionPerformed
       
        tbl.setNumRows(0);
       
        int buscaidade = Integer.parseInt(txtBuscarIdade.getText());
        ArrayList<Atleta> lista = atletaController.getLista();
        String result = new String();
        
        for(Atleta a: lista){
            if(buscaidade == a.getIdade()){
            tbl.addRow(new Object[]{a.getCodigo(), a.getNome(), a.getIdade(), a.getPeso(), a.getAltura()});
            }
            
        }
        tblAtletas.setModel(tbl);
    }//GEN-LAST:event_btnBuscarIdadeActionPerformed

    private void btnBuscarPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPesoActionPerformed

        tbl.setNumRows(0);
       
        double buscapeso = Double.parseDouble(txtBuscarPeso.getText());
        ArrayList<Atleta> lista = atletaController.getLista();
        String result = new String();
        
        for(Atleta a: lista){
            if(buscapeso == a.getPeso()){
            tbl.addRow(new Object[]{a.getCodigo(), a.getNome(), a.getIdade(), a.getPeso(), a.getAltura()});
            }
            
        }
        tblAtletas.setModel(tbl);
    }//GEN-LAST:event_btnBuscarPesoActionPerformed

    private void btnBuscarAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlturaActionPerformed

        tbl.setNumRows(0);
       
        double buscaaltura = Double.parseDouble(txtBuscarAltura.getText());
        ArrayList<Atleta> lista = atletaController.getLista();
        String result = new String();
        
        for(Atleta a: lista){
            if(buscaaltura == a.getAltura()){
            tbl.addRow(new Object[]{a.getCodigo(), a.getNome(), a.getIdade(), a.getPeso(), a.getAltura()});
            }
            
        }
        tblAtletas.setModel(tbl);
    }//GEN-LAST:event_btnBuscarAlturaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        String nomeExcluir = txtExcluir.getText();
        atletaController.excluir(nomeExcluir);
        int resp = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir os dados de " + nomeExcluir + "?");
         if (resp == 0){
             atletaController.excluir(nomeExcluir);
             JOptionPane.showMessageDialog(null, "Dados de " + nomeExcluir + " excluídos");
         }else{
             JOptionPane.showMessageDialog(null, "Dados de " + nomeExcluir + " não foram excluídos");
         }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblAtletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAtletasMouseClicked
        int linhaSelec = tblAtletas.getSelectedRow();
        String nome = tblAtletas.getValueAt(linhaSelec, 0).toString();
        txtExcluir.setText(nome);
    }//GEN-LAST:event_tblAtletasMouseClicked

    /**
     * @param args the command line argument
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
            java.util.logging.Logger.getLogger(FrmAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAltura;
    private javax.swing.JButton btnBuscarCodigo;
    private javax.swing.JButton btnBuscarIdade;
    private javax.swing.JButton btnBuscarNome;
    private javax.swing.JButton btnBuscarPeso;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMaisAlto;
    private javax.swing.JButton btnMedia;
    private javax.swing.JButton btnMenorIdade;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JTable tblAtletas;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBuscarAltura;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtBuscarIdade;
    private javax.swing.JTextField txtBuscarNome;
    private javax.swing.JTextField txtBuscarPeso;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtExcluir;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
