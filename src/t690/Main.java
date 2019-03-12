package t690;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/employee-importance/
 */

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee();
        e1.id = 1;
        e1.importance = 5;
        List<Integer> sub1 = new ArrayList<>();
        sub1.add(2);
        sub1.add(3);
        e1.subordinates = sub1;
        employees.add(e1);

        Employee e2 = new Employee();
        e2.id = 2;
        e2.importance = 3;
        List<Integer> sub2 = new ArrayList<>();
        e2.subordinates = sub2;
        employees.add(e2);

        Employee e3 = new Employee();
        e3.id = 3;
        e3.importance = 3;
        List<Integer> sub3 = new ArrayList<>();
        e3.subordinates = sub3;
        employees.add(e3);

        Main main = new Main();
        System.out.println(main.getImportance(employees, 1));
    }

    int sum = 0;

    public int getImportance(List<Employee> employees, int id) {

        if (id == 0) return 0;

        for (Employee employee : employees) {
            if (employee.id == id) {
                sum += employee.importance;
                for (int x : employee.subordinates) {
                    getImportance(employees, x);
                }
            }
        }
        return sum;
    }


}
