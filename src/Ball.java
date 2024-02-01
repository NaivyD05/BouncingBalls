import java.awt.*;
public class Ball {
    private int x;
    private int y;
    private int size;
    private int speed;
    private Color color;

    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        size = 10;
        speed = 5;
        color = Color.PINK;

    }


    public void draw(Graphics g2) {//taking the g object from myPanel class to pass it here
        g2.setColor(color);
        g2.fillOval(x,y,size,size);
    }

    public void move(double h, double w){
        if(x-size>w)
            speed *=-1;

        if(y-size>h)
            speed *=-1;

        x+=speed;
        y+=speed;


    }


}
