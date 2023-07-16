package instances;

import java.time.LocalDate;

public interface Instance {
    void setMonthCount(int monthCount);
    void setName(String name);
    void setProjectCount(int projectCount);
    void setSalary(int salary);
    void setType(String type);
    void setBirthday(LocalDate birthday);
    void setPrice(int price);
}
