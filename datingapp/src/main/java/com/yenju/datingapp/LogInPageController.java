package com.yenju.datingapp;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LogInPageController implements Initializable {


    @FXML
    private Button button_login;
    @FXML
    private Button button_signup;

    @FXML
    private TextField tf_username;

    @FXML
    private TextField tf_password;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        button_login.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event){
                DBConnection.logInUser(event, tf_username.getText(), tf_password.getText());
            }
        });

        button_signup.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                DBConnection.changeScene(event, "com/yenju/datingapp/SignUp.fxml", null,null);
            }
        });
    }

}
