import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class CoffeeMachineTestGUI extends CoffeeMachine {
    JFrame frame;
    JPanel panel,panel1,panelmain;
    JLabel image,label,label1,label2,label3,labelCoffee,labelwaterandmoney,labelbeans,labelmilk,labelcups,labelcash,labelmoney,labelop;
    JTextField tf,tf1,tf2,tf3;
    JButton button,ca,es,la,chRemand,takemoney,next,back;
    Font font = new Font("TH SarabunPSK", Font.BOLD, 30);
    java.net.URL pic = getClass().getResource("coffee.png"); 
    ImageIcon imageicon = new ImageIcon(pic); 
    CardLayout c1 = new CardLayout();
    CoffeeMachineTestGUI(int water, int milk, int beans, int cups, int cash){
        super(water, milk, beans, cups, cash);
        frame = new JFrame("Coffee Machine");
        tf = new JTextField();
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setwater(getwater()+Integer.parseInt(tf.getText()));
                tf.setText("");
                labelwaterandmoney.setText("Now You have water = "+getwater()+" ml");
                labelmilk.setText("Now You have milk = "+getmilk()+" ml");
                labelbeans.setText("Now You have beans = "+getbeans()+" gram");
                labelcups.setText("Now You have "+getcups()+" cups");
                labelmoney.setText("the money in this machine is "+getcash()+"Dollars");
            }
        });
        tf1 = new JTextField();
        tf1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setmilk(getmilk()+Integer.parseInt(tf1.getText()));
                tf1.setText("");
                labelwaterandmoney.setText("Now You have water = "+getwater()+" ml");
                labelmilk.setText("Now You have milk = "+getmilk()+" ml");
                labelbeans.setText("Now You have beans = "+getbeans()+" gram");
                labelcups.setText("Now You have "+getcups()+" cups");
                labelmoney.setText("the money in this machine is "+getcash()+"Dollars");
            }
        });
        tf2 = new JTextField();
        tf2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setbeans(getbeans()+Integer.parseInt(tf2.getText()));
                tf2.setText("");
                labelwaterandmoney.setText("Now You have water = "+getwater()+" ml");
                labelmilk.setText("Now You have milk = "+getmilk()+" ml");
                labelbeans.setText("Now You have beans = "+getbeans()+" gram");
                labelcups.setText("Now You have "+getcups()+" cups");
                labelmoney.setText("the money in this machine is "+getcash()+"Dollars");
            }
        });
        tf3 = new JTextField();
        tf3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setcups(getcups()+Integer.parseInt(tf3.getText()));
                tf3.setText("");
                labelwaterandmoney.setText("Now You have water = "+getwater()+" ml");
                labelmilk.setText("Now You have milk = "+getmilk()+" ml");
                labelbeans.setText("Now You have beans = "+getbeans()+" gram");
                labelcups.setText("Now You have "+getcups()+" cups");
                labelmoney.setText("the money in this machine is "+getcash()+"Dollars");
            }
        });
        button = new JButton("Buy");
        ca = new JButton("Click here to Buy Cappuccino");
        ca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               makeCappuccino();
               labelwaterandmoney.setText("Now You have water = "+getwater()+" ml");
               labelmilk.setText("Now You have milk = "+getmilk()+" ml");
               labelbeans.setText("Now You have beans = "+getbeans()+" gram");
               labelcups.setText("Now You have "+getcups()+" cups");
               labelmoney.setText("the money in this machine is "+getcash()+"Dollars");
               }});
        es = new JButton("Click here to Buy Espesso");
        es.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               makeEspresso();
                labelwaterandmoney.setText("Now You have water = "+getwater()+" ml");
                labelmilk.setText("Now You have milk = "+getmilk()+" ml");
                labelbeans.setText("Now You have beans = "+getbeans()+" gram");
                labelcups.setText("Now You have "+getcups()+" cups");
                labelmoney.setText("the money in this machine is "+getcash()+"Dollars");
                labelop.setText(" ");
            } 
        });
        la = new JButton("Click here to Buy Late");
        la.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               makeLatte();
                labelwaterandmoney.setText("Now You have water = "+getwater()+" ml");
                labelmilk.setText("Now You have milk = "+getmilk()+" ml");
                labelbeans.setText("Now You have beans = "+getbeans()+" gram");
                labelcups.setText("Now You have "+getcups()+" cups");
                labelmoney.setText("the money in this machine is "+getcash()+"Dollars");
                labelop.setText(" ");
            } 
        });
        chRemand = new JButton("Checking status");
        chRemand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelwaterandmoney.setText("Now You have water = "+getwater()+" ml");
                labelmilk.setText("Now You have milk = "+getmilk()+" ml");
                labelbeans.setText("Now You have beans = "+getbeans()+" gram");
                labelcups.setText("Now You have "+getcups()+" cups");
                labelmoney.setText("the money in this machine is "+getcash()+"Dollars"); 
            }
        });
        takemoney = new JButton("Take all money in this machine?");
        takemoney.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            labelwaterandmoney.setText("You got "+getcash()+" Dollar");
            setcash(0);
                labelmilk.setText("");
                labelbeans.setText("");
                labelcups.setText("");
                labelmoney.setText("");
            }
        });
        label = new JLabel("Water:");
        label1 = new JLabel("Milk:");
        label2 = new JLabel("Beans:");
        label3 = new JLabel("Cups:");
        labelCoffee = new JLabel("Coffee Machine",SwingConstants.CENTER);
        labelCoffee.setFont(font);
        labelwaterandmoney = new JLabel("");
        labelmilk = new JLabel("");
        labelbeans = new JLabel("");
        labelcups = new JLabel("");
        labelmoney = new JLabel("");
        image = new JLabel(imageicon);
        image.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e)
            {
                labelwaterandmoney.setText("Welcome to Coffee machine Group 8!!");
                labelmilk.setText("");
                labelbeans.setText("");
                labelcups.setText("");
                labelmoney.setText("");
            }
        });
        labelop = new JLabel("");
        panel = new JPanel();
        panelmain = new JPanel();
        panelmain.setLayout(c1);
        next= new JButton("NEXT");
        back=new JButton("BACK");
        next.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                c1.show(panelmain, "2");
            }
        });
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                c1.show(panelmain, "1");
            }
        });
        panel1 = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel1.setLayout(new GridLayout(0, 1));
        panel1.setBackground(Color.pink);
        panel.add(labelCoffee);
        frame.add(image,BorderLayout.WEST);
        panel.add(ca);
        panel.add(es);
        panel.add(la);
        panel.add(next,BorderLayout.SOUTH);
        panel1.add(label);
        panel1.add(tf);
        panel1.add(label1);
        panel1.add(tf1);
        panel1.add(label2);
        panel1.add(tf2);
        panel1.add(label3);
        panel1.add(tf3);
        panel1.add(takemoney);
        panel1.add(chRemand);
        panel1.add(labelwaterandmoney);
        panel1.add(labelmilk);
        panel1.add(labelbeans);
        panel1.add(labelcups);
        panel1.add(labelmoney);
        panel1.add(labelop);
        panel1.add(back,BorderLayout.SOUTH);
        panel.setBackground(Color.pink);
        panelmain.add(panel,"1");
        panelmain.add(panel1,"2");
        c1.show(panelmain,"1");
        frame.setSize(800,700);
        frame.add(panelmain);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new CoffeeMachineTestGUI(0, 0, 0, 0, 0);
        
    }
}