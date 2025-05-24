/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author Rendi
 */
public class App {
    public static void main (String[] args) {
        FormLogin login = new FormLogin();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
    }
}
