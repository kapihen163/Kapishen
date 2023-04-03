package Lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateFieldButtonListner implements ActionListener {

    private JTextField inputField;

    public CalculateFieldButtonListner(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
