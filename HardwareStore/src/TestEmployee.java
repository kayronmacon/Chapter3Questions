import com.hardwareStore.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee();
        employee.setFirstName("Kayron");
        employee.setLastName("Macon");
        employee1.setFirstName("Kiante");
        employee1.setLastName("Macon");
        employee.setMonthlySalary(3000.00);
        employee1.setMonthlySalary(4200.00);
        employee.raise(10);
        employee1.raise(10);
        System.out.println(employee1.getMonthlySalary());
        System.out.println(""+employee.getFirstName()+ " salary after raise: " +employee.getMonthlySalary() );
        System.out.println("");
        System.out.println("====================================================");
        System.out.println("");
        System.out.println(""+employee1.getFirstName()+ " salary after raise: " +employee1.getMonthlySalary() );

    }


}
