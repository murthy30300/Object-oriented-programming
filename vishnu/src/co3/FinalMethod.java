package co3;
interface Printable{
void print();
}

interface Showable extends Printable{
void show();
}

class FinalMethod implements Showable{

public void print(){System.out.println("Hello");}
public void show(){System.out.println("Welcome");}

public static void main(String args[])
{
FinalMethod obj = new FinalMethod();
obj.print();
obj.show();
 }
}

