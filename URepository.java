import com.company.repositories.interfaces.IUserRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public boolean createMedicine() {
        st.setint(id.getName());
        st.setString(id.getPrice());

        boolean executed = st.execute();
        return executed;
        st.execute();
        return true;
        } catch (SQLException throwables) {
        throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        } finally {
        try {
        con.close();
        } catch (SQLException throwables) {
        throwables.printStackTrace();
        }
        }
        return false;
        }
@Override
public User getUser(int id) {
        Connection con = null;
        try {
        con = db.getConnection();
        String sql = "SELECT id,name,price,manufacturer FROM medicine WHERE id=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        User user = new User(rs.getInt("id"),
        rs.getString("name"),
        rs.getString("price"),
        rs.getString("manufacturer"));
        return medicine;
        }
        } catch (SQLException throwables) {
        throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        } finally {
        try {
        con.close();
        } catch (SQLException throwables) {
        throwables.printStackTrace();
        }
        }
        return null;
        }
@Override
public List<Medicine> getAllMedicine() {
        Connection con = null;
        try {
        con = db.getConnection();
        String sql = "SELECT id,name,price,manufacturer FROM medicine";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        List<User> users = new LinkedList<>();
        while (rs.next()) {
       Medicine medicine = new Medicine(rs.getInt("id"),
        rs.getString("name"),
        rs.getString("price"),
        rs.getString("manufacturer"));
        medicine.add(medicine);
        }
        return medicine;
        } catch (SQLException throwables) {
        throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        } finally {
        try {
        con.close();
        } catch (SQLException throwables) {
        throwables.printStackTrace();
        }
        }
        return null;
        }
        }