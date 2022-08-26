public class Message {
    private String messageContent;
    private String messageNext;

    public Message(String messageContent){
        this.messageContent = messageContent;
        this.messageNext = null;
    }
    public String getMessageContent() {
        return messageContent;
    }
    public void setMessageContent(String messageContent){
        this.messageContent = messageContent;
    }
    public String getMessageNext(){
        return  messageNext;
    }
    public void setMessageNext(){
        this.messageNext = messageNext;
    }
}
