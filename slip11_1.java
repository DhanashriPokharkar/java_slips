/*Define an interface “Operation” which has method volume( ).Define a constant PI having a value
3.142 Create a class cylinder which implements this interface (members – radius,height). Create
one object and calculate the volume */


interface operation
{
	final static float pi=3.14f;
	float compute(float r,float h);
}
class area implements operation
{
		public float compute(float r,float h)
		{
			return(2*pi*r*r+2*pi*r*h);
		}
}

class volume implements operation
{
		public float compute(float r,float h)
		{
			return(pi*r*r*h);
		}
}

class operation1
{
	public static void main(String args[])
	{
		area a=new area();
		volume v=new volume();
		operation res;
		res=a;
		System.out.println("area="+res.compute(7.4f,10.2f));
		res=v;
		System.out.println("volume="+res.compute(7.2f,10.1f));
	}
}


