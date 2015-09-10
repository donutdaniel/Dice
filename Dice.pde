void setup()
{
	size(610,610);
	background(255, 255, 255);
	noLoop();
}
void draw()
{
	int y1;
	int x1;
	for(y1=10;y1<=600;y1=y1+35) {
			for(x1=10;x1<=600;x1=x1+35){
				Die bob = new Die(x1,y1);
				bob.roll();
				bob.show();
			}
			x1=10;
		}
}
void mousePressed()
{
	redraw();
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
	void roll()
	{
		number=(int)(Math.random()*6+1);
	}
	
	void show()
	{
		fill(0);
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
					ellipse(myX+7.5,myY+7.5,5,5);
					ellipse(myX+15,myY+15,5,5);
					ellipse(myX+22.5,myY+22.5,5,5);
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
					ellipse(myX+10,myY+7.5,5,5);
					ellipse(myX+10,myY+15,5,5);
					ellipse(myX+10,myY+22.5,5,5);
					ellipse(myX+20,myY+7.5,5,5);
					ellipse(myX+20,myY+15,5,5);
					ellipse(myX+20,myY+22.5,5,5);
					break;
			}
	}
}
