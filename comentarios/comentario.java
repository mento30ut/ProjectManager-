/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comentarios;

import User.user;

/**
 *
 * @author galla
 */
public class comentario {
    private int id;
    private user user;
    private String contario;

    public int getId() {
        return id;
    }

    public user getUser() {
        return user;
    }

    public String getContario() {
        return contario;
    }

    public void setContario(String contario) {
        this.contario = contario;
    }

    public comentario(int id, user user, String contario) {
        this.id = id;
        this.user = user;
        this.contario = contario;
    }

    public comentario() {
         this(0,null,"");
    }
  
}
