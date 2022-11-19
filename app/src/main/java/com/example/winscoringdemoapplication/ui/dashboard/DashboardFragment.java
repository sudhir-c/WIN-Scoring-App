package com.example.winscoringdemoapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.winscoringdemoapplication.DataStore;
import com.example.winscoringdemoapplication.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    ToggleButton isTeam1Switch;
    TextView namedisplayplayer1teamA;
    TextView namedisplayplayer2teamA;
    TextView namedisplayplayer3teamA;
    TextView namedisplayplayer1teamB;
    TextView namedisplayplayer2teamB;
    TextView namedisplayplayer3teamB;

    Button scoreincreasePlayer1teamA;
    Button scoreincreasePlayer2teamA;
    Button scoreincreasePlayer3teamA;
    Button scoredecreasePlayer1teamA;
    Button scoredecreasePlayer2teamA;
    Button scoredecreasePlayer3teamA;

    Button scoreincreasePlayer1teamB;
    Button scoreincreasePlayer2teamB;
    Button scoreincreasePlayer3teamB;
    Button scoredecreasePlayer1teamB;
    Button scoredecreasePlayer2teamB;
    Button scoredecreasePlayer3teamB;

    private FragmentDashboardBinding binding;

    public void setPlayerScoreInputVisibility(boolean isTeam2SwitchChecked) {
        if (isTeam2SwitchChecked) {
            namedisplayplayer1teamA.setVisibility(View.VISIBLE);
            scoreincreasePlayer1teamA.setVisibility(View.VISIBLE);
            scoredecreasePlayer1teamA.setVisibility(View.VISIBLE);

            namedisplayplayer2teamA.setVisibility(View.VISIBLE);
            scoreincreasePlayer2teamA.setVisibility(View.VISIBLE);
            scoredecreasePlayer2teamA.setVisibility(View.VISIBLE);

            namedisplayplayer3teamA.setVisibility(View.VISIBLE);
            scoreincreasePlayer3teamA.setVisibility(View.VISIBLE);
            scoredecreasePlayer3teamA.setVisibility(View.VISIBLE);

            namedisplayplayer1teamB.setVisibility(View.INVISIBLE);
            scoreincreasePlayer1teamB.setVisibility(View.INVISIBLE);
            scoredecreasePlayer1teamB.setVisibility(View.INVISIBLE);

            namedisplayplayer2teamB.setVisibility(View.INVISIBLE);
            scoreincreasePlayer2teamB.setVisibility(View.INVISIBLE);
            scoredecreasePlayer2teamB.setVisibility(View.INVISIBLE);

            namedisplayplayer3teamB.setVisibility(View.INVISIBLE);
            scoreincreasePlayer3teamB.setVisibility(View.INVISIBLE);
            scoredecreasePlayer3teamB.setVisibility(View.INVISIBLE);
        } else {
            namedisplayplayer1teamA.setVisibility(View.INVISIBLE);
            scoreincreasePlayer1teamA.setVisibility(View.INVISIBLE);
            scoredecreasePlayer1teamA.setVisibility(View.INVISIBLE);

            namedisplayplayer2teamA.setVisibility(View.INVISIBLE);
            scoreincreasePlayer2teamA.setVisibility(View.INVISIBLE);
            scoredecreasePlayer2teamA.setVisibility(View.INVISIBLE);

            namedisplayplayer3teamA.setVisibility(View.INVISIBLE);
            scoreincreasePlayer3teamA.setVisibility(View.INVISIBLE);
            scoredecreasePlayer3teamA.setVisibility(View.INVISIBLE);

            namedisplayplayer1teamB.setVisibility(View.VISIBLE);
            scoreincreasePlayer1teamB.setVisibility(View.VISIBLE);
            scoredecreasePlayer1teamB.setVisibility(View.VISIBLE);

            namedisplayplayer2teamB.setVisibility(View.VISIBLE);
            scoreincreasePlayer2teamB.setVisibility(View.VISIBLE);
            scoredecreasePlayer2teamB.setVisibility(View.VISIBLE);

            namedisplayplayer3teamB.setVisibility(View.VISIBLE);
            scoreincreasePlayer3teamB.setVisibility(View.VISIBLE);
            scoredecreasePlayer3teamB.setVisibility(View.VISIBLE);
        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        isTeam1Switch = binding.isTeam1Switch;
        isTeam1Switch.setChecked(true);
        isTeam1Switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPlayerScoreInputVisibility(isTeam1Switch.isChecked());
            }
        });

        namedisplayplayer1teamA = binding.namedisplayPlayer1teamA;
        namedisplayplayer1teamA.setText(String.valueOf(DataStore.getPlayer1teamAScore()));

        scoreincreasePlayer1teamA = binding.scoreincreasePlayer1teamA;
        scoreincreasePlayer1teamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer1teamAScore(DataStore.getPlayer1teamAScore() + 1);
                namedisplayplayer1teamA.setText(DataStore.getTeamA()[0] + ": " + String.valueOf(DataStore.getPlayer1teamAScore()));
            }
        });
        scoredecreasePlayer1teamA = binding.scoredecreasePlayer1teamA;
        scoredecreasePlayer1teamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer1teamAScore(DataStore.getPlayer1teamAScore() - 1);
                namedisplayplayer1teamA.setText(DataStore.getTeamA()[0] + ": " + String.valueOf(DataStore.getPlayer1teamAScore()));
            }
        });

        namedisplayplayer2teamA = binding.namedisplayPlayer2teamA;
        namedisplayplayer2teamA.setText(String.valueOf(DataStore.getPlayer2teamAScore()));

        scoreincreasePlayer2teamA = binding.scoreincreasePlayer2teamA;
        scoreincreasePlayer2teamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer2teamAScore(DataStore.getPlayer2teamAScore() + 1);
                namedisplayplayer2teamA.setText(DataStore.getTeamA()[1] + ": " + String.valueOf(DataStore.getPlayer2teamAScore()));
            }
        });
        scoredecreasePlayer2teamA = binding.scoredecreasePlayer2teamA;
        scoredecreasePlayer2teamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer2teamAScore(DataStore.getPlayer2teamAScore() - 1);
                namedisplayplayer2teamA.setText(DataStore.getTeamA()[1] + ": " + String.valueOf(DataStore.getPlayer2teamAScore()));
            }
        });


        namedisplayplayer3teamA = binding.namedisplayPlayer3teamA;
        namedisplayplayer3teamA.setText(String.valueOf(DataStore.getPlayer3teamAScore()));

        scoreincreasePlayer3teamA = binding.scoreincreasePlayer3teamA;
        scoreincreasePlayer3teamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer3teamAScore(DataStore.getPlayer3teamAScore() + 1);
                namedisplayplayer3teamA.setText(DataStore.getTeamA()[2] + ": " + String.valueOf(DataStore.getPlayer3teamAScore()));
            }
        });
        scoredecreasePlayer3teamA = binding.scoredecreasePlayer3teamA;
        scoredecreasePlayer3teamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer3teamAScore(DataStore.getPlayer3teamAScore() - 1);
                namedisplayplayer3teamA.setText(DataStore.getTeamA()[2] + ": " + String.valueOf(DataStore.getPlayer3teamAScore()));
            }
        });





        namedisplayplayer1teamB = binding.namedisplayPlayer1teamB;
        namedisplayplayer1teamB.setText(String.valueOf(DataStore.getPlayer1teamBScore()));

        scoreincreasePlayer1teamB = binding.scoreincreasePlayer1teamB;
        scoreincreasePlayer1teamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer1teamBScore(DataStore.getPlayer1teamBScore() + 1);
                namedisplayplayer1teamB.setText(DataStore.getTeamB()[0] + ": " + String.valueOf(DataStore.getPlayer1teamBScore()));
            }
        });
        scoredecreasePlayer1teamB = binding.scoredecreasePlayer1teamB;
        scoredecreasePlayer1teamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer1teamBScore(DataStore.getPlayer1teamBScore() - 1);
                namedisplayplayer1teamB.setText(DataStore.getTeamB()[0] + ": " + String.valueOf(DataStore.getPlayer1teamBScore()));
            }
        });

        namedisplayplayer2teamB = binding.namedisplayPlayer2teamB;
        namedisplayplayer2teamB.setText(String.valueOf(DataStore.getPlayer2teamBScore()));

        scoreincreasePlayer2teamB = binding.scoreincreasePlayer2teamB;
        scoreincreasePlayer2teamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer2teamBScore(DataStore.getPlayer2teamBScore() + 1);
                namedisplayplayer2teamB.setText(DataStore.getTeamB()[1] + ": " + String.valueOf(DataStore.getPlayer2teamBScore()));
            }
        });
        scoredecreasePlayer2teamB = binding.scoredecreasePlayer2teamB;
        scoredecreasePlayer2teamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer2teamBScore(DataStore.getPlayer2teamBScore() - 1);
                namedisplayplayer2teamB.setText(DataStore.getTeamB()[1] + ": " + String.valueOf(DataStore.getPlayer2teamBScore()));
            }
        });


        namedisplayplayer3teamB = binding.namedisplayPlayer3teamB;
        namedisplayplayer3teamB.setText(String.valueOf(DataStore.getPlayer3teamBScore()));

        scoreincreasePlayer3teamB = binding.scoreincreasePlayer3teamB;
        scoreincreasePlayer3teamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer3teamBScore(DataStore.getPlayer3teamBScore() + 1);
                namedisplayplayer3teamB.setText(DataStore.getTeamB()[2] + ": " + String.valueOf(DataStore.getPlayer3teamBScore()));
            }
        });
        scoredecreasePlayer3teamB = binding.scoredecreasePlayer3teamB;
        scoredecreasePlayer3teamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore.setPlayer3teamBScore(DataStore.getPlayer3teamBScore() - 1);
                namedisplayplayer3teamB.setText(DataStore.getTeamB()[3] + ": " + String.valueOf(DataStore.getPlayer3teamBScore()));
            }
        });


        setPlayerScoreInputVisibility(isTeam1Switch.isChecked());

