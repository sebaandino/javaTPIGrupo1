package com.sebaandino.tpi.Utils;

import javax.swing.JOptionPane;

public class JOptionPaneUtil {
    
    public static void mostrarMensaje(String mensaje, TipoMensaje tipo) {
        switch (tipo) {
            case INFORMATIVO -> JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
            case ADVERTENCIA -> JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
            case ERROR -> JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            default -> JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    public enum TipoMensaje {
        INFORMATIVO,
        ADVERTENCIA,
        ERROR
    }
    
}
