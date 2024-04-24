package com.library_v2;

import javax.swing.*;
import java.awt.*;

public class PaginaPrincipal extends JFrame {

    public PaginaPrincipal() {
        setTitle("Library v2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setBackground(new Color(200, 255, 200));
        setLocationRelativeTo(null);

        JLabel tituloLabel = new JLabel("Welcome to my app");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 30));
        tituloLabel.setBackground(new Color(200, 255, 200));
        tituloLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel principalLabel = new JLabel("Falta definir");
        principalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        principalLabel.setHorizontalAlignment(JLabel.LEFT);

        JButton boton1 = new JButton("Ya soy usuario");
        JButton boton2 = new JButton("Crear usuario");
        boton1.setBackground(new Color(0, 230, 0));
        boton2.setBackground(new Color(0, 230, 0));

        JPanel panelBotones = new JPanel(new FlowLayout());
        setSize(900, 600);
        panelBotones.setBackground(new Color(200, 255, 200));
        panelBotones.add(tituloLabel);
        panelBotones.add(principalLabel);
        panelBotones.add(boton1);
        panelBotones.add(boton2);

        setLayout(new BorderLayout());
        add(panelBotones, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PaginaPrincipal::new);
    }
}
