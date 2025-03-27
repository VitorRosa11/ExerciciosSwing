
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro1 extends javax.swing.JFrame{
 private JTextField txtNome, txtEmail, txtTelefone;
    private JButton btnSalvar;
    private JTextArea txtUsuarios;
    

    
    public TelaCadastro1() {
         setTitle("Cadastro de Usuário");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Criando os componentes
        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);
        
        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField(20);
        
        JLabel lblTelefone = new JLabel("Telefone:");
        txtTelefone = new JTextField(15);
        
        btnSalvar = new JButton("Salvar");
        txtUsuarios = new JTextArea(10, 30);
        txtUsuarios.setEditable(false);
        
        // Adicionando componentes à tela
        add(lblNome);
        add(txtNome);
        add(lblEmail);
        add(txtEmail);
        add(lblTelefone);
        add(txtTelefone);
        add(btnSalvar);
        add(new JScrollPane(txtUsuarios));

        // Evento do botão "Salvar"
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
    cadastrarUsuario();
            }
        });
        
        setVisible(true);
    }

    private void cadastrarUsuario() {
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        String telefone = txtTelefone.getText();
        
        if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario1 usuario = new Usuario1(nome, email, telefone);
        txtUsuarios.append(usuario.toString());

        // Limpando os campos
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
    }

    public static void main(String[] args) {
        new TelaCadastro1();
    }
}


   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(TelaCadastro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

