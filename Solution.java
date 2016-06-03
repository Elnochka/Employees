package employees;

import java.io.*;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

/**
 * Created by Елена on 31.05.16.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new EmployeeHourly(1, "name1", 20));
        list.add(new EmployeeHourly(2, "name2", 15));
        list.add(new EmployeeFix(3, "name3", 400));
        list.add(new EmployeeFix(4, "name4", 450));
        list.add(new EmployeeHourly(5, "name5", 15));
        list.add(new EmployeeHourly(6, "name6", 25));
        list.add(new EmployeeFix(7, "name6", 350));

        Collections.sort(list, new EmployeeCompare());
        for (Employee str: list)
        {
            System.out.println("ID " + str.getId() + " ,name " + str.getName() + " ,average " + str.avrSalary());
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < list.size(); i++)
        {
            if (i == 5)
                break;

            System.out.println("ID " + list.get(i).getId() + " ,name " + list.get(i).getName() + " ,average " + list.get(i).avrSalary());
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - 1 - i;
            if (i == 3)
                break;

            System.out.println("ID " + list.get(j).getId() + " ,name " + list.get(j).getName() + " ,average " + list.get(j).avrSalary());
        }

        System.out.println();
        System.out.println();

        FileWriter os = new FileWriter("C:/data.txt");
        FileReader is = new FileReader("C:/data.txt");
        for (Employee str: list)
        {

            String s = ("ID " + str.getId() + " ,name " + str.getName() + " ,average " + str.avrSalary());

            os.write(s + "\r" + "\n");
        }
        os.close();

        BufferedReader reader = new BufferedReader(is);
        while (reader.ready())
        {

            String str = reader.readLine();
            System.out.println(str);

        }
        reader.close();
        is.close();







    }
}
