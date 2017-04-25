package Exercise
//@ToString(includeSuper = true)
class Employee extends Person {
    int empId;
    String companyName;
    double salary;

    @Override
    String toString() {
        Object.toString();
        return  "${Object.toString()} He works for ${companyName} with employee id ${empId} and draws \$ ${salary} lots of money !!!"
    }

}
