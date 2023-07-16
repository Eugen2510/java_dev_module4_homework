package instances;

import java.time.LocalDate;

public class YoungestEldestWorker implements Instance{
    private String type;
    private String name;
    private LocalDate birthday;


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
        this.type =type;
    }

    @Override
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public void setPrice(int price) {

    }

    @Override
    public String toString() {
        return "YoungestEldestWorker{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
