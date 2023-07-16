package tools;

import storage.SqlFilePathsConstants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSqlFile {

    public static String stringFromFile(String path){
        String sql = null;
        try {
            sql = Files.readString(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sql;
    }

    public static void main(String[] args) {
        System.out.println(ReadSqlFile.stringFromFile(SqlFilePathsConstants.INIT));
    }
}
