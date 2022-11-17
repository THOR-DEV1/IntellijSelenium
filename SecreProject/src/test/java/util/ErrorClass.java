package util;

import javax.swing.*;

public class ErrorClass {
    String ex=null;
    public String Assert()  {
        JFrame f= new JFrame("TextField Example");
        JTextField t1;
        t1=new JTextField();
        t1.setBounds(50,100, 200,30);
        f.add(t1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        return t1.getText();
    }

}
