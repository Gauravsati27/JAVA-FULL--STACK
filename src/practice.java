
class Singleton
{
    private static Singleton instance;

    static
    {
        instance = new Singleton();
        System.out.println("Static Block: Singleton Instance Created");
    }

    private Singleton()
    {
        System.out.println("Constructor: Singleton Object Created");
    }

    public static Singleton getInstance()
    {
        return instance;
    }

    public void greet()
    {
        System.out.println("Hello Everyone!!!");
    }
}
public class practice{
    public static void main(String[] args)
    {
        System.out.println("Main Method");
        Singleton obj1 = Singleton.getInstance();
        obj1.greet();
    }
}