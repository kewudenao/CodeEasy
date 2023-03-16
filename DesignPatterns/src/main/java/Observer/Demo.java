package Observer;

import Observer.Impl.Editor;
import Observer.Impl.EmailNotificationListener;
import Observer.Impl.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open",new LogOpenListener());
        editor.events.subscribe("save",new EmailNotificationListener("emailAddress"));

        editor.sendMessage("测试");
        editor.saveMessage("测试");
    }
}
