public interface Subject {
    void subscribeObserver(Observer observer);
    void unSubscribeObserver(Observer observer);
    void notifyObserver();
    String getSubjectDetails();
}
