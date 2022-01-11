package com.example.ServerChatSpring.model.msg;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table
public class Msg {
    @Id
    @Column(name = "msgId")
    private int msgId;
    @Column(name = "userId_FK")
    private Integer userIdFk;
    private String text;
    private String date;

    public Msg(int userIdFk, String text, String date) {
        this.userIdFk = userIdFk;
        this.text = text;
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public int getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(Integer userIdFk) {
        this.userIdFk = userIdFk;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msgId=" + msgId +
                ", userIdFk=" + userIdFk +
                ", text='" + text + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
