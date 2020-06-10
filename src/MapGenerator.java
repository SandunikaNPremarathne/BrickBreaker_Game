import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator
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
    public boolean mind;
    public int mx,my;
    public int t=10;
      
    public MapGenerator(int row , int col){
        map = new int[row][col];
         for(int i = 0; i < map.length; i++){
            for(int j = 0;j < map[0].length; j++){
                map[i][j] = 1;
            }
        
        }
        bricksWidth = 540/col;
        bricksHeight = 120/row;
        l=84;
        m=54;
        n=70;
        o=40;
        q=0;
        f=0;
        mx=0;
        my=0;
        mind=false;
    }
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.red);
                   // g.draw3DRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight,true);
                   // g.fill3DRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight, false);
                    
                    g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);
                    g.setColor(Color.WHITE);
                    g.drawLine(j * bricksWidth + l, i * bricksHeight + m, j * bricksWidth + n+bricksWidth, i * bricksHeight + 54+q);
                    g.drawLine(j * bricksWidth + l, i * bricksHeight + m, j * bricksWidth + 84+q,i * bricksHeight + o+bricksHeight);
                    g.setStroke(new BasicStroke(6));
                    g.setColor(Color.black);
                    g.drawRect(j * bricksWidth + 80+f, i * bricksHeight + 50, bricksWidth, bricksHeight); 
                    
                    //g.setColor(Color.black);
                   // g.draw3DRect(j * bricksWidth + 80+f, i * bricksHeight + 50, bricksWidth, bricksHeight, true);

                }

            }

        }
        
    }
    public void setBricksValue(int value,int row,int col)
    {
        map[row][col] = value;
        mind=true;
        mx=row;
        my=col;

    }


}
