import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener{

    //variables 

    //frame
    private static JFrame openingFrame;

    //panel
    private static JPanel openingPanel;
    private static JPanel loginPanel;

    //labels
    private static JLabel loginLabel;
    private static JLabel passwordLabel;

    //Button
    private static JButton enterToLoginButton;
    private static JButton attemptLogin;
    

    //Login info
    private static JTextField loginId;
    private static JPasswordField passwordId;


    public static void openingScreen(){
        openingFrame = new JFrame();
        openingPanel = new JPanel();

        //framework
        openingFrame.setSize(500,300);
        openingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //panelwork
        openingPanel.setLayout(null);
        openingFrame.add(openingPanel);

        openingFrame.setVisible(true);
        
    }

    public static void pressToLoginFunction(){
        //Press to Login action
        enterToLoginButton = new JButton("Press to Login");
        enterToLoginButton.setBounds(125, 125, 250, 25);
        enterToLoginButton.addActionListener(new App());

        openingPanel.add(enterToLoginButton);
    }

    public static void loginScreen(){
        loginPanel = new JPanel();
        loginPanel.setLayout(null);
        openingFrame.add(loginPanel);

        loginLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        loginId = new JTextField();
        passwordId = new JPasswordField();

        attemptLogin = new JButton("Login");
        attemptLogin.setBounds(0, 0, 50, 25);
       // attemptLogin.addActionListener();
        
        loginLabel.setBounds(25, 25, 80, 25);
        passwordLabel.setBounds(25, 55, 80, 25);
        loginId.setBounds(100, 25, 125, 25);
        passwordId.setBounds(100, 55, 125, 25); 

        loginPanel.add(loginLabel);
        loginPanel.add(passwordLabel);
        loginPanel.add(loginId);
        loginPanel.add(passwordId);
        loginPanel.add(attemptLogin);

    
        
    }

    public static void main(String[] args){
        openingScreen();
        pressToLoginFunction();
        loginScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("This works.");
        
        openingPanel.setVisible(false);
        loginPanel.setVisible(true);
    }
    public void test(){
        System.out.println("TEST WORKS");
    }


}
