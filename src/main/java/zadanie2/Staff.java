package zadanie2;

public class Staff extends Person{

    private String specialization;
    private int salary;

    public Staff(String name, String address) {
        super(name, address);
    }

    public Staff(String specialization, int salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
