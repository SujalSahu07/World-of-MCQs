package com.worldofmcqs;

import java.sql.*;

public class Quiz {
    public static void startQuiz() {
    String url = "jdbc:mysql://localhost:3306/worldofmcqs";
    String user = "root";
    String password = "your_password";

    try (Connection conn = DriverManager.getConnection(url, user, password)) {
        String sql = \"SELECT * FROM questions\";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt(\"id\");
                String question = rs.getString(\"question\");
                System.out.println(\"ID: \" + id + \", Question: \" + question);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
