package PlayerRole;

public class Admin implements Role{
    @Override
    public void doTask() {
        //Perform admin actions
        System.out.println("Performing admin actions.");
    }
}
