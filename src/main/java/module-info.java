module NarumiDeobfGUI {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires org.objectweb.asm;
    requires Deobfuscator.fc5f31f;
    opens gq.malwarefight.narumiideobfgui to javafx.fxml;
    exports gq.malwarefight.narumiideobfgui to javafx.graphics;
}
