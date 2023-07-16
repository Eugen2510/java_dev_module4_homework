package instances;

import java.time.LocalDate;

public class ProjectPrice implements Instance{
    private String name;
    private int price;


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

    }

    @Override
    public void setType(String type) {

    }

    @Override
    public void setBirthday(LocalDate birthday) {

    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProjectPrice{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
