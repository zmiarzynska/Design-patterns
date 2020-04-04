class Singleton {
    private static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}


class TestSingleton{

    public static void main(String a[]){
       Singleton singleton= Singleton.getInstance();
       System.out.println(singleton);
       Singleton singleton2= Singleton.getInstance();
       System.out.println(singleton2);
    }
}