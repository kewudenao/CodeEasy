package Observer.Impl;

public class EmailNotificationListener implements EventListener{

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    /**
     * 1.在数据 中通过eventType查找对应的邮件发送对象
     * 2.将邮件发送给MQ
     *
     * @param eventType
     * @param message
     */
    @Override
    public void update(String eventType, String message) {
        System.out.println("Email to"+email+"Some one want this message"+message);
    }
}
