public class Teacher extends Person{

    private double salary;
    private int yearsWorked;

    public Teacher(String name, String address, String qualification, double salary, int yearsWorked) {

        super(name, address, qualification);

        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printTeacher() {
        super.udskrivPerson();
        System.out.println("Teachers salary: " + salary);
        System.out.println("Years worked at the institution: " + yearsWorked);
    }

    public void udskrivAdresse() {
        System.out.println("Address information: " + address);
    }

    public double yearSalary() {
        return salary * 12 * 1.125;
    }
}
