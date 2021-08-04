package com.company;

        import com.company.controllers.UserController;
        import com.company.data.PostgresDB;
        import com.company.data.interfaces.IDB;
        import com.company.repositories.UserRepository;
        import com.company.repositories.interfaces.IUserRepository;
        import java.sql.*;
public class Main {

    public static void main(String[] args) {
        @@ -25,29 +28,31 @@ public static void main(String[] args) {
            IDB db = new PostgresDB();
            IUserRepository repo = new UserRepository(db);
            MyApplication app = new MyApplication(repo);
            UserController controller = new UserController(repo);
            MyApplication app = new MyApplication(controller);
            app.start();
        }
    }
