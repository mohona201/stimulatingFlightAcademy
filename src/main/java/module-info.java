module oop.stimulatingflightacademy {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.stimulatingflightacademy to javafx.fxml;
    exports oop.stimulatingflightacademy;
    exports oop.stimulatingflightacademy.madhu;

    opens oop.stimulatingflightacademy.madhu to javafx.fxml;
    exports oop.stimulatingflightacademy.Madhu;
    opens oop.stimulatingflightacademy.Madhu to javafx.fxml;
}