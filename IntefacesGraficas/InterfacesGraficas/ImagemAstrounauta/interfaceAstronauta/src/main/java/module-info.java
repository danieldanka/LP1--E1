module tela.registrar.interfaceastronauta.interfaceastronauta {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens tela.registrar.Interface.Astronauta to javafx.fxml;
    exports tela.registrar.Interface.Astronauta;
}