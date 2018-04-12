/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.CadastroFuncionario;
import controle.DaoFuncionario;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Endereco;
import modelo.Vendedor;

/**
 *
 * @author Amanda
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    int xMouse;
    int yMouse;
    private DaoFuncionario dao;
    private final CadastroFuncionario cadFuncionario;
    public TelaLogin() throws IOException {

        cadFuncionario = new CadastroFuncionario();
        /*
        try{ 
            cadFuncionario.salvar(new Vendedor(50, "Amanda", "amanda@gmail.com", "222.222.222-22", 
                    "1111-1", "ADS", "Superior Incompleto", "(83) 99999-9999", "Atendente", 
                    new Endereco("Centro", "Sousa", "58815-000", "José Viana", 204, " ", "F Sarmento Pneus"), "123"));
            
        } catch (IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao criar funcionario");
        } catch (ClassNotFoundException ex){
            
        }
        */
       
        dao = new CadastroFuncionario();
        initComponents();
        overflow_bg.setBackground(new Color(0,0,0,200));
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campo_usuario = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        campo_senha = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        overflow_bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(28, 27, 27));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.textHighlight);
        jLabel2.setText("Usuário");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 90, -1));

        campo_usuario.setBackground(new java.awt.Color(28, 27, 27));
        campo_usuario.setBorder(null);
        campo_usuario.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campo_usuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 340, 30));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 340, 10));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.textHighlight);
        jLabel3.setText("Senha");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 80, -1));

        campo_senha.setBackground(new java.awt.Color(28, 27, 27));
        campo_senha.setFont(new java.awt.Font("Oswald ExtraLight", 0, 14)); // NOI18N
        campo_senha.setForeground(new java.awt.Color(255, 255, 255));
        campo_senha.setBorder(null);
        jPanel2.add(campo_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 340, 30));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 340, 10));

        btn_login.setBackground(java.awt.SystemColor.textHighlight);
        btn_login.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 350, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(java.awt.SystemColor.textHighlight);
        jLabel4.setText("LOGIN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, -1));

        jLabel1.setBackground(new java.awt.Color(28, 27, 27));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 120, 215));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 30));

        jLabel7.setText("jLabel7");
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, 0, 850, 36));

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 340, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 0, 477, 490));

        overflow_bg.setBackground(new java.awt.Color(0, 0, 0));
        overflow_bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amanda\\Documents\\Amanda\\ADS\\3P\\POO\\ProjetoPOO\\img\\logo.png")); // NOI18N
        overflow_bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 195, -1, 100));
        logo.getAccessibleContext().setAccessibleName("logo");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Development by Amanda e Rafaela");
        overflow_bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 455, -1, -1));

        jPanel1.add(overflow_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amanda\\Documents\\Amanda\\ADS\\3P\\POO\\ProjetoPOO\\img\\bg.jpg")); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        try{
            
            if(dao.autentica(campo_usuario.getText(), new String(campo_senha.getPassword()))){
                TelaHome home = new TelaHome(campo_usuario.getText());
                home.setVisible(true);
                dispose();
            } else{
                jLabel6.setText("Usuário ou senha inválidos");
            }
        } catch(IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Login não encontrado", "ERROr", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btn_loginActionPerformed

    private void campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_usuarioActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel7MouseDragged

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel7MousePressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new TelaLogin().setVisible(true);
                } catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_login;
    private javax.swing.JPasswordField campo_senha;
    private javax.swing.JFormattedTextField campo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel overflow_bg;
    // End of variables declaration//GEN-END:variables
}