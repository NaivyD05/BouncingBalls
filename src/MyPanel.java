import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel{//allows you to inherted from other classes

    int radX = (int)(Math.random()*getWidth());
    int radY = (int)(Math.random()*getHeight());
    int l = 300;

    int yVal = 1;

    Ball myBall;
    public MyPanel(){
    setBackground(Color.GREEN);

    myBall = new Ball(400,300);

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


            myBall.draw(g);
            myBall.move(getHeight(), getWidth());



        g.setColor(Color.BLUE);
        g.drawString("Hello world", 150, 150);




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
