module com.example.calculatorprogram {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.calculatorprogram to javafx.fxml;
    exports com.example.calculatorprogram;
}