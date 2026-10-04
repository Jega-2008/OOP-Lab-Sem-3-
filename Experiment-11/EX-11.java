import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class StudentCRUD extends Application {

    TextField idField, nameField, deptField, phoneField;
    TextArea output;

    Connection con;

    public void start(Stage stage) {

        idField = new TextField();
        idField.setPromptText("Student ID");

        nameField = new TextField();
        nameField.setPromptText("Student Name");

        deptField = new TextField();
        deptField.setPromptText("Department");

        phoneField = new TextField();
        phoneField.setPromptText("Phone");

        Button add = new Button("Add");
        Button view = new Button("View");
        Button update = new Button("Update");
        Button delete = new Button("Delete");

        output = new TextArea();

        add.setOnAction(e -> addStudent());
        view.setOnAction(e -> viewStudents());
        update.setOnAction(e -> updateStudent());
        delete.setOnAction(e -> deleteStudent());

        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        root.getChildren().addAll(
                idField, nameField, deptField, phoneField,
                add, view, update, delete, output
        );

        Scene scene = new Scene(root, 450, 500);

        stage.setTitle("Student CRUD Application");
        stage.setScene(scene);
        stage.show();

        connectDatabase();
    }

    void connectDatabase() {
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "root"
            );
            System.out.println("Database Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void addStudent() {
        try {
            String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(idField.getText()));
            ps.setString(2, nameField.getText());
            ps.setString(3, deptField.getText());
            ps.setString(4, phoneField.getText());

            ps.executeUpdate();

            output.setText("Student added successfully!");

        } catch (Exception e) {
            output.setText(e.getMessage());
        }
    }

    void viewStudents() {
        try {
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            String data = "";

            while (rs.next()) {
                data += "ID: " + rs.getInt("id") +
                        "  Name: " + rs.getString("name") +
                        "  Department: " + rs.getString("department") +
                        "  Phone: " + rs.getString("phone") + "\
