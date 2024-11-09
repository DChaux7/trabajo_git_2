package iug;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField cctf;
    private JTextField textFieldPass;
    private JButton btn;
    private JPanel main;
    private JPanel login;
    private JPasswordField passtf;

    public Login(){
        init();
    }
    private void init(){

        Integer cc = 1122332211;
        String password = "pass2";

        JFrame jFrame = new JFrame();
        jFrame.setSize(400,400);
        jFrame.setTitle("Login");
        jFrame.setVisible(true);
        jFrame.add(main);

        cctf.setText(String.valueOf(cc));
        passtf.setText(password);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bienvenido n = new Bienvenido();
                jFrame.setVisible(false);
            }
        });
    }
}
