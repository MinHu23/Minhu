
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Jian {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public Jian() {
        textArea_A.setText("请猜一个数");
        textArea_A.setBounds(100,100,256,128);
        textArea_A.setBackground(Color.GREEN);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.ORANGE);
        myPanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if ((textArea_A.getText()).equals("23"))
                    {
                        textArea_B.setText("输入正确");
                    } else{
                        textArea_B.setText("输入错误");
                    }

                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    textArea_B.setText("");
                }
            }
        });

    }

    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Jian().go();
    }
}
