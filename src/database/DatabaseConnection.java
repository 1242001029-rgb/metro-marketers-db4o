package database;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class DatabaseConnection {

    private static final String DB_FILE = "metro.db4o";

    public static ObjectContainer getDatabase() {

        return Db4oEmbedded.openFile(DB_FILE);
    }
}