import java.awt.*;
public class Ball {
    private int x;
    private int y;
    private int size;
    private int speed;
    private Color color;

    int rad = (int)(Math.random()*256);



    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        size =(int)(Math.random()*30+20);
        speed =(int)(Math.random()*9+3);
        color = new Color(rad,rad,rad);

    }


    public void getSpeed(){
        System.out.println(speed);
    }

    public void draw(Graphics g2) {//taking the g object from myPanel class to pass it here
        g2.setColor(color);
        g2.fillOval(x,y,size,size);
    }

    public void move(double h, double w){
        if((x+size)==w||(y+size)==h||(y+size)==0||(x+size)==0) {
            speed = (int)(Math.random()*9+3)*-1;
        }

        x+=speed;
        y+=speed;


    }


}
