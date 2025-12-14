import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
  public static void main(String[] args) {
    
  }
}

interface Observer{
  void update(String message);
}

interface Subject{
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers(String message);
}

class YoutubeChannel implements Subject {
  private List<Observer> observers=new ArrayList<>();
  private String latestVideo;

  public void registerObserver(Observer observer){
    observers.add(observer);
  }

  public void removeObserver(Observer observer){
    observers.remove(observer);
  }

  public void notifyObservers(String message){
    for(Observer observer : observers){
      observer.update(message);
    }
  }

  public void uploadVideo(String videoTitle){
    this.latestVideo = videoTitle;
    notifyObservers("New video uploaded: " + videoTitle);
  }
}

class Subscriber implements Observer {
  private String name;

  public Subscriber(String name){
    this.name=name;
  }

  @Override
  public void update(String message){
    System.out.println(name + " received update: " + message);
  }
}