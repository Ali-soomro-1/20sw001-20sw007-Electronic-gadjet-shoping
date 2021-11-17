import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class Shopping

{

    static int num=1;

    static int pay=0;

    static String w1="Buy",w2="Buy",w3="Buy",w4="Buy",m1="Buy",m2="Buy",m3="Buy",m4="Buy",l1="Buy",l2="Buy",l3="Buy",l4="Buy",h1="Buy",h2="Buy",h3="Buy",h4="Buy";

    public static void main(String args[])

    {

        JFrame frame1=new JFrame();

        frame1.setVisible(true);

        frame1.setLocation(330,20);

        frame1.setSize(700,700);

        frame1.setResizable(false);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pn1=new JPanel();

        frame1.add(pn1);

        pn1.setBackground(Color.BLACK);

        pn1.setLayout(null);

        JLabel wc=new JLabel();

        pn1.add(wc);

        wc.setBounds(210,50,300,60);

        wc.setText("WELCOME");

        wc.setForeground(Color.RED);

        wc.setFont(new Font("ITALIC",Font.BOLD,50));


        JLabel ptitle=new JLabel();
        ptitle.setBounds(10,200,700,30);
        pn1.add(ptitle);
        ptitle.setText("PROJECT : ELECTRONIC GADJET SHOPPING");
        ptitle.setForeground(Color.GREEN);

        ptitle.setFont(new Font("ITALIC",Font.BOLD,30));

        JLabel by=new JLabel();
        by.setBounds(250,270,700,30);
        pn1.add(by);
        by.setText("MADE   BY");
        by.setForeground(Color.YELLOW);

        by.setFont(new Font("ITALIC",Font.BOLD,30));


        JLabel pr1=new JLabel();
        pr1.setBounds(200,350,700,30);
        pn1.add(pr1);
        pr1.setText("ALI RAZA 20SW007");
        pr1.setForeground(Color.WHITE);

        pr1.setFont(new Font("ITALIC",Font.BOLD,30));



        JLabel pr2=new JLabel();
        pr2.setBounds(110,420,700,30);
        pn1.add(pr2);
        pr2.setText("MOHAMMAD USAMA 20SW001");
        pr2.setForeground(Color.BLUE);

        pr2.setFont(new Font("ITALIC",Font.BOLD,30));





        JButton bt1=new JButton("LET'S SHOP");

        bt1.setBounds(230,550,220,60);

        bt1.setBackground(Color.BLACK);

        bt1.setForeground(Color.GREEN);

        bt1.setFont(new Font("ITALIC",Font.BOLD,30));

        pn1.add(bt1);



        bt1.addActionListener(new ActionListener()

                              {

                                  public void actionPerformed(ActionEvent e)

                                  {

                                      frame1.setVisible(false);

                                      JFrame frame2=new JFrame();

                                      frame2.setLocation(0,0);

                                      frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);

                                      frame2.setVisible(true);

                                      frame2.setResizable(false);

                                      frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                      JPanel pn2=new JPanel();

                                      pn2.setLayout(null);

                                      frame2.add(pn2);

                                      JLabel lb2=new JLabel();

                                      lb2.setFont(new Font("ITALIC",Font.BOLD,30));

                                      lb2.setBounds(500,10,300,60);

                                      lb2.setText("OUR PRODUCTS");

                                      lb2.setForeground(Color.YELLOW);

                                      pn2.add(lb2);

                                      pn2.setBackground(Color.RED);

                                      ImageIcon img1=new ImageIcon("D:/pd1.jpeg");

                                      JButton btW=new JButton(img1);

                                      btW.setBounds(350,80,img1.getIconWidth(),img1.getIconHeight());

                                      pn2.add(btW);



                                      JLabel lbwT=new JLabel();

                                      pn2.add(lbwT);

                                      lbwT.setBounds(30,200,200,30);

                                      lbwT.setText("WATCHES");

                                      lbwT.setFont(new Font("ITALIC",Font.BOLD,30));

                                      lbwT.setForeground(Color.GREEN);





                                      ImageIcon img2=new ImageIcon("D:/mob.jpeg");

                                      JButton btM=new JButton(img2);

                                      btM.setBounds(220,100,img2.getIconWidth(),img2.getIconHeight());



                                      JLabel lbmT=new JLabel();

                                      lbmT.setBounds(30,200,200,30);

                                      lbmT.setText("MOBILES");

                                      lbmT.setFont(new Font("ITALIC",Font.BOLD,30));

                                      lbmT.setForeground(Color.RED);

                                      ImageIcon img3=new ImageIcon("D:/lap.jpg");

                                      JButton btHp=new JButton(img3);

                                      btHp.setBounds(370,130,img3.getIconWidth(),img3.getIconHeight());

                                      JLabel lbhT=new JLabel();

                                      lbhT.setBounds(40,200,200,30);

                                      lbhT.setText("LAPTOPS");

                                      lbhT.setFont(new Font("ITALIC",Font.BOLD,30));

                                      lbhT.setForeground(Color.ORANGE);



                                      ImageIcon img4=new ImageIcon("D:/headpn.jpg");

                                      JButton btSp=new JButton(img4);

                                      btSp.setBounds(330,90,img4.getIconWidth(),img4.getIconHeight());



                                      JLabel lbsT=new JLabel();





                                      lbsT.setBounds(30,200,220,30);

                                      lbsT.setText("HEADPHONES");

                                      lbsT.setFont(new Font("ITALIC",Font.BOLD,30));

                                      lbsT.setForeground(Color.BLUE);













                                      JButton btP= new JButton();

                                      pn2.add(btP);

                                      btP.setBounds(30,400,165,50);

                                      btP.setBackground(Color.BLACK);

                                      btP.setForeground(Color.YELLOW);

                                      btP.setText("Previous");

                                      btP.setFont(new Font("ITALIC",Font.BOLD,30));

                                      btP.setEnabled(false);



                                      JButton btN= new JButton();

                                      pn2.add(btN);

                                      btN.setBounds(1050,400,165,50);

                                      btN.setBackground(Color.BLACK);

                                      btN.setForeground(Color.YELLOW);

                                      btN.setText("NEXT");

                                      btN.setFont(new Font("ITALIC",Font.BOLD,30));













                                      JFrame frame3= new JFrame();




                                      frame3.setExtendedState(JFrame.MAXIMIZED_BOTH);



                                      JPanel pn3=new JPanel();

                                      pn3.setLayout(null);

                                      frame3.add(pn3);

                                      pn3.setBackground(Color.CYAN);

                                      JFrame frame4= new JFrame();




                                      frame4.setExtendedState(JFrame.MAXIMIZED_BOTH);



                                      JPanel pn4=new JPanel();

                                      pn4.setLayout(null);

                                      frame4.add(pn4);

                                      pn4.setBackground(Color.YELLOW);


                                      JFrame frame5= new JFrame();

                                      frame5.setExtendedState(JFrame.MAXIMIZED_BOTH);

                                      JPanel pn5=new JPanel();

                                      pn5.setLayout(null);

                                      frame5.add(pn5);

                                      pn5.setBackground(Color.WHITE);


                                      JFrame frame6= new JFrame();

                                      frame6.setExtendedState(JFrame.MAXIMIZED_BOTH);

                                      JPanel pn6=new JPanel();

                                      pn6.setLayout(null);

                                      frame6.add(pn6);

                                      pn6.setBackground(Color.GREEN);











                                      btN.addActionListener(new ActionListener()

                                                            {

                                                                public void actionPerformed(ActionEvent e)

                                                                {

                                                                    if(num==1)

                                                                    {





                                                                        btW.setBounds(5000,10,20,20);

                                                                        lbwT.setBounds(5000,10,20,20);



                                                                        btM.setBounds(220,100,img2.getIconWidth(),img2.getIconHeight());

                                                                        lbmT.setBounds(30,200,200,30);





                                                                        pn2.add(btM);

                                                                        pn2.add(lbmT);



                                                                        pn2.setBackground(Color.GREEN);









                                                                        btP.setEnabled(true);





                                                                        num++;











                                                                    }

                                                                    else if(num==2)

                                                                    {



                                                                        btM.setBounds(5000,10,20,20);

                                                                        lbmT.setBounds(5000,10,20,20);



                                                                        btHp.setBounds(370,130,img3.getIconWidth(),img3.getIconHeight());

                                                                        lbhT.setBounds(40,200,200,30);



                                                                        pn2.add(btHp);

                                                                        pn2.add(lbhT);

                                                                        pn2.setBackground(Color.BLUE);



                                                                        num++;







                                                                    }

                                                                    else if(num==3)

                                                                    {



                                                                        btHp.setBounds(5000,130,20,20);

                                                                        lbhT.setBounds(5000,200,200,30);





                                                                        btSp.setBounds(330,90,img4.getIconWidth(),img4.getIconHeight());

                                                                        lbsT.setBounds(30,200,220,30);



                                                                        pn2.add(btSp);

                                                                        pn2.add(lbsT);









                                                                        pn2.setBackground(Color.WHITE);

                                                                        btN.setEnabled(false);



                                                                        num++;

                                                                    }
                                                                }

                                                            }

                                      );



                                      btP.addActionListener(new ActionListener()

                                                            {

                                                                public void actionPerformed(ActionEvent e)

                                                                {

                                                                    if(num==2)

                                                                    {

                                                                        btM.setBounds(5000,10,20,20);

                                                                        lbmT.setBounds(5000,10,20,20);





                                                                        btW.setBounds(350,80,img1.getIconWidth(),img1.getIconHeight());

                                                                        lbwT.setBounds(30,200,200,30);

                                                                        pn2.setBackground(Color.RED);







                                                                        num--;

                                                                        btP.setEnabled(false);



                                                                    }

                                                                    else if(num==3)

                                                                    {

                                                                        btHp.setBounds(5000,20,300,300);

                                                                        lbhT.setBounds(5000,10,20,20);



                                                                        btM.setBounds(220,100,img2.getIconWidth(),img2.getIconHeight());

                                                                        lbmT.setBounds(30,200,200,30);



                                                                        pn2.setBackground(Color.GREEN);





                                                                        num--;





                                                                    }



                                                                    else if(num==4)

                                                                    {



                                                                        btSp.setBounds(5000,130,20,20);

                                                                        lbsT.setBounds(5000,200,200,30);



                                                                        btHp.setBounds(370,130,img3.getIconWidth(),img3.getIconHeight());

                                                                        lbhT.setBounds(40,200,200,30);

                                                                        pn2.setBackground(Color.BLUE);



                                                                        num--;

                                                                        btN.setEnabled(true);



                                                                    }









                                                                }

                                                            }

                                      );





                                      JFrame bill =new JFrame();

                                      bill.setBounds(1000,130,250,250);

                                      JPanel pnbl=new JPanel();

                                      pnbl.setLayout(null);

                                      pnbl.setBackground(Color.BLACK);

                                      bill.add(pnbl);

                                      bill.setResizable(false);


                                      JLabel wt1=new
                                              JLabel();

                                      pnbl.add(wt1);

                                      wt1.setBounds(20,65,300,80);



                                      wt1.setForeground(Color.RED);



                                      wt1.setFont(new Font("ITALIC",Font.BOLD,35));














                                      btW.addActionListener(new ActionListener()

                                                            {

                                                                public void actionPerformed(ActionEvent e)

                                                                {

                                                                    frame2.setVisible(false);

                                                                    frame3.setVisible(true);

                                                                    ImageIcon img1=new ImageIcon("D:/wpd1.png");

                                                                    JLabel pd1=new JLabel(img1);

                                                                    pd1.setBounds(90,250,img1.getIconWidth(),img1.getIconHeight());

                                                                    pn3.add(pd1);

                                                                    JLabel pd1I=new JLabel();

                                                                    pd1I.setBounds(230,280,100,40);

                                                                    pn3.add(pd1I);

                                                                    pd1I.setForeground(Color.BLUE);

                                                                    pd1I.setText("WT1");

                                                                    pd1I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JLabel pd1P=new JLabel();

                                                                    pd1P.setBounds(230,370,120,40);

                                                                    pn3.add(pd1P);

                                                                    pd1P.setForeground(Color.RED);

                                                                    pd1P.setText("2500");

                                                                    pd1P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JButton pd1B=new JButton();

                                                                    pd1B.setBounds(105,470,100,40);

                                                                    pn3.add(pd1B);

                                                                    pd1B.setForeground(Color.RED);

                                                                    pd1B.setBackground(Color.BLACK);

                                                                    pd1B.setText("BUY");

                                                                    pd1B.setFont(new Font("ITALIC",Font.BOLD,25));











                                                                    ImageIcon img2=new ImageIcon("D:/wpd2.png");

                                                                    JLabel pd2=new JLabel(img2);

                                                                    pd2.setBounds(380,220,img2.getIconWidth(),img2.getIconHeight());

                                                                    pn3.add(pd2);

                                                                    JLabel pd2I=new JLabel();

                                                                    pd2I.setBounds(560,280,100,40);

                                                                    pn3.add(pd2I);

                                                                    pd2I.setForeground(Color.BLUE);

                                                                    pd2I.setText("WT2");

                                                                    pd2I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JLabel pd2P=new JLabel();

                                                                    pd2P.setBounds(560,370,120,40);

                                                                    pn3.add(pd2P);

                                                                    pd2P.setForeground(Color.RED);

                                                                    pd2P.setText("4000");

                                                                    pd2P.setFont(new Font("ITALIC",Font.BOLD,25));


                                                                    JButton pd2B=new JButton();

                                                                    pd2B.setBounds(415,490,100,40);

                                                                    pn3.add(pd2B);

                                                                    pd2B.setForeground(Color.RED);

                                                                    pd2B.setBackground(Color.BLACK);

                                                                    pd2B.setText("BUY");

                                                                    pd2B.setFont(new Font("ITALIC",Font.BOLD,25));







                                                                    ImageIcon img3=new ImageIcon("D:/wpd3.png");

                                                                    JLabel pd3=new JLabel(img3);

                                                                    pd3.setBounds(730,220,img3.getIconWidth(),img3.getIconHeight());

                                                                    pn3.add(pd3);

                                                                    JLabel pd3I=new JLabel();

                                                                    pd3I.setBounds(920,280,100,40);

                                                                    pn3.add(pd3I);

                                                                    pd3I.setForeground(Color.BLUE);

                                                                    pd3I.setText("WT3");

                                                                    pd3I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JLabel pd3P=new JLabel();

                                                                    pd3P.setBounds(920,370,120,40);

                                                                    pn3.add(pd3P);

                                                                    pd3P.setForeground(Color.RED);

                                                                    pd3P.setText("3500");

                                                                    pd3P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JButton pd3B=new JButton();

                                                                    pd3B.setBounds(763,490,100,40);

                                                                    pn3.add(pd3B);

                                                                    pd3B.setForeground(Color.RED);

                                                                    pd3B.setBackground(Color.BLACK);

                                                                    pd3B.setText("BUY");

                                                                    pd3B.setFont(new Font("ITALIC",Font.BOLD,25));







                                                                    ImageIcon img4=new ImageIcon("D:/wpd4.png");

                                                                    JLabel pd4=new JLabel(img4);

                                                                    pd4.setBounds(1080,220,img4.getIconWidth(),img4.getIconHeight());

                                                                    pn3.add(pd4);

                                                                    JLabel pd4I=new JLabel();

                                                                    pd4I.setBounds(1260,280,100,40);

                                                                    pn3.add(pd4I);

                                                                    pd4I.setForeground(Color.BLUE);

                                                                    pd4I.setText("WT3");

                                                                    pd4I.setFont(new Font("ITALIC",Font.BOLD,25));





                                                                    JLabel pd4P=new JLabel();

                                                                    pd4P.setBounds(1260,370,120,40);

                                                                    pn3.add(pd4P);

                                                                    pd4P.setForeground(Color.RED);

                                                                    pd4P.setText("3000");

                                                                    pd4P.setFont(new Font("ITALIC",Font.BOLD,25));





                                                                    JButton pd4B=new JButton();

                                                                    pd4B.setBounds(1110,490,100,40);

                                                                    pn3.add(pd4B);

                                                                    pd4B.setForeground(Color.RED);

                                                                    pd4B.setBackground(Color.BLACK);

                                                                    pd4B.setText("BUY");

                                                                    pd4B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                    pd1B.addActionListener(new ActionListener()

                                                                                           {

                                                                                               public void actionPerformed(ActionEvent e)

                                                                                               {

                                                                                                   if(w1=="Buy")

                                                                                                   {

                                                                                                       pay+=2500;

                                                                                                       pd1B.setText("UnBuy");

                                                                                                       pd1B.setFont(new Font("ITALIC",Font.BOLD,15));


                                                                                                       w1="UnBuy";
                                                                                                   }
                                                                                                   else if(w1=="UnBuy")
                                                                                                   {

                                                                                                       pay-=2500;

                                                                                                       pd1B.setText(w1);

                                                                                                       pd1B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                       pd1B.setText("Buy");
                                                                                                       w1="Buy";
                                                                                                   }


                                                                                                   bill.setVisible(true);


                                                                                                   wt1.setText("Bill = " +pay);
                                                                                               }

                                                                                           }

                                                                    );
                                                                    pd2B.addActionListener(new ActionListener()

                                                                                           {

                                                                                               public void actionPerformed(ActionEvent e)

                                                                                               {

                                                                                                   if(w2=="Buy")

                                                                                                   {

                                                                                                       pay+=4000;

                                                                                                       w2="UnBuy";
                                                                                                       pd2B.setText("UnBuy");
                                                                                                       pd2B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                   }

                                                                                                   else if(w2=="UnBuy")

                                                                                                   {

                                                                                                       pay-=4000;

                                                                                                       w2="Buy";

                                                                                                       pd2B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                       pd2B.setText("Buy");
                                                                                                   }





                                                                                                   bill.setVisible(true);


                                                                                                   wt1.setText("Bill = " +pay);


                                                                                               }

                                                                                           }

                                                                    );


                                                                    pd3B.addActionListener(new ActionListener()

                                                                                           {

                                                                                               public void actionPerformed(ActionEvent e)

                                                                                               {

                                                                                                   if(w3=="Buy")

                                                                                                   {

                                                                                                       pay+=3500;

                                                                                                       w3="UnBuy";

                                                                                                       pd3B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                       pd3B.setText("UnBuy");
                                                                                                   }

                                                                                                   else if(w3=="UnBuy")

                                                                                                   {

                                                                                                       pay-=3500;

                                                                                                       w3="Buy";

                                                                                                       pd3B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                       pd3B.setText("Buy");
                                                                                                   }





                                                                                                   bill.setVisible(true);

                                                                                                   wt1.setText("Bill = " +pay);


                                                                                               }

                                                                                           }

                                                                    );


                                                                    pd4B.addActionListener(new ActionListener()

                                                                                           {

                                                                                               public void actionPerformed(ActionEvent e)

                                                                                               {

                                                                                                   if(w4=="Buy")

                                                                                                   {

                                                                                                       pay+=3000;

                                                                                                       w4="UnBuy";

                                                                                                       pd4B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                       pd4B.setText("UnBuy");
                                                                                                   }

                                                                                                   else if(w4=="UnBuy")

                                                                                                   {

                                                                                                       pay-=3000;

                                                                                                       w4="Buy";

                                                                                                       pd4B.setFont(new Font("ITALIC",Font.BOLD,25));
                                                                                                       pd4B.setText("Buy");
                                                                                                   }
                                                                                                   bill.setVisible(true);
                                                                                                   wt1.setText("Bill = " +pay);
                                                                                               }

                                                                                           }

                                                                    );

                                                                    JButton Main=new JButton("Main MENU");

                                                                    pn3.add(Main);

                                                                    Main.setBounds(540,620,180,60);

                                                                    Main.setForeground(Color.GREEN);
                                                                    Main.setBackground(Color.BLACK);

                                                                    Main.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                    Main.addActionListener(new ActionListener()
                                                                                           {

                                                                                               public void actionPerformed(ActionEvent e)
                                                                                               {
                                                                                                   frame2.setVisible(true);
                                                                                                   frame3.setVisible(false);
                                                                                               }
                                                                                           }
                                                                    );

                                                                }

                                                            }
                                      );


                                      btM.addActionListener(new ActionListener()

                                                            {

                                                                public void actionPerformed(ActionEvent e)

                                                                {

                                                                    frame2.setVisible(false);

                                                                    frame3.setVisible(false);

                                                                    frame4.setVisible(true);

                                                                    ImageIcon imgm1=new ImageIcon("D:/MB1.PNG");

                                                                    JLabel pdm1=new JLabel(imgm1);

                                                                    pdm1.setBounds(30,150,imgm1.getIconWidth(),imgm1.getIconHeight());

                                                                    pn4.add(pdm1);

                                                                    JLabel pdm1I=new JLabel();

                                                                    pdm1I.setBounds(230,210,100,40);

                                                                    pn4.add(pdm1I);

                                                                    pdm1I.setForeground(Color.BLUE);

                                                                    pdm1I.setText("Mb1");

                                                                    pdm1I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JLabel pdm1P=new JLabel();

                                                                    pdm1P.setBounds(230,430,120,40);

                                                                    pn4.add(pdm1P);

                                                                    pdm1P.setForeground(Color.RED);

                                                                    pdm1P.setText("22500");

                                                                    pdm1P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JButton pdm1B=new JButton();

                                                                    pdm1B.setBounds(80,520,100,40);

                                                                    pn4.add(pdm1B);

                                                                    pdm1B.setForeground(Color.RED);

                                                                    pdm1B.setBackground(Color.BLACK);

                                                                    pdm1B.setText("BUY");

                                                                    pdm1B.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    ImageIcon imgm2=new ImageIcon("D:/Mb2.PNG");

                                                                    JLabel pdm2=new JLabel(imgm2);

                                                                    pdm2.setBounds(420,150,imgm2.getIconWidth(),imgm2.getIconHeight());

                                                                    pn4.add(pdm2);

                                                                    JLabel pdm2I=new JLabel();

                                                                    pdm2I.setBounds(615,220,100,40);

                                                                    pn4.add(pdm2I);

                                                                    pdm2I.setForeground(Color.BLUE);

                                                                    pdm2I.setText("Mb2");

                                                                    pdm2I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JLabel pdm2P=new JLabel();

                                                                    pdm2P.setBounds(615,420,120,40);

                                                                    pn4.add(pdm2P);

                                                                    pdm2P.setForeground(Color.RED);

                                                                    pdm2P.setText("26500");

                                                                    pdm2P.setFont(new Font("ITALIC",Font.BOLD,25));


                                                                    JButton pdm2B=new JButton();

                                                                    pdm2B.setBounds(465,520,100,40);

                                                                    pn4.add(pdm2B);

                                                                    pdm2B.setForeground(Color.RED);

                                                                    pdm2B.setBackground(Color.BLACK);

                                                                    pdm2B.setText("BUY");

                                                                    pdm2B.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    ImageIcon imgm3=new ImageIcon("D:/img3.PNG");

                                                                    JLabel pdm3=new JLabel(imgm3);

                                                                    pdm3.setBounds(780,140,imgm3.getIconWidth(),imgm3.getIconHeight());

                                                                    pn4.add(pdm3);

                                                                    JLabel pdm3I=new JLabel();

                                                                    pdm3I.setBounds(980,230,100,40);

                                                                    pn4.add(pdm3I);

                                                                    pdm3I.setForeground(Color.BLUE);

                                                                    pdm3I.setText("Mb3");

                                                                    pdm3I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JLabel pdm3P=new JLabel();

                                                                    pdm3P.setBounds(980,420,120,40);

                                                                    pn4.add(pdm3P);

                                                                    pdm3P.setForeground(Color.RED);

                                                                    pdm3P.setText("16500");

                                                                    pdm3P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JButton pdm3B=new JButton();

                                                                    pdm3B.setBounds(830,540,100,40);

                                                                    pn4.add(pdm3B);

                                                                    pdm3B.setForeground(Color.RED);

                                                                    pdm3B.setBackground(Color.BLACK);

                                                                    pdm3B.setText("BUY");

                                                                    pdm3B.setFont(new Font("ITALIC",Font.BOLD,25));







                                                                    ImageIcon imgm4=new ImageIcon("D:/mbbbb4.PNG");

                                                                    JLabel pdm4=new JLabel(imgm4);

                                                                    pdm4.setBounds(1080,170,imgm4.getIconWidth(),imgm4.getIconHeight());

                                                                    pn4.add(pdm4);

                                                                    JLabel pdm4I=new JLabel();

                                                                    pdm4I.setBounds(1260,280,100,40);

                                                                    pn4.add(pdm4I);

                                                                    pdm4I.setForeground(Color.BLUE);

                                                                    pdm4I.setText("Mb4");

                                                                    pdm4I.setFont(new Font("ITALIC",Font.BOLD,25));





                                                                    JLabel pdm4P=new JLabel();

                                                                    pdm4P.setBounds(1260,370,120,40);

                                                                    pn4.add(pdm4P);

                                                                    pdm4P.setForeground(Color.RED);

                                                                    pdm4P.setText("85000");

                                                                    pdm4P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                    JButton pdm4B=new JButton();

                                                                    pdm4B.setBounds(1110,490,100,40);

                                                                    pn4.add(pdm4B);

                                                                    pdm4B.setForeground(Color.RED);

                                                                    pdm4B.setBackground(Color.BLACK);

                                                                    pdm4B.setText("BUY");

                                                                    pdm4B.setFont(new Font("ITALIC",Font.BOLD,25));


                                                                    pdm1B.addActionListener(new ActionListener()

                                                                                            {

                                                                                                public void actionPerformed(ActionEvent e)

                                                                                                {

                                                                                                    if(m1=="Buy")

                                                                                                    {

                                                                                                        pay+=22500;

                                                                                                        pdm1B.setText("UnBuy");

                                                                                                        pdm1B.setFont(new Font("ITALIC",Font.BOLD,15));


                                                                                                        m1="UnBuy";
                                                                                                    }
                                                                                                    else if(m1=="UnBuy")
                                                                                                    {

                                                                                                        pay-=22500;

                                                                                                        pdm1B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                        pdm1B.setText("Buy");
                                                                                                        m1="Buy";
                                                                                                    }


                                                                                                    bill.setVisible(true);


                                                                                                    wt1.setText("Bill = " +pay);
                                                                                                }

                                                                                            }

                                                                    );


                                                                    pdm2B.addActionListener(new ActionListener()

                                                                                            {

                                                                                                public void actionPerformed(ActionEvent e)

                                                                                                {

                                                                                                    if(m2=="Buy")

                                                                                                    {

                                                                                                        pay+=26500;

                                                                                                        m2="UnBuy";
                                                                                                        pdm2B.setText("UnBuy");
                                                                                                        pdm2B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                    }

                                                                                                    else if(m2=="UnBuy")

                                                                                                    {

                                                                                                        pay-=26500;

                                                                                                        m2="Buy";

                                                                                                        pdm2B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                        pdm2B.setText("Buy");
                                                                                                    }





                                                                                                    bill.setVisible(true);


                                                                                                    wt1.setText("Bill = " +pay);


                                                                                                }

                                                                                            }

                                                                    );


                                                                    pdm3B.addActionListener(new ActionListener()

                                                                                            {

                                                                                                public void actionPerformed(ActionEvent e)

                                                                                                {

                                                                                                    if(m3=="Buy")

                                                                                                    {

                                                                                                        pay+=16500;

                                                                                                        m3="UnBuy";

                                                                                                        pdm3B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                        pdm3B.setText("UnBuy");
                                                                                                    }

                                                                                                    else if(m3=="UnBuy")

                                                                                                    {

                                                                                                        pay-=16500;

                                                                                                        m3="Buy";

                                                                                                        pdm3B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                        pdm3B.setText("Buy");
                                                                                                    }





                                                                                                    bill.setVisible(true);

                                                                                                    wt1.setText("Bill = " +pay);


                                                                                                }

                                                                                            }

                                                                    );


                                                                    pdm4B.addActionListener(new ActionListener()

                                                                                            {

                                                                                                public void actionPerformed(ActionEvent e)

                                                                                                {

                                                                                                    if(m4=="Buy")

                                                                                                    {

                                                                                                        pay+=8500;

                                                                                                        m4="UnBuy";

                                                                                                        pdm4B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                        pdm4B.setText("UnBuy");
                                                                                                    }

                                                                                                    else if(m4=="UnBuy")

                                                                                                    {

                                                                                                        pay-=8500;

                                                                                                        m4="Buy";

                                                                                                        pdm4B.setFont(new Font("ITALIC",Font.BOLD,25));
                                                                                                        pdm4B.setText("Buy");
                                                                                                    }
                                                                                                    bill.setVisible(true);
                                                                                                    wt1.setText("Bill = " +pay);
                                                                                                }

                                                                                            }

                                                                    );



                                                                    JButton Main=new JButton("Main MENU");

                                                                    pn3.add(Main);
                                                                    pn4.add(Main);
                                                                    Main.setBounds(540,620,180,60);

                                                                    Main.setForeground(Color.GREEN);
                                                                    Main.setBackground(Color.BLACK);

                                                                    Main.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                    Main.addActionListener(new ActionListener()
                                                                                           {

                                                                                               public void actionPerformed(ActionEvent e)
                                                                                               {
                                                                                                   frame2.setVisible(true);
                                                                                                   frame3.setVisible(false);

                                                                                               }
                                                                                           }
                                                                    );

                                                                }

                                                            }
                                      );


                                      //mbend











                                      btHp.addActionListener(new ActionListener()

                                                             {

                                                                 public void actionPerformed(ActionEvent e)

                                                                 {

                                                                     frame2.setVisible(false);

                                                                     frame3.setVisible(false);

                                                                     frame4.setVisible(false);

                                                                     frame5.setVisible(true);

                                                                     ImageIcon imgl1=new ImageIcon("D:/lap1.jpg");

                                                                     JLabel pdl1=new JLabel(imgl1);

                                                                     pdl1.setBounds(0,250,imgl1.getIconWidth(),imgl1.getIconHeight());

                                                                     pn5.add(pdl1);

                                                                     JLabel pdl1I=new JLabel();

                                                                     pdl1I.setBounds(280,260,100,40);

                                                                     pn5.add(pdl1I);

                                                                     pdl1I.setForeground(Color.BLUE);

                                                                     pdl1I.setText("LAP1");

                                                                     pdl1I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JLabel pdl1P=new JLabel();

                                                                     pdl1P.setBounds(280,380,120,40);

                                                                     pn5.add(pdl1P);

                                                                     pdl1P.setForeground(Color.RED);

                                                                     pdl1P.setText("30000");

                                                                     pdl1P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JButton pdl1B=new JButton();

                                                                     pdl1B.setBounds(80,440,100,40);

                                                                     pn5.add(pdl1B);

                                                                     pdl1B.setForeground(Color.RED);

                                                                     pdl1B.setBackground(Color.BLACK);

                                                                     pdl1B.setText("BUY");

                                                                     pdl1B.setFont(new Font("ITALIC",Font.BOLD,25));




                                                                     ImageIcon imgl2=new ImageIcon("D:/lap2.PNG");

                                                                     JLabel pdl2=new JLabel(imgl2);

                                                                     pdl2.setBounds(360,260,imgl2.getIconWidth(),imgl2.getIconHeight());

                                                                     pn5.add(pdl2);

                                                                     JLabel pdl2I=new JLabel();

                                                                     pdl2I.setBounds(620,270,100,40);

                                                                     pn5.add(pdl2I);

                                                                     pdl2I.setForeground(Color.BLUE);

                                                                     pdl2I.setText("LAP2");

                                                                     pdl2I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JLabel pdl2P=new JLabel();

                                                                     pdl2P.setBounds(618,370,120,40);

                                                                     pn5.add(pdl2P);

                                                                     pdl2P.setForeground(Color.RED);

                                                                     pdl2P.setText("37500");

                                                                     pdl2P.setFont(new Font("ITALIC",Font.BOLD,25));


                                                                     JButton pdl2B=new JButton();

                                                                     pdl2B.setBounds(435,430,100,40);

                                                                     pn5.add(pdl2B);

                                                                     pdl2B.setForeground(Color.RED);

                                                                     pdl2B.setBackground(Color.BLACK);

                                                                     pdl2B.setText("BUY");

                                                                     pdl2B.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     ImageIcon imgl3=new ImageIcon("D:/lap3.PNG");

                                                                     JLabel pdl3=new JLabel(imgl3);

                                                                     pdl3.setBounds(700,250,imgl3.getIconWidth(),imgl3.getIconHeight());

                                                                     pn5.add(pdl3);

                                                                     JLabel pdl3I=new JLabel();

                                                                     pdl3I.setBounds(965,270,100,40);

                                                                     pn5.add(pdl3I);

                                                                     pdl3I.setForeground(Color.BLUE);

                                                                     pdl3I.setText("LAP3");

                                                                     pdl3I.setFont(new Font("ITALIC",Font.BOLD,25));


                                                                     JLabel pdl3P=new JLabel();

                                                                     pdl3P.setBounds(965,370,120,40);

                                                                     pn5.add(pdl3P);

                                                                     pdl3P.setForeground(Color.RED);

                                                                     pdl3P.setText("65000");

                                                                     pdl3P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JButton pdl3B=new JButton();

                                                                     pdl3B.setBounds(785,440,100,40);

                                                                     pn5.add(pdl3B);

                                                                     pdl3B.setForeground(Color.RED);

                                                                     pdl3B.setBackground(Color.BLACK);

                                                                     pdl3B.setText("BUY");

                                                                     pdl3B.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     ImageIcon imgl4=new ImageIcon("D:/lp4.PNG");

                                                                     JLabel pdl4=new JLabel(imgl4);

                                                                     pdl4.setBounds(1045,240,imgl4.getIconWidth(),imgl4.getIconHeight());

                                                                     pn5.add(pdl4);

                                                                     JLabel pdl4I=new JLabel();

                                                                     pdl4I.setBounds(1280,260,100,40);

                                                                     pn5.add(pdl4I);

                                                                     pdl4I.setForeground(Color.BLUE);

                                                                     pdl4I.setText("LAP4");

                                                                     pdl4I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JLabel pdl4P=new JLabel();

                                                                     pdl4P.setBounds(1280,370,120,40);

                                                                     pn5.add(pdl4P);

                                                                     pdl4P.setForeground(Color.RED);

                                                                     pdl4P.setText("24000");

                                                                     pdl4P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JButton pdl4B=new JButton();

                                                                     pdl4B.setBounds(1120,460,100,40);

                                                                     pn5.add(pdl4B);

                                                                     pdl4B.setForeground(Color.RED);

                                                                     pdl4B.setBackground(Color.BLACK);

                                                                     pdl4B.setText("BUY");

                                                                     pdl4B.setFont(new Font("ITALIC",Font.BOLD,25));


                                                                     pdl1B.addActionListener(new ActionListener()

                                                                                             {

                                                                                                 public void actionPerformed(ActionEvent e)

                                                                                                 {

                                                                                                     if(l1=="Buy")

                                                                                                     {

                                                                                                         pay+=30000;

                                                                                                         pdl1B.setText("UnBuy");

                                                                                                         pdl1B.setFont(new Font("ITALIC",Font.BOLD,15));


                                                                                                         l1="UnBuy";
                                                                                                     }
                                                                                                     else if(l1=="UnBuy")
                                                                                                     {

                                                                                                         pay-=30000;

                                                                                                         pdl1B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                         pdl1B.setText("Buy");
                                                                                                         l1="Buy";
                                                                                                     }


                                                                                                     bill.setVisible(true);


                                                                                                     wt1.setText("Bill = " +pay);
                                                                                                 }

                                                                                             }

                                                                     );


                                                                     pdl2B.addActionListener(new ActionListener()

                                                                                             {

                                                                                                 public void actionPerformed(ActionEvent e)

                                                                                                 {

                                                                                                     if(l2=="Buy")

                                                                                                     {

                                                                                                         pay+=37500;

                                                                                                         l2="UnBuy";
                                                                                                         pdl2B.setText("UnBuy");
                                                                                                         pdl2B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                     }

                                                                                                     else if(l2=="UnBuy")

                                                                                                     {

                                                                                                         pay-=37500;

                                                                                                         l2="Buy";

                                                                                                         pdl2B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                         pdl2B.setText("Buy");
                                                                                                     }





                                                                                                     bill.setVisible(true);


                                                                                                     wt1.setText("Bill = " +pay);


                                                                                                 }

                                                                                             }

                                                                     );


                                                                     pdl3B.addActionListener(new ActionListener()

                                                                                             {

                                                                                                 public void actionPerformed(ActionEvent e)

                                                                                                 {

                                                                                                     if(l3=="Buy")

                                                                                                     {

                                                                                                         pay+=65000;

                                                                                                         l3="UnBuy";

                                                                                                         pdl3B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                         pdl3B.setText("UnBuy");
                                                                                                     }

                                                                                                     else if(l3=="UnBuy")

                                                                                                     {

                                                                                                         pay-=65000;

                                                                                                         l3="Buy";

                                                                                                         pdl3B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                         pdl3B.setText("Buy");
                                                                                                     }





                                                                                                     bill.setVisible(true);

                                                                                                     wt1.setText("Bill = " +pay);


                                                                                                 }

                                                                                             }

                                                                     );


                                                                     pdl4B.addActionListener(new ActionListener()

                                                                                             {

                                                                                                 public void actionPerformed(ActionEvent e)

                                                                                                 {

                                                                                                     if(l4=="Buy")

                                                                                                     {

                                                                                                         pay+=24000;

                                                                                                         l4="UnBuy";

                                                                                                         pdl4B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                         pdl4B.setText("UnBuy");
                                                                                                     }

                                                                                                     else if(l4=="UnBuy")

                                                                                                     {

                                                                                                         pay-=24000;

                                                                                                         l4="Buy";

                                                                                                         pdl4B.setFont(new Font("ITALIC",Font.BOLD,25));
                                                                                                         pdl4B.setText("Buy");
                                                                                                     }
                                                                                                     bill.setVisible(true);
                                                                                                     wt1.setText("Bill = " +pay);
                                                                                                 }

                                                                                             }

                                                                     );



                                                                     JButton Main=new JButton("Main MENU");

                                                                     pn3.add(Main);
                                                                     pn4.add(Main);
                                                                     pn5.add(Main);
                                                                     Main.setBounds(540,620,180,60);

                                                                     Main.setForeground(Color.GREEN);
                                                                     Main.setBackground(Color.BLACK);

                                                                     Main.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                     Main.addActionListener(new ActionListener()
                                                                                            {

                                                                                                public void actionPerformed(ActionEvent e)
                                                                                                {
                                                                                                    frame2.setVisible(true);
                                                                                                    frame3.setVisible(false);
                                                                                                    frame4.setVisible(false);
                                                                                                    frame5.setVisible(false);
                                                                                                }
                                                                                            }
                                                                     );

                                                                 }

                                                             }
                                      );


                                      btSp.addActionListener(new ActionListener()

                                                             {

                                                                 public void actionPerformed(ActionEvent e)

                                                                 {

                                                                     frame2.setVisible(false);

                                                                     frame3.setVisible(false);

                                                                     frame4.setVisible(false);

                                                                     frame5.setVisible(false);

                                                                     frame6.setVisible(true);

                                                                     ImageIcon imgh1=new ImageIcon("D:/hw1.PNG");

                                                                     JLabel pdh1=new JLabel(imgh1);

                                                                     pdh1.setBounds(30,220,imgh1.getIconWidth(),imgh1.getIconHeight());

                                                                     pn6.add(pdh1);

                                                                     JLabel pdh1I=new JLabel();

                                                                     pdh1I.setBounds(210,250,100,40);

                                                                     pn6.add(pdh1I);

                                                                     pdh1I.setForeground(Color.BLUE);

                                                                     pdh1I.setText("HP1");

                                                                     pdh1I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JLabel pdh1P=new JLabel();

                                                                     pdh1P.setBounds(210,330,120,40);

                                                                     pn6.add(pdh1P);

                                                                     pdh1P.setForeground(Color.RED);

                                                                     pdh1P.setText("2000");

                                                                     pdh1P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JButton pdh1B=new JButton();

                                                                     pdh1B.setBounds(70,430,100,40);

                                                                     pn6.add(pdh1B);

                                                                     pdh1B.setForeground(Color.RED);

                                                                     pdh1B.setBackground(Color.BLACK);

                                                                     pdh1B.setText("BUY");

                                                                     pdh1B.setFont(new Font("ITALIC",Font.BOLD,25));




                                                                     ImageIcon imgh2=new ImageIcon("D:/hw2.PNG");

                                                                     JLabel pdh2=new JLabel(imgh2);

                                                                     pdh2.setBounds(370,210,imgh2.getIconWidth(),imgh2.getIconHeight());

                                                                     pn6.add(pdh2);

                                                                     JLabel pdh2I=new JLabel();

                                                                     pdh2I.setBounds(590,250,100,40);

                                                                     pn6.add(pdh2I);

                                                                     pdh2I.setForeground(Color.BLUE);

                                                                     pdh2I.setText("HP2");

                                                                     pdh2I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JLabel pdh2P=new JLabel();

                                                                     pdh2P.setBounds(588,350,120,40);

                                                                     pn6.add(pdh2P);

                                                                     pdh2P.setForeground(Color.RED);

                                                                     pdh2P.setText("3000");

                                                                     pdh2P.setFont(new Font("ITALIC",Font.BOLD,25));


                                                                     JButton pdh2B=new JButton();

                                                                     pdh2B.setBounds(425,430,100,40);

                                                                     pn6.add(pdh2B);

                                                                     pdh2B.setForeground(Color.RED);

                                                                     pdh2B.setBackground(Color.BLACK);

                                                                     pdh2B.setText("BUY");

                                                                     pdh2B.setFont(new Font("ITALIC",Font.BOLD,25));


                                                                     ImageIcon imgh3=new ImageIcon("D:/hw3.jpg");

                                                                     JLabel pdh3=new JLabel(imgh3);

                                                                     pdh3.setBounds(700,200,imgh3.getIconWidth(),imgh3.getIconHeight());

                                                                     pn6.add(pdh3);

                                                                     JLabel pdh3I=new JLabel();

                                                                     pdh3I.setBounds(925,260,100,40);

                                                                     pn6.add(pdh3I);

                                                                     pdh3I.setForeground(Color.BLUE);

                                                                     pdh3I.setText("HP3");

                                                                     pdh3I.setFont(new Font("ITALIC",Font.BOLD,25));


                                                                     JLabel pdh3P=new JLabel();

                                                                     pdh3P.setBounds(925,370,120,40);

                                                                     pn6.add(pdh3P);

                                                                     pdh3P.setForeground(Color.RED);

                                                                     pdh3P.setText("4000");

                                                                     pdh3P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JButton pdh3B=new JButton();

                                                                     pdh3B.setBounds(765,450,100,40);

                                                                     pn6.add(pdh3B);

                                                                     pdh3B.setForeground(Color.RED);

                                                                     pdh3B.setBackground(Color.BLACK);

                                                                     pdh3B.setText("BUY");

                                                                     pdh3B.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     ImageIcon imgh4=new ImageIcon("D:/hw4.PNG");

                                                                     JLabel pdh4=new JLabel(imgh4);

                                                                     pdh4.setBounds(1045,220,imgh4.getIconWidth(),imgh4.getIconHeight());

                                                                     pn6.add(pdh4);

                                                                     JLabel pdh4I=new JLabel();

                                                                     pdh4I.setBounds(1260,260,100,40);

                                                                     pn6.add(pdh4I);

                                                                     pdh4I.setForeground(Color.BLUE);

                                                                     pdh4I.setText("HP4");

                                                                     pdh4I.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JLabel pdh4P=new JLabel();

                                                                     pdh4P.setBounds(1260,340,120,40);

                                                                     pn6.add(pdh4P);

                                                                     pdh4P.setForeground(Color.RED);

                                                                     pdh4P.setText("2500");

                                                                     pdh4P.setFont(new Font("ITALIC",Font.BOLD,25));



                                                                     JButton pdh4B=new JButton();

                                                                     pdh4B.setBounds(1100,440,100,40);

                                                                     pn6.add(pdh4B);

                                                                     pdh4B.setForeground(Color.RED);

                                                                     pdh4B.setBackground(Color.BLACK);

                                                                     pdh4B.setText("BUY");

                                                                     pdh4B.setFont(new Font("ITALIC",Font.BOLD,25));


                                                                     pdh1B.addActionListener(new ActionListener()

                                                                                             {

                                                                                                 public void actionPerformed(ActionEvent e)

                                                                                                 {

                                                                                                     if(h1=="Buy")

                                                                                                     {

                                                                                                         pay+=2000;

                                                                                                         pdh1B.setText("UnBuy");

                                                                                                         pdh1B.setFont(new Font("ITALIC",Font.BOLD,15));


                                                                                                         h1="UnBuy";
                                                                                                     }
                                                                                                     else if(h1=="UnBuy")
                                                                                                     {

                                                                                                         pay-=2000;

                                                                                                         pdh1B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                         pdh1B.setText("Buy");
                                                                                                         h1="Buy";
                                                                                                     }


                                                                                                     bill.setVisible(true);


                                                                                                     wt1.setText("Bill = " +pay);
                                                                                                 }

                                                                                             }

                                                                     );


                                                                     pdh2B.addActionListener(new ActionListener()

                                                                                             {

                                                                                                 public void actionPerformed(ActionEvent e)

                                                                                                 {

                                                                                                     if(h2=="Buy")

                                                                                                     {

                                                                                                         pay+=3000;

                                                                                                         h2="UnBuy";
                                                                                                         pdh2B.setText("UnBuy");
                                                                                                         pdh2B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                     }

                                                                                                     else if(h2=="UnBuy")

                                                                                                     {

                                                                                                         pay-=3000;

                                                                                                         h2="Buy";

                                                                                                         pdh2B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                         pdh2B.setText("Buy");
                                                                                                     }





                                                                                                     bill.setVisible(true);


                                                                                                     wt1.setText("Bill = " +pay);


                                                                                                 }

                                                                                             }

                                                                     );


                                                                     pdh3B.addActionListener(new ActionListener()

                                                                                             {

                                                                                                 public void actionPerformed(ActionEvent e)

                                                                                                 {

                                                                                                     if(h3=="Buy")

                                                                                                     {

                                                                                                         pay+=4000;

                                                                                                         h3="UnBuy";

                                                                                                         pdh3B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                         pdh3B.setText("UnBuy");
                                                                                                     }

                                                                                                     else if(h3=="UnBuy")

                                                                                                     {

                                                                                                         pay-=4000;

                                                                                                         h3="Buy";

                                                                                                         pdh3B.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                                                         pdh3B.setText("Buy");
                                                                                                     }





                                                                                                     bill.setVisible(true);

                                                                                                     wt1.setText("Bill = " +pay);


                                                                                                 }

                                                                                             }

                                                                     );


                                                                     pdh4B.addActionListener(new ActionListener()

                                                                                             {

                                                                                                 public void actionPerformed(ActionEvent e)

                                                                                                 {

                                                                                                     if(h4=="Buy")

                                                                                                     {

                                                                                                         pay+=2500;

                                                                                                         h4="UnBuy";

                                                                                                         pdh4B.setFont(new Font("ITALIC",Font.BOLD,15));

                                                                                                         pdh4B.setText("UnBuy");
                                                                                                     }

                                                                                                     else if(h4=="UnBuy")

                                                                                                     {

                                                                                                         pay-=2500;

                                                                                                         h4="Buy";

                                                                                                         pdh4B.setFont(new Font("ITALIC",Font.BOLD,25));
                                                                                                         pdh4B.setText("Buy");
                                                                                                     }
                                                                                                     bill.setVisible(true);
                                                                                                     wt1.setText("Bill = " +pay);
                                                                                                 }

                                                                                             }

                                                                     );



                                                                     JButton Main=new JButton("Main MENU");

                                                                     pn3.add(Main);
                                                                     pn4.add(Main);
                                                                     pn5.add(Main);
                                                                     pn6.add(Main);
                                                                     Main.setBounds(540,620,180,60);

                                                                     Main.setForeground(Color.GREEN);
                                                                     Main.setBackground(Color.BLACK);

                                                                     Main.setFont(new Font("ITALIC",Font.BOLD,25));

                                                                     Main.addActionListener(new ActionListener()
                                                                                            {

                                                                                                public void actionPerformed(ActionEvent e)
                                                                                                {
                                                                                                    frame2.setVisible(true);
                                                                                                    frame3.setVisible(false);
                                                                                                    frame4.setVisible(false);
                                                                                                    frame5.setVisible(false);
                                                                                                    frame6.setVisible(false);
                                                                                                }
                                                                                            }
                                                                     );

                                                                 }

                                                             }
                                      );







                                  }
                              }
        );
    }
}