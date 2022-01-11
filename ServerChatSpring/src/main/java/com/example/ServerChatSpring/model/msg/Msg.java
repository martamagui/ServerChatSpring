package com.example.ServerChatSpring.model.msg;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table
public class Msg {
    @Id
    @Column(name = "msgid")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int msgId;
    @Column(name = "useridfk")
    private Integer userIdFk;
    private String text;
    private String date;

    //Es necesario siempre un constructor vacio
    public Msg() {
    }

    public Msg(Integer userIdFk, String text, String date) {
        this.userIdFk = userIdFk;
        this.text = text;
        this.date = date;
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
