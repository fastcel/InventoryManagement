package org.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SignupPage {

    public void start(Stage primaryStage) {

        // Create labels and fields
        Label nameLabel = new Label("Full Name:");
        TextField nameField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        Button signupButton = new Button("Sign Up");

        // Handle button click
        signupButton.setOnAction(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String username = usernameField.getText();
            String password = passwordField.getText();

            System.out.println("Signup Info:");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Signup Successful!");
            alert.showAndWait();
        });

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);

        grid.add(emailLabel, 0, 1);
        grid.add(emailField, 1, 1);

        grid.add(usernameLabel, 0, 2);
        grid.add(usernameField, 1, 2);

        grid.add(passwordLabel, 0, 3);
        grid.add(passwordField, 1, 3);

        grid.add(signupButton, 1, 4);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setTitle("Signup Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
