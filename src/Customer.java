public class Customer implements User {
    String name;
   private Chat chat;

    public Customer(String name) {
        this.name= name;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
      chat.broadcastMessage(name, message);

    }

    @Override
    public void getMessage(String message) {
        System.out.println(message);
    }
}
