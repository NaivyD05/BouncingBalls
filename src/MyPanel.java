import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyPanel extends JPanel{//allows you to inherted from other classes

    int radX = (int)(Math.random()*500);
    int radY = (int)(Math.random()*500);
    int l = 300;

    int yVal = 1;

    Ball myBall;
    Ball[] balls = new Ball[20];
    public MyPanel(){
        setBackground(Color.GREEN);
        for(int i = 0;i<20;i++){
            balls[i] = new Ball();
        }

        myBall = new Ball(radX,radY);
//
//    //addding key listener moving an object left/right/updown
//        setFocusable(true);
//        addKeyListener(new KeyAdapter() {
//        @Override
//        public void keyPressed(KeyEvent e) {
//            super.keyPressed(e);
//            System.out.println(e.getKeyCode());
//            int key = e.getKeyCode();
//
//            if(key==68){
//                System.out.println("moving right");
//            }
//        }
//    });

    }

    @Override
    public void paintComponent(Graphics g){
        //sout
        //super means go up one level
        super.paintComponent(g);
        //System.out.println("hi");
        //the x and y are the top left corner of the box

//        g.setColor(Color.RED);
//        g.fillOval(xLoc,yLoc,20,20);//g is an object of the graphics class

        for(int i= 0;i<20;i++){
            balls[i].draw(g);
            balls[i].move(getHeight(), getWidth());
        }

        radY = getHeight();
        radX = getWidth();

        myBall.draw(g);

        myBall.move(getHeight(), getWidth());


        try {
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println(e);
        }
        //avoids infinite recursion
        repaint();
    }
}
