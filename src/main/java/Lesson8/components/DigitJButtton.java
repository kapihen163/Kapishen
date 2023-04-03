package Lesson8.components;

import javax.swing.*;
import java.awt.*;

public class DigitJButtton extends JButton {
    public DigitJButtton(String text) {
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN, 25));
        setBackground(new Color(191, 215, 248));

    }
}
