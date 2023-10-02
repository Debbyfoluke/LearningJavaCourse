public class StaffInfo {
    public String name;
    public String qualification;
    public int age;
    public String mobileNumber;
    public String emailAddress;
    public String workingExperience;
    public String role = "teacher";

    public StaffInfo(String name, String qualification, int age, String mobileNumber, String emailAddress, String workingExperience, String role) {
        this.name = name;
        this.qualification = qualification;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        this.workingExperience = workingExperience;
        this.role = role;
    }



    public StaffInfo(String name, String qualification, int age, String mobileNumber, String emailAddress, String workingExperience) {
        this.name = name;
        this.qualification = qualification;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        this.workingExperience = workingExperience;
    }

    @Override
    public String toString() {
        return "StaffInfo{" +
                "name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", age=" + age +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", workingExperience='" + workingExperience + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
