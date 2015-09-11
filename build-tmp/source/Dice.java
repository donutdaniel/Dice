import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {


int colour=0;
public void setup()
{
	size(610,650);
	//background(255, 255, 255);
	noLoop();
}
public void draw()
{
	int y1;
	int x1;
	int sum=0;
	background(255);
	for(y1=10;y1<=600;y1=y1+35) {
			for(x1=10;x1<=600;x1=x1+35){
				Die bob = new Die(x1,y1);
				bob.roll();
				bob.show();
				sum=bob.number+sum;
			}
			x1=10;
		}
		textSize(30);
		fill(0);
		text(sum,280,630);
}
public void mousePressed()
{
	redraw();
	colour=0;
}
class Die //models one single dice cube
{
	int myX;
	int myY;
	int number;

	Die(int x, int y)
	{
		myX=x;
		myY=y;

	}
	public void roll()
	{
		number=(int)(Math.random()*6+1);
	}
	
	public void show()
	{
		colour=colour+1;
		fill(colour,0,colour);
		rect(myX, myY, 30, 30);
		fill(255);
			switch (number) {
				case 1:
					ellipse(myX+15,myY+15,5,5);
					break;
				case 2:
					ellipse(myX+10,myY+10,5,5);
					ellipse(myX+20,myY+20,5,5);
					break;
				case 3:
					ellipse(myX+7.5f,myY+7.5f,5,5);
					ellipse(myX+15,myY+15,5,5);
					ellipse(myX+22.5f,myY+22.5f,5,5);
					break;
				case 4:
					ellipse(myX+10,myY+10,5,5);
					ellipse(myX+20,myY+20,5,5);
					ellipse(myX+10,myY+20,5,5);
					ellipse(myX+20,myY+10,5,5);
					break;
				case 5:
					ellipse(myX+10,myY+10,5,5);
					ellipse(myX+20,myY+20,5,5);
					ellipse(myX+10,myY+20,5,5);
					ellipse(myX+20,myY+10,5,5);
					ellipse(myX+15,myY+15,5,5);
					break;
				case 6:
					ellipse(myX+10,myY+7.5f,5,5);
					ellipse(myX+10,myY+15,5,5);
					ellipse(myX+10,myY+22.5f,5,5);
					ellipse(myX+20,myY+7.5f,5,5);
					ellipse(myX+20,myY+15,5,5);
					ellipse(myX+20,myY+22.5f,5,5);
					break;
			}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
