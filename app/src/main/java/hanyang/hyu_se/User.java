package hanyang.hyu_se;

/**
 * Created by Josh on 6/3/16.
 *
 * User class that stores ID, password, and phone number
 */
public class User {
    String username, password, phone_number;

    // Creating a user with username, password, and phone number provided
    public User(String username, String password, String phone_number){
        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
    }

    // Creating a user when no phone number is provided
    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.phone_number = "";
    }
}
