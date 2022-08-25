
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users{
    private Connection connection;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<User> all(){
        List<User> users = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while(rs.next()){
                User user = new User(rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password"));
                users.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
        return users;
    }


    @Override
    public User findByUsername(String username) {
        User user = null;
        try{
            String query = "SELECT * FROM users WHERE username = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            rs.next();
            user = new User(rs.getLong("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"));
        }catch(SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
        return user;
    }

    @Override
    public Long insert(User user) {
        try {
            String query = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2,user.getEmail());
            stmt.setString(3,user.getPassword());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }
}
