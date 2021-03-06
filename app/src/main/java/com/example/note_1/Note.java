package com.example.note_1;

public class Note {
    private int id;
    private String title;
    private String content;
    private String time;
    private int modeAlarm;
    private boolean done;
    private boolean alarm;

    public Note(){

    }

    public Note(int id, String title, String content, String time, int modeAlarm, boolean alarm, boolean done) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
        this.modeAlarm = modeAlarm;
        this.alarm = alarm;
        this.done = done;
    }

    public Note(String title, String content, String time, int modeAlarm, boolean alarm) {
        this.title = title;
        this.content = content;
        this.time = time;
        this.modeAlarm = modeAlarm;
        this.alarm = alarm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getModeAlarm() {
        return modeAlarm;
    }

    public void setModeAlarm(int modeAlarm) {
        this.modeAlarm = modeAlarm;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isAlarm() {
        return alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
