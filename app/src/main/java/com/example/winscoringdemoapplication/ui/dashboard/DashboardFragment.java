package com.example.winscoringdemoapplication.ui.dashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.winscoringdemoapplication.DataStore;
import com.example.winscoringdemoapplication.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    ToggleButton isTeamASwitch;
    TextView namedisplayplayer1;
    TextView namedisplayplayer2;
    TextView namedisplayplayer3;
    TextView namedisplayplayer4;
    TextView namedisplayplayer5;
    TextView scoreDisplay;
    //TextView namedisplayplayer6;

    Button scoreincreasePlayer1;
    Button scoreincreasePlayer2;
    Button scoreincreasePlayer3;
    Button scoreincreasePlayer4;
    Button scoreincreasePlayer5;
    //Button scoreincreasePlayer6;

    Button scoredecreasePlayer1;
    Button scoredecreasePlayer2;
    Button scoredecreasePlayer3;
    Button scoredecreasePlayer4;
    Button scoredecreasePlayer5;
    //Button scoredecreasePlayer6;

    Spinner foulSpinner;
    Button addFoul;
    Button decreaseFoul;




    private FragmentDashboardBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        scoreDisplay = binding.scoreDisplay;

        isTeamASwitch = binding.isTeamASwitch;
        namedisplayplayer1 = binding.namedisplayPlayer1;
        namedisplayplayer2 = binding.namedisplayPlayer2;
        namedisplayplayer3 = binding.namedisplayPlayer3;
        namedisplayplayer4 = binding.namedisplayPlayer4;
        namedisplayplayer5 = binding.namedisplayPlayer5;

        scoreincreasePlayer1 = binding.scoreincreasePlayer1;
        scoreincreasePlayer2 = binding.scoreincreasePlayer2;
        scoreincreasePlayer3 = binding.scoreincreasePlayer3;
        scoreincreasePlayer4 = binding.scoreincreasePlayer4;
        scoreincreasePlayer5 = binding.scoreincreasePlayer5;
        //scoreincreasePlayer6 = binding.scoreincreasePlayer6;

        scoredecreasePlayer1 = binding.scoredecreasePlayer1;
        scoredecreasePlayer2 = binding.scoredecreasePlayer2;
        scoredecreasePlayer3 = binding.scoredecreasePlayer3;
        scoredecreasePlayer4 = binding.scoredecreasePlayer4;
        scoredecreasePlayer5 = binding.scoredecreasePlayer5;
        //scoredecreasePlayer6 = binding.scoredecreasePlayer6;

        foulSpinner = binding.foulSpinner;
        addFoul = binding.addFoul;
        decreaseFoul = binding.decreaseFoul;


        isTeamASwitch.setChecked(true);

        if (isTeamASwitch.isChecked()) {
            namedisplayplayer1.setText(DataStore.getTeamA()[0] + ": " + DataStore.getPlayer1teamAScore());
            namedisplayplayer2.setText(DataStore.getTeamA()[1] + ": " + DataStore.getPlayer2teamAScore());
            namedisplayplayer3.setText(DataStore.getTeamA()[2] + ": " + DataStore.getPlayer3teamAScore());
            namedisplayplayer4.setText(DataStore.getTeamA()[3] + ": " + DataStore.getPlayer4teamAScore());
            namedisplayplayer5.setText(DataStore.getTeamA()[4] + ": " + DataStore.getPlayer5teamAScore());

            scoreincreasePlayer1.setTextColor(Color.BLACK);
            scoreincreasePlayer2.setTextColor(Color.BLACK);
            scoreincreasePlayer3.setTextColor(Color.BLACK);
            scoreincreasePlayer4.setTextColor(Color.BLACK);
            scoreincreasePlayer5.setTextColor(Color.BLACK);

            scoredecreasePlayer1.setTextColor(Color.BLACK);
            scoredecreasePlayer2.setTextColor(Color.BLACK);
            scoredecreasePlayer3.setTextColor(Color.BLACK);
            scoredecreasePlayer4.setTextColor(Color.BLACK);
            scoredecreasePlayer5.setTextColor(Color.BLACK);


        } else {
            namedisplayplayer1.setText(DataStore.getTeamB()[0] + ": " + DataStore.getPlayer1teamBScore());
            namedisplayplayer2.setText(DataStore.getTeamB()[1] + ": " + DataStore.getPlayer2teamBScore());
            namedisplayplayer3.setText(DataStore.getTeamB()[2] + ": " + DataStore.getPlayer3teamBScore());
            namedisplayplayer4.setText(DataStore.getTeamB()[3] + ": " + DataStore.getPlayer4teamBScore());
            namedisplayplayer5.setText(DataStore.getTeamB()[4] + ": " + DataStore.getPlayer5teamBScore());

            scoreincreasePlayer1.setTextColor(Color.WHITE);
            scoreincreasePlayer2.setTextColor(Color.WHITE);
            scoreincreasePlayer3.setTextColor(Color.WHITE);
            scoreincreasePlayer4.setTextColor(Color.WHITE);
            scoreincreasePlayer5.setTextColor(Color.WHITE);

            scoredecreasePlayer1.setTextColor(Color.WHITE);
            scoredecreasePlayer2.setTextColor(Color.WHITE);
            scoredecreasePlayer3.setTextColor(Color.WHITE);
            scoredecreasePlayer4.setTextColor(Color.WHITE);
            scoredecreasePlayer5.setTextColor(Color.WHITE);


        }
        isTeamASwitch.setChecked(true);
        isTeamASwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        isTeamASwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    namedisplayplayer1.setText(DataStore.getTeamA()[0] + ": " + DataStore.getPlayer1teamAScore());
                    namedisplayplayer2.setText(DataStore.getTeamA()[1] + ": " + DataStore.getPlayer2teamAScore());
                    namedisplayplayer3.setText(DataStore.getTeamA()[2] + ": " + DataStore.getPlayer3teamAScore());
                    namedisplayplayer4.setText(DataStore.getTeamA()[3] + ": " + DataStore.getPlayer4teamAScore());
                    namedisplayplayer5.setText(DataStore.getTeamA()[4] + ": " + DataStore.getPlayer5teamAScore());

                    scoreincreasePlayer1.setTextColor(Color.BLACK);
                    scoreincreasePlayer2.setTextColor(Color.BLACK);
                    scoreincreasePlayer3.setTextColor(Color.BLACK);
                    scoreincreasePlayer4.setTextColor(Color.BLACK);
                    scoreincreasePlayer5.setTextColor(Color.BLACK);

                    scoredecreasePlayer1.setTextColor(Color.BLACK);
                    scoredecreasePlayer2.setTextColor(Color.BLACK);
                    scoredecreasePlayer3.setTextColor(Color.BLACK);
                    scoredecreasePlayer4.setTextColor(Color.BLACK);
                    scoredecreasePlayer5.setTextColor(Color.BLACK);


                } else {
                    namedisplayplayer1.setText(DataStore.getTeamB()[0] + ": " + DataStore.getPlayer1teamBScore());
                    namedisplayplayer2.setText(DataStore.getTeamB()[1] + ": " + DataStore.getPlayer2teamBScore());
                    namedisplayplayer3.setText(DataStore.getTeamB()[2] + ": " + DataStore.getPlayer3teamBScore());
                    namedisplayplayer4.setText(DataStore.getTeamB()[3] + ": " + DataStore.getPlayer4teamBScore());
                    namedisplayplayer5.setText(DataStore.getTeamB()[4] + ": " + DataStore.getPlayer5teamBScore());

                    scoreincreasePlayer1.setTextColor(Color.WHITE);
                    scoreincreasePlayer2.setTextColor(Color.WHITE);
                    scoreincreasePlayer3.setTextColor(Color.WHITE);
                    scoreincreasePlayer4.setTextColor(Color.WHITE);
                    scoreincreasePlayer5.setTextColor(Color.WHITE);

                    scoredecreasePlayer1.setTextColor(Color.WHITE);
                    scoredecreasePlayer2.setTextColor(Color.WHITE);
                    scoredecreasePlayer3.setTextColor(Color.WHITE);
                    scoredecreasePlayer4.setTextColor(Color.WHITE);
                    scoredecreasePlayer5.setTextColor(Color.WHITE);


                }
            }
        });

        scoreincreasePlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    DataStore.setPlayer1teamAScore(DataStore.getPlayer1teamAScore() + 1);
                    namedisplayplayer1.setText(DataStore.getTeamA()[0] + ": " + DataStore.getPlayer1teamAScore());
                    changeScoreDisplay();

                } else {
                    DataStore.setPlayer1teamBScore(DataStore.getPlayer1teamBScore() + 1);
                    namedisplayplayer1.setText(DataStore.getTeamB()[0] + ": " + DataStore.getPlayer1teamBScore());
                    changeScoreDisplay();
                }
            }
        });

        scoreincreasePlayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    DataStore.setPlayer2teamAScore(DataStore.getPlayer2teamAScore() + 1);
                    namedisplayplayer2.setText(DataStore.getTeamA()[1] + ": " + DataStore.getPlayer2teamAScore());
                    changeScoreDisplay();
                } else {
                    DataStore.setPlayer2teamBScore(DataStore.getPlayer2teamBScore() + 1);
                    namedisplayplayer2.setText(DataStore.getTeamB()[1] + ": " + DataStore.getPlayer2teamBScore());
                    changeScoreDisplay();
                }
            }
        });

        scoreincreasePlayer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    DataStore.setPlayer3teamAScore(DataStore.getPlayer3teamAScore() + 1);
                    namedisplayplayer3.setText(DataStore.getTeamA()[2] + ": " + DataStore.getPlayer3teamAScore());
                    changeScoreDisplay();
                } else {
                    DataStore.setPlayer3teamBScore(DataStore.getPlayer3teamBScore() + 1);
                    namedisplayplayer3.setText(DataStore.getTeamB()[2] + ": " + DataStore.getPlayer3teamBScore());
                    changeScoreDisplay();
                }
            }
        });

        scoreincreasePlayer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    DataStore.setPlayer4teamAScore(DataStore.getPlayer4teamAScore() + 1);
                    namedisplayplayer4.setText(DataStore.getTeamA()[3] + ": " + DataStore.getPlayer4teamAScore());
                    changeScoreDisplay();
                } else {
                    DataStore.setPlayer4teamBScore(DataStore.getPlayer4teamBScore() + 1);
                    namedisplayplayer4.setText(DataStore.getTeamB()[3] + ": " + DataStore.getPlayer4teamBScore());
                    changeScoreDisplay();
                }
            }
        });

        scoreincreasePlayer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    DataStore.setPlayer5teamAScore(DataStore.getPlayer5teamAScore() + 1);
                    namedisplayplayer5.setText(DataStore.getTeamA()[4] + ": " + DataStore.getPlayer5teamAScore());
                    changeScoreDisplay();
                } else {
                    DataStore.setPlayer5teamBScore(DataStore.getPlayer5teamBScore() + 1);
                    namedisplayplayer5.setText(DataStore.getTeamB()[4] + ": " + DataStore.getPlayer5teamBScore());
                    changeScoreDisplay();
                }
            }
        });

        scoredecreasePlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    DataStore.setPlayer1teamAScore(DataStore.getPlayer1teamAScore() - 1);
                    namedisplayplayer1.setText(DataStore.getTeamA()[0] + ": " + DataStore.getPlayer1teamAScore());
                    changeScoreDisplay();

                } else {
                    DataStore.setPlayer1teamBScore(DataStore.getPlayer1teamBScore() - 1);
                    namedisplayplayer1.setText(DataStore.getTeamB()[0] + ": " + DataStore.getPlayer1teamBScore());
                    changeScoreDisplay();
                }
            }
        });

        scoredecreasePlayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    DataStore.setPlayer2teamAScore(DataStore.getPlayer2teamAScore() - 1);
                    namedisplayplayer2.setText(DataStore.getTeamA()[1] + ": " + DataStore.getPlayer2teamAScore());
                    changeScoreDisplay();
                } else {
                    DataStore.setPlayer2teamBScore(DataStore.getPlayer2teamBScore() - 1);
                    namedisplayplayer2.setText(DataStore.getTeamB()[1] + ": " + DataStore.getPlayer2teamBScore());
                    changeScoreDisplay();
                }
            }
        });

        scoredecreasePlayer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    DataStore.setPlayer3teamAScore(DataStore.getPlayer3teamAScore() - 1);
                    namedisplayplayer3.setText(DataStore.getTeamA()[2] + ": " + DataStore.getPlayer3teamAScore());
                    changeScoreDisplay();
                } else {
                    DataStore.setPlayer3teamBScore(DataStore.getPlayer3teamBScore() - 1);
                    namedisplayplayer3.setText(DataStore.getTeamB()[2] + ": " + DataStore.getPlayer3teamBScore());
                    changeScoreDisplay();
                }
            }
        });

        scoredecreasePlayer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    DataStore.setPlayer4teamAScore(DataStore.getPlayer4teamAScore() - 1);
                    namedisplayplayer4.setText(DataStore.getTeamA()[3] + ": " + DataStore.getPlayer4teamAScore());
                    changeScoreDisplay();
                } else {
                    DataStore.setPlayer4teamBScore(DataStore.getPlayer4teamBScore() - 1);
                    namedisplayplayer4.setText(DataStore.getTeamB()[3] + ": " + DataStore.getPlayer4teamBScore());
                    changeScoreDisplay();
                }
            }
        });

        scoredecreasePlayer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    DataStore.setPlayer5teamAScore(DataStore.getPlayer5teamAScore() - 1);
                    namedisplayplayer5.setText(DataStore.getTeamA()[4] + ": " + DataStore.getPlayer5teamAScore());
                    changeScoreDisplay();
                } else {
                    DataStore.setPlayer5teamBScore(DataStore.getPlayer5teamBScore() - 1);
                    namedisplayplayer5.setText(DataStore.getTeamB()[4] + ": " + DataStore.getPlayer5teamBScore());
                    changeScoreDisplay();
                }
            }
        });


        return root;
    }

    public void changeScoreDisplay() {
        int teamAScore =
                DataStore.getPlayer1teamAScore() +
                        DataStore.getPlayer2teamAScore() +
                        DataStore.getPlayer3teamAScore() +
                        DataStore.getPlayer4teamAScore() +
                        DataStore.getPlayer5teamAScore();
        int teamBScore =
                DataStore.getPlayer1teamBScore() +
                        DataStore.getPlayer2teamBScore() +
                        DataStore.getPlayer3teamBScore() +
                        DataStore.getPlayer4teamBScore() +
                        DataStore.getPlayer5teamBScore();

        scoreDisplay.setText(teamAScore + " - " + teamBScore);
    }



    @Override
    public void onResume() {
        super.onResume();
//        namedisplayplayer1teamA.setText(DataStore.getTeamA()[0] + ": " + String.valueOf(DataStore.getPlayer1teamAScore()));
//        namedisplayplayer2teamA.setText(DataStore.getTeamA()[1] + ": " + String.valueOf(DataStore.getPlayer2teamAScore()));
//        namedisplayplayer3teamA.setText(DataStore.getTeamA()[2] + ": " + String.valueOf(DataStore.getPlayer3teamAScore()));
//
//        namedisplayplayer1teamB.setText(DataStore.getTeamB()[0] + ": " + String.valueOf(DataStore.getPlayer1teamBScore()));
//        namedisplayplayer2teamB.setText(DataStore.getTeamB()[1] + ": " + String.valueOf(DataStore.getPlayer2teamBScore()));
//        namedisplayplayer3teamB.setText(DataStore.getTeamB()[2] + ": " + String.valueOf(DataStore.getPlayer3teamBScore()));



    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}