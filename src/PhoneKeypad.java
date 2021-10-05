import javax.swing.*;
import java.awt.*;
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
    private JButton starButton;
    private JButton clearButton;


    boolean isCalling = false; // setting the state of our call button to false so that call button is displayed

    public PhoneKeypad() {

        zeroButton.addActionListener(new ActionListener() { // Zero Button
            @Override
            public void actionPerformed(ActionEvent e) {

                String zero = zeroButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + zero);

            }
        });

        oneButton.addActionListener(new ActionListener() { // One Button
            @Override
            public void actionPerformed(ActionEvent e) {

                String one = oneButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + one);

            }
        });

        twoButton.addActionListener(new ActionListener() { // Two Button
            @Override
            public void actionPerformed(ActionEvent e) {

                String two = twoButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + two);

            }
        });

        threeButton.addActionListener(new ActionListener() { // Three Button
            @Override
            public void actionPerformed(ActionEvent e) {

               String three = threeButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + three);

            }
        });

        fourButton.addActionListener(new ActionListener() { // Four Button
            @Override
            public void actionPerformed(ActionEvent e) {

               String four = fourButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + four);

            }
        });

        fiveButton.addActionListener(new ActionListener() { // Five Button
            @Override
            public void actionPerformed(ActionEvent e) {

                String five = fiveButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + five);

            }
        });

        sixButton.addActionListener(new ActionListener() { // Six Button
            @Override
            public void actionPerformed(ActionEvent e) {

                String six = sixButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + six);

            }
        });

        sevenButton.addActionListener(new ActionListener() { // Seven Button
            @Override
            public void actionPerformed(ActionEvent e) {

                String seven = sevenButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + seven);

            }
        });

        eightButton.addActionListener(new ActionListener() { // Eight Button
            @Override
            public void actionPerformed(ActionEvent e) {

                String eight = eightButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + eight);

            }
        });

        nineButton.addActionListener(new ActionListener() { // Nine Button
            @Override
            public void actionPerformed(ActionEvent e) {

                String nine = nineButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + nine);

            }
        });

        callEndButton.addActionListener(new ActionListener() { // Call/Hangup Button
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isCalling) { // If statement used to determine when to switch between Call and Hangup
                    isCalling = true;
                    callEndButton.setBackground(new Color(161, 37, 16));
                    callEndButton.setText("Hang Up");
                } else {
                    isCalling = false;
                    numDisplayTextPane.setText("+1 ");
                    callEndButton.setBackground(new Color(34, 114, 60));
                    callEndButton.setText("Call");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() { // Resets keypad
            @Override
            public void actionPerformed(ActionEvent e) {
                isCalling = false;
                numDisplayTextPane.setText("+1 ");
                callEndButton.setBackground(new Color(34, 114, 60));
                callEndButton.setText("Call");
            }
        });

        starButton.addActionListener(new ActionListener() { // Star Button
            @Override
            public void actionPerformed(ActionEvent e) {
                String star = starButton.getText();
                numDisplayTextPane.setText(numDisplayTextPane.getText() + star);
            }
        });

    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("PhoneKeypad");
        frame.setContentPane(new PhoneKeypad().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
