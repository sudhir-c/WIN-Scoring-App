package com.example.winscoringdemoapplication.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.winscoringdemoapplication.DataStore;
import com.example.winscoringdemoapplication.databinding.FragmentMatchInformationBinding;

public class MatchInformationFragment extends Fragment {
    EditText playerName1teamA;
    EditText playerName2teamA;
    EditText playerName3teamA;
    EditText playerName4teamA;
    EditText playerName5teamA;
    EditText playerName6teamA;

    EditText playerName1teamB;
    EditText playerName2teamB;
    EditText playerName3teamB;
    EditText playerName4teamB;
    EditText playerName5teamB;
    EditText playerName6teamB;
    private FragmentMatchInformationBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentMatchInformationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        playerName1teamA = binding.playerName1teamA;
//        playerName2teamA = binding.playerName2teamA;
//        playerName3teamA = binding.playerName3teamA;
//        playerName4teamA = binding.playerName4teamA;
//        playerName5teamA = binding.playerName5teamA;
//        playerName6teamA = binding.playerName6teamA;
//
//        playerName1teamB = binding.playerName1teamB;
//        playerName2teamB = binding.playerName2teamB;
//        playerName3teamB = binding.playerName3teamB;
//        playerName4teamB = binding.playerName4teamB;
//        playerName5teamB = binding.playerName5teamB;
//        playerName6teamB = binding.playerName6teamB;

//        final TextView textView = binding.textHome;
//        .getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
    @Override
    public void onPause() {
        String[] teamA = {
                playerName1teamA.getText().toString(),
                playerName2teamA.getText().toString(),
                playerName3teamA.getText().toString(),
                playerName4teamA.getText().toString(),
                playerName5teamA.getText().toString(),
                playerName6teamA.getText().toString(),
        };

        String[] teamB = {
                playerName1teamB.getText().toString(),
                playerName2teamB.getText().toString(),
                playerName3teamB.getText().toString(),
                playerName4teamB.getText().toString(),
                playerName5teamB.getText().toString(),
                playerName6teamB.getText().toString(),
        };
        DataStore.setTeamA(teamA);
        DataStore.setTeamB(teamB);
        super.onPause();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}