/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import User.user;
import comentarios.comentario;
import java.util.ArrayList;

/**
 *
 * @author javierortizdobles
 */
public class Task {
    private int id;
    private String description;
    private Boolean completed;
    private user user;
    private ArrayList<comentario> listComment;

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public user getUser() {
        return user;
    }

    public ArrayList<comentario> getListComment() {
        return listComment;
    }

    public Task(int id, String description, Boolean completed, user user, ArrayList<comentario> listComment) {
        this.id = id = 1;
        id++;
        this.description = description;
        this.completed = completed;
        this.user = user;
        this.listComment = new ArrayList();
    }

    public Task() {
        this(0,"",null,null,new ArrayList());
    }
    
    public void addComment(comentario comentario){
        listComment.add(comentario);
    }
    
    
    
    
}
