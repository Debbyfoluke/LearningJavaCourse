public class StudentInfo {
    public String name;
    public int age;
    public String presentClass;
    public String department;
    public  String  subjects;
    public String sex;

    public StudentInfo(String name, int age, String presentClass, String department, String subjects, String sex) {
        this.name = name;
        this.age = age;
        this.presentClass = presentClass;
        this.department = department;
        this.subjects = subjects;
        this.sex = sex;
    }


    public StudentInfo(String name, int age, String presentClass, String department, String subjects) {
        this.name = name;
        this.age = age;
        this.presentClass = presentClass;
        this.department = department;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", presentClass='" + presentClass + '\'' +
                ", department='" + department + '\'' +
                ", subjects='" + subjects + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
