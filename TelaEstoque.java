import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEstoque extends javax.swing.JFrame {

    public TelaEstoque() {
     setTitle("Gerenciador de Estoque");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        gerenciador = new GerenciadorProdutos();

        
        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);

        JLabel lblPreco = new JLabel("Preço:");
        txtPreco = new JTextField(10);

        JLabel lblQuantidade = new JLabel("Quantidade:");
        txtQuantidade = new JTextField(5);

        btnAdicionar = new JButton("Adicionar");
        txtListaProdutos = new JTextArea(10, 30);
        txtListaProdutos.setEditable(false);

       
        add(lblNome);
        add(txtNome);
        add(lblPreco);
        add(txtPreco);
        add(lblQuantidade);
        add(txtQuantidade);
        add(btnAdicionar);
        add(new JScrollPane(txtListaProdutos));

       
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarProduto();
            }
        });

        setVisible(true);
    }

    private void adicionarProduto() {
        try {
            String nome = txtNome.getText();
            double preco = Double.parseDouble(txtPreco.getText());
            int quantidade = Integer.parseInt(txtQuantidade.getText());

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha o nome do produto!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (preco <= 0 || quantidade < 0) {
                JOptionPane.showMessageDialog(this, "Preço deve ser positivo e quantidade não pode ser negativa!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Produto produto = new Produto(nome, preco, quantidade);
            gerenciador.adicionarProduto(produto);

           
            txtListaProdutos.setText(gerenciador.listarProdutos());

            
            txtNome.setText("");
            txtPreco.setText("");
            txtQuantidade.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Insira valores válidos para preço e quantidade!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new TelaEstoque();
    }
}
   
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

