package com.example.winscoringdemoapplication.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.winscoringdemoapplication.DataStore;
import com.example.winscoringdemoapplication.databinding.FragmentGeneralInfoBinding;
import com.example.winscoringdemoapplication.ui.DatePickerFragment;
import com.example.winscoringdemoapplication.ui.RosterADialogFragment;
import com.example.winscoringdemoapplication.ui.RosterBDialogFragment;

public class GeneralInfoFragment extends Fragment {
    public FragmentGeneralInfoBinding binding;
    public EditText scorekeeperNameEntry;
    public EditText matchLocation;
    public EditText teamATeamName;
    public EditText teamACoachName;
    public EditText teamBTeamName;
    public EditText teamBCoachName;
    public EditText matchDate;
    public Button rosterAButton;
    public Button rosterBButton;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGeneralInfoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        scorekeeperNameEntry = binding.scorekeeperNameEntry;
        matchLocation = binding.matchLocation;
        teamATeamName = binding.teamATeamName;
        teamACoachName = binding.teamACoachName;
        teamBTeamName = binding.teamBTeamName;
        teamBCoachName = binding.teamBCoachName;
        matchDate = binding.matchDate;
        rosterAButton = binding.rosterAButton;
        rosterBButton = binding.rosterBButton;

        matchDate.setVisibility(View.GONE);
        matchDate.setHint("Enter Date");
        matchDate.setText("");
        rosterAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogA();
            }
        });

        rosterBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogB();
            }
        });

        scorekeeperNameEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setScorekeeperName(binding.scorekeeperNameEntry.getText().toString());
            }
        });

        matchLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setMatchLocation(binding.matchLocation.getText().toString());
            }
        });
        teamACoachName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setTeamACoach(binding.teamACoachName.getText().toString());
            }
        });
       teamATeamName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setTeamAName(binding.teamATeamName.getText().toString());
            }
        });
        teamBCoachName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setTeamBCoach(binding.teamBCoachName.getText().toString());
            }
        });
        teamBTeamName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setTeamBName(binding.teamBTeamName.getText().toString());
            }
        });

        matchDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog(v);
                matchDate.setText(DataStore.getDayMonthYear()[0] + "/" + DataStore.getDayMonthYear()[1] + "/" + DataStore.getDayMonthYear()[2]);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onPause() {
        DataStore.setScorekeeperName(scorekeeperNameEntry.getText().toString());
        //DataStore.setDayMonthYear()
        DataStore.setMatchLocation(matchLocation.getText().toString());
        DataStore.setTeamACoach(teamACoachName.getText().toString());
        DataStore.setTeamAName(teamATeamName.getText().toString());
        DataStore.setTeamBCoach(teamBCoachName.getText().toString());
        DataStore.setTeamBName(teamBTeamName.getText().toString());

        super.onPause();
    }

    @Override
    public void onResume() {
        binding.scorekeeperNameEntry.setText(DataStore.getScorekeeperName());
        binding.matchDate.setText(DataStore.getDayMonthYear()[0] + "/" + DataStore.getDayMonthYear()[1] + "/" + DataStore.getDayMonthYear()[2]);
        binding.matchLocation.setText(DataStore.getMatchLocation());
        binding.teamACoachName.setText(DataStore.getTeamACoach());
        binding.teamATeamName.setText(DataStore.getTeamAName());
        binding.teamBCoachName.setText(DataStore.getTeamBCoach());
        binding.teamBTeamName.setText(DataStore.getTeamBName());

        super.onResume();
        binding = null;
    }

    void showDialogA() {
        // DialogFragment.show() will take care of adding the fragment
        // in a transaction.  We also want to remove any currently showing
        // dialog, so make our own transaction and take care of that here.
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment prev = getFragmentManager().findFragmentByTag("rostera");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        // Create and show the dialog.
        DialogFragment newFragment = RosterADialogFragment.newInstance();

        newFragment.show(ft, "rostera");
    }

    void showDialogB() {
        // DialogFragment.show() will take care of adding the fragment
        // in a transaction.  We also want to remove any currently showing
        // dialog, so make our own transaction and take care of that here.
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment prev = getFragmentManager().findFragmentByTag("rosterb");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        // Create and show the dialog.
        DialogFragment newFragment = RosterBDialogFragment.newInstance();
//        int width = getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
//        int height = getResources().getDimensionPixelSize(R.dimen.activity_vertical_margin);
//        newFragment.getDialog().getWindow().setLayout(width, height);
        newFragment.show(ft, "rosterb");
//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
//        //layoutParams.copyFrom(newFragment.getDialog().getWindow().getAttributes());
//
//        // setting width to 90% of display
//        layoutParams.width = (int) (displayMetrics.widthPixels * 0.9f);
//
//        // setting height to 90% of display
//        layoutParams.height = (int) (displayMetrics.heightPixels * 0.9f);
//        newFragment.getDialog().getWindow().setAttributes(layoutParams);
////        newFragment.setStyle(DialogFragment.STYLE_NO_FRAME, android.R.style.Theme_Holo_Light);
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getActivity().getSupportFragmentManager(), "datePicker");
    }


}
