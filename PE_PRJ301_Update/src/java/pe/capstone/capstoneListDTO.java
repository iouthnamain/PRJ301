/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.capstone;

/**
 *
 * @author ADMIN
 */
public class capstoneListDTO {
    private String id;
    private String name;
    private String description;
    private String userID;

    public capstoneListDTO() {
    }

    public capstoneListDTO(String id, String name, String description, String userID) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.userID = userID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    
}
