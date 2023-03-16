package Observer.Impl;

import com.sun.tools.javac.util.StringUtils;

public class Editor {
    public EventManager events;
    private String message;

    public Editor() {
        this.events = new EventManager("open","save");
    }

    public void sendMessage(String message){
        this.message = message;
        events.notify("open",message);
    }

    public void saveMessage(String message){
        events.notify("save",message);
    }
}
