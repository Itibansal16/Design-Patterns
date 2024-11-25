public class Main {
    public static void main(String[] args) {
       Singleton singleton = Singleton.getInstance();
       singleton.setField1("field1 initial");
       singleton.setField2("field2 initial");

       System.out.println(singleton.getField1() + " " + singleton.getField2() + " " + singleton);

       Singleton singleton1 = Singleton.getInstance();
       singleton1.setField2("field2 edited");
       System.out.println(singleton1.getField1() + " " + singleton1.getField2() + " " + singleton1);
        System.out.println(singleton.getField1() + " " + singleton.getField2() + " " + singleton);
    }
}