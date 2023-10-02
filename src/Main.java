import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<StaffInfo> staff = new ArrayList<>(List.of(
                new StaffInfo("Adekunle festus", "Bsc", 34,
                        "08021212121",
                        "adekunlefestus@gmail.com", "12"
                ),
                new StaffInfo("Mr Ajase festus", "HND", 23,
                        "08023232323",
                        "ajasefestus@gmail.com", "3"
                ),
                new StaffInfo("Mrs Ojebode tayo", "phd", 50,
                        "08134609085",
                        "ojebodetayo@gmail.com", "20"
                ),
                new StaffInfo("Mr Taiwo olayemi", "Ssce", 30,
                        "09120451678",
                        "taiwoolayemi@gmail.com", "8", "security"
                ),
                new StaffInfo("Mrs Akinyemi juliana", "Ssce", 28,
                        "07080136941",
                        "akinyemijuliana@gmail.com", "5", "cleaner"
                )
        ));


        var principal = new PrincipalLogin(staff);
        var teacher = new TeacherLogin();
        var student = new StudentLogin();
        var scanner = new Scanner(System.in);

        System.out.println("Hello.. " +
                "\n" +
                "Enter 1 to login as the Principal: " +
                "\n" +
                "Enter 2 to login as a teacher: " +
                "\n" +
                "Enter 3 to login as a student: "
        );

        int loginCode = 0;

        try {
            loginCode = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong password");

        }

        int principalAction = 0;
        int teacherAction = 0;
        int StudentAction = 0;
        if (loginCode == 1) {
            System.out.println("Hi.. " +
                    "\n" +
                    "Enter 1 to printStudent: " +
                    "\n" +
                    "Enter 2 to printSubjct : " +
                    "\n" +
                    "Enter 3 to printStaffs: " +
                    "\n" +
                    "Enter 4 to printClasses :"
            );
            try {
                principalAction = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong password");
                principalAction = scanner.nextInt();
            }
            if (principalAction == 1) {
                principal.printStudent();
            } else if (principalAction == 2) {
                principal.printSubject();
            } else if (principalAction == 3) {
                principal.printStaffs();
            } else if (principalAction == 4) {
                principal.printClasses();
            }
            else
                System.out.println("Incorrect password please try again");



        } else if (loginCode == 2) {
            System.out.println("Hi.. " +
                    "\n" +
                    "Enter 5 to printStudent: " +
                    "\n" +
                    "Enter 6 to printSubject : " +
                    "\n" +
                    "Enter 7 to printClasses : " +
                    "\n" +
                    "Enter 8 to assignScore"
            );
            try {
                teacherAction = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong password");
                teacherAction = scanner.nextInt();
            }
            if (teacherAction == 5) {
                teacher.printStudent();
            } else if (teacherAction == 6) {
                teacher.printSubject();
            }else if (teacherAction == 7) {
                teacher.printClasses();
            } else if (teacherAction == 8) {
                teacher.assignScore();
            }
            else
                System.out.println("Wrong password try again");

        } else if (loginCode == 3) {
            System.out.println("Hi.. " +
                    "\n" +
                    "Enter 14 to printSubject : " +
                    "\n" +
                    "Enter 12 to printSubClasses : "
            );
            try {
                StudentAction = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong password");
                StudentAction = scanner.nextInt();
            }
            if (StudentAction == 14) {
                student.printSubject();
            } else if (StudentAction == 12) {
                student.printClasses();
            }
            else
                System.out.println("Incorrect pin");
        }
        else
            System.out.println("Wrong password");
    }
}