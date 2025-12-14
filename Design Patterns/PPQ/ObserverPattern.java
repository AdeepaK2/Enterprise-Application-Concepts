import java.util.List;

import javax.management.Notification;

public class ObserverPattern {
public static void main(String[] args) {
    NotificationSystem notificationSystem = new NotificationSystem();

    Doctor d1=new Doctor("Smith");
    Doctor d2=new Doctor("Johnson");

    notificationSystem.addObserver(d1);
    notificationSystem.addObserver(d2);

    notificationSystem.notifyObservers("New patient admitted.");
}
}

interface Observer{
  public void update(String message);
}

interface Subject{
  public void addObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers(String message);
}

class Doctor  implements Observer{
  private String name;

  public Doctor(String name){
    this.name=name;
  }
  public void update(String message){
    System.out.println("Doctor "+name+" received update: "+message);
  }
}

public NotificationSystem implements Subject{
  private List<Observer> observers = new ArrayList<>();

  public void addObserver(Observer o){
    observers.add(o)
  }

  public void removeObserver(Observer o){
    observers.remove(o);
  }

  public void notifyObservers(String message){
    for(Observer o:observers){
      o.update(message);
    }
  }
}