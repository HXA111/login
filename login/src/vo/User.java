package vo;

public class User {
    private String username;
    private String password;
    private String chrName;
    private String role;

    public User(String username, String password, String chrName, String role) {
        this.username = username;
        this.password = password;
        this.chrName = chrName;
        this.role = role;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChrName() {
        return chrName;
    }

    public void setChrName(String chrName) {
        this.chrName = chrName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", chrName='" + chrName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
