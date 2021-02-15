import java.util.Comparator;

public class Student {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student name1, Student name2) {
            return name1.getName().compareTo(name2.getName());
        }

    }

    public static class AgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student age1, Student age2) {
            return Integer.compare(age1.getAge(), age2.getAge());
        }
    }

    public static class NameAgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {

            int resultName = o1.getName().compareTo(o2.getName());


            if (resultName != 0) {
                return resultName;
            } else
                return Integer.compare(o1.getAge(), o2.getAge());
        }


    }

    Comparator<Student> nameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    Comparator<Student> ageComparator = new Comparator<Student>() {
        @Override
        public int compare(Student age1, Student age2) {
            return Integer.compare(age1.getAge(), age2.getAge());
        }
    };

    Comparator<Student> NameAgeComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {

            int resultName = o1.getName().compareTo(o2.getName());

            if (resultName != 0) {
                return resultName;

            } else
                return Integer.compare(o1.getAge(), o2.getAge());
        }
    };

    IStudentStringConverter iStudentStringConverter = student -> {

        StringBuilder jsonStudent = new StringBuilder(
                "Json: \n" + "{ \n" +
                        "\"" +
                        "name" + "\"" + ": " + "\"" + student.name + "\"" + ", \n" +
                        "\"" + "age" + "\"" + ": " + "\"" + student.age + "\" \n"
                        + "} \n"
        );
        return jsonStudent.toString();

    };
    IStudentPrinter iStudentPrinter = student -> System.out.println(iStudentStringConverter.convectStudentToString(student));

}
