/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect;

import java.util.HashSet;
import task.Task;

/**
 *
 * @author galla
 */
public class Proyecto {
    private int id; 
    private String name;
    private HashSet<Task> listtarea;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Task> getListtarea() {
        return listtarea;
    }

    public Proyecto(int id, String name, HashSet<Task> listtarea) {
        this.id = id;
        this.name = name;
        this.listtarea = listtarea = new HashSet();
    }

    public Proyecto() {
        this(0,"",new HashSet());
    }
    
}
