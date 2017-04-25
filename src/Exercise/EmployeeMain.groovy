package Exercise

class EmployeeMain {
    static void main(String[] args) {
        Employee employee = new Employee(name: "Akhil", age: 24, gender: "Male", address: "Kalkaji, New Delhi", empId: 1, companyName: "TTN", salary: 15000);

        println employee;
        println("Employee Name: ${employee.name}")
        println("Employee Age: ${employee.getAge()}")
        println("Employee Gender: ${employee.gender}")
        println("Employee Address: ${employee.getAddress()}")

        println("Employee ID: ${employee.getEmpId()}")
        println("Employee Company Name: ${employee.companyName}")
        println("Employee Salary: ${employee.getSalary()}")

    }
}
