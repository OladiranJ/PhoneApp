import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhoneKeypad {

    private JPanel mainPanel;
    private JPanel numDisplayPanel;
    private JPanel keypadPanel1;
    private JPanel keypadPanel2;
    private JPanel keypadPanel3;
    private JPanel keypadPanel4;
    private JPanel callEndPanel;
    private JTextPane numDisplayTextPane;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton zeroButton;
    private JButton callEndButton;
    private JButton backspaceButton;
    private JButton clearButton;


    public Phone() {



    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("PhoneKeypad");
        frame.setContentPane(new PhoneKeypad().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
