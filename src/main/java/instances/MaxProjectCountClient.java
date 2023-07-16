package instances;

import java.time.LocalDate;
import java.util.Locale;

public class MaxProjectCountClient implements Instance{
    private String name;
    private int projectCount;

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
        this.projectCount = projectCount;
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
        return "MaxProjectCountClient{" +
                "name='" + name + '\'' +
                ", projectCount=" + projectCount +
                '}';
    }
}
