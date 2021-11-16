import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class Calculator implements ActionListener {
    JFrame f = new JFrame("Calculator");
    JTextField tf = new JTextField();

    String op, n1, n2, result;
    int num1, num2;
    double res;

    Calculator() {
        f.setSize(280, 340);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf.setEditable(false);
        tf.setBackground(Color.cyan);

        JButton bt0 = new JButton("0");
        JButton bt1 = new JButton("1");
        JButton bt2 = new JButton("2");
        JButton bt3 = new JButton("3");
        JButton bt4 = new JButton("4");
        JButton bt5 = new JButton("5");
        JButton bt6 = new JButton("6");
        JButton bt7 = new JButton("7");
        JButton bt8 = new JButton("8");
        JButton bt9 = new JButton("9");

        JButton bt10 = new JButton("+");
        JButton bt11 = new JButton("-");
        JButton bt12 = new JButton("/");
        JButton bt13 = new JButton("*");
        JButton bt14 = new JButton("C");
        JButton bt15 = new JButton("=");

        tf.setBounds(10, 260, 240, 30);
        bt0.setBounds(70, 200, 50, 50);
        bt1.setBounds(10, 20, 50, 50);
        bt2.setBounds(70, 20, 50, 50);
        bt3.setBounds(130, 20, 50, 50);
        bt4.setBounds(10, 80, 50, 50);
        bt5.setBounds(70, 80, 50, 50);
        bt6.setBounds(130, 80, 50, 50);
        bt7.setBounds(10, 140, 50, 50);
        bt8.setBounds(70, 140, 50, 50);
        bt9.setBounds(130, 140, 50, 50);
        bt10.setBounds(200, 20, 50, 50);
        bt11.setBounds(200, 80, 50, 50);
        bt12.setBounds(200, 140, 50, 50);
        bt13.setBounds(200, 200, 50, 50);
        bt14.setBounds(10, 200, 50, 50);
        bt15.setBounds(130, 200, 50, 50);

        f.add(bt0);
        f.add(bt1);
        f.add(bt2);
        f.add(bt3);
        f.add(bt4);
        f.add(bt5);
        f.add(bt6);
        f.add(bt7);
        f.add(bt8);
        f.add(bt9);
        f.add(bt10);
        f.add(bt11);
        f.add(bt12);
        f.add(bt13);
        f.add(bt14);
        f.add(bt15);
        f.add(tf);

        bt0.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);
        bt11.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);
        bt15.addActionListener(this);

        op = "";
        n1 = "";
        n2 = "";
        result = "";
        
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("+")) {
            op = "+";
        }
        else if (ae.getActionCommand().equals("-")) {
            op = "-";
        }
        else if (ae.getActionCommand().equals("/")) {
            op = "/";
        }
        else if (ae.getActionCommand().equals("*")) {
            op = "*";
        }

        switch (op) {
            case "":
                if (ae.getActionCommand().equals("0")) {
                    n1 += "0";
                } else if (ae.getActionCommand().equals("1")) {
                    n1 += "1";
                } else if (ae.getActionCommand().equals("2")) {
                    n1 += "2";
                } else if (ae.getActionCommand().equals("3")) {
                    n1 += "3";
                } else if (ae.getActionCommand().equals("4")) {
                    n1 += "4";
                } else if (ae.getActionCommand().equals("5")) {
                    n1 += "5";
                } else if (ae.getActionCommand().equals("6")) {
                    n1 += "6";
                } else if (ae.getActionCommand().equals("7")) {
                    n1 += "7";
                } else if (ae.getActionCommand().equals("8")) {
                    n1 += "8";
                } else if (ae.getActionCommand().equals("9")) {
                    n1 += "9";
                }
                break;

            case "*", "/", "+", "-":
                if (ae.getActionCommand().equals("0")) {
                    n2 += "0";
                } else if (ae.getActionCommand().equals("1")) {
                    n2 += "1";
                } else if (ae.getActionCommand().equals("2")) {
                    n2 += "2";
                } else if (ae.getActionCommand().equals("3")) {
                    n2 += "3";
                } else if (ae.getActionCommand().equals("4")) {
                    n2 += "4";
                } else if (ae.getActionCommand().equals("5")) {
                    n2 += "5";
                } else if (ae.getActionCommand().equals("6")) {
                    n2 += "6";
                } else if (ae.getActionCommand().equals("7")) {
                    n2 += "7";
                } else if (ae.getActionCommand().equals("8")) {
                    n2 += "8";
                } else if (ae.getActionCommand().equals("9")) {
                    n2 += "9";
                }
                break;

            default:
                break;
        }
        
        tf.setText(n1 + " " + op + " " + n2);

        if (ae.getActionCommand().equals("=")) {
            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);

            if (op == "+") {
                res = (num1 + num2);
                result = Double.toString(res);
            } else if (op == "-") {
                res = (num1 - num2);
                result = Double.toString(res);
            } else if (op == "/") {
                res = (double)(num1) / (double)(num2);
                result = Double.toString(res);
            } else if (op == "*") {
                res = (num1 * num2);
                result = Double.toString(res);
            }
            tf.setText("= " + result);
        }
        
        if (ae.getActionCommand().equals("C")) {
            tf.setText("");
            n1 = "";
            n2 = "";
            op = "";
            result = "";
            num1 = 0;
            num2 = 0;
            res = 0;
        }
    }
    
    public static void main(String[] args) {
        new Calculator();
    }
}