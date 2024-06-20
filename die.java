package methods;

import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

class MyCanvas extends JPanel implements ActionListener {
    private TextField stringInput;
    private int a, b, c;

    public int rand1to6() {
        return (int) (1 + Math.random() * 6);
    }

    public int rand3(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public void setupUI() {
        stringInput = new TextField(30);
        add(stringInput);
        stringInput.addActionListener(this);


        a = rand1to6();
        b = rand1to6();
        c = rand1to6();
        System.out.println("A random dice roll from 1 to 6 is " + a);
        System.out.println("The combined dice roll of " + a + ", " + b + " and " + c + " is " + rand3(a, b, c));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == stringInput) {
            String input = stringInput.getText();
            System.out.println("Input received: " + input);

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Canvas");
        MyCanvas canvas = new MyCanvas();
        frame.add(canvas);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}