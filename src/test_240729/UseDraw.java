package test_240729;

public class UseDraw {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Diagram[] d = new Diagram[3];
		
		d[0] = new Triangle();		//업캐스팅
		d[1] = new Circle();		//업캐스팅
		d[2] = new Rectangle();	//업캐스팅
		
		if(d[0] instanceof Triangle)
		{
			Triangle tt = (Triangle)d[0]; //다운캐스팅
		}
		
		for(int i = 0; i < d.length; i++)
		{
			d[i].draw();
		}
	}

}
