import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaNotas extends javax.swing.JFrame {
 private JTextField txtNome, txtNota1, txtNota2;
    private JButton btnCalcular;
    private JLabel lblResultado;

    
    public TelaNotas() {
         setTitle("Calculadora de Notas");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Criando os componentes
        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);

        JLabel lblNota1 = new JLabel("Nota 1:");
        txtNota1 = new JTextField(5);

        JLabel lblNota2 = new JLabel("Nota 2:");
        txtNota2 = new JTextField(5);

        btnCalcular = new JButton("Calcular");
        lblResultado = new JLabel("Média e situação aparecerão aqui.");

        // Adicionando componentes à tela
        add(lblNome);
        add(txtNome);
        add(lblNota1);
        add(txtNota1);
        add(lblNota2);
        add(txtNota2);
        add(btnCalcular);
        add(lblResultado);

        // Evento do botão "Calcular"
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularMedia();
            }
        });

        setVisible(true);
    }

    private void calcularMedia() {
        try {
            String nome = txtNome.getText();
            double nota1 = Double.parseDouble(txtNota1.getText());
            double nota2 = Double.parseDouble(txtNota2.getText());

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha o nome!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
                JOptionPane.showMessageDialog(this, "As notas devem estar entre 0 e 10!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Aluno aluno = new Aluno(nome, nota1, nota2);
            double media = aluno.calcularMedia();
            String situacao = GerenciadorNotas.verificarSituacao(media);

            lblResultado.setText("Média: " + String.format("%.2f", media) + " - " + situacao);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Insira valores numéricos válidos para as notas!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new TelaNotas();
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
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

