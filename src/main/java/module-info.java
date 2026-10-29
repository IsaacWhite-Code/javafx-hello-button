module com.hellobutton {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hellobutton to javafx.fxml;
    exports com.hellobutton;
}