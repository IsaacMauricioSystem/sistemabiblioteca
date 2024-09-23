module sistemabiblioteca {
    requires javafx.controls;
    requires javafx.fxml;

    opens sistemabiblioteca to javafx.fxml;
    exports sistemabiblioteca;
}
