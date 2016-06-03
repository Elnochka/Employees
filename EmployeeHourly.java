package employees;

/**
 * Created by Елена on 31.05.16.
 */
public class EmployeeHourly extends Employee {
    double hourly;

    public EmployeeHourly(int id, String name, double hourly) {
        super(id, name);
        this.hourly = hourly;
    }

    @Override
    public double avrSalary() {
        return 20.8 * 8 * hourly;
    }
}
