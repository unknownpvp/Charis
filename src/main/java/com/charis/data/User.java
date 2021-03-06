package com.charis.data;
import java.io.Serializable;

/**
 * Encapsulates the properties of a user.
 */
public final class User implements Serializable
{
    private final String username;
    private String firstName;
    private String lastName;
    private String password;
    private boolean admin; // Is the user an admin?
    private boolean active; // Inactive accounts cannot log in


    /**
     * Builds a user.
     * @param uname Username
     * @param fname First name
     * @param lname Last name
     * @param pass password
     * @param admin Is an admin?
     * @param active Is account active?
     */
    public User(String uname, String fname, String lname, String pass, boolean admin, boolean active)
    {
        this.username = uname;
        this.firstName = fname;
        this.lastName = lname;
        this.setPassword(pass);
        this.setAdmin(admin);
        this.setActive(active);
    }


    public String getUsername()
    {
        return username;
    }

    public void setFirstName(String s)
    {
        this.firstName = s;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String s)
    {
        this.lastName = s;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin)
    {
        this.admin = admin;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
