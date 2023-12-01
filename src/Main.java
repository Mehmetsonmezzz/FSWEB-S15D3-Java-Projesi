import com.workintech.company.Employee;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList=new LinkedList<>();
        employeeList.add(new Employee
                (1,"Mehmet","Sonmez"));
        employeeList.add(new Employee
                (1,"ahmet","Sonmez"));
        employeeList.add(new Employee
                (4,"Ali","Veli"));
        employeeList.add(new Employee
                (4,"Yunus","Öz"));
        employeeList.add(new Employee
                (5,"Ugurcan","Yıldız"));
        employeeList.add(new Employee
                (6,"Umut","Çavuş"));


        System.out.println(employeeList);



        List<Employee> duplicateList=new LinkedList<>();
        Map<Integer,Employee> uniqueMap=new HashMap<>();


        for(Employee employee: employeeList){
            if (uniqueMap.containsKey(employee.getId())){
                duplicateList.add(employee);
            }else {
                uniqueMap.put(employee.getId(),employee);
            }

        }
        employeeList.removeAll(duplicateList);

        System.out.println("*****************");
        System.out.println("duplicate"+duplicateList);

    }
}