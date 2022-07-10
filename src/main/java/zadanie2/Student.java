package zadanie2;

public class Student extends Person{
    String fieldOfStudy;
    int yearOfStudy;
    int annualCost;

    public Student(String fieldOfStudy, int yearOfStudy, int annualCost) {
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.annualCost = annualCost;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getAnnualCost() {
        return annualCost;
    }

    public void setAnnualCost(int annualCost) {
        this.annualCost = annualCost;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", annualCost=" + annualCost +
                '}';
    }
}
