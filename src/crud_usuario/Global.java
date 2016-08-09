/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_usuario;

public final  class Global {    
    public final static String URL;
    public final static String DRIVER;
    public final static String USER;
    public final static String PASS;
    static{
        URL=getValor("url");
        DRIVER=getValor("driver");
        USER=getValor("usuario");
        PASS=getValor("clave");        
    }
     public static String getValor(String clave) {
        java.util.ResourceBundle Configuracion = java.util.ResourceBundle.getBundle("conec.database");
        return  Configuracion.getString(clave);
     }    
}
