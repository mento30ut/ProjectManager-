/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.util.HashSet;
import task.Task;

/**
 *
 * @author javierortizdobles
 */
public class proyect {
    private int id;
    private String name;
    private HashSet<Task> listTask;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Task> getlistTask() {
        return listTask;
    }

    public proyect(int id, String name, HashSet<Task> listaTarea) {
        this.id = id;
        this.name = name;
        this.listTask = new HashSet();
    }

    public proyect() {
        this(0,"",new HashSet());
    }
    
    
   
    
    
}
