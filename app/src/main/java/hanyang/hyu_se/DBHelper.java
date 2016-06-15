package hanyang.hyu_se;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by ccman on 2016. 6. 15..
 */

public class DBHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "LocalUser.db";
    private static final int DB_VER = 1;

    public DBHelper(Context context){
        super(context, DB_NAME, null, DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE JoinedChatRoomList(" +
                "GroupCode VARCHAR(8), " +
                "ChatRoomID INT, " +
                "ChatRoomName VARCHAR(30), " +
                "PRIMARY KEY(GroupCode, ChatRoomID)" +
                ");";
        db.execSQL(sql);
        sql = "CREATE TABLE JoinedChatRoomMsg(" +
                "MsgID INT AUTO_INCREMENT," +
                "GroupCode VARCHAR(8)," +
                "ChatRoomID INT," +
                "SenderID VARCHAR(30)," +
                "MsgContent VARCHAR(200)," +
                "MsgTime TIMESTAMP," +
                "PRIMARY KEY(MsgID)" +
                ");";
        db.execSQL(sql);
        Log.d("LocalUser", "db create");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        // TODO Auto-generated method stub
        String sql_droptable = "DROP TABLE IF EXISTS " + "JoinedChatRoomList;";
        db.execSQL(sql_droptable);
        sql_droptable = "DROP TABLE IF EXISTS " + "JoinedChatRoomMsg;";
        db.execSQL(sql_droptable);
    }
}
