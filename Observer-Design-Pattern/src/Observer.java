public interface Observer {
    void subscribe();
    void unsubscribe();
    void update(String desc);
}
