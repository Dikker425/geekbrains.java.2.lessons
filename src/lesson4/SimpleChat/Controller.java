package Lesson4.SimpleChat;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Controller {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");


    @FXML
    TextArea textOutput;

    @FXML
    TextField textInput;

    @FXML
    Button sendButton;

    //Закрытие программы через меню
    public void menuItemFileExitAction(ActionEvent actionEvent) {
        Platform.exit();
    }

    // отправка соробщения через Enter или кнопку
    public void sendMessage(ActionEvent actionEvent) {
        LocalDateTime now = LocalDateTime.now();
        if (textInput.getText().trim().isEmpty()) {
            textInput.setPromptText("Нельзя отправить пустое сообщение");
        } else {
            textOutput.appendText(dtf.format(now) + " : " + textInput.getText() + "\n");
            textInput.clear();
            textInput.setPromptText("Введите сообщение. . .");
        }
    }

}
