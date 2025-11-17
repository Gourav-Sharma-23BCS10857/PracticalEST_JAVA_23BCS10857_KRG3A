import java.sql.*;
import java.util.*;

public class EmployeeJDBC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rr", "root" ,"Gourav@2004");

            PreparedStatement pst = con.prepareStatement("INSERT INTO EMPLOYEE(ID, NAME, SALARY) VALUES(?,?,?)");
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setDouble(3, salary);
            pst.executeUpdate();

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEE");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
