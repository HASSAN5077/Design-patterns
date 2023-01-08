package multiplicity.q2;

import java.util.ArrayList;
import java.util.List;

public class AdministrativeAssistant {
    private String name;
    private List<Manager> managers;

    public AdministrativeAssistant(String name, Manager manager) {
        this.managers = new ArrayList<>();
        this.name = name;
        managers.add(manager);
    }

    public void addManager(Manager mn){
        managers.add(mn);
    }
    public void removeManager(Manager mn){
        managers.remove(mn);
    }
}
