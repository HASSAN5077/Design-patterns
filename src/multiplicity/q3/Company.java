package multiplicity.q3;

import multiplicity.q1.Employee;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    BoardOfDirectors boardOfDirector;

    public Company(String name, BoardOfDirectors bd) {
        this.name = name;
        this.boardOfDirector = bd;
    }

}
