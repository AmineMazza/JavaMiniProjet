
package com.aitbouna.gestionemprunt;

import javax.swing.JFrame;

/**
 *
 * @author AitBouna
 */
public class Logout {
    public static void logout(JFrame context, LoginForm loginScreen){
        LoginSession.isLoggedIn = false;
        context.setVisible(false);
        loginScreen.setVisible(true);
    }
}
