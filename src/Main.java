public class Main {
    public static void main(String[] args) {
        ConcreteChat chat = new ConcreteChat();
        Customer admin = new Customer("admin (Andrey)");
        admin.setChat(chat);

        Customer customerHalina = new Customer("Halina");
        customerHalina.setChat(chat);
        Customer customerNatalia = new Customer("Natalia");
        customerNatalia .setChat(chat);
        chat.setAdmin(admin);
        chat.addUser(customerHalina);
        chat.addUser(customerNatalia);
        admin.sendMessage("Hello");
        customerHalina.sendMessage("Hello, I'm Halina ");
        customerHalina.sendMessage("Hello, I'm Natalia ");
    }
}