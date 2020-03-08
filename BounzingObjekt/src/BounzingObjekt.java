/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vicky
 */
import javax.swing.*;
import java.util.*;
import java.awt.*;
public class BounzingObjekt extends JPanel{
    public ArrayList<Objekt> objekts;
    public Color[] colors;
    public int n;
    public BounzingObjekt(int num) {
        n = num;
        Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
        objekts = new ArrayList<Objekt>();
            int r = (int)(Math.random() * colors.length);
            int r2 = (int)(Math.random() * colors.length);
            Color[] c1 = {colors[r], colors[r2]};
            objekts.add(new Objekt(c1, (int)(Math.random() * 1600), (int)(Math.random() * 830), true, true));
    }
    
    public void update(Graphics window) {
        paint(window);
    }
    
    public void paint(Graphics window) {
        window.setColor(Color.BLACK);
        window.fillRect(0, 0, 1600, 830);
        if (objekts.size() < n) {
        Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
        int r = (int)(Math.random() * colors.length);
        int r2 = (int)(Math.random() * colors.length);
        Color[] c1 = {colors[r], colors[r2]};
        objekts.add(new Objekt(c1, (int)(Math.random() * 1600), (int)(Math.random() * 830), true, true));
        }
        for (int  i = 0; i < objekts.size(); i++) {
            objekts.get(i).drawObjekt(window);
        }
        System.out.println("h");
        
        repaint();
    }
}
