package db_services;

import storage.Database;
import storage.SqlFilePathsConstants;
import tools.ReadSqlFile;

public class DatabaseInitService {
    public static void main(String[] args) {
        Database instance = Database.getInstance();
        instance.executeUpdate(ReadSqlFile.stringFromFile(SqlFilePathsConstants.INIT));

    }
}
