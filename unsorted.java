//undecided aand unsorted sample.
class NoMethodParameters{
    void print1To10() {
    for (int i = 1; i <= 10; i++)
    System.out.println(i);
    }
    void print10To20() {
    for (int i = 10; i <= 20; i++)
    System.out.println(i);
    }
    void print1To99() {
    for (int i = 1; i <= 99; i++)
    System.out.println(i);
    }
    NoMethodParameters noParameters = new NoMethodParameters();
    noParameters.print10To20();
    noParameters.print1To99();
}

class WithMethodParameters {
    void printNumbers(int start, int end) {
    for (int i = start; i <= end; i++)
    System.out.println(i);
    }
    WithMethodParameters withParameters = new WithMethodParameters();
    withParameters.printNumbers(10, 20);
    withParameters.printNumbers(1, 99);
    withParameters.printNumbers(100, 200);
    withParameters.printNumbers(500, 1000);
}

interface Validate {
    boolean check(Emp emp);
}

class Emp {
    String name;
    int performanceRating;
    double salary;
    Emp(String nm, int rating, double sal) {
    name = nm;
    performanceRating = rating;
    salary = sal;
    }
    public String getName() { return name; }
    public int getPerformanceRating() { return performanceRating; }
    public double getSalary() { return salary; }
    public String toString() {
        return name + ":" + performanceRating + ":" + salary;
    }
}

class ValidatePerformanceRating implements Validate{
    public boolean check(Emp emp) {
        return (emp.getPerformanceRating() >= 5);
    }
}

class ValidateName implements Validate{
    public boolean check(Emp emp) {
        return (emp.getName.startsWith("P"));
    }
}

class Test {
    public static void main(String args[]) {
        Emp e1 = new Emp("Shreya", 5, 9999.00);
        Emp e2 = new Emp("Paul", 4, 1234.00);
        Emp e3 = new Emp("Harry", 5, 8769.00);
        Emp e4 = new Emp("Selvan", 1, 2769.00);
        ArrayList<Emp> empArrList = new ArrayList<>();
        empArrList.add(e1);
        empArrList.add(e2);
        empArrList.add(e3);
        empArrList.add(e4);
        Validate validatePerfor = e -> e.getPerformanceRating() >= 5;
        //Validate validate = (e) -> e.getPerformanceRating() >= 5;
        //Validate validate = (Emp e) -> e.getPerformanceRating() >= 5;
        //Validate validate = (e) -> { return (e.getPerformanceRating() >= 5); };
        filter(empArrList, validatePerfor);
    }
    static void filter(ArrayList<Emp> list, Validate rule) {
        for (Emp e : list) {
            if (rule.check(e)) {
                System.out.println(e);
            }
        }
    }
}
