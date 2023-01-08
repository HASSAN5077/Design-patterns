package multiplicity.q2;


import java.util.ArrayList;
import java.util.List;

public class Manager {
    private String name;
    private List<AdministrativeAssistant> administrativeAssistantList;

    public Manager(String name) {
        this.name = name;
        administrativeAssistantList = new ArrayList<>();
    }

    public void addAdministrativeAssistant(AdministrativeAssistant adm){
        administrativeAssistantList.add(adm);
    }

    public void removeAdministrativeAssistant(AdministrativeAssistant adm){
        administrativeAssistantList.remove(adm);
    }

    public int getNoOfAdministrativeAssistant(){
        return administrativeAssistantList.size();
    }
}
