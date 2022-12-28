package com.example.winscoringdemoapplication.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.winscoringdemoapplication.DataStore;
import com.example.winscoringdemoapplication.R;
import com.example.winscoringdemoapplication.databinding.FragmentDashboardBinding;

import java.util.Arrays;

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
    TextView foulCount;



    private FragmentDashboardBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

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
        foulCount = binding.foulCount;


        isTeamASwitch.setChecked(true);
        isTeamASwitch.setBackgroundColor(Color.rgb(252, 108, 66));



        final ArrayAdapter[] foulSpinnerArrayAdapter = new ArrayAdapter[1];


        if (isTeamASwitch.isChecked()) {
            isTeamASwitch.setTextColor(Color.BLACK);
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

            addFoul.setTextColor(Color.BLACK);
            decreaseFoul.setTextColor(Color.BLACK);

            foulSpinnerArrayAdapter[0] = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_dropdown_item, DataStore.getTeamA());
            foulCount.setText("Fouls: 0");


        } else {
            isTeamASwitch.setTextColor(Color.WHITE);
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

            addFoul.setTextColor(Color.WHITE);
            decreaseFoul.setTextColor(Color.WHITE);

            foulSpinnerArrayAdapter[0] = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_dropdown_item, DataStore.getTeamB());
            foulCount.setText("Fouls: 0");
        }

        foulSpinner.setAdapter(foulSpinnerArrayAdapter[0]);

        isTeamASwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTeamASwitch.isChecked()) {
                    isTeamASwitch.setTextColor(Color.BLACK);
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

                    addFoul.setTextColor(Color.BLACK);
                    decreaseFoul.setTextColor(Color.BLACK);

                    foulSpinnerArrayAdapter[0] = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_dropdown_item, DataStore.getTeamA());
                    foulSpinner.setAdapter(foulSpinnerArrayAdapter[0]);
                    foulCount.setText("Fouls: " + DataStore.getTeamAFouls().stream().mapToInt(score -> score).sum());


                } else {
                    isTeamASwitch.setTextColor(Color.WHITE);
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

                    addFoul.setTextColor(Color.WHITE);
                    decreaseFoul.setTextColor(Color.WHITE);

                    foulSpinnerArrayAdapter[0] = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_dropdown_item, DataStore.getTeamB());
                    foulSpinner.setAdapter(foulSpinnerArrayAdapter[0]);

                    foulCount.setText("Fouls: " + DataStore.getTeamBFouls().stream().mapToInt(score -> score).sum());


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
        addFoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreTotal = 0;
                if (isTeamASwitch.isChecked()) {
                    DataStore.getTeamAFouls().set(foulSpinner.getSelectedItemPosition(), DataStore.getTeamAFouls().get(foulSpinner.getSelectedItemPosition()) + 1);
                    scoreTotal = DataStore.getTeamAFouls().stream().mapToInt(score -> score).sum();
                    foulCount.setText("Fouls: " + Integer.toString(scoreTotal));
                } else {
                    DataStore.getTeamBFouls().set(foulSpinner.getSelectedItemPosition(), DataStore.getTeamBFouls().get(foulSpinner.getSelectedItemPosition()) + 1);
                    scoreTotal = DataStore.getTeamBFouls().stream().mapToInt(score -> score).sum();
                    foulCount.setText("Fouls: " + Integer.toString(scoreTotal));
                }
            }
        });
        decreaseFoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreTotal = 0;
                if (isTeamASwitch.isChecked()) {
                    DataStore.getTeamAFouls().set(foulSpinner.getSelectedItemPosition(), DataStore.getTeamAFouls().get(foulSpinner.getSelectedItemPosition()) - 1);
                    scoreTotal = DataStore.getTeamAFouls().stream().mapToInt(score -> score).sum();
                    foulCount.setText("Fouls: " + Integer.toString(scoreTotal));
                } else {
                    DataStore.getTeamBFouls().set(foulSpinner.getSelectedItemPosition(), DataStore.getTeamBFouls().get(foulSpinner.getSelectedItemPosition()) - 1);
                    scoreTotal = DataStore.getTeamBFouls().stream().mapToInt(score -> score).sum();
                    foulCount.setText("Fouls: " + Integer.toString(scoreTotal));
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
        changeScoreDisplay();
        if (isTeamASwitch.isChecked()) {
            int scoreTotal = DataStore.getTeamAFouls().stream().mapToInt(score -> score).sum();
            foulCount.setText("Fouls: " + Integer.toString(scoreTotal));
        } else {
            int scoreTotal = DataStore.getTeamBFouls().stream().mapToInt(score -> score).sum();
            foulCount.setText("Fouls: " + Integer.toString(scoreTotal));
        }
        super.onResume();


    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}