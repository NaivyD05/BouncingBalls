import java.awt.*;
public class Ball {
    private int x;
    private int y;
    private int size;
    private int xSpeed;
    private int ySpeed;
    private Color color;

    int rad = (int)(Math.random()*256);




    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        size =(int)(Math.random()*30)+20;
        xSpeed =(int)(Math.random()*9)+3;
        ySpeed =(int)(Math.random()*9)+3;
        color = new Color(rad,rad,rad);

    }

    public Ball(){
       x = (int)(Math.random()*500);
       y = (int)(Math.random()*500);
       xSpeed =(int)(Math.random()*9)+3;
       ySpeed =(int)(Math.random()*9)+3;

       color = new Color(rad,rad,rad);

    }




    public void draw(Graphics g2) {//taking the g object from myPanel class to pass it here
        g2.setColor(color);
        g2.fillOval(x,y,size,size);
    }

    public void move(double h, double w){
        x+=xSpeed;
        y+=ySpeed;

        if(x >= w- size|| x<=0){
            xSpeed *= -1;
            if (ySpeed < 0){
                ySpeed = (int)(Math.random()*20)+ 1;
                ySpeed *= -1;
            }else
            {
                ySpeed = (int)(Math.random()*20)+ 1;
            }

        }else if (y>= h - size || y<=0){
            ySpeed *= -1;


            if (xSpeed < 0){
                xSpeed = (int)(Math.random()*20)+ 1;
                xSpeed *= -1;
            }else
            {
                xSpeed = (int)(Math.random()*20)+ 1;
            }


        }

        if(((y+size)== 0||(x+size)==0)){
            xSpeed = (int)(Math.random()*9+3)*-1;
            ySpeed = (int)(Math.random()*9+3)*-1;
        }




    }


}
