package Student;

public class StudentInfo {
    int rollno, per;
    String sclass;

    public StudentInfo(int rollno, int per, String sclass) {
        this.rollno = rollno;
        this.per = per;
        this.sclass = sclass;
    }

    public void getInfo() {
        System.out.println(rollno + " " + sclass + " " + per);
    }
}
