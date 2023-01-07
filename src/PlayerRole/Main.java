package PlayerRole;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("ali");
        p1.addRole(new Admin());
        Player p2 = new Player("ahmad");
        p2.addRole(new Moderator());
        p1.getRoles();
        if(p1.hasRole(new Admin())){
            System.out.println("enter in admin");
            Role r1 = new Admin();
            r1.doTask();
        }
        if(p2.hasRole(new Moderator())){
            Role r2 = new Moderator();
            r2.doTask();
        }
    }
}
