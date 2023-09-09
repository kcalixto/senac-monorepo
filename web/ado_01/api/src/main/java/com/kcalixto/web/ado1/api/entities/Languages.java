package com.kcalixto.web.ado1.api.entities;

public class Languages {
    private String name;
    private String writeLevel;
    private String readLevel;
    private String speakLevel;

    public Languages() {
    }

    public Languages(String name, String writeLevel, String readLevel, String speakLevel) {
        this.name = name;
        this.writeLevel = writeLevel;
        this.readLevel = readLevel;
        this.speakLevel = speakLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriteLevel() {
        return writeLevel;
    }

    public void setWriteLevel(String writeLevel) {
        this.writeLevel = writeLevel;
    }

    public String getReadLevel() {
        return readLevel;
    }

    public void setReadLevel(String readLevel) {
        this.readLevel = readLevel;
    }

    public String getSpeakLevel() {
        return speakLevel;
    }

    public void setSpeakLevel(String speakLevel) {
        this.speakLevel = speakLevel;
    }

}
