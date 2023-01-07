package PlayerRole;

public class Moderator implements Role{
    @Override
    public void doTask() {
        //perform user actions
        System.out.println("Performing moderator actions.");
    }
}
