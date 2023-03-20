package Lesson8;

import Lesson8.components.DigitJButtton;
import Lesson8.components.OperatorJButtton;
import Lesson8.listeners.ButtonListener;
import Lesson8.listeners.ClearFieldButtonListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {
    private JTextField inputField;
    //    private final String appTitle;

    public ApplicationForm(String title) {
        super(title);
        setBounds(500,300,250,370);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);



        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);

        setJMenuBar(createMenu());

        add(createCenterPanel(), BorderLayout.CENTER);

//        add(new Button("Кнопка"), BorderLayout.EAST);
//        add(new Button("Кнопка"), BorderLayout.WEST);

        setVisible(true);
    }

    private JMenuBar createMenu(){
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(new ClearFieldButtonListner(inputField));
        menuFile.add(clear);

        menuFile.add(new JMenuItem("Exit"));
        menuBar.add(menuFile);

        menuBar.add(new JMenuItem("Help"));
        menuBar.add(new JMenuItem("About"));

        JMenuItem exit = new JMenuItem("Exit");
//        exit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
        exit.addActionListener(e -> System.exit(0));
        menuBar.add(exit);

        return menuBar;
    }



    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);

        inputField.setFont(new Font("Arial", Font.PLAIN, 25));
        inputField.setMargin(new Insets(8,0,8,0));
        inputField.setBackground(new Color(238, 210, 73));

//        inputField.setText("1+2\3");

        return top;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener), BorderLayout.WEST);

        return centerPanel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4,3));

        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new DigitJButtton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        JButton calc = new OperatorJButtton("=");

        digitsPanel.add(calc);
        calc.setEnabled(false);

        JButton clear = new OperatorJButtton("C");
        clear.addActionListener(new ClearFieldButtonListner(inputField));
        digitsPanel.add(clear);


        return digitsPanel;
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));

        JButton minus = new OperatorJButtton("-");
        minus.addActionListener(buttonListener);
        panel.add(minus);

        JButton plus = new OperatorJButtton("+");
        plus.addActionListener(buttonListener);
        panel.add(plus);

        JButton multiply = new OperatorJButtton("x");
        multiply.addActionListener(buttonListener);
        panel.add(multiply);

        JButton divide = new OperatorJButtton("/");
        divide.addActionListener(buttonListener);
        panel.add(divide);



        return panel;
    }

}
