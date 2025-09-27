class Employee {
    String name, desg;
    int id, sal;

    Employee(String name, String desg, int id, int sal) {
        this.desg = desg;
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
}

class slip6_1 {
    public static void main(String args[]) {
        Employee e = new Employee("Atharv", "Software engineer", 1, 10000);
        System.out.println(e.toString());
    }
}