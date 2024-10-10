/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tabalhojava.View;

import javax.swing.JOptionPane;
import tabalhojava.Model.Usuario;
import tabalhojava.Controller.Utils;

/**
 *
 * @author Daniel Dória
 */
public class TelaRegistro extends javax.swing.JFrame {

    private TelaLogin telaLogin;
    private Utils utils = new Utils();
    /**
     * Creates new form TelaRegistro
     */
    public TelaRegistro(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApelido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtConfSenha = new javax.swing.JPasswordField();
        registrar = new javax.swing.JButton();
        mostrarSenha = new javax.swing.JToggleButton();
        mostrarConfirmacao = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("E-mail:");

        jLabel3.setText("Nascimento:");

        txtNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascimentoActionPerformed(evt);
            }
        });

        jLabel4.setText("Usuario:");

        jLabel5.setText("Senha:");

        jLabel6.setText("Confirmar senha:");

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        mostrarSenha.setText("Mostrar Senha");
        mostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaActionPerformed(evt);
            }
        });

        mostrarConfirmacao.setText("Mostrar Confirmação");
        mostrarConfirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarConfirmacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome)
                    .addComponent(txtEmail)
                    .addComponent(txtNascimento)
                    .addComponent(txtApelido)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtSenha)
                            .addComponent(jLabel6)
                            .addComponent(txtConfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mostrarConfirmacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostrarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(registrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarConfirmacao))
                .addGap(18, 18, 18)
                .addComponent(registrar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascimentoActionPerformed

    
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        
        try{
            Usuario usuario = new Usuario();
            String nome = this.txtNome.getText();
            if(nome.length() < 3){
                utils.mostrarErro("Esse nome é invalido!");
                
                return;
            }
            usuario.setNome(nome);
            
            String email = this.txtEmail.getText();
            boolean isValido = usuario.validarEmail(email, this.telaLogin.getUsuarios());
            if(!isValido){
                utils.mostrarErro("Esse email é inválido ou já existe!");
                
                return;
            }
            usuario.setEmail(email); 
            
            String nascimento = this.txtNascimento.getText();
            boolean isMaiorIdade = usuario.validarIdade(nascimento);
            if(!isMaiorIdade){
                utils.mostrarErro("O usuario precisa tyer 18 anos ou mais");
                
                return;
            }           
            usuario.setNascimento(nascimento);
            
            String apelido = this.txtApelido.getText();
            boolean isDiferente = usuario.validarApelido (apelido, this.telaLogin.getUsuarios());
            if(!isDiferente){
                utils.mostrarErro("Nome de usuário precisa ser único, este já está sendo usado!");
                
                return;
            }
            usuario.setApelido(apelido);
            
            String senha = new String(this.txtSenha.getPassword());
            String confirmarSenha = new String(this.txtConfSenha.getPassword());
            boolean isIgual = usuario.validarSenha(senha, confirmarSenha);
            if(!isIgual){
                utils.mostrarErro("Senha muito curta ou diferentes!");

                return;
            }
            usuario.setSenha(senha);
            
            this.telaLogin.getUsuarios().add(usuario);
            
            this.telaLogin.setVisible(true);
            this.dispose();
            
        }catch(Exception e){
            utils.mostrarErro(e.getMessage());
        }   
    }//GEN-LAST:event_registrarActionPerformed

    private void mostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaActionPerformed
        // TODO add your handling code here:
        if(this.mostrarSenha.isSelected()){
            this.txtSenha.setEchoChar((char) 0);
        }else{
            this.txtSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarSenhaActionPerformed

    private void mostrarConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarConfirmacaoActionPerformed
        // TODO add your handling code here:
         if(this.mostrarConfirmacao.isSelected()){
            this.txtConfSenha.setEchoChar((char) 0);
        }else{
            this.txtConfSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarConfirmacaoActionPerformed

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton mostrarConfirmacao;
    private javax.swing.JToggleButton mostrarSenha;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
