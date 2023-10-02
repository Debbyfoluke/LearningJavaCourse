import java.util.ArrayList;

public class TeacherLogin extends Admin implements StudentPrinter, SubjectPrinter, ClassesPrinter {
//    private ArrayList<SubjectsList> subjects;
//    public ArrayList<String> classes;
//    private ArrayList<StudentInfo> students;
    @Override
    public void printClasses() {
        for(String item : classes) {
            System.out.println(item);
        }
    }
    @Override
    public void printStudent() {
        for (StudentInfo item :student) {
            System.out.println(item);
        }
    }

    @Override
    public void printSubject() {
        for (SubjectsList item : subjects) {
            System.out.println(item);
        }
    }

    void assignScore() {
        System.out.println( "Before assigning " + subjects);
        var sub = subjects.get(2);
        sub.score = 32;
        subjects.set(2, sub);
        System.out.println( "After assigning " + subjects);
    }

    @Override
    public void printLists() {
        super.printLists();
    }
}
