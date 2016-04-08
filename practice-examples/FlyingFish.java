
public class FlyingFish {
		String name;
		int weight;
		float speed;
			FlyingFish()
			{
				name="unnamed";
				weight=3;
				speed=0;
				//System.out.println("Defalut Constructor called.");
			}
			FlyingFish(String a)
			{
				name=a;
				weight=3;
				speed=0;
				//System.out.println("Constructor with string argument called.");
			}
			FlyingFish(String a, int b)
			{
				name=a;
				weight=b;
				speed=0;
				//System.out.println("Constructor with string and integer argument called.");
			}
			FlyingFish(String a, int b, float c)
			{
				name=a;
				weight=b;
				speed=c;
				//System.out.println("Constructor with all argument called.");
			}
			public  String toString()
			{
//		       System.out.print("\nName="+name);
//		       System.out.print("\nWeight="+weight);
//		       System.out.print("\nSpeed="+speed);
//		       System.out.print("\n");
		       return "\nName="+name+"\nWeight="+weight+"\nSpeed="+speed+"\n";
		    }
			public  void gainWeight()
			{
				this.weight+=1;
			}
			public  void gainWeight(int w)
			{
				this.weight+=w;
			}
			public void speedUp()
			{
				this.speed+=0.2f;
			}
			public  void speedUp(float s)
			{
				this.speed+=s;
			}
			public static void main(String[] args)
			{
				  int i=args.length;
				  FlyingFish obj[] = new FlyingFish[i];	
				  for(i=0;i<args.length;i++)
				  {
					  	obj[i] = new FlyingFish(args[i]);
				  		obj[i].speedUp();
				  		obj[i].gainWeight(2);
				  		System.out.print(obj[i].toString());
				 }
			}
		}


