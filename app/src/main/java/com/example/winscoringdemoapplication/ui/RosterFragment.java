package com.example.winscoringdemoapplication.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.winscoringdemoapplication.databinding.FragmentRosterBinding;

public class RosterFragment extends Fragment {
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

        return root;
    }
    @Override
    public void onPause() {
        super.onPause();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}