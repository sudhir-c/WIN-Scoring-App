package com.example.winscoringdemoapplication.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.winscoringdemoapplication.DataStore;
import com.example.winscoringdemoapplication.databinding.FragmentRosterBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class RosterFragment extends Fragment {

    ToggleButton isTeamARosterSwitch;

    EditText playerName1;
    EditText playerName2;
    EditText playerName3;
    EditText playerName4;
    EditText playerName5;
    EditText playerName6;
    EditText playerName7;
    EditText playerName8;
    EditText playerName9;
    EditText playerName10;
    EditText playerName11;
    EditText playerName12;

    EditText playerNumber1;
    EditText playerNumber2;
    EditText playerNumber3;
    EditText playerNumber4;
    EditText playerNumber5;
    EditText playerNumber6;
    EditText playerNumber7;
    EditText playerNumber8;
    EditText playerNumber9;
    EditText playerNumber10;
    EditText playerNumber11;
    EditText playerNumber12;

    EditText playerScore1;
    EditText playerScore2;
    EditText playerScore3;
    EditText playerScore4;
    EditText playerScore5;
    EditText playerScore6;
    EditText playerScore7;
    EditText playerScore8;
    EditText playerScore9;
    EditText playerScore10;
    EditText playerScore11;
    EditText playerScore12;

    CheckBox playerOn1;
    CheckBox playerOn2;
    CheckBox playerOn3;
    CheckBox playerOn4;
    CheckBox playerOn5;
    CheckBox playerOn6;
    CheckBox playerOn7;
    CheckBox playerOn8;
    CheckBox playerOn9;
    CheckBox playerOn10;
    CheckBox playerOn11;
    CheckBox playerOn12;


    private FragmentRosterBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentRosterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        isTeamARosterSwitch = binding.isTeamARosterSwitch;

        playerName1 = binding.playerName1;
        playerName2 = binding.playerName2;
        playerName3 = binding.playerName3;
        playerName4 = binding.playerName4;
        playerName5 = binding.playerName5;
        playerName6 = binding.playerName6;
        playerName7 = binding.playerName7;
        playerName8 = binding.playerName8;
        playerName9 = binding.playerName9;
        playerName10 = binding.playerName10;
        playerName11 = binding.playerName11;
        playerName12 = binding.playerName12;

        playerNumber1 = binding.playerNumber1;
        playerNumber2 = binding.playerNumber2;
        playerNumber3 = binding.playerNumber3;
        playerNumber4 = binding.playerNumber4;
        playerNumber5 = binding.playerNumber5;
        playerNumber6 = binding.playerNumber6;
        playerNumber7 = binding.playerNumber7;
        playerNumber8 = binding.playerNumber8;
        playerNumber9 = binding.playerNumber9;
        playerNumber10 = binding.playerNumber10;
        playerNumber11 = binding.playerNumber11;
        playerNumber12 = binding.playerNumber12;

        playerScore1 = binding.playerScore1;
        playerScore2 = binding.playerScore2;
        playerScore3 = binding.playerScore3;
        playerScore4 = binding.playerScore4;
        playerScore5 = binding.playerScore5;
        playerScore6 = binding.playerScore6;
        playerScore7 = binding.playerScore7;
        playerScore8 = binding.playerScore8;
        playerScore9 = binding.playerScore9;
        playerScore10 = binding.playerScore10;
        playerScore11 = binding.playerScore11;
        playerScore12 = binding.playerScore12;

        playerOn1 = binding.playerOn1;
        playerOn2 = binding.playerOn2;
        playerOn3 = binding.playerOn3;
        playerOn4 = binding.playerOn4;
        playerOn5 = binding.playerOn5;
        playerOn6 = binding.playerOn6;
        playerOn7 = binding.playerOn7;
        playerOn8 = binding.playerOn8;
        playerOn9 = binding.playerOn9;
        playerOn10 = binding.playerOn10;
        playerOn11 = binding.playerOn11;
        playerOn12 = binding.playerOn12;


        isTeamARosterSwitch.setTextOn("Team A");
        isTeamARosterSwitch.setTextOff("Team B");
        isTeamARosterSwitch.setChecked(true);
        isTeamARosterSwitch.setBackgroundColor(Color.rgb(252, 108, 66));
        isTeamARosterSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateUI();
            }
        });

        updateUI();

        return root;
    }

    @Override
    public void onPause() {
        updateData();
        super.onPause();
    }

    @Override
    public void onResume() {
        updateUI();
        super.onResume();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void updateData() {
        if (isTeamARosterSwitch.isChecked()) {
            DataStore.getFullTeamARoster().replace(1, new ArrayList<>(Arrays.asList(playerName1.getText().toString(), playerNumber1.getText().toString(), playerScore1.getText().toString())));
            DataStore.getFullTeamARoster().replace(2, new ArrayList<>(Arrays.asList(playerName2.getText().toString(), playerNumber2.getText().toString(), playerScore2.getText().toString())));
            DataStore.getFullTeamARoster().replace(3, new ArrayList<>(Arrays.asList(playerName3.getText().toString(), playerNumber3.getText().toString(), playerScore3.getText().toString())));
            DataStore.getFullTeamARoster().replace(4, new ArrayList<>(Arrays.asList(playerName4.getText().toString(), playerNumber4.getText().toString(), playerScore4.getText().toString())));
            DataStore.getFullTeamARoster().replace(5, new ArrayList<>(Arrays.asList(playerName5.getText().toString(), playerNumber5.getText().toString(), playerScore5.getText().toString())));
            DataStore.getFullTeamARoster().replace(6, new ArrayList<>(Arrays.asList(playerName6.getText().toString(), playerNumber6.getText().toString(), playerScore6.getText().toString())));
            DataStore.getFullTeamARoster().replace(7, new ArrayList<>(Arrays.asList(playerName7.getText().toString(), playerNumber7.getText().toString(), playerScore7.getText().toString())));
            DataStore.getFullTeamARoster().replace(8, new ArrayList<>(Arrays.asList(playerName8.getText().toString(), playerNumber8.getText().toString(), playerScore8.getText().toString())));
            DataStore.getFullTeamARoster().replace(9, new ArrayList<>(Arrays.asList(playerName9.getText().toString(), playerNumber9.getText().toString(), playerScore9.getText().toString())));
            DataStore.getFullTeamARoster().replace(10, new ArrayList<>(Arrays.asList(playerName10.getText().toString(), playerNumber10.getText().toString(), playerScore10.getText().toString())));
            DataStore.getFullTeamARoster().replace(11, new ArrayList<>(Arrays.asList(playerName11.getText().toString(), playerNumber11.getText().toString(), playerScore11.getText().toString())));
            DataStore.getFullTeamARoster().replace(12, new ArrayList<>(Arrays.asList(playerName12.getText().toString(), playerNumber12.getText().toString(), playerScore12.getText().toString())));
        } else {
            DataStore.getFullTeamBRoster().replace(1, new ArrayList<>(Arrays.asList(playerName1.getText().toString(), playerNumber1.getText().toString(), playerScore1.getText().toString())));
            DataStore.getFullTeamBRoster().replace(2, new ArrayList<>(Arrays.asList(playerName2.getText().toString(), playerNumber2.getText().toString(), playerScore2.getText().toString())));
            DataStore.getFullTeamBRoster().replace(3, new ArrayList<>(Arrays.asList(playerName3.getText().toString(), playerNumber3.getText().toString(), playerScore3.getText().toString())));
            DataStore.getFullTeamBRoster().replace(4, new ArrayList<>(Arrays.asList(playerName4.getText().toString(), playerNumber4.getText().toString(), playerScore4.getText().toString())));
            DataStore.getFullTeamBRoster().replace(5, new ArrayList<>(Arrays.asList(playerName5.getText().toString(), playerNumber5.getText().toString(), playerScore5.getText().toString())));
            DataStore.getFullTeamBRoster().replace(6, new ArrayList<>(Arrays.asList(playerName6.getText().toString(), playerNumber6.getText().toString(), playerScore6.getText().toString())));
            DataStore.getFullTeamBRoster().replace(7, new ArrayList<>(Arrays.asList(playerName7.getText().toString(), playerNumber7.getText().toString(), playerScore7.getText().toString())));
            DataStore.getFullTeamBRoster().replace(8, new ArrayList<>(Arrays.asList(playerName8.getText().toString(), playerNumber8.getText().toString(), playerScore8.getText().toString())));
            DataStore.getFullTeamBRoster().replace(9, new ArrayList<>(Arrays.asList(playerName9.getText().toString(), playerNumber9.getText().toString(), playerScore9.getText().toString())));
            DataStore.getFullTeamBRoster().replace(10, new ArrayList<>(Arrays.asList(playerName10.getText().toString(), playerNumber10.getText().toString(), playerScore10.getText().toString())));
            DataStore.getFullTeamBRoster().replace(11, new ArrayList<>(Arrays.asList(playerName11.getText().toString(), playerNumber11.getText().toString(), playerScore11.getText().toString())));
            DataStore.getFullTeamBRoster().replace(12, new ArrayList<>(Arrays.asList(playerName12.getText().toString(), playerNumber12.getText().toString(), playerScore12.getText().toString())));
        }
    }

    public void updateUI() {
        if (isTeamARosterSwitch.isChecked()) {
            try {
//                playerName1.setText(DataStore.getFullTeamARoster().get(1).get(0));
//                playerNumber1.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(1).get(1)));
//                playerScore1.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(1).get(2)));
//                playerName2.setText(DataStore.getFullTeamARoster().get(2).get(0));
//                playerNumber2.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(2).get(1)));
//                playerScore2.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(2).get(2)));
//                playerName3.setText(DataStore.getFullTeamARoster().get(3).get(0));
//                playerNumber3.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(3).get(1)));
//                playerScore3.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(3).get(2)));
//                playerName4.setText(DataStore.getFullTeamARoster().get(4).get(0));
//                playerNumber4.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(4).get(1)));
//                playerScore4.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(4).get(2)));
//                playerName5.setText(DataStore.getFullTeamARoster().get(5).get(0));
//                playerNumber5.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(5).get(1)));
//                playerScore5.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(5).get(2)));
//                playerName6.setText(DataStore.getFullTeamARoster().get(6).get(0));
//                playerNumber6.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(6).get(1)));
//                playerScore6.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(6).get(2)));
//                playerName7.setText(DataStore.getFullTeamARoster().get(7).get(0));
//                playerNumber7.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(7).get(1)));
//                playerScore7.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(7).get(2)));
//                playerName8.setText(DataStore.getFullTeamARoster().get(8).get(0));
//                playerNumber8.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(8).get(1)));
//                playerScore8.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(8).get(2)));
//                playerName9.setText(DataStore.getFullTeamARoster().get(9).get(0));
//                playerNumber9.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(9).get(1)));
//                playerScore9.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(9).get(2)));
//                playerName10.setText(DataStore.getFullTeamARoster().get(10).get(0));
//                playerNumber10.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(10).get(1)));
//                playerScore10.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(10).get(2)));
//                playerName11.setText(DataStore.getFullTeamARoster().get(11).get(0));
//                playerNumber11.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(11).get(1)));
//                playerScore11.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(11).get(2)));
//                playerName12.setText(DataStore.getFullTeamARoster().get(12).get(0));
//                playerNumber12.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(12).get(1)));
//                playerScore12.setText(Integer.parseInt(DataStore.getFullTeamARoster().get(12).get(2)));
                playerName1.setText(DataStore.getFullTeamARoster().get(1).get(0));
                playerNumber1.setText(DataStore.getFullTeamARoster().get(1).get(1));
                playerScore1.setText(DataStore.getFullTeamARoster().get(1).get(2));
                playerName2.setText(DataStore.getFullTeamARoster().get(2).get(0));
                playerNumber2.setText(DataStore.getFullTeamARoster().get(2).get(1));
                playerScore2.setText(DataStore.getFullTeamARoster().get(2).get(2));
                playerName3.setText(DataStore.getFullTeamARoster().get(3).get(0));
                playerNumber3.setText(DataStore.getFullTeamARoster().get(3).get(1));
                playerScore3.setText(DataStore.getFullTeamARoster().get(3).get(2));
                playerName4.setText(DataStore.getFullTeamARoster().get(4).get(0));
                playerNumber4.setText(DataStore.getFullTeamARoster().get(4).get(1));
                playerScore4.setText(DataStore.getFullTeamARoster().get(4).get(2));
                playerName5.setText(DataStore.getFullTeamARoster().get(5).get(0));
                playerNumber5.setText(DataStore.getFullTeamARoster().get(5).get(1));
                playerScore5.setText(DataStore.getFullTeamARoster().get(5).get(2));
                playerName6.setText(DataStore.getFullTeamARoster().get(6).get(0));
                playerNumber6.setText(DataStore.getFullTeamARoster().get(6).get(1));
                playerScore6.setText(DataStore.getFullTeamARoster().get(6).get(2));
                playerName7.setText(DataStore.getFullTeamARoster().get(7).get(0));
                playerNumber7.setText(DataStore.getFullTeamARoster().get(7).get(1));
                playerScore7.setText(DataStore.getFullTeamARoster().get(7).get(2));
                playerName8.setText(DataStore.getFullTeamARoster().get(8).get(0));
                playerNumber8.setText(DataStore.getFullTeamARoster().get(8).get(1));
                playerScore8.setText(DataStore.getFullTeamARoster().get(8).get(2));
                playerName9.setText(DataStore.getFullTeamARoster().get(9).get(0));
                playerNumber9.setText(DataStore.getFullTeamARoster().get(9).get(1));
                playerScore9.setText(DataStore.getFullTeamARoster().get(9).get(2));
                playerName10.setText(DataStore.getFullTeamARoster().get(10).get(0));
                playerNumber10.setText(DataStore.getFullTeamARoster().get(10).get(1));
                playerScore10.setText(DataStore.getFullTeamARoster().get(10).get(2));
                playerName11.setText(DataStore.getFullTeamARoster().get(11).get(0));
                playerNumber11.setText(DataStore.getFullTeamARoster().get(11).get(1));
                playerScore11.setText(DataStore.getFullTeamARoster().get(11).get(2));
                playerName12.setText(DataStore.getFullTeamARoster().get(12).get(0));
                playerNumber12.setText(DataStore.getFullTeamARoster().get(12).get(1));
                playerScore12.setText(DataStore.getFullTeamARoster().get(12).get(2));
            } catch (NumberFormatException e) {
                playerName1.setText(DataStore.getFullTeamARoster().get(1).get(0));
                playerNumber1.setText("0");
                playerScore1.setText("0");
                playerName2.setText(DataStore.getFullTeamARoster().get(2).get(0));
                playerNumber2.setText("0");
                playerScore2.setText("0");
                playerName3.setText(DataStore.getFullTeamARoster().get(3).get(0));
                playerNumber3.setText("0");
                playerScore3.setText("0");
                playerName4.setText(DataStore.getFullTeamARoster().get(4).get(0));
                playerNumber4.setText("0");
                playerScore4.setText("0");
                playerName5.setText(DataStore.getFullTeamARoster().get(5).get(0));
                playerNumber5.setText("0");
                playerScore5.setText("0");
                playerName6.setText(DataStore.getFullTeamARoster().get(6).get(0));
                playerNumber6.setText("0");
                playerScore6.setText("0");
                playerName7.setText(DataStore.getFullTeamARoster().get(7).get(0));
                playerNumber7.setText("0");
                playerScore7.setText("0");
                playerName8.setText(DataStore.getFullTeamARoster().get(8).get(0));
                playerNumber8.setText("0");
                playerScore8.setText("0");
                playerName9.setText(DataStore.getFullTeamARoster().get(9).get(0));
                playerNumber9.setText("0");
                playerScore9.setText("0");
                playerName10.setText(DataStore.getFullTeamARoster().get(10).get(0));
                playerNumber10.setText("0");
                playerScore10.setText("0");
                playerName11.setText(DataStore.getFullTeamARoster().get(11).get(0));
                playerNumber11.setText("0");
                playerScore11.setText("0");
                playerName12.setText(DataStore.getFullTeamARoster().get(12).get(0));
                playerNumber12.setText("0");
                playerScore12.setText("0");
            }
        } else {
            try {
//                playerName1.setText(DataStore.getFullTeamBRoster().get(1).get(0));
//                playerNumber1.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(1).get(1)));
//                playerScore1.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(1).get(2)));
//                playerName2.setText(DataStore.getFullTeamBRoster().get(2).get(0));
//                playerNumber2.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(2).get(1)));
//                playerScore2.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(2).get(2)));
//                playerName3.setText(DataStore.getFullTeamBRoster().get(3).get(0));
//                playerNumber3.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(3).get(1)));
//                playerScore3.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(3).get(2)));
//                playerName4.setText(DataStore.getFullTeamBRoster().get(4).get(0));
//                playerNumber4.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(4).get(1)));
//                playerScore4.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(4).get(2)));
//                playerName5.setText(DataStore.getFullTeamBRoster().get(5).get(0));
//                playerNumber5.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(5).get(1)));
//                playerScore5.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(5).get(2)));
//                playerName6.setText(DataStore.getFullTeamBRoster().get(6).get(0));
//                playerNumber6.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(6).get(1)));
//                playerScore6.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(6).get(2)));
//                playerName7.setText(DataStore.getFullTeamBRoster().get(7).get(0));
//                playerNumber7.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(7).get(1)));
//                playerScore7.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(7).get(2)));
//                playerName8.setText(DataStore.getFullTeamBRoster().get(8).get(0));
//                playerNumber8.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(8).get(1)));
//                playerScore8.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(8).get(2)));
//                playerName9.setText(DataStore.getFullTeamBRoster().get(9).get(0));
//                playerNumber9.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(9).get(1)));
//                playerScore9.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(9).get(2)));
//                playerName10.setText(DataStore.getFullTeamBRoster().get(10).get(0));
//                playerNumber10.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(10).get(1)));
//                playerScore10.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(10).get(2)));
//                playerName11.setText(DataStore.getFullTeamBRoster().get(11).get(0));
//                playerNumber11.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(11).get(1)));
//                playerScore11.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(11).get(2)));
//                playerName12.setText(DataStore.getFullTeamBRoster().get(12).get(0));
//                playerNumber12.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(12).get(1)));
//                playerScore12.setText(Integer.parseInt(DataStore.getFullTeamBRoster().get(12).get(2)));
                playerName1.setText(DataStore.getFullTeamBRoster().get(1).get(0));
                playerNumber1.setText(DataStore.getFullTeamBRoster().get(1).get(1));
                playerScore1.setText(DataStore.getFullTeamBRoster().get(1).get(2));
                playerName2.setText(DataStore.getFullTeamBRoster().get(2).get(0));
                playerNumber2.setText(DataStore.getFullTeamBRoster().get(2).get(1));
                playerScore2.setText(DataStore.getFullTeamBRoster().get(2).get(2));
                playerName3.setText(DataStore.getFullTeamBRoster().get(3).get(0));
                playerNumber3.setText(DataStore.getFullTeamBRoster().get(3).get(1));
                playerScore3.setText(DataStore.getFullTeamBRoster().get(3).get(2));
                playerName4.setText(DataStore.getFullTeamBRoster().get(4).get(0));
                playerNumber4.setText(DataStore.getFullTeamBRoster().get(4).get(1));
                playerScore4.setText(DataStore.getFullTeamBRoster().get(4).get(2));
                playerName5.setText(DataStore.getFullTeamBRoster().get(5).get(0));
                playerNumber5.setText(DataStore.getFullTeamBRoster().get(5).get(1));
                playerScore5.setText(DataStore.getFullTeamBRoster().get(5).get(2));
                playerName6.setText(DataStore.getFullTeamBRoster().get(6).get(0));
                playerNumber6.setText(DataStore.getFullTeamBRoster().get(6).get(1));
                playerScore6.setText(DataStore.getFullTeamBRoster().get(6).get(2));
                playerName7.setText(DataStore.getFullTeamBRoster().get(7).get(0));
                playerNumber7.setText(DataStore.getFullTeamBRoster().get(7).get(1));
                playerScore7.setText(DataStore.getFullTeamBRoster().get(7).get(2));
                playerName8.setText(DataStore.getFullTeamBRoster().get(8).get(0));
                playerNumber8.setText(DataStore.getFullTeamBRoster().get(8).get(1));
                playerScore8.setText(DataStore.getFullTeamBRoster().get(8).get(2));
                playerName9.setText(DataStore.getFullTeamBRoster().get(9).get(0));
                playerNumber9.setText(DataStore.getFullTeamBRoster().get(9).get(1));
                playerScore9.setText(DataStore.getFullTeamBRoster().get(9).get(2));
                playerName10.setText(DataStore.getFullTeamBRoster().get(10).get(0));
                playerNumber10.setText(DataStore.getFullTeamBRoster().get(10).get(1));
                playerScore10.setText(DataStore.getFullTeamBRoster().get(10).get(2));
                playerName11.setText(DataStore.getFullTeamBRoster().get(11).get(0));
                playerNumber11.setText(DataStore.getFullTeamBRoster().get(11).get(1));
                playerScore11.setText(DataStore.getFullTeamBRoster().get(11).get(2));
                playerName12.setText(DataStore.getFullTeamBRoster().get(12).get(0));
                playerNumber12.setText(DataStore.getFullTeamBRoster().get(12).get(1));
                playerScore12.setText(DataStore.getFullTeamBRoster().get(12).get(2));
            } catch (NumberFormatException e) {
                playerName1.setText(DataStore.getFullTeamBRoster().get(1).get(0));
                playerNumber1.setText("0");
                playerScore1.setText("0");
                playerName2.setText(DataStore.getFullTeamBRoster().get(2).get(0));
                playerNumber2.setText("0");
                playerScore2.setText("0");
                playerName3.setText(DataStore.getFullTeamBRoster().get(3).get(0));
                playerNumber3.setText("0");
                playerScore3.setText("0");
                playerName4.setText(DataStore.getFullTeamBRoster().get(4).get(0));
                playerNumber4.setText("0");
                playerScore4.setText("0");
                playerName5.setText(DataStore.getFullTeamBRoster().get(5).get(0));
                playerNumber5.setText("0");
                playerScore5.setText("0");
                playerName6.setText(DataStore.getFullTeamBRoster().get(6).get(0));
                playerNumber6.setText("0");
                playerScore6.setText("0");
                playerName7.setText(DataStore.getFullTeamBRoster().get(7).get(0));
                playerNumber7.setText("0");
                playerScore7.setText("0");
                playerName8.setText(DataStore.getFullTeamBRoster().get(8).get(0));
                playerNumber8.setText("0");
                playerScore8.setText("0");
                playerName9.setText(DataStore.getFullTeamBRoster().get(9).get(0));
                playerNumber9.setText("0");
                playerScore9.setText("0");
                playerName10.setText(DataStore.getFullTeamBRoster().get(10).get(0));
                playerNumber10.setText("0");
                playerScore10.setText("0");
                playerName11.setText(DataStore.getFullTeamBRoster().get(11).get(0));
                playerNumber11.setText("0");
                playerScore11.setText("0");
                playerName12.setText(DataStore.getFullTeamBRoster().get(12).get(0));
                playerNumber12.setText("0");
                playerScore12.setText("0");
            }
        }
    }
}