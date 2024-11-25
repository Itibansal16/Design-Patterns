import java.util.List;

public class CommentaryImpl implements Commentary, Subject{

    private final List<Observer> observers;
    private String desc;
    private final String subjectDetails;

    public CommentaryImpl(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObserver();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        System.out.println();
        if(observers.size() == 0) {
            System.out.println("No subscribers");
        } else {
            System.out.println("Sending updates to Subscribers");
        }
        observers.stream().forEach(observer -> observer.update(this.desc));
    }

    @Override
    public String getSubjectDetails (){
        return this.subjectDetails;
    }

}
