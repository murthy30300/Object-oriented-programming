package co1;
class Q {
  public void disp() {
    System.out.println("java");
  }
}

class P extends Q {
  public void disp() {
    Q.super.disp();
    System.out.println("nptel");
  }
}

class C extends P {
  public void disp() {
    P.super.disp();
    System.out.println("course");
  }
}

public class Account {
  public static void main(String[] args) {
    C c = new C();
    c.disp();
  }
}
