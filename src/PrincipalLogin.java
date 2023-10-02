import java.util.ArrayList;

public class PrincipalLogin extends Admin implements StudentPrinter, SubjectPrinter, ClassesPrinter, StaffPrinter {
    private ArrayList<StaffInfo> staffList;
    private ArrayList<StudentInfo> students;
////    private ArrayList<SubjectsList> subjects;

    public PrincipalLogin(ArrayList<StaffInfo> staffList) {
        this.staffList = staffList;
       ;
    }


    public String addToList() {
        return null;
    }

    public String deleteList() {
        return "staffList, students, subject";
    }





    @Override
    public void printClasses() {
        for (String item : classes) {
            System.out.println(item);
        }
    }

    @Override
    public void printStudent() {
        for (StudentInfo item : student) {
            System.out.println(item);
        }
    }

    @Override
    public void printSubject() {
        for (SubjectsList item : subjects) {
            System.out.println(item);
        }
    }

    @Override
    public void printStaffs() {
       for (StaffInfo item : staffList)
           System.out.println(item);
    }
    private void addToStaffList() {
        staffList.add(new StaffInfo("Sobayo ojo", "masters", 55, "09132160475", "sobayoojo@gmail.com", "20"));
        System.out.println(staffList);
    }
    private void removeFromSaffList() {
        staffList.remove(4);
        System.out.println(staffList);
    }
    private void addToStudents() {
        students.add(new StudentInfo("Jiboye olaiye", 18, "SS3", "Art", "3", "male"));
        System.out.println(students);
    }
    private void removeFromStudents() {
        students.remove(0);
        System.out.println(students);
    }

    @Override
    public void printLists() {
        super.printLists();
        System.out.println(staffList);
    }
}
