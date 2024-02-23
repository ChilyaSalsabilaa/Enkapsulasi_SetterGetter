package ENKAPSULASI;

public class User {
    
    private String username ;
    private String password ;
    private int id ;
    private boolean status ; //true : pelajar, false : pekerja 
    
    public User () {
        System.out.println("INI CONSTRUCTORR");
    }
    
    public User (String satu, String dua){
        this.username = satu;
        this.username = dua;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

