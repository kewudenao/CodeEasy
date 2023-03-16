package Observer.Impl;

import java.util.*;

/**
 *  publish event
 */
public class EventManager {
    Map<String,List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... listeners) {
        Arrays.stream(listeners).forEach(o->this.listeners.put(o,new ArrayList<>()));
    }

    public void subscribe(String eventType, EventListener event){
        List<EventListener> users = listeners.get(eventType);
        users.add(event);
    }

    public  void unsubscribe(String eventType,EventListener event){
        List<EventListener> users = listeners.get(eventType);
        users.remove(event);
    }

    public void notify(String eventType,String message){
        List<EventListener> users = listeners.get(eventType);
        users.forEach(o->o.update(eventType,message));
    }
}
