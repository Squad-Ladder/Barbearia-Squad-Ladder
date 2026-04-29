package Telas;

import util.UIConfig;

import javax.swing.*;

import modelos.*;

import java.awt.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Login");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4,1,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,40,20,40));
        panel.setBackground(UIConfig.BG);

        JTextField nome = new JTextField();
        JButton entrar = new JButton("Entrar");
        JButton cadastrar = new JButton("Cadastrar");

        estilizar(entrar);
        estilizar(cadastrar);

        panel.add(new JLabel("Nome:"));
        panel.add(nome);
        panel.add(entrar);
        panel.add(cadastrar);

        add(panel);

        entrar.addActionListener(e -> {
            for (Cadastro c : BancoFake.clientes) {
                if (c.getNome().equals(nome.getText())) {
                    new MenuFrame(c);
                    dispose();
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Usuário não encontrado");
        });

        cadastrar.addActionListener(e -> {
            new CadastroFrame();
            dispose();
        });

        setVisible(true);
    }

    private void estilizar(JButton b){
        b.setBackground(UIConfig.PRIMARY);
        b.setForeground(UIConfig.TEXT_WHITE);
        b.setFocusPainted(false);
    }
}