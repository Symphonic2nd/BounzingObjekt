/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vicky
 */
import java.util.*;
import java.awt.*;
public class Objekt {
    public int x;
    public int y;
    public Color[] colors;
    public boolean up;
    public boolean right;
    
    public Objekt(Color[] c, int xc, int yc, boolean u, boolean r) {
        colors = c;
        x = xc;
        y = yc;
        up = u;
        right = r;
    }
    
    public void setX(int xc) {
        x = xc;
    }
    
    public void setY(int yc) {
        y = yc;
    }
    
    public void drawObjekt(Graphics window) {
        if (up) {
            y--;
        }
        else if (!up) {
            y++;
        }
        if (right) {
            x++;
        }
        else if (!right) {
            x--;
        }
        
        if (x == 1600) {
            right = false;
        }
        if (x == 0) {
            right = true;
        }
        if (y == 0) {
            up = false;
        }
        if (y == 830) {
            up = true;
        }
        
        window.setColor(colors[0]);
        window.fillRect(x, y, 30, 30);
        window.setColor(colors[1]);
        window.fillOval(x, y, 30, 30);
    }
}
  