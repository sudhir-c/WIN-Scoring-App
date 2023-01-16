package com.example.winscoringdemoapplication.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.example.winscoringdemoapplication.DataStore;
import com.example.winscoringdemoapplication.databinding.DialogfragmentRosterErrorBinding;

public class RosterErrorDialogFragment extends DialogFragment {
    TextView teamAErrorTitle;
    TextView invalidPlayerAmountTeamA;
    TextView invalidPlayerAmountTeamB;

    TextView teamBErrorTitle;
    TextView invalidPlayerScoreTeamA;
    TextView invalidPlayerScoreTeamB;



    public @NonNull DialogfragmentRosterErrorBinding binding;

    static RosterErrorDialogFragment newInstance() {
        RosterErrorDialogFragment instance = new RosterErrorDialogFragment();
        return instance;
    }



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = DialogfragmentRosterErrorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        setStyle(STYLE_NORMAL, android.R.style.Theme_Holo_Light);
        teamAErrorTitle = binding.teamAErrorTitle;
        invalidPlayerAmountTeamA = binding.invalidPlayerAmountTeamA;
        invalidPlayerAmountTeamB = binding.invalidPlayerAmountTeamB;
        teamBErrorTitle = binding.teamBErrorTitle;
        invalidPlayerScoreTeamA = binding.invalidPlayerScoreTeamA;
        invalidPlayerScoreTeamB = binding.invalidPlayerScoreTeamB;

        invalidPlayerAmountTeamA.setVisibility(View.GONE);
        invalidPlayerAmountTeamB.setVisibility(View.GONE);
        invalidPlayerScoreTeamA.setVisibility(View.GONE);
        invalidPlayerScoreTeamB.setVisibility(View.GONE);

        if (DataStore.isIsActiveTeamANot5()) {
            invalidPlayerAmountTeamA.setVisibility(View.VISIBLE);
        }
        if (DataStore.isIsActiveTeamBNot5()) {
            invalidPlayerAmountTeamB.setVisibility(View.VISIBLE);
        }
        if (DataStore.doesActiveTeamAPointsExceed14()) {
            invalidPlayerScoreTeamA.setVisibility(View.VISIBLE);
        }
        if (DataStore.doesActiveTeamBPointsExceed14()) {
            invalidPlayerScoreTeamB.setVisibility(View.VISIBLE);
        }
        if (!DataStore.isIsActiveTeamANot5() && !DataStore.doesActiveTeamAPointsExceed14()) {
            teamAErrorTitle.setText("Team A ✔️");
        }
        if (!DataStore.isIsActiveTeamBNot5() && !DataStore.doesActiveTeamBPointsExceed14()) {
            teamBErrorTitle.setText("Team B ✔️");
        }
        return root;
    }



    public void onPause() {
        super.onPause();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
