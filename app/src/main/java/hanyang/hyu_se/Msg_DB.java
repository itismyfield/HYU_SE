package hanyang.hyu_se;

public class Msg_DB{
    int MsgID;
    String GroupCode;
    int ChatRoomID;
    String SenderID;
    String MsgContent;
    String MsgTime;

    public Msg_DB(){
    }

    public Msg_DB(int MsgID, String GroupCode, int ChatRoomID, String SenderID, String MsgContent, String MsgTime){
        this.MsgID = MsgID;
        this.GroupCode = GroupCode;
        this.ChatRoomID = ChatRoomID;
        this.SenderID = SenderID;
        this.MsgContent = MsgContent;
        this.MsgTime = MsgTime;
    }


    public int getMsgID(){
        return this.MsgID;
    }

    public void setMsgID(int MsgID){
        this.MsgID = MsgID;
    }

    public int getChatRoomID(){
        return this.ChatRoomID;
    }

    public void setChatRoomID(int ChatRoomID){
        this.ChatRoomID = ChatRoomID;
    }

    public String getGroupCode(){
        return this.GroupCode;
    }

    public void setGroupCode(String GroupCode){
        this.GroupCode = GroupCode;
    }

    public String getSenderID(){
        return this.SenderID;
    }

    public void setSenderID(String SenderID){
        this.SenderID = SenderID;
    }

    public String getMsgContent(){
        return this.MsgContent;
    }

    public void setMsgContent(String MsgContent){
        this.MsgContent = MsgContent;
    }

    public String getMsgTime(){
        return this.MsgTime;
    }

    public void setMsgTime(String MsgTime){
        this.MsgTime = MsgTime;
    }

}
