package pl.coderslab.beans;

public class MessageSender {
    private String message;
    private MessageService messageService;


    //w beans.xml określono, źe EmailService, który implementuje MessageService ma być wstrzyknięty w tym konstruktorze
    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(){
        messageService.send();
    }
    public void sendMessageFromProperty(){
        messageService.send(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
