/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
public class frame extends JFrame implements ActionListener,ItemListener{
     JPanel subPanel,subPanel1,subPanel2,subPanel3;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19
            ,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37
                    ,b38,b39,b40,del,clr,ans,exit;
    JCheckBox box;
    
      double n1 = 0,res = 0;
      nmo z=new nmo();
        int opra =0,n;
         BigDecimal result = BigDecimal.ONE;
    JTextField text;
    JLabel label;
    JMenu file,help;
    JMenuBar tools;
    public frame(){
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this .setBackground(Color.BLACK);
        this .setLocation(250, 50);
        this .setResizable(true);
        this.setTitle("Calculator");
        this.setSize(350, 580);

        file = new JMenu("File");
        help = new JMenu("help");
        tools = new JMenuBar();
        tools.add(file);
        tools.add(help);
        
         
        this.add(tools);
        this.pack();
        

         subPanel1 = new JPanel();
         subPanel2 = new JPanel();
         subPanel3 = new JPanel();
         subPanel = new JPanel();
//         subPanel.setSize(900, 580);
        subPanel1.setLayout(null);
        subPanel2.setLayout(null);
        subPanel3.setLayout(null);
        subPanel.setLayout(null);
        subPanel.setSize(350, 580);
//        subPanel.setBounds(0, 0, 900, 580);
           
        add(subPanel1);
        add(subPanel2);
        add(subPanel3);
        add(subPanel);
        box =new JCheckBox("scientific",false);
        subPanel.add(box);
        box.setBounds(15,530,120,30);
        box.setBackground(Color.BLACK);
        box.setForeground(Color.WHITE);
//        subPanel.setPreferredSize(new Dimension(350, 580));
        subPanel.setBackground(Color.BLACK);
//      subPanel1.setPreferredSize(new Dimension(800, 50));
        subPanel1.setBackground(Color.DARK_GRAY);
//      subPanel2.setPreferredSize(new Dimension(400, 300));
        subPanel2.setBackground(Color.DARK_GRAY);
        //subPanel3.setPreferredSize(new Dimension(500, 300));
        subPanel3.setBackground(Color.DARK_GRAY);
        
//        subPanel.setBounds(0,35, 400, 580);
        subPanel1.setBounds(19,120, 320, 60);
        subPanel2.setBounds(19,200,320,300);
        subPanel3.setBounds(385,200,500, 300);
        subPanel.add(subPanel1);
        subPanel.add(subPanel2);
        subPanel.add(subPanel3);
        label = new  JLabel();
        subPanel.add(label);
        label.setBounds(19,40, 70, 30);
        label.setForeground(Color.red);
        
        text = new  JTextField(30);
        subPanel.add(text);
        text.setBounds(19,80, 320, 35);
        
         del = new JButton("DEL");
         clr = new JButton("CLR");
         ans = new JButton("ANS");
         exit = new JButton("EXIT");
        
         b0 = new JButton("0");
         b1=new JButton("1");
         b2=new JButton("2");
         b3=new JButton("3");
         b4=new JButton("4");
         b5=new JButton("5");
         b6=new JButton("6");
         b7=new JButton("7");
         b8=new JButton("8");
         b9=new JButton("9");
         b10=new JButton(".");
         b11=new JButton("+");
         b12=new JButton("-");
         b13=new JButton("*");
         b14=new JButton("±");
         b15=new JButton("/");
         b16 = new JButton(" χ2 ");
         b17 = new JButton(" χ3 ");
         b18 = new JButton(" χ^y ");
         b19 = new JButton(" 1/x ");
         b20 = new JButton(" ( ");
         b21 = new JButton(" √ ");
         b22 = new JButton(" ∛ ");
         b23 = new JButton(" y√ ");
         b24 = new JButton(" n! ");
         b25 = new JButton(" ) ");
         b26 = new JButton(" sin ");
         b27 = new JButton(" cos ");
         b28 = new JButton(" tan ");
         b29 = new JButton(" exp ");
         b30 = new JButton(" nPr ");
         b31 = new JButton(" asin ");
         b32 = new JButton(" acos ");
         b33 = new JButton(" atan ");
         b34 = new JButton(" log ");
         b35 = new JButton(" nCr ");
         b36 = new JButton(" sinh ");
         b37 = new JButton(" cosh ");
         b38 = new JButton(" tanh ");
         b39 = new JButton(" log10 ");
         b40 = new JButton(" ∏ ");

        subPanel1.add(del);
        subPanel1.add(clr);
        subPanel1.add(ans);
        subPanel1.add(exit);
        del.setBounds(5,10,70,30);
        clr.setBounds(85,10,70,30);
        ans.setBounds(165,10,70,30);
        exit.setBounds(245,10,70,30);
        
        subPanel2.add(b0);
        subPanel2.add(b1);
        subPanel2.add(b2);
        subPanel2.add(b3);
        subPanel2.add(b4);
        subPanel2.add(b5);
        subPanel2.add(b6);
        subPanel2.add(b7);
        subPanel2.add(b8);
        subPanel2.add(b9);
        subPanel2.add(b10);
        subPanel2.add(b11);
        subPanel2.add(b12);
        subPanel2.add(b13);
        subPanel2.add(b14);
        subPanel2.add(b15);

        subPanel3.add(b16);
        subPanel3.add(b17);
        subPanel3.add(b18);
        subPanel3.add(b19);
        subPanel3.add(b20);
        subPanel3.add(b21);
        subPanel3.add(b22);
        subPanel3.add(b23);
        subPanel3.add(b24);
        subPanel3.add(b25);
        subPanel3.add(b26);
        subPanel3.add(b27);
        subPanel3.add(b28);
        subPanel3.add(b29);
        subPanel3.add(b30);
        subPanel3.add(b31);
        subPanel3.add(b32);
        subPanel3.add(b33);
        subPanel3.add(b34);
        subPanel3.add(b35);
        subPanel3.add(b36);
        subPanel3.add(b37);
        subPanel3.add(b38);
        subPanel3.add(b39);
        subPanel3.add(b40);
        
        b7.setBounds(20,10,60,60);
        b8.setBounds(90,10,60,60);
        b9.setBounds(160,10,60,60);
        b11.setBounds(230,10,60,60);
        b4.setBounds(20,80,60,60);
        b5.setBounds(90,80,60,60);
        b6.setBounds(160,80,60,60);
        b12.setBounds(230,80,60,60);
        b1.setBounds(20,150,60,60);
        b2.setBounds(90,150,60,60);
        b3.setBounds(160,150,60,60);
        b13.setBounds(230,150,60,60);
        b0.setBounds(20,220,60,60);
        b10.setBounds(90,220,60,60);
        b14.setBounds(160,220,60,60);
        b15.setBounds(230,220,60,60);
        
        b16.setBounds(10,10,80,40);
        b17.setBounds(110,10,80,40);
        b18.setBounds(210,10,80,40);
        b19.setBounds(310,10,80,40);
        b20.setBounds(410,10,80,40);
        b21.setBounds(10,60,80,40);
        b22.setBounds(110,60,80,40);
        b23.setBounds(210,60,80,40);
        b24.setBounds(310,60,80,40);
        b25.setBounds(410,60,80,40);
        b26.setBounds(10,110,80,40);
        b27.setBounds(110,110,80,40);
        b28.setBounds(210,110,80,40);
        b29.setBounds(310,110,80,40);
        b30.setBounds(410,110,80,40);
        b31.setBounds(10,160,80,40);
        b32.setBounds(110,160,80,40);
        b33.setBounds(210,160,80,40);
        b34.setBounds(310,160,80,40);
        b35.setBounds(410,160,80,40);
        b36.setBounds(10,210,80,40);
        b37.setBounds(110,210,80,40);
        b38.setBounds(210,210,80,40);
        b39.setBounds(310,210,80,40);
        b40.setBounds(410,210,80,40);
          
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);
        b31.addActionListener(this);
        b31.addActionListener(this);
        b32.addActionListener(this);
        b33.addActionListener(this);
        b34.addActionListener(this);
        b35.addActionListener(this);
        b36.addActionListener(this);
        b37.addActionListener(this);
        b38.addActionListener(this);
        b39.addActionListener(this);
        b40.addActionListener(this);
        ans.addActionListener(this);
        clr.addActionListener(this);
        del.addActionListener(this);
        exit.addActionListener(this);
        
