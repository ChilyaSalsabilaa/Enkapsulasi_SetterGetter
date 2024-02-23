package ENKAPSULASI;

public class Mainn {
    public static void main(String[] args) {
        
        User user = new User ("aa", "bb");
        User user1 = new User ();
        
        user.setUsername (" APA") ;
        user.setPassword ( " OPO") ;
        user.setId (  123) ;
        user.setStatus( false);
        
        System.out.println("Username" +user.getUsername());
        System.out.println("Password" + user.getPassword());  
        System.out.println("Id" + user.getId());
        System.out.println("Status" + user.isStatus());
    }
}
