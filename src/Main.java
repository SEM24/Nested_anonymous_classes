
public class Main {

    public static void main(String[] args) {
    new Main().run();
    }
    private void run()
    {
        Student student = new Student("Sergey",30);
        Student student2 = new Student("Sergey2",20);
       student.iStudentPrinter.onScreen(student);

    }




}
