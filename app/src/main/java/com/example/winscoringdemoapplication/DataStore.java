package com.example.winscoringdemoapplication;

public class DataStore {
    private static String[] teamA = {};
    private static String[] teamB = {};
    private static int player1teamAScore;
    private static int player2teamAScore;
    private static int player3teamAScore;

    public static int getPlayer1teamBScore() {
        return player1teamBScore;
    }

    public static void setPlayer1teamBScore(int player1teamBScore) {
        DataStore.player1teamBScore = player1teamBScore;
    }

    public static int getPlayer2teamBScore() {
        return player2teamBScore;
    }

    public static void setPlayer2teamBScore(int player2teamBScore) {
        DataStore.player2teamBScore = player2teamBScore;
    }

    public static int getPlayer3teamBScore() {
        return player3teamBScore;
    }

    public static void setPlayer3teamBScore(int player3teamBScore) {
        DataStore.player3teamBScore = player3teamBScore;
    }

    private static int player1teamBScore;
    private static int player2teamBScore;
    private static int player3teamBScore;




    public static int getPlayer3teamAScore() {
        return player3teamAScore;
    }

    public static void setPlayer3teamAScore(int player3teamAScore) {
        DataStore.player3teamAScore = player3teamAScore;
    }




    public static int getPlayer2teamAScore() {
        return player2teamAScore;
    }

    public static void setPlayer2teamAScore(int player2teamAScore) {
        DataStore.player2teamAScore = player2teamAScore;
    }



    public static int getPlayer1teamAScore() {
        return player1teamAScore;
    }

    public static void setPlayer1teamAScore(int player1teamAScore) {
        DataStore.player1teamAScore = player1teamAScore;
    }

    public static String[] getTeamA() {
        return teamA;
    }

    public static void setTeamA(String[] teamA) {
        DataStore.teamA = teamA;
    }

    public static String[] getTeamB() {
        return teamB;
    }

    public static void setTeamB(String[] teamB) {
        DataStore.teamB = teamB;
    }


}
