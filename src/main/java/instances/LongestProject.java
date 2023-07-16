package instances;

import java.time.LocalDate;

public class LongestProject implements Instance {
    public String name;
    public int monthCount;



    @Override
    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setProjectCount(int projectCount) {

    }

    @Override
    public void setSalary(int Salary) {

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
        return "LongestProject{" +
                "name='" + name + '\'' +
                ", monthCount=" + monthCount +
                '}';
    }
}
