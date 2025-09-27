package Student;

public class StudentPer {
    int s1, s2, s3, s4, s5, s6;

    public StudentPer(int s1, int s2, int s3, int s4, int s5, int s6) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
    }

    public void calcPer() {
        float per = ((s1 + s2 + s3 + s4 + s5 + s6) / 600) * 100;
        System.out.print("Percentage of student is: " + per);
    }
}
