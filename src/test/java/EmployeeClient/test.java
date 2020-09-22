package EmployeeClient;

public class test {
    public static void main(String args[]) throws Exception_Exception {
        EmployeeServiceService ESS=new EmployeeServiceService();
        EmployeeService ES=ESS.getEmployeeServicePort();
        System.out.println(ES.getEmployeesService());
    }
}
