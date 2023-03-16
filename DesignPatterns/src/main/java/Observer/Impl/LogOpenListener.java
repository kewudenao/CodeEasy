package Observer.Impl;

public class LogOpenListener implements EventListener{



    /**
     *  将日志信息推送给对应的MQ
     * @param eventType
     * @param message
     */
    @Override
    public void update(String eventType, String message) {

    }
}
