import java.util.ArrayList;
import java.util.List;

class Task26 {
    private String name;
    private double bonus;

    public Task26(String name, double bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}

class Project {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String name, double bonus) {
        tasks.add(new Task(name, bonus));
    }

    public double getFinishedTaskBonus() {
        return tasks.stream().mapToDouble(Task::getBonus).sum();
    }
}

public class Main {
    public static void main(String[] args) {