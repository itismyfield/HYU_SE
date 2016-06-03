package hanyang.hyu_se;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Josh on 6/3/16.
 *
 * Storing the user's account on the user's local phone
 */
public class UserLocalStore {
    public static final String SP_Name = "userDetails";
    // Shared Preference allows us to store data on the phone
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_Name, 0);
    }

    /* Methods to set/get the data */
    public void storeUserData(User user){
        // allows us to edit data
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("username", user.username);
        spEditor.putString("password", user.password);
        spEditor.putString("phone_number", user.phone_number);
        spEditor.commit();// saves the changes
    }

    public User getLoggedInUser(){
        String username = userLocalDatabase.getString("username", "");
        String password = userLocalDatabase.getString("password", "");
        String phone_number = userLocalDatabase.getString("phone_number", "");

        User storedUser = new User(username, password, phone_number);
        return storedUser;
    }

    public void setUserLoggedIn(boolean loggedIn){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedIn(){
        if (userLocalDatabase.getBoolean("loggedIn", false) == true)
            return true;
        else
            return false;
    }

    public void clearUserData(){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
