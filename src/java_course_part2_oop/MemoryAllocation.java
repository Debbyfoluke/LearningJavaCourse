package java_course_part2_oop;

public class MemoryAllocation {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        var textBox2 = textBox1;
        textBox2.setText("Hello World");
        System.out.println(textBox1.text);
    }
}
