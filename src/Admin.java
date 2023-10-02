import java.util.ArrayList;
import java.util.List;

public class Admin {

    ArrayList<StudentInfo> student = new ArrayList<>(List.of(
            new StudentInfo("Handu abidemi", 15, "SS1",
                    "Science", "5", "female"),
            new StudentInfo("Ayomide iyanu", 17, "SS2",
                    "Art", "3", "female"),
            new StudentInfo("David mark", 18, "SS3",
                    "Commercial", "4", "male"),
            new StudentInfo("Indigo emeka", 16, "SS2",
                    "Science", "5", "male"),
            new StudentInfo("John amos", 14, "SS1",
                    "Art", "3", "male")
    ));

    ArrayList<SubjectsList>  subjects = new ArrayList<>(List.of(
            new SubjectsList("English Language", 50),
            new SubjectsList("Mathematics", 70),
            new SubjectsList("Physics", 65),
            new SubjectsList("Chemistry", 80),
            new SubjectsList("Biology", 75)
    ));

    ArrayList<String> classes = new ArrayList<>(List.of("SS1", "SS2", "SS3"));

    public void printLists(){
        System.out.println(student);

        System.out.println(subjects);
        System.out.println(classes);
    }

}