        box.addItemListener(this);
        
        text.addKeyListener(new DirectionListener());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b7){
            text.setText(text.getText()+"7");
        }
        else if (e.getSource()==b8){
            text.setText(text.getText()+"8");
        }
        else if (e.getSource()==b9){
            text.setText(text.getText()+"9");
        }
        else if (e.getSource()==b4){
            text.setText(text.getText()+"4");
        }
        else if (e.getSource()==b5){
            text.setText(text.getText()+"5");
        }
        else if (e.getSource()==b6){
            text.setText(text.getText()+"6");
        }
        else if (e.getSource()==b1){
            text.setText(text.getText()+"1");
        }
        else if (e.getSource()==b0){
            text.setText(text.getText()+"0");
        }
        else if (e.getSource()==b2){
            text.setText(text.getText()+"2");
        }
        else if (e.getSource()==b3){
            text.setText(text.getText()+"3");
        }
        else if (e.getSource()==b10){
            text.setText(text.getText()+".");
        }
         else if (e.getSource()==b40){
            text.setText(text.getText()+" ∏ ");
        }
         else if (e.getSource()==b14){
            text.setText(text.getText()+"-");
//            n1=Double.parseDouble(text.getText());
            
        }
        else if (e.getSource()==b11){
            n1=Double.parseDouble(text.getText());
            opra = 11;
            text.setText("");
            label.setText(n1+"+");
        }
        else if (e.getSource()==b12){
            n1=Double.parseDouble(text.getText());
            opra = 12;
            text.setText("");
            label.setText(n1+"-");
        }
        else if (e.getSource()==b13){
            n1=Double.parseDouble(text.getText());
            opra = 13;
            text.setText("");
            label.setText(n1+"*");
        }
        else if (e.getSource()==b15){
            n1=Double.parseDouble(text.getText());
            opra = 15;
            text.setText("");
            label.setText(n1+"/");
        }
         else if (e.getSource()==b16){
            n1=Double.parseDouble(text.getText());
            opra = 16;
            text.setText("");
            label.setText(n1+"^2");
        }
          else if (e.getSource()==b17){
            n1=Double.parseDouble(text.getText());
            opra = 17;
            text.setText("");
            label.setText(n1+"^3");
        }
          else if (e.getSource()==b18){
            n1=Double.parseDouble(text.getText());
            opra = 18;
            text.setText("");
            label.setText(n1+"^");
        }
          else if (e.getSource()==b19){
            n1=Double.parseDouble(text.getText());
            opra = 19;
            text.setText("");
            label.setText("1/"+n1);
        }
          
          else if (e.getSource()==b20){
               text.setText(text.getText()+"(");
            text.setText(""); 
            label.setText("(");
        }
          else if (e.getSource()==b21){
          n1=Double.parseDouble(text.getText()); 
          if(n1<0){
              text.setText("ERROR");
              label.setText("ERROR");
          }
          else{
            opra = 21;
            text.setText("");                
            label.setText("√"+n1);}
           
            
        }
           else if (e.getSource()==b22){
          n1=Double.parseDouble(text.getText()); 
            opra = 22;
            text.setText("");                
            label.setText("3√"+n1);
           
            
        }
             else if (e.getSource()==b26){
          n1=Double.parseDouble(text.getText()); 
            opra = 26;
            text.setText("");                
            label.setText("sin"+"("+n1+")");
        }
              else if (e.getSource()==b27){
          n1=Double.parseDouble(text.getText()); 
            opra = 27;
            text.setText("");                
            label.setText("cos"+"("+n1+")");
        }
              else if (e.getSource()==b28){
         n1=Double.parseDouble(text.getText()); 
            opra = 28;
            text.setText("");                
            label.setText("tan"+"("+n1+")");
        }
              else if (e.getSource()==b31){
          n1=Double.parseDouble(text.getText()); 
            opra = 31;
            text.setText("");                
            label.setText("asin"+"("+n1+")");
        }
              else if (e.getSource()==b32){
          n1=Double.parseDouble(text.getText()); 
            opra = 32;
            text.setText("");                
            label.setText("acos"+"("+n1+")");
        }
              else if (e.getSource()==b33){
          n1=Double.parseDouble(text.getText()); 
            opra = 33;
            text.setText("");                
            label.setText("atan"+"("+n1+")");
        }
               else if (e.getSource()==b36){
          n1=Double.parseDouble(text.getText()); 
            opra = 36;
            text.setText("");                
            label.setText("sinh"+"("+n1+")");
        }
                else if (e.getSource()==b37){
          n1=Double.parseDouble(text.getText()); 
            opra = 37;
            text.setText("");                
            label.setText("cosh"+"("+n1+")");
        }
                 else if (e.getSource()==b38){
          n1=Double.parseDouble(text.getText()); 
            opra = 38;
            text.setText("");                
            label.setText("tanh"+"("+n1+")");
           
        }
                 else if (e.getSource()==b29){
          n1=Double.parseDouble(text.getText()); 
            opra = 29;
            text.setText("");                
            label.setText("exp"+"("+n1+")");
           
            
        }
                 else if (e.getSource()==b23){
          n1=Double.parseDouble(text.getText());
          opra=23;
            text.setText("");                
            label.setText("y√ "+n1);
        }
           else if (e.getSource()==b24){
           n=Integer.parseInt(text.getText());
            text.setText("");                
            label.setText(n+"!");
             opra=24;
        }
           else if (e.getSource()==b35){
            n=Integer.parseInt(text.getText());
            opra = 35;
            text.setText("");                
            label.setText(n+"c");
           }
           else if (e.getSource()==b30){
            n=Integer.parseInt(text.getText());
            opra = 30;
            text.setText("");                
            label.setText(n+"p");
           }
           else if (e.getSource()==b25){
             
             n1=Double.parseDouble(text.getText()); 
            text.setText("");                
            label.setText(n1+")");
           
            
        }
            else if (e.getSource()==b34){
             
             n1=Double.parseDouble(text.getText()); 
             opra=34;
            text.setText("");                
            label.setText("log("+n1+")");
           
            
        }
            else if (e.getSource()==b39){
             
             n1=Double.parseDouble(text.getText()); 
             opra=39;
            text.setText("");                
            label.setText("log10("+n1+")");
           
            
        }
       
        else if (e.getSource()==del){
            int len = text.getText().length();
            int num = text.getText().length()-1;
            String store;
            if (len>0){
                StringBuilder back = new StringBuilder(text.getText());
                back.deleteCharAt(num);
                store=back.toString();
                text.setText(store);
            }
        }
        else if (e.getSource()==clr){
                text.setText("");
                label.setText("");
        }
         else if (e.getSource()==ans){
      
            switch(opra){
                case 11:
                    res=Double.parseDouble(text.getText());
                    res+=n1;
                    break;
            
            
                case 12:
                    res=n1-Double.parseDouble(text.getText());
                    break;
            
            
                case 13:
                    res=n1*Double.parseDouble(text.getText());
                    break;
            
         
                case 15:
                    
                    res=n1/Double.parseDouble(text.getText());
                    break;
                    
                case 16:
                    res=Math.pow(n1, 2);
                    break;
                
                case 17:
                    res=Math.pow(n1, 3);
                    break;
                    
                case 18:
                    res=Math.pow(n1,Double.parseDouble(text.getText()));
                    break;
                  
                case 19:
                    res=1/n1;
                    break;
                    
                case 21:
                    res=Math.sqrt(n1);
                    break;
                        
            
                case 22:
                    res=Math.cbrt(n1);
                    break;
                 
                case 23:
                    res=Math.pow(n1, 1/Double.parseDouble(text.getText()));
                    break; 
                    
                case 26:
                    res=Math.sin(n1*3.141592653589793238462/180);
                    break;
                    
                case 27:
                    res=Math.cos(n1*3.141592653589793238462/180);
                    break;
                    
                case 28:
                    res=Math.tan(n1*3.141592653589793238462/180);
                    break;
                    
                case 31:
                    res=Math.asin(n1);
                    break;
                    
                case 32:
                    res=Math.acos(n1);
                    break;
                    
                case 33:
                    res=Math.atan(n1);
                    break;
                    
                case 36:
                    res=Math.sinh(n1);
                    break;
                    
                case 37:
                    res=Math.cosh(n1);
                    break;
                 
                case 38:
                    res=Math.tanh(n1);
                    break;
                    
                case 29:
                    res=Math.exp(n1);
                    break;
                    
                case 34:
                    res=Math.log10(n1);
                    break;
                case 39:
                    res=Math.log10(n1);
                    break;
                case 40:
                    res=3.141592653589793238462;
                    break;   
                case 35:
                    res = z.ncr(n,Integer.parseInt(text.getText()));
                    break;
                case 30:
                    res = z.npr(n,Integer.parseInt(text.getText()));
                    break;  
                case 24:
                  result =z.Facto(n);
                  res=result.doubleValue();
                    break;
            }
                
            text.setText(Double.toString(res));
            label.setText(Double.toString(res));
        }
         
    }

    

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(box.isSelected()){
            this.setSize(910, 600);
            subPanel1.setBounds(19,120, 870, 60);
            text.setBounds(19,80, 870, 35);
            del.setBounds(10,10,80,30);
            clr.setBounds(110,10,80,30);
            ans.setBounds(650,10,80,30);
            exit.setBounds(750,10,80,30);
            tools.setSize(900,35);
        }
     
    
}
public class nmo {
        public int ncr(int x,int y) {
             return fact(x) / (fact(y) * 
                  fact(x - y)); 
        }
    public int npr(int x, int y) 
    { 
        return fact(x) / fact(x - y); 
    } 
  public int fact(int n) 
{ 
    int re = 1; 
    for (int i = 2; i <= n; i++) 
        re = re * i; 
    return re; 
} 
  public BigDecimal Facto (int number) {
            BigDecimal factorial = BigDecimal.ONE;
            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(new BigDecimal(i));
            }
            return factorial;
        }
}

    private class DirectionListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
                e.consume();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
           
        }

        @Override
        public void keyReleased(KeyEvent e) {
           
        }
            
        }
}
