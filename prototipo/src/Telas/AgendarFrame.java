package Telas;

import util.UIConfig;

import javax.swing.*;

import modelos.*;

import java.awt.*;

public class AgendarFrame extends JFrame {

    public AgendarFrame(Cadastro user){
        setTitle("Agendar");
        setSize(350,250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5,1,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,40,20,40));
        panel.setBackground(UIConfig.BG);

        JComboBox<String> servico = new JComboBox<>(new String[]{"Corte","Barba","Combo"});
        JComboBox<String> horario = new JComboBox<>(new String[]{"09:00","10:00","11:00"});

        JButton confirmar = new JButton("Confirmar");
        JButton voltar = new JButton("Voltar");

        estilizar(confirmar);
        estilizar(voltar);

        panel.add(servico);
        panel.add(horario);
        panel.add(confirmar);
        panel.add(voltar);

        add(panel);

        confirmar.addActionListener(e -> {
            BancoFake.agendamentos.add(new Agendamento(user,
                servico.getSelectedItem().toString(),
                horario.getSelectedItem().toString()
            ));
            JOptionPane.showMessageDialog(this,"Agendado!");
        });

        voltar.addActionListener(e -> {
            dispose();
            new MenuFrame(user);
        });

        setVisible(true);
    }

    private void estilizar(JButton b){
        b.setBackground(UIConfig.PRIMARY);
        b.setForeground(UIConfig.TEXT_WHITE);
    }
}