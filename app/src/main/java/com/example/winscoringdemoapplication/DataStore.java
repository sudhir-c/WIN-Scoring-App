package com.example.winscoringdemoapplication;

import java.util.List;
import java.util.Map;

public class DataStore {
    private static String[] teamA = {"", "", "", "", "", "",};
    private static String[] teamB = {"", "", "", "", "", "",};
    private static int player1teamAScore;
    private static int player2teamAScore;
    private static int player3teamAScore;
    private static int player4teamAScore;
    private static int player5teamAScore;

    private static int player1teamBScore;
    private static int player2teamBScore;
    private static int player3teamBScore;



    private static int player4teamBScore;
    private static int player5teamBScore;

    private static int[] dayMonthYear = {00, 00, 0000};
    private static String scorekeeperName;
    private static String matchLocation;
    private static String teamACoach;
    private static String teamBCoach;
    private static String teamAName;
    private static String teamBName;

    private static List<String> teamAFouls;
    private static List<String> teamBFouls;


    public static String getScorekeeperName() {
        return scorekeeperName;
    }

    public static void setScorekeeperName(String scorekeeperName) {
        DataStore.scorekeeperName = scorekeeperName;
    }

    public static String getMatchLocation() {
        return matchLocation;
    }

    public static void setMatchLocation(String matchLocation) {
        DataStore.matchLocation = matchLocation;
    }

    public static String getTeamACoach() {
        return teamACoach;
    }

    public static void setTeamACoach(String teamACoach) {
        DataStore.teamACoach = teamACoach;
    }

    public static String getTeamBCoach() {
        return teamBCoach;
    }

    public static void setTeamBCoach(String teamBCoach) {
        DataStore.teamBCoach = teamBCoach;
    }

    public static String getTeamAName() {
        return teamAName;
    }

    public static void setTeamAName(String teamAName) {
        DataStore.teamAName = teamAName;
    }

    public static String getTeamBName() {
        return teamBName;
    }

    public static void setTeamBName(String teamBName) {
        DataStore.teamBName = teamBName;
    }

    public static int[] getDayMonthYear() {
        return dayMonthYear;
    }

    public static void setDayMonthYear(int[] yearMonthDay) {
        DataStore.dayMonthYear = yearMonthDay;
    }




    public static int getPlayer4teamAScore() {
        return player4teamAScore;
    }

    public static void setPlayer4teamAScore(int player4teamAScore) {
        DataStore.player4teamAScore = player4teamAScore;
    }

    public static int getPlayer5teamAScore() {
        return player5teamAScore;
    }

    public static void setPlayer5teamAScore(int player5teamAScore) {
        DataStore.player5teamAScore = player5teamAScore;
    }

    public static int getPlayer4teamBScore() {
        return player4teamBScore;
    }

    public static void setPlayer4teamBScore(int player4teamBScore) {
        DataStore.player4teamBScore = player4teamBScore;
    }

    public static int getPlayer5teamBScore() {
        return player5teamBScore;
    }

    public static void setPlayer5teamBScore(int player5teamBScore) {
        DataStore.player5teamBScore = player5teamBScore;
    }

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
