import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public final class BreakBrick
{
    public int map[][];
    public int bricksWidth;
    public int bricksHeight;
    public int l;
    public int m;
    public int n;
    public int o;
    public int q;
    public int f;
    public boolean mind=false;
    int mx;
    int my;
    int t;
    Graphics g;
      
    public BreakBrick(){
         System.out.print("sssssssss");
        bricksWidth = 50;
        bricksHeight = 30;
        l=84;
        m=54;
        mx=0;
        my=0;
        t=30;
        paint();
    }
    public void paint() {
                 //  if(mind){
            //while(t<520){
        System.out.print("bbbbbb");
                     g.setColor(Color.white);
            g.fillRect(my * bricksWidth + 80, mx * bricksHeight + 50+t, bricksWidth/2, bricksHeight);
                   // g.setColor(Color.WHITE);
                    //g.drawLine(my * bricksWidth + l, mx * bricksHeight + m, my * bricksWidth + n+bricksWidth, mx * bricksHeight + 54+q);
                   // g.drawLine(my * bricksWidth + l, mx * bricksHeight + m, my * bricksWidth + 84+q,mx * bricksHeight + o+bricksHeight);
                  //  g.setStroke(new BasicStroke(6));
                    g.setColor(Color.black);
                    g.drawRect(my * bricksWidth + 80+f, mx * bricksHeight + 50+t, bricksWidth/2, bricksHeight);
                    
                    g.setColor(Color.red);
                    g.fillRect(my * bricksWidth + 80+(bricksWidth/2), mx * bricksHeight + 50+t, bricksWidth/2, bricksHeight);
                  //  g.setColor(Color.WHITE);
                    //g.drawLine(my * bricksWidth + l, mx * bricksHeight + m, my * bricksWidth + n+bricksWidth, mx * bricksHeight + 54+q);
                   // g.drawLine(my * bricksWidth + l, mx * bricksHeight + m, my * bricksWidth + 84+q,mx * bricksHeight + o+bricksHeight);
                  //  g.setStroke(new BasicStroke(6));
                    g.setColor(Color.black);
                    g.drawRect(my * bricksWidth + 80+f+(bricksWidth/2), mx * bricksHeight + 50+t, bricksWidth/2, bricksHeight);
                   // t+=10;
          //  }
                    
       // }
                }
    public void setBricksValue(int value,int row,int col)
    {
        mind=true;
        mx=row;
        my=col;

    }


}
