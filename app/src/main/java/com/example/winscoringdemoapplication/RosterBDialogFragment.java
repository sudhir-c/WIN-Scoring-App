package com.example.winscoringdemoapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.example.winscoringdemoapplication.databinding.DialogfragmentRosterBBinding;

public class RosterBDialogFragment extends DialogFragment {
    EditText playerName1teamB;
    EditText playerName2teamB;
    EditText playerName3teamB;
    EditText playerName4teamB;
    EditText playerName5teamB;
    EditText playerName6teamB;

    public @NonNull DialogfragmentRosterBBinding binding;

    static RosterBDialogFragment newInstance() {
        RosterBDialogFragment instance = new RosterBDialogFragment();
        return instance;
    }



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = DialogfragmentRosterBBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        playerName1teamB = binding.playerName1teamB;
        playerName2teamB = binding.playerName2teamB;
        playerName3teamB = binding.playerName3teamB;
        playerName4teamB = binding.playerName4teamB;
        playerName5teamB = binding.playerName5teamB;
        playerName6teamB = binding.playerName6teamB;

        playerName1teamB.setText(DataStore.getTeamB()[0]);
        playerName2teamB.setText(DataStore.getTeamB()[1]);
        playerName3teamB.setText(DataStore.getTeamB()[2]);
        playerName4teamB.setText(DataStore.getTeamB()[3]);
        playerName5teamB.setText(DataStore.getTeamB()[4]);
        playerName6teamB.setText(DataStore.getTeamB()[5]);

        setStyle(STYLE_NO_FRAME, android.R.style.Theme_Holo_Light);
//        int width = getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
//        int height = getResources().getDimensionPixelSize(R.dimen.activity_vertical_margin);
//        getDialog().getWindow().setLayout(width, height);

        return root;
    }

    public void onPause() {
        String[] teamB = {
                playerName1teamB.getText().toString(),
                playerName2teamB.getText().toString(),
                playerName3teamB.getText().toString(),
                playerName4teamB.getText().toString(),
                playerName5teamB.getText().toString(),
                playerName6teamB.getText().toString(),
        };
        DataStore.setTeamB(teamB);
        super.onPause();
    }


    @Override
    public void onDestroyView() {
        String[] teamB = {
                playerName1teamB.getText().toString(),
                playerName2teamB.getText().toString(),
                playerName3teamB.getText().toString(),
                playerName4teamB.getText().toString(),
                playerName5teamB.getText().toString(),
                playerName6teamB.getText().toString(),
        };
        DataStore.setTeamB(teamB);
        super.onDestroyView();
        binding = null;
    }

}
