import javax.swing.*;

public class NewWindow {

    NewWindow(){
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Hello");

        label.setBounds(0,0,150,150);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.add(label);
        frame.setVisible(true);
    }
}