//        namedisplayplayer1teamA.setVisibility(View.VISIBLE);
//        scoreincreasePlayer1teamA.setVisibility(View.VISIBLE);
//        scoredecreasePlayer1teamA.setVisibility(View.VISIBLE);
//
//        namedisplayplayer2teamA.setVisibility(View.VISIBLE);
//        scoreincreasePlayer2teamA.setVisibility(View.VISIBLE);
//        scoredecreasePlayer2teamA.setVisibility(View.VISIBLE);
//
//        namedisplayplayer3teamA.setVisibility(View.VISIBLE);
//        scoreincreasePlayer3teamA.setVisibility(View.VISIBLE);
//        scoredecreasePlayer3teamA.setVisibility(View.VISIBLE);
//
//        namedisplayplayer1teamB.setVisibility(View.INVISIBLE);
//        scoreincreasePlayer1teamB.setVisibility(View.INVISIBLE);
//        scoredecreasePlayer1teamB.setVisibility(View.INVISIBLE);
//
//        namedisplayplayer2teamB.setVisibility(View.INVISIBLE);
//        scoreincreasePlayer2teamB.setVisibility(View.INVISIBLE);
//        scoredecreasePlayer2teamB.setVisibility(View.INVISIBLE);
//
//        namedisplayplayer3teamB.setVisibility(View.INVISIBLE);
//        scoreincreasePlayer3teamA.setVisibility(View.INVISIBLE);
//        scoredecreasePlayer3teamB.setVisibility(View.INVISIBLE);

        return root;
    }



    @Override
    public void onResume() {
        super.onResume();
        namedisplayplayer1teamA.setText(DataStore.getTeamA()[0] + ": " + String.valueOf(DataStore.getPlayer1teamAScore()));
        namedisplayplayer2teamA.setText(DataStore.getTeamA()[1] + ": " + String.valueOf(DataStore.getPlayer2teamAScore()));
        namedisplayplayer3teamA.setText(DataStore.getTeamA()[2] + ": " + String.valueOf(DataStore.getPlayer3teamAScore()));

        namedisplayplayer1teamB.setText(DataStore.getTeamB()[0] + ": " + String.valueOf(DataStore.getPlayer1teamBScore()));
        namedisplayplayer2teamB.setText(DataStore.getTeamB()[1] + ": " + String.valueOf(DataStore.getPlayer2teamBScore()));
        namedisplayplayer3teamB.setText(DataStore.getTeamB()[2] + ": " + String.valueOf(DataStore.getPlayer3teamBScore()));



    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}