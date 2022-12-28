package com.example.winscoringdemoapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.winscoringdemoapplication.databinding.DialogfragmentRosterABinding;
import com.example.winscoringdemoapplication.databinding.FragmentGeneralInfoBinding;

public class RosterADialogFragment extends DialogFragment {
    EditText playerName1teamA;
    EditText playerName2teamA;
    EditText playerName3teamA;
    EditText playerName4teamA;
    EditText playerName5teamA;

    public @NonNull DialogfragmentRosterABinding binding;

    static RosterADialogFragment newInstance() {
        RosterADialogFragment instance = new RosterADialogFragment();
        return instance;
    }



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = DialogfragmentRosterABinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        playerName1teamA = binding.playerName1teamA;
        playerName2teamA = binding.playerName2teamA;
        playerName3teamA = binding.playerName3teamA;
        playerName4teamA = binding.playerName4teamA;
        playerName5teamA = binding.playerName5teamA;

        playerName1teamA.setText(DataStore.getTeamA()[0]);
        playerName2teamA.setText(DataStore.getTeamA()[1]);
        playerName3teamA.setText(DataStore.getTeamA()[2]);
        playerName4teamA.setText(DataStore.getTeamA()[3]);
        playerName5teamA.setText(DataStore.getTeamA()[4]);

        setStyle(STYLE_NO_FRAME, android.R.style.Theme_Holo_Light);
//        int width = getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
//        int height = getResources().getDimensionPixelSize(R.dimen.activity_vertical_margin);
//        getDialog().getWindow().setLayout(width, height);

        return root;
    }

    public void onPause() {
        String[] teamA = {
                playerName1teamA.getText().toString(),
                playerName2teamA.getText().toString(),
                playerName3teamA.getText().toString(),
                playerName4teamA.getText().toString(),
                playerName5teamA.getText().toString(),
        };
        DataStore.setTeamA(teamA);
        super.onPause();
    }


    @Override
    public void onDestroyView() {
        String[] teamA = {
                playerName1teamA.getText().toString(),
                playerName2teamA.getText().toString(),
                playerName3teamA.getText().toString(),
                playerName4teamA.getText().toString(),
                playerName5teamA.getText().toString(),
        };
        DataStore.setTeamA(teamA);
        super.onDestroyView();
        binding = null;
    }

}
