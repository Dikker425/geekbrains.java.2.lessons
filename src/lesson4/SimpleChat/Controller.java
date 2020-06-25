package Lesson4.SimpleChat;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.crypto.spec.PSource;

public class Controller {

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
        if(textInput.getText().trim().isEmpty()){
            textInput.setPromptText("Нельзя отправить пустое сообщение");
        } else {
            textOutput.appendText(textInput.getText() + "\n");
            textInput.clear();
            textInput.setPromptText("Введите сообщение. . .");
        }
    }

}
