package Session8.HW4;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}
