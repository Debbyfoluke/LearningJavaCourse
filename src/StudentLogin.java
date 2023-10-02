public class StudentLogin extends Admin implements SubjectPrinter, ClassesPrinter {
    int scores= 0;




    @Override
    public void printClasses() {
        for (String item : classes) {
            System.out.println(item);
        }
    }

    @Override
    public void printSubject() {
       for (SubjectsList item : subjects){
           System.out.println(item);
       }
    }

    @Override
    public void printLists() {
        super.printLists();
        System.out.println(scores);
    }
}
