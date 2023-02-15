module io.knifer.stalkermusicreplacementtool {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.knifer.stalkermusicreplacementtool to javafx.fxml;
    exports io.knifer.stalkermusicreplacementtool;
}