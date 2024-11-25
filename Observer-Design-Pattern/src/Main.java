import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Commentary commentary = new CommentaryImpl(new ArrayList<>(), "Cricket Match Commentary");
//
//        Observer observer1 = new ObserverImpl(commentary, "Iti Bansal");
//        observer1.subscribe();
//
//        Observer observer2 = new ObserverImpl(commentary, "Anmol Bansal");
//        observer2.subscribe();
//
//        Observer observer3 = new ObserverImpl(commentary, "John Dae");
//        observer3.subscribe();
//
//        commentary.setDesc("Match has started");
//        commentary.setDesc("Virat Kohli on the spot");
//
//        observer1.unsubscribe();
//        commentary.setDesc("Virat Kohli has hit an iconic six");
        Observer observer = new ObserverImpl(commentary, "");
        System.out.println(observer.getClass());
    }
}