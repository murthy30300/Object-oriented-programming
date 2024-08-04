package co2;
//singleton class
class Captainn{
    private static Captainn c = null;
    private String name;

    private Captainn(String name) {
        this.name = name;
    }

    public static Captainn getInstance(String name) {
        if (c == null) {
            c = new Captainn(name);
        }
        return c;
    }

    public String toString() {
        return "The captain name is " + name;
    }
}

public class classDemo {
    public static void main(String[] args) {
        Captainn cricket = Captainn.getInstance("kohli");
        System.out.println(cricket);
        Captainn football = Captainn.getInstance("bootia");
        System.out.println(football);
    }
}
