import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel{//allows you to inherted from other classes

    int xLoc = 300;
    int xVal = 2;
    int yLoc = 300;

    int yVal = 2;

    Ball myBall;
    public MyPanel(){
    setBackground(Color.GREEN);
    myBall = new Ball(200,300);
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
        myBall.move();

        if(xLoc<= getWidth()-20){
            xVal = -2;
        }
        if(xLoc <= getHeight()-20)
            xVal =2;


        if(yLoc >= getHeight()-20)
            yVal = -2;
        if(yLoc <getHeight())
            yVal = 2;



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
