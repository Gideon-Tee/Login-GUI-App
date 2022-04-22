import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
        private static JFrame frame;
        private static JPanel panel;
        private static JTextField userText, passwordText;
        private static JButton button;
        private static JLabel userLabel, passwordLabel, success;

    public static void main(String[] args) {


            panel = new JPanel();
            panel.setLayout(null);

            frame = new JFrame();
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 200);
            frame.setTitle("Login");
            frame.setResizable(true);



            userLabel = new JLabel("User");
            userLabel.setBounds(10, 20, 80, 25);
            panel.add(userLabel);

             userText = new JTextField(20);
            userText.setBounds(100, 20, 180, 25);
            panel.add(userText);

            passwordLabel = new JLabel("Password");
            passwordLabel.setBounds(10, 50, 80, 25);
            panel.add(passwordLabel);

            passwordText = new JPasswordField(20);
            passwordText.setBounds(100, 50, 180, 25);
            panel.add(passwordText);

            button = new JButton("Login");
            button.setBounds(10,90,80,25);
            button.addActionListener(new GUI());
            panel.add(button);

            success = new JLabel("");
            success.setBounds(10,120,300,25);
            panel.add(success);


            frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String user = userText.getText();
            String password = passwordText.getText();

            if (user.equals("Gideon") && password.equals("gideon124")) {
                    success.setText("Log in was successful");
            } else {
                    success.setText("Username or password is incorrect");
            }

    }
}
