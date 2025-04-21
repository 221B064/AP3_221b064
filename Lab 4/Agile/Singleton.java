<<<<<<< HEAD

class Singleton {

    private static Singleton instance;
    private Singleton()
    {
        System.out.println("Singleton is Instantiated.");
    }
    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    public static void doSomething()
    {
        System.out.println("Somethong is Done.");
    }
}
class Main {
    public static void main(String[] args)
    {
        Singleton.getInstance().doSomething();
    }
}
=======

class Singleton {

    private static Singleton instance;
    private Singleton()
    {
        System.out.println("Singleton is Instantiated.");
    }
    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    public static void doSomething()
    {
        System.out.println("Somethong is Done.");
    }
}
class Main {
    public static void main(String[] args)
    {
        Singleton.getInstance().doSomething();
    }
}
>>>>>>> c8506a8661af3a9688f08ffebc07d00e1f958254
