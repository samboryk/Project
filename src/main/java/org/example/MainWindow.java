package org.example;

import javax.swing.*;

public class MainWindow extends JFrame {
    private LoginPanel loginPanel;

    public MainWindow() {
        super("Хостел");

        loginPanel = new LoginPanel((Employee employee) -> {
            JOptionPane.showMessageDialog(this, "Ви ввійшли як користувач " + employee.getFullName());
        });
        add(loginPanel);

        setSize(1200,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
