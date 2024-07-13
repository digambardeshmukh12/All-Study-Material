import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.*;

public class DatabaseGUI extends Application {
    private Connection connection;
    private Statement statement;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Database connection parameters
        String host = "localhost";
        String port = "3306";
        String database = "your_database_name";
        String username = "your_username";
        String password = "your_password";

        // Connect to the database
        connectToDatabase(host, port, database, username, password);

        // Create GUI components
        Button insertButton = new Button("Insert");
        Button updateButton = new Button("Update");
        Button deleteButton = new Button("Delete");
        Button selectButton = new Button("Select");

        TextArea outputArea = new TextArea();
        outputArea.setEditable(false);

        TextField inputField = new TextField();

        // Set button actions
        insertButton.setOnAction(e -> {
            String input = inputField.getText();
            insertData(input);
            inputField.clear();
        });

        updateButton.setOnAction(e -> {
            String input = inputField.getText();
            updateData(input);
            inputField.clear();
        });

        deleteButton.setOnAction(e -> {
            String input = inputField.getText();
            deleteData(input);
            inputField.clear();
        });

        selectButton.setOnAction(e -> {
            ObservableList<String> data = selectData();
            outputArea.setText(String.join("\n", data));
        });

        // Create layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.addRow(0, new Label("Input:"), inputField);
        gridPane.addRow(1, insertButton, updateButton, deleteButton, selectButton);
        gridPane.addRow(2, new Label("Output:"), outputArea);

        // Create scene and stage
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Database GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void connectToDatabase(String host, String port, String database, String username, String password) {
        try {
            String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertData(String data) {
        String query = "INSERT INTO your_table_name (column_name) VALUES ('" + data + "')";
        executeQuery(query);
    }

    private void updateData(String data) {
        String query = "UPDATE your_table_name SET column_name = '" + data + "' WHERE condition";
        executeQuery(query);
    }

    private void deleteData(String data) {
        String query = "DELETE FROM your_table_name WHERE column_name = '" + data + "'";
        executeQuery(query);
    }

    private ObservableList<String> selectData() {
        ObservableList<String> data = FXCollections.observableArrayList();
        String query = "SELECT * FROM your_table_name";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String value = resultSet.getString("column_name");
                data.add(value);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    private void executeQuery(String query) {
        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
