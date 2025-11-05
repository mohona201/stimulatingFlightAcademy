module oop.stimulatingflightacademy {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.stimulatingflightacademy to javafx.fxml;
    exports oop.stimulatingflightacademy;
}