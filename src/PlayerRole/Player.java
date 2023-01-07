package PlayerRole;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Role> roles;
    public Player(String name) {
        this.name = name;
        roles = new ArrayList<Role>();
    }
    public void addRole(Role role) {
        roles.add(role);
    }

    public void removeRole(Role role) {
        roles.remove(role);
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
    public void getRoles(){
        for(int i = 0; i < roles.size(); i++){
            System.out.println(roles.get(i));
        }
    }
}
