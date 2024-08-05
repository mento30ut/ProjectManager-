 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author javierortizdobles
 */
public class user {
    private String id;
    private String name;
    private String email;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public user(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public user() {
        this("","","");
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
