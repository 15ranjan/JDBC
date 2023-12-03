import java.sql.*;

public class ConnectDB {
    public static void main(String[] args){
//        String sql = "select title from film where film_id = 20";
//        String url = "jdbc:mysql://localhost:3306/sakila";
//        String userName = "root";
//        String password = "game1234";
//
//
//        Connection con = DriverManager.getConnection(url, userName, password);
//        Statement st = con.createStatement();
//        ResultSet result = st.executeQuery(sql);
//        result.next();
//        String output = result.getString("title");
//        System.out.println(output);

        String sql = "SELECT title FROM film WHERE release_year = 2006";
        String url = "jdbc:mysql://localhost:3306/sakila";
        String userName = "root";
        String password = "game1234";

        try (Connection con = DriverManager.getConnection(url, userName, password);
             Statement st = con.createStatement();
             ResultSet result = st.executeQuery(sql)) {
            // Check if there is any result
            if(result.next());
            String output = result.getString(1);
            System.out.println(output);
            //System.out.println("No film found for film_id = 20");
        } catch (Exception exception) {
            exception.printStackTrace(); // Handle the exception appropriately in a real application
        }

    }
}
