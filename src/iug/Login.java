package iug;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    // Creacion de componentes
    private JTextField cctf;
    private JPasswordField passtf;
    private JButton btn;
    private JPanel main;
    private JPanel login;

    // Ejecuta init
    public Login(){
        init();
    }
    // configuracion de los componentes
    private void init(){

        Integer cc = 1122332211;
        String password = "pass2";

        // Configuracion de la vista
        JFrame jFrame = new JFrame();
        jFrame.setSize(400,400);
        jFrame.setTitle("Login");
        jFrame.setVisible(true);
        jFrame.add(main);

        cctf.setText(String.valueOf(cc));
        passtf.setText(password);

        // Boton de Validacion
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validar que no esté vacio
                if (cctf.getText().isEmpty() || passtf.getPassword().length == 0){
                    cctf.setText("");
                    passtf.setText("");
                }
                else {
                    // Validar que sean correctos los datos
                    char[] p = passtf.getPassword();
                    String validarPass = String.valueOf(p);

                    if (Integer.valueOf(cctf.getText()).equals(cc) && validarPass.equals(password)){
                        System.out.println("Correcto");
                        Bienvenido n = new Bienvenido();
                        jFrame.setVisible(false);
                    }
                    else {
                        System.out.println("Incorrecto");
                    }
                }
            }
        });
    }
}
