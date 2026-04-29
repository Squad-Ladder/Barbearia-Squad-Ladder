package Telas;

import util.UIConfig;

import javax.swing.*;

import modelos.*;

import java.awt.*;

public class ListaFrame extends JFrame {

    public ListaFrame(Cadastro user){
        setTitle("Agendamentos");
        setSize(400,300);
        setLocationRelativeTo(null);

        DefaultListModel<Agendamento> model = new DefaultListModel<>();
        for(Agendamento a: BancoFake.agendamentos){
            model.addElement(a);
        }

        JList<Agendamento> lista = new JList<>(model);

        JButton cancelar = new JButton("Cancelar");
        JButton voltar = new JButton("Voltar");

        cancelar.addActionListener(e -> {
            Agendamento a = lista.getSelectedValue();
            if(a!=null){
                a.cancelar();
                lista.repaint();
            }
        });

        voltar.addActionListener(e -> {
            dispose();
            new MenuFrame(user);
        });

        JPanel botoes = new JPanel();
        botoes.add(cancelar);
        botoes.add(voltar);

        add(new JScrollPane(lista),BorderLayout.CENTER);
        add(botoes,BorderLayout.SOUTH);

        setVisible(true);
    }
}