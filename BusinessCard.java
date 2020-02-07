/***************************************************************
* BusinessCard - A digital business card to give information
* about my services as a super rad climbing coach.
* 
* @author - Jon Rabideau
* 
* @version - 1.0.0 9/19/2019
**************************************************************/
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.lang.Object;
import java.util.*;
import java.awt.*;
public class BusinessCard extends JPanel{
 public static void main(String[] a) {
 JFrame f = new JFrame();
 f.setContentPane(new BusinessCard());
 f.setSize(500, 300);
 f.setVisible(true);
 while (true) {
       f.repaint();
    }
 
 }
 public void paintComponent(Graphics g){
 
//Mouse mov (adapted from lab3)
Point p = MouseInfo.getPointerInfo().getLocation();
int xMouse = (int)p.getX();
int yMouse = (int)p.getY() - 300;
int wallC = 300;
int wallB = -300;

if (yMouse > 300) {
     yMouse = 300;}     

 

    
 //Font definitions    
 Font arial = new Font("arial", Font.BOLD, 20);
 Font timesI = new Font("times", Font.ITALIC, 18);
 Font times = new Font("times", Font.PLAIN, 14);
 Font arialS = new Font("arial", Font.BOLD, 26);
 Font timesS = new Font("times", Font.PLAIN, 16);
 
 //Color definitions
 Color myBlue = new Color (30, 227, 201);
 Color myYellow = new Color (252, 186, 3);
 Color myPurple = new Color (73, 10, 87);
 Color myPink = new Color (227, 30, 108);
 
 // this statement required
 super.paintComponent(g);
 
 // Background Color)
 setBackground(Color.GRAY);
 
  // Background
  BufferedImage photo = null;
try {
File background = new File("back2.jpg");
photo = ImageIO.read(background);
}
catch (IOException e){
g.drawString("Problem reading the file", 100, 100);
}
g.drawImage(photo, 0, 0, 500, 300, null);
 

 
 //Wall Border
 g.setColor(myYellow);
 g.fillRect(370, 0, 130, 1000);
 
 g.setColor(myBlue);
 g.fillRect(372, 0, 130, 1000);

 // Climbing wall
 g.setColor(myPurple);
 g.fillRect(374, 0, 130, 1000);
 
 //Grid Wall
 
 //Vertical Lines
 g.setColor(myBlue);
 g.fillRect(412, 0 , 2, 1000);
 g.fillRect(452, 0 , 2, 1000);
 g.fillRect(492, 0 , 2, 1000);
 
 //Horizontal Lines
 g.fillRect(372, -yMouse + 40 * -10, 130, 2);
 g.fillRect(372, -yMouse + 40 * -9, 130, 2);
 g.fillRect(372, -yMouse + 40 * -8, 130, 2);
 g.fillRect(372, -yMouse + 40 * -7, 130, 2);
 g.fillRect(372, -yMouse + 40 * -6, 130, 2);
 g.fillRect(372, -yMouse + 40 * -5, 130, 2);
 g.fillRect(372, -yMouse + 40 * -4, 130, 2);
 g.fillRect(372, -yMouse + 40 * -3, 130, 2);
 g.fillRect(372, -yMouse + 40 * -2, 130, 2);
 g.fillRect(372, -yMouse + 40 * -1, 130, 2);
 g.fillRect(372, -yMouse, 130, 2);
 g.fillRect(372, -yMouse + 40 * 1, 130, 2);
 g.fillRect(372, -yMouse + 40 * 2, 130, 2);
 g.fillRect(372, -yMouse + 40 * 3, 130, 2);
 g.fillRect(372, -yMouse + 40 * 4, 130, 2);
 g.fillRect(372, -yMouse + 40 * 5, 130, 2);
 g.fillRect(372, -yMouse + 40 * 6, 130, 2);
 g.fillRect(372, -yMouse + 40 * 7, 130, 2);
 g.fillRect(372, -yMouse + 40 * 8, 130, 2);
 g.fillRect(372, -yMouse + 40 * 9, 130, 2);
 g.fillRect(372, -yMouse + 40 * 10, 130, 2);
 g.fillRect(372, -yMouse + 40 * 11, 130, 2);
 g.fillRect(372, -yMouse + 40 * 12, 130, 2);

//Wall Holds

//Set 1

 //Red Holds
 g.setColor(myBlue);
 //Hold 1 (Starting from the top)
 int[] xpoints = new int[] {385, 400, 413};
 int[] ypoints = new int[] {-yMouse + 5, -yMouse + 27, -yMouse + 12};
 g.fillPolygon(xpoints , ypoints, 3);
 //Hold 2
 int[] xpoints2 = new int[] {382, 415, 409, 390};
 int[] ypoints2 = new int[] {-yMouse + 112, -yMouse + 122, -yMouse + 98, -yMouse + 105};
 g.fillPolygon(xpoints2, ypoints2, 4);
 //Hold 3
 int[] xpoints3 = new int[] {425, 468, 409};
 int[] ypoints3 = new int[] {-yMouse + 156, -yMouse + 175, -yMouse + 160};
 g.fillPolygon(xpoints3, ypoints3, 3);
 //Hold 4
 int[] xpoints4 = new int[] {383, 398, 409};
 int[] ypoints4 = new int[] {-yMouse + 215, -yMouse + 226, -yMouse + 208};
 g.fillPolygon(xpoints4, ypoints4, 3);
 
 //Blue Holds
 g.setColor(myPink);
 //Hold 1 (Starting from the top)
 int[] xpoints5 = new int[] {437, 444, 460};
 int[] ypoints5 = new int[] {-yMouse + 10, -yMouse + 33, -yMouse + 12};
 g.fillPolygon(xpoints5, ypoints5, 3);
 //Hold 2
 int[] xpoints6 = new int[] {388, 400, 425, 430};
 int[] ypoints6 = new int[] {-yMouse + 55, -yMouse + 43, -yMouse + 60, -yMouse + 72};
 g.fillPolygon(xpoints6, ypoints6, 4);
 //Hold 3
 int[] xpoints7 = new int[] {440, 450, 463};
 int[] ypoints7 = new int[] {-yMouse + 118, -yMouse + 145, -yMouse + 136};
 g.fillPolygon(xpoints7, ypoints7, 3);
 //Hold 4
 int[] xpoints8 = new int[] {433, 456, 468};
 int[] ypoints8 = new int[] {-yMouse + 250, -yMouse + 223, -yMouse + 268};
 g.fillPolygon(xpoints8, ypoints8, 3);
 
//Holds set 2

 //Red Holds
 g.setColor(myPink);
 //Hold 1 (Starting from the top)
 int[] xpointsB = new int[] {385, 400, 413};
 int[] ypointsB= new int[] {-yMouse + wallB + 5, -yMouse + wallB + 27, -yMouse + wallB + 12};
 g.fillPolygon(xpointsB, ypointsB, 3);
 //Hold 2
 int[] xpointsB2 = new int[] {382, 415, 409, 390};
 int[] ypointsB2 = new int[] {-yMouse + wallB + 112, -yMouse + wallB + 122, -yMouse + wallB + 98, -yMouse + wallB + 105};
 g.fillPolygon(xpointsB2, ypointsB2, 4);
 //Hold 3
 int[] xpointsB3 = new int[] {425, 468, 409};
 int[] ypointsB3 = new int[] {-yMouse + wallB + 156, -yMouse + wallB + 175, -yMouse + wallB + 160};
 g.fillPolygon(xpointsB3, ypointsB3, 3);
 //Hold 4
 int[] xpointsB4 = new int[] {383, 398, 409};
 int[] ypointsB4 = new int[] {-yMouse + wallB + 215, -yMouse + wallB + 226, -yMouse + wallB + 208};
 g.fillPolygon(xpointsB4, ypointsB4, 3);
 
 //Blue Holds
 g.setColor(myYellow);
 //Hold 1 (Starting from the top)
 int[] xpointsB5 = new int[] {437, 444, 460};
 int[] ypointsB5 = new int[] {-yMouse + wallB + 10, -yMouse + wallB + 33, -yMouse + wallB + 12};
 g.fillPolygon(xpointsB5, ypointsB5, 3);
 //Hold 2
 int[] xpointsB6 = new int[] {388, 400, 425, 430};
 int[] ypointsB6 = new int[] {-yMouse + wallB + 55, -yMouse + wallB + 43, -yMouse + wallB + 60, -yMouse + wallB + 72};
 g.fillPolygon(xpointsB6, ypointsB6, 4);
 //Hold 3
 int[] xpointsB7 = new int[] {440, 450, 463};
 int[] ypointsB7 = new int[] {-yMouse + wallB + 118, -yMouse + wallB + 145, -yMouse + wallB + 136};
 g.fillPolygon(xpointsB7, ypointsB7, 3);
 //Hold 4
 int[] xpointsB8 = new int[] {433, 456, 468};
 int[] ypointsB8 = new int[] {-yMouse + wallB + 250, -yMouse + wallB + 223, -yMouse + wallB + 268};
 g.fillPolygon(xpointsB8, ypointsB8, 3);
 
//Holds set 3

 //Red Holds
 g.setColor(myBlue);
 //Hold 1 (Starting from the top)
 int[] xpointsC = new int[] {385, 400, 413};
 int[] ypointsC= new int[] {-yMouse + wallC + 5, -yMouse + wallC + 27, -yMouse + wallC + 12};
 g.fillPolygon(xpointsC, ypointsC, 3);
 //Hold 2
 int[] xpointsC2 = new int[] {382, 415, 409, 390};
 int[] ypointsC2 = new int[] {-yMouse + wallC + 112, -yMouse + wallC + 122, -yMouse + wallC + 98, -yMouse + wallC + 105};
 g.fillPolygon(xpointsC2, ypointsC2, 4);
 //Hold 3
 int[] xpointsC3 = new int[] {425, 468, 409};
 int[] ypointsC3 = new int[] {-yMouse + wallC + 156, -yMouse + wallC + 175, -yMouse + wallC + 160};
 g.fillPolygon(xpointsC3, ypointsC3, 3);
 //Hold 4
 int[] xpointsC4 = new int[] {383, 398, 409};
 int[] ypointsC4 = new int[] {-yMouse + wallC + 215, -yMouse + wallC + 226, -yMouse + wallC + 208};
 g.fillPolygon(xpointsC4, ypointsC4, 3);
 
 //Blue Holds
 g.setColor(myYellow);
 //Hold 1 (Starting from the top)
 int[] xpointsC5 = new int[] {437, 444, 460};
 int[] ypointsC5 = new int[] {-yMouse + wallC + 10, -yMouse + wallC + 33, -yMouse + wallC + 12};
 g.fillPolygon(xpointsC5, ypointsC5, 3);
 //Hold 2
 int[] xpointsC6 = new int[] {388, 400, 425, 430};
 int[] ypointsC6 = new int[] {-yMouse + wallC + 55, -yMouse + wallC + 43, -yMouse + wallC + 60, -yMouse + wallC + 72};
 g.fillPolygon(xpointsC6, ypointsC6, 4);
 //Hold 3
 int[] xpointsC7 = new int[] {440, 450, 463};
 int[] ypointsC7 = new int[] {-yMouse + wallC + 118, -yMouse + wallC + 145, -yMouse + wallC + 136};
 g.fillPolygon(xpointsC7, ypointsC7, 3);
 //Hold 4
 int[] xpointsC8 = new int[] {433, 456, 468};
 int[] ypointsC8 = new int[] {-yMouse + wallC + 250, -yMouse + wallC + 223, -yMouse + wallC + 268};
 g.fillPolygon(xpointsC8, ypointsC8, 3);
 
 
// Climbing guy
 
try {
File file = new File("climbing-manYellow.gif");
photo = ImageIO.read(file);
}
catch (IOException e){
g.drawString("Problem reading the file", 100, 100);
}
g.drawImage(photo, 375, yMouse, 100, 150, null);

// Picture of me
int xMe = 0;
int yMe = 0;

try {
File me = new File("meL2.gif");
photo = ImageIO.read(me);
}
catch (IOException e){
g.drawString("Problem reading the file", 100, 100);
}
g.drawImage(photo, xMe + -25, yMe + 0, 300, 300, null);


 // Busines and motto
 
 //Background Border
   g.setColor(myBlue);
 int[] topX1 = new int [] {490, 115, 195, 490};
 int[] topY1 = new int [] {198, 198, 247, 247};
 g.fillPolygon(topX1, topY1, 4);
 
 //Background
  g.setColor(myPink);
 int[] topX = new int [] {500, 125, 200, 500};
 int[] topY = new int [] {200, 200, 245, 245};
 g.fillPolygon(topX, topY, 4);
 
 //Top Words Shadow
 g.setColor(myPurple);
 g.setFont(arial);
 g.drawString("Get Over It: Climbing Coaching" , 181, 221);
 
 //Bottom Words Shadow
 g.setColor(myPurple);
 g.setFont(timesI);
 g.drawString("We'll help you reach the top!" , 244, 240);
 
 //Top Words
   g.setColor(myYellow);
 g.setFont(arial);
 g.drawString("Get Over It: Climbing Coaching" , 182, 220);
 
 //Bottom Words
 g.setColor(myBlue);
 g.setFont(timesI);
 g.drawString("We'll help you reach the top!" , 245, 239);
 
  //Name and contact info shadows
  
  int xName = -40;
  int yName = -10;
  int xName2 = -30;
 
 //Back Shadow 
 g.setColor(myPurple);
 g.setFont(arialS);
 g.drawString("Jon Rabideau" , xName + 212, yName + 98);
 g.setColor(myPurple);
 g.setFont(timesS);
 g.drawString("jon@getoveritclimbing.com" , xName2 + 193, yName + 118);
 
 //Middle Shadow
 g.setColor(myPink);
 g.setFont(arialS);
 g.drawString("Jon Rabideau" , xName + 213, yName + 99);
 g.setColor(myPink);
 g.setFont(timesS);
 g.drawString("jon@getoveritclimbing.com" , xName2 + 194, yName + 119);

 
 // My name and contact info (front)
 g.setColor(myYellow);
 g.setFont(arialS);
 g.drawString("Jon Rabideau" , xName + 215, yName + 100);
 g.setColor(myYellow);
 g.setFont(timesS);
 g.drawString("jon@getoveritclimbing.com" , xName2 + 195, yName + 120);
 

 


 }
}
