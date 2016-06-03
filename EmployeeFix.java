package employees;

/**
 * Created by Елена on 31.05.16.
 */
public class EmployeeFix extends Employee {
    double fix;

    public EmployeeFix(int id, String name, double fix) {
        super(id, name);
        this.fix = fix;
    }

    @Override
    public double avrSalary() {
        return fix;
    }
}
