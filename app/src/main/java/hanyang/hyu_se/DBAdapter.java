package hanyang.hyu_se;

import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by ccman on 2016. 6. 15..
 */

public class DBAdapter {

    static final String chatroom_dbname = "JoinedChatRoomList";
    static final String msg_dbname = "JoinedChatRoomMsg";

    //데이터 베이스를 이용하는 컨텍스트
    private Context context;
    //데이터 연동객체
    private SQLiteDatabase db;


    public DBAdapter(Context context) {
        this.context = context;
        this.open();
        //test code

        Log.d("LocalUserDB","db insert done");
    }

    public void open() throws SQLException {
        try {

            db = (new DBHelper(context).getWritableDatabase());
        } catch(SQLiteException e) {
            db = (new DBHelper(context).getReadableDatabase());
        }
    }

    public void insert_chatroom(String GroupCode, int ChatRoomID, String ChatRoomName) {
        try {
            ContentValues values = new ContentValues();
            values.put("GroupCode",GroupCode);
            values.put("ChatRoomID", ChatRoomID);
            values.put("ChatRoomName",ChatRoomName);
            long result = db.insert(chatroom_dbname,null,values);
        } catch(Exception e) {

        }
    }

    public void insert_msg(String GroupCode, int ChatRoomID, String SenderID, String MsgContent, String MsgTime) {
        try {
            ContentValues values = new ContentValues();
            values.put("GroupCode", GroupCode);
            values.put("ChatRoomID", ChatRoomID);
            values.put("SenderID", SenderID);
            values.put("MsgContent", MsgContent);
            values.put("MsgTime", MsgTime);

            long result = db.insert(msg_dbname,null,values);
        } catch(Exception e) {

        }
    }

    public Cursor select_all_chatroom() {
        Cursor c = db.query("JoinedChatRoomList", //table name
                new String[] {"GroupCode","ChatRoomID","ChatRoomName"}, //colum 명세
                null, //where
                null, //where 절에 전달할 데이터
                null, //group by
                null, //having
                "ChatRoomID" + " DESC" //order by
        );
        return c;
    }

    public ArrayList<ChatRoom_DB> get_all_chatroom() {
        ArrayList<ChatRoom_DB> chatrooms = new ArrayList<ChatRoom_DB>();
        Cursor c = select_all_chatroom();
        if(c.moveToFirst()) {
            int indexGroupCode = c.getColumnIndex("GroupCode");
            int indexChatRoomID = c.getColumnIndex("ChatRoomID");
            int indexChatRoomName = c.getColumnIndex("ChatRoomName");
            do {

                String GroupCode = c.getString(indexGroupCode);
                int ChatRoomID = c.getInt(indexChatRoomID);
                String ChatRoomName = c.getString(indexChatRoomName);

                chatrooms.add(new ChatRoom_DB(GroupCode, ChatRoomID, ChatRoomName));
            } while(c.moveToNext());
        }

        return chatrooms;
    }

    public Cursor select_all_Msgs() {
        Cursor c = db.query("JoinedChatRoomMsg", //table name
                new String[] {"MsgID","GroupCode","ChatRoomID", "SenderID", "MsgContent", "MsgTime"}, //colum 명세
                null, //where
                null, //where 절에 전달할 데이터
                null, //group by
                null, //having
                "MsgID" + " DESC" //order by
        );
        return c;
    }

    public ArrayList<Msg_DB> get_all_Msgs() {
        ArrayList<Msg_DB> msgs = new ArrayList<Msg_DB>();
        Cursor c = select_all_Msgs();
        if(c.moveToFirst()) {
            int indexMsgID = c.getColumnIndex("MsgID");
            int indexGroupCode = c.getColumnIndex("GroupCode");
            int indexChatRoomID = c.getColumnIndex("ChatRoomID");
            int indexSenderID = c.getColumnIndex("SenderID");
            int indexMsgContent = c.getColumnIndex("MsgContent");
            int indexMsgTime = c.getColumnIndex("MsgTime");
            do {
                int MsgID = c.getInt(indexMsgID);
                String GroupCode = c.getString(indexGroupCode);
                int ChatRoomID = c.getInt(indexChatRoomID);
                String SenderID = c.getString(indexSenderID);
                String MsgContent = c.getString(indexMsgContent);
                String MsgTime = c.getString(indexMsgTime);

                msgs.add(new Msg_DB(MsgID, GroupCode, ChatRoomID, SenderID, MsgContent, MsgTime));
            } while(c.moveToNext());
        }

        return msgs;
    }

    //여기까지.
    public void delete_msgs(int MsgID, String GroupCode, int ChatRoomID) {
        db.delete(msg_dbname, //table name
                "MsgID=? and GroupCode=? and ChatRoom=?", //where 절
                new String[] {Integer.toString(MsgID), GroupCode, Integer.toString(ChatRoomID)} //where절 들어갈 데이터
        );
    }

    public void delete_chatroom(String GroupCode, int ChatRoomID) {
        db.delete(chatroom_dbname, //table name
                "GroupCode=? and ChatRoom=?", //where 절
                new String[] {GroupCode, Integer.toString(ChatRoomID)} //where절 들어갈 데이터
        );
    }

    public void Close() {
        db.close();
    }

}

