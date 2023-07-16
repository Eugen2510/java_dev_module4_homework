package db_services;

import instances.*;
import storage.Database;
import storage.SqlFilePathsConstants;
import tools.ReadSqlFile;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    public <T extends Instance> List<T> execute(String sql, Class<T> tClass){
        List<T> res = new ArrayList<>();
        ResultSet resultSet = Database.getInstance().executeQuery(sql);
        int count;
        try {
            ResultSetMetaData rmsd = resultSet.getMetaData();
            count = rmsd.getColumnCount();
            while (resultSet.next()) {
                T t = tClass.newInstance();
                for (int i = 1; i <= count; i++) {
                    String name = rmsd.getColumnName(i);
                    if (name.equalsIgnoreCase("name")
                            || name.equalsIgnoreCase("id")
                            || name.equalsIgnoreCase("project_id")) {
                        t.setName(resultSet.getString(name));
                    }
                    if (name.equalsIgnoreCase("MONTH_COUNT")) {
                        t.setMonthCount(Integer.parseInt(resultSet.getString(name)));
                    }
                    if(name.equalsIgnoreCase("PROJECT_COUNT")){
                        t.setProjectCount(Integer.parseInt(resultSet.getString(name)));
                    }
                    if (name.equalsIgnoreCase("SALARY")){
                        t.setSalary(Integer.parseInt(resultSet.getString(name)));
                    }
                    if(name.equalsIgnoreCase("TYPE")){
                        t.setType(resultSet.getString(name));
                    }
                    if (name.equalsIgnoreCase("BIRTHDAY")){
                        t.setBirthday(LocalDate.parse(resultSet.getString(name)));
                    }
                    if (name.equalsIgnoreCase("PRICE")){
                        t.setPrice(Integer.parseInt(resultSet.getString(name)));
                    }
                }
                res.add(t);
            }
            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    public static void main(String[] args) {
        String sql = ReadSqlFile.stringFromFile(SqlFilePathsConstants.FIND_LONGEST_PROJECT);
        List<LongestProject> execute = new DatabaseQueryService().execute(sql, LongestProject.class);
        System.out.println("execute = " + execute);

    }
}
