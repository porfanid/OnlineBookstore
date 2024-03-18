import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private Connection connection;
    private final String url;
    private final String username;
    private final String password;

    public Database(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("MySQL JDBC driver not found", e);
        }
    }

    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    public void write(String table_name, Map<String, Object> data) throws SQLException {
        StringBuilder columns = new StringBuilder();
        StringBuilder values = new StringBuilder();
        for (String column : data.keySet()) {
            columns.append(column).append(",");
            values.append("?,");
        }
        // Remove the trailing comma
        columns.deleteCharAt(columns.length() - 1);
        values.deleteCharAt(values.length() - 1);

        //String sql = ;
        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO "+table_name+" (" + columns + ") VALUES (" + values + ")")) {
            int index = 1;
            for (Object value : data.values()) {
                if (value instanceof String) {
                    statement.setString(index, (String) value);
                } else if (value instanceof Integer) {
                    statement.setInt(index, (Integer) value);
                } else if (value instanceof Double) {
                    statement.setDouble(index, (Double) value);
                } // Add more cases for other data types as needed
                index++;
            }
            statement.executeUpdate();
        }
    }

    public List<Map<String, Object>> read(String table) throws SQLException {
        List<Map<String, Object>> resultList = new ArrayList<>();
        String sql = "SELECT * FROM " + table;
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                Map<String, Object> row = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object value = resultSet.getObject(i);
                    row.put(columnName, value);
                }
                resultList.add(row);
            }
        }
        return resultList;
    }
}
