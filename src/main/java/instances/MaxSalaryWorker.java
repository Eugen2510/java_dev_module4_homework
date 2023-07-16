package instances;

import java.time.LocalDate;

public class MaxSalaryWorker implements Instance{
    private String name;
    private int salary;

    @Override
    public void setName(long name) {

    }

    @Override
    public void setMonthCount(int monthCount) {

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setProjectCount(int projectCount) {

    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public void setBirthday(LocalDate birthday) {

    }

    @Override
    public void setPrice(int price) {

    }

    @Override
    public String toString() {
        return "MaxSalaryWorker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
