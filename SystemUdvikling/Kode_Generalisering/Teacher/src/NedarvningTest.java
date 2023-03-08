public class NedarvningTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("model.Person:");

        Person person = new Person("Hanne", "Sydbakken 27", "Datalog");

        Student student = new Student("Margrethe", "Ringvej 7", "STX", 9.5, "DMU01");

        person.udskrivPerson();

        System.out.println();

        System.out.println("model.Student:");

        student.udskrivPerson();// kalder overrided metode

        System.out.println();

        student.udskrivAdresse(); // kalder egen metode

        System.out.println(student.getName()); // kalder nedarvet metode

        System.out.println();

        Teacher teacher = new Teacher("Ole", "Bakkedal 2", "Datalog", 20000, 5);

        teacher.printTeacher();

        System.out.println();

        System.out.println("Ole's salary is " + teacher.getSalary());

        teacher.setSalary(15000);

        System.out.println();

        teacher.printTeacher();

        System.out.println("Ole's yearly salary is " + teacher.yearSalary());

        System.out.println("Teachers information:");

        System.out.println("Teachers name: " + teacher.getName());

        teacher.udskrivAdresse();

        teacher.setYearsWorked(6);

        System.out.println("Years worked: " + teacher.getYearsWorked());

    }

}
