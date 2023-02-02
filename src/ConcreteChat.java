import java.util.ArrayList;
import java.util.List;

public class ConcreteChat implements  Chat{
    private List<User>userList= new ArrayList<>();
    private User admin;

    public ConcreteChat() {
    }

    public void setAdmin(User admin) {
        this.admin=admin;
        userList.add(admin);
    }

    void addUser (User user) {
        userList.add(user);
    }
    @Override
    public void broadcastMessage(String message, String name) {
        for (User user: userList){
            user.getMessage(name +" *** " +message);
        }
    }
}
