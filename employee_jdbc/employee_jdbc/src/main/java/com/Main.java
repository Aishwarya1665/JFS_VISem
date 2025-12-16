package com.skillnext2;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection c = DBConnection.getConnection();
        if (c != null) {
            try {
                c.close();
            } catch (Exception ignored) {
            }
        }
    }
}
