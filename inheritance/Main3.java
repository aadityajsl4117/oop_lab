class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    void displayManager() {
        System.out.println("Team Size: " + teamSize);
    }
}

class ProjectManager extends Manager {
    String projectName;

    ProjectManager(String name, double salary, int teamSize, String projectName) {
        super(name, salary, teamSize);
        this.projectName = projectName;
    }

    void displayProject() {
        System.out.println("Project Name: " + projectName);
    }
}

public class Main3 {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager("Rahul", 50000, 10, "Website Development");

        pm.displayEmployee();
        pm.displayManager();
        pm.displayProject();
    }
}