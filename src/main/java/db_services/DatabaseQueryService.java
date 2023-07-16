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
        DatabaseQueryService queryService = new DatabaseQueryService();

        String sql = ReadSqlFile.stringFromFile(SqlFilePathsConstants.PRINT_PROJECT_PRICES);
        List<ProjectPrice> projectPrices =queryService.execute(sql, ProjectPrice.class);
        System.out.println("List<ProjectPrice> = " + projectPrices);


        sql = ReadSqlFile.stringFromFile(SqlFilePathsConstants.FIND_YOUNGEST_ELDEST_WORKERS);
        List<YoungestEldestWorker> youngestEldestWorkers = queryService.execute(sql, YoungestEldestWorker.class);
        System.out.println("List<YoungestEldestWorker> = " + youngestEldestWorkers);

        sql = ReadSqlFile.stringFromFile(SqlFilePathsConstants.FIND_LONGEST_PROJECT);
        List<LongestProject> longestProjects = queryService.execute(sql, LongestProject.class);
        System.out.println("List<LongestProject> = " + longestProjects);

        sql = ReadSqlFile.stringFromFile(SqlFilePathsConstants.FIND_MAX_SALARY_WORKER);
        List<MaxSalaryWorker> maxSalaryWorkers = queryService.execute(sql, MaxSalaryWorker.class);
        System.out.println("List<MaxSalaryWorker> = " + maxSalaryWorkers);

        sql = ReadSqlFile.stringFromFile(SqlFilePathsConstants.FIND_MAX_PROJECTS_CLIENT);
        List<MaxProjectCountClient> maxProjectCountClients = queryService.execute(sql, MaxProjectCountClient.class);
        System.out.println("List<MaxProjectCountClient> = " + maxProjectCountClients);
    }
}
