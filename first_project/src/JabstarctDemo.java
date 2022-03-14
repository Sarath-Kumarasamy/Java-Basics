abstract class Writer //abstract class
{
	abstract public void write(); //abstract method
	public void draw()
	{
		System.out.println("hello writer-draw");
	}
}
class Pencil extends Writer
{
	public void write()  //abstract method implement in sub class
	{
		System.out.println("Brief notes using pencil");
	}
}
class Pen extends Writer
{
	public void write()  //abstract method implement in sub class
	{
		System.out.println("Essay para using pen");
	}
}
public class JabstarctDemo {

	public static void main(String[] args) {
		
		Pen open = new Pen();
		open.write();
		
		Pencil opencil = new Pencil();
		opencil.write();
		
		opencil.draw();  // method of abstact class is called with sub class object

	}

}
