import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineBookStore {
    public static void main(String[] args) {
        String url = System.getenv("DB_URL");
        String username = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");

        Database handler = new Database(url, username, password);
        try {
            handler.connect();
            Map<String, Object> credentials = new HashMap<>();
            credentials.put("username", "test");
            credentials.put("password", "2");
            //handler.write("user_creds",credentials);
            List<Map<String, Object>> result = handler.read("user_creds");
            for (Map<String, Object> row : result) {
                System.out.println(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                handler.disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
