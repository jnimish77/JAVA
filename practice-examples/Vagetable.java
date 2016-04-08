package shakbhaji;
class Vegetable
{
	
	void Vegetable()
	{
	
	}
	
	
}

class tomato extends Vegetable
{
  void tomato()
  {
	  Vegetable();
	  System.out.println("$ Tomato");
  }
  
}

class lettuce extends Vegetable
{
  void lettuce()
  {
	  Vegetable();
	  System.out.println("$ Lettuce");
  }
  
}

class cabbage extends Vegetable
{
  void cabbage()
  {
	  Vegetable();
	  System.out.println("$ Cabbage");
  }
  
}

class VegeFamily
{
	public static void main(String[] args)
	{
	  Vegetable objv = new Vegetable();
	  tomato objt = new tomato();
	  lettuce objl = new lettuce();
	  cabbage objc = new cabbage();
	  System.out.println("$ java VegeSequence");
	  objt.tomato();
	  objl.lettuce();
	  objc.cabbage(); 
	}
}
