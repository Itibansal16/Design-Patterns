public class ObserverImpl implements Observer{
    private Subject subject;
    private String desc;
    private String userInfo;

    public ObserverImpl(Subject subject, String userInfo) {
        this.subject = subject;
        this.userInfo = userInfo;
    }

    @Override
    public void subscribe() {
        System.out.println();
        System.out.println("Subscribing " + userInfo + " to " + subject.getSubjectDetails() + "...");
        this.subject.subscribeObserver(this);
        System.out.println("subscribed");
    }

    @Override
    public void unsubscribe() {
        System.out.println();
        System.out.println("UnSubscribing " + userInfo + " to " + subject.getSubjectDetails() + "...");
        this.subject.unSubscribeObserver(this);
        System.out.println("unSubscribed");
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
        System.out.println(this.userInfo + "-new update --->>> " + this.desc);
    }
}
