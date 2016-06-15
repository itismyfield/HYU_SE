package hanyang.hyu_se;

public class ChatRoom_DB{
    String GroupCode;
    int ChatRoomID;
    String ChatRoomName;

    public ChatRoom_DB() {

    }

    public ChatRoom_DB(String GroupCode, int ChatRoomID, String ChatRoomName){
        this.GroupCode = GroupCode;
        this.ChatRoomID = ChatRoomID;
        this.ChatRoomName = ChatRoomName;
    }

    public String getGroupCode(){
        return this.GroupCode;
    }

    public void setGroupCode(String GroupCode){
        this.GroupCode = GroupCode;
    }

    public int getChatRoomID(){
        return this.ChatRoomID;
    }

    public void setChatRoomID(int ChatRoomID){
        this.ChatRoomID = ChatRoomID;
    }

    public String getChatRoomName(){
        return this.ChatRoomName;
    }

    public void setChatRoomName(String ChatRoomName){
        this.ChatRoomName =  ChatRoomName;
    }
}
