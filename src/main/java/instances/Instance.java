package instances;

import java.time.LocalDate;
import java.util.Locale;

public interface Instance {
    void setName(long name);
    void setMonthCount(int monthCount);
    void setName(String name);
    void setProjectCount(int projectCount);
    void setSalary(int salary);
    void setType(String type);
    void setBirthday(LocalDate birthday);
    void setPrice(int price);
}
