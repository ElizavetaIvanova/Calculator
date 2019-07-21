import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelApp extends JPanel {
    JTextField txt1 = null;
    double res = 0;
    double res1 = 0;

    String op = "";



    public JPanelApp() {
        final int x = 10;
        final int y = 10;

        final int dx = 50;
        final int dy = 60;

        setBackground(Color.LIGHT_GRAY);


        try {



            setLayout(null);
            final TextField txt1 = new TextField();
            txt1.setBounds(x, x, 235, 25);


            JButton b0 = new JButton("0");
            b0.setBounds(x, 4 * dy, 50, 50);
            b0.setBackground(Color.WHITE);

            JButton b1 = new JButton("1");
            b1.setBounds(x, 3 * dy, 50, 50);
            b1.setBackground(Color.WHITE);

            JButton b2 = new JButton("2");
            b2.setBounds(x + dx, 3 * dy, 50, 50);
            b2.setBackground(Color.WHITE);

            JButton b3 = new JButton("3");
            b3.setBounds(x + 2 * dx, 3 * dy, 50, 50);
            b3.setBackground(Color.WHITE);

            JButton b4 = new JButton("4");
            b4.setBounds(x, 2 * dy, 50, 50);
            b4.setBackground(Color.WHITE);

            JButton b5 = new JButton("5");
            b5.setBounds(x + dx, 2 * dy, 50, 50);
            b5.setBackground(Color.WHITE);

            JButton b6 = new JButton("6");
            b6.setBounds(x + 2 * dx, 2 * dy, 50, 50);
            b6.setBackground(Color.WHITE);

            JButton b7 = new JButton("7");
            b7.setBounds(x, dy, 50, 50);
            b7.setBackground(Color.WHITE);

            JButton b8 = new JButton("8");
            b8.setBounds(x + dx, dy, 50, 50);
            b8.setBackground(Color.WHITE);

            JButton b9 = new JButton("9");
            b9.setBounds(x + 2 * dx, dy, 50, 50);
            b9.setBackground(Color.WHITE);

            JButton bRes = new JButton("=");
            bRes.setBounds(x + dx, 4 * dy, 50, 50);
            Font bigFont = new Font("serif", Font.BOLD, 22);
            bRes.setFont(bigFont);
            bRes.setBackground(Color.WHITE);


            JButton bPlus = new JButton("+");
            bPlus.setBounds(x + 3 * dx, dy, 75, 50);
            Font bigFontPlus = new Font("serif", Font.BOLD, 22);
            bPlus.setFont(bigFontPlus);
            bPlus.setBackground(Color.WHITE);

            JButton bMinus = new JButton("-");
            bMinus.setBounds(x + 3 * dx, 2 * dy, 75, 50);
            Font bigFontMinus = new Font("serif", Font.BOLD, 22);
            bMinus.setFont(bigFontMinus);
            bMinus.setBackground(Color.WHITE);

            JButton bMulti = new JButton("*");
            bMulti.setBounds(x + 3 * dx, 3 * dy, 75, 50);
            Font bigFontMulti = new Font("serif", Font.BOLD, 22);
            bMulti.setFont(bigFontMulti);
            bMulti.setBackground(Color.WHITE);

            JButton bDivision = new JButton("/");
            bDivision.setBounds(x + 3 * dx, 4 * dy, 75, 50);
            Font bigFontDivision = new Font("serif", Font.BOLD, 22);
            bDivision.setFont(bigFontDivision);
            bDivision.setBackground(Color.WHITE);

            JButton bClear = new JButton("Clear");
            bClear.setBounds(x, 5 * dy, 225, 25);
            Font bigFontClear = new Font("serif", Font.BOLD, 22);
            bClear.setFont(bigFontClear);
            bClear.setBackground(Color.WHITE);

            JButton bDot = new JButton(".");
            bDot.setBounds(x + 2 * dx, 4 * dy, 50, 50);
            bDot.setBackground(Color.WHITE);


            add(txt1);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bRes);
            add(bPlus);
            add(bMinus);
            add(bMulti);
            add(bDivision);
            add(bClear);
            add(bDot);


            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 2);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 3);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 4);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 5);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 6);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 7);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 8);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 9);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 0);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            bDot.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt1.setText(txt1.getText() + ".");
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    } else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            bPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CheckFirstNum(txt1);
                    op = "+";
                }
            });

            bMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    CheckFirstNum(txt1);
                    op = "-";
                }
            });

            bMulti.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    CheckFirstNum(txt1);
                    op = "*";
                }
            });

            bDivision.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    CheckFirstNum(txt1);
                    op = "/";
                }
            });

            bClear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt1.setText("");
                }
            });

            bRes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double num = Double.valueOf(res);
                    double num1 = Double.valueOf(res1);
                    String strOp = op;

                    MethodCalc mc = new MethodCalc();
                    String str = DivZero(mc, num, num1, strOp);
                    txt1.setText(str);
                }
            });

        } catch (ArithmeticException exception) {
            return;
        }
    }

//    private Container getContentPane() {
//        Container c=this.getContentPane();
//        c.setBackground(Color.YELLOW);
//        return c;
//    }



    public void CheckFirstNum(TextField txt1) {
        try {
            String s = txt1.getText();
            res = Double.valueOf(s);
            txt1.setText("");
        } catch (NumberFormatException e) {
            txt1.setText("Enter number");
            return;
        }
    }

    public String DivZero(MethodCalc mc, double num, double num1, String strOp) {
        String str = "Can not divide by zero";
        try {
            String strRes = String.valueOf(mc.calc(num, num1, strOp));
            str = strRes;
            return str;
        } catch (NumberFormatException e) {
            return str;
        } catch (NullPointerException e) {
            return str;
        }


    }
}
