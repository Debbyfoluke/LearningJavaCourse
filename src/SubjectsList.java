public class SubjectsList {
   public String name;
   public int score = 0;

    public SubjectsList(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "SubjectsList{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
