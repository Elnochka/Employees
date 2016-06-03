package employees;

import java.util.Comparator;

/**
 * Created by Елена on 31.05.16.
 */
public class EmployeeCompare implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int salaryCompare = Double.compare(o2.avrSalary(), o1.avrSalary());
        if (salaryCompare != 0) {
            return salaryCompare;
        }

        return o1.getName().compareTo(o2.getName());

    }
}
