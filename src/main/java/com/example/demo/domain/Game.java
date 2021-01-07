package com.example.demo.domain;

public class Game {
    private Integer gameId;
    private String gameName;
    private String gameType;
    private String gameCompany;
    private Integer gameYear;

    public Game() {
    }

    public Game(Integer gameId, String gameName, String gameType, String gameCompany, Integer gameYear) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameType = gameType;
        this.gameCompany = gameCompany;
        this.gameYear = gameYear;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGameCompany() {
        return gameCompany;
    }

    public void setGameCompany(String gameCompany) {
        this.gameCompany = gameCompany;
    }

    public Integer getGameYear() {
        return gameYear;
    }

    public void setGameYear(Integer gameYear) {
        this.gameYear = gameYear;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", gameType='" + gameType + '\'' +
                ", gameCompany='" + gameCompany + '\'' +
                ", gameYear=" + gameYear +
                '}';
    }
}
