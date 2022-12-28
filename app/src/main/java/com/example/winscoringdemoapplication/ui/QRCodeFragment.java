package com.example.winscoringdemoapplication.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.winscoringdemoapplication.DataStore;
import com.example.winscoringdemoapplication.R;
import com.example.winscoringdemoapplication.databinding.FragmentQrcodeBinding;
import com.example.winscoringdemoapplication.databinding.FragmentQrcodeBinding;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QRCodeFragment extends Fragment {

    private FragmentQrcodeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentQrcodeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ImageView qrCodeHolder = binding.qrCodeHolder;
        qrCodeHolder.setVisibility(View.INVISIBLE);

        Button genQRCodeButton = binding.genQRCodeButton;
        genQRCodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    displayQRCode();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });



        return root;
    }

    public void displayQRCode() throws JSONException {
        int teamATotalScore;
        int teamBTotalScore;
        ArrayList<Integer> teamAScores = new ArrayList<>();
        teamAScores.add(0, DataStore.getPlayer1teamAScore());
        teamAScores.add(1, DataStore.getPlayer2teamAScore());
        teamAScores.add(2, DataStore.getPlayer3teamAScore());
        teamAScores.add(3, DataStore.getPlayer4teamAScore());
        teamAScores.add(4, DataStore.getPlayer5teamAScore());
        teamATotalScore = teamAScores.stream().mapToInt(score -> score).sum();
        ArrayList<Integer> teamBScores = new ArrayList<>();
        teamBScores.add(0, DataStore.getPlayer1teamBScore());
        teamBScores.add(1, DataStore.getPlayer2teamBScore());
        teamBScores.add(2, DataStore.getPlayer3teamBScore());
        teamBScores.add(3, DataStore.getPlayer4teamBScore());
        teamBScores.add(4, DataStore.getPlayer5teamBScore());
        teamBTotalScore = teamBScores.stream().mapToInt(score -> score).sum();

        JSONObject matchJSON = new JSONObject();
        matchJSON.put("Scorekeeper", DataStore.getScorekeeperName());
        matchJSON.put("Date", DataStore.getDayMonthYear()[0] + "-" + DataStore.getDayMonthYear()[1] + "-" + DataStore.getDayMonthYear()[2]);
        matchJSON.put("Match Location", DataStore.getMatchLocation());
        matchJSON.put("Team A Name", DataStore.getTeamAName());
        matchJSON.put("Team A Coach", DataStore.getTeamACoach());
        matchJSON.put("Team A Roster", Arrays.toString(DataStore.getTeamA()));
        matchJSON.put("Team A Total Score", teamATotalScore);
        matchJSON.put("Team A Scores", teamAScores);
        matchJSON.put("Team A Fouls", DataStore.getTeamAFouls());
        matchJSON.put("Team B Name", DataStore.getTeamBName());
        matchJSON.put("Team B Coach", DataStore.getTeamBCoach());
        matchJSON.put("Team B Roster", Arrays.toString(DataStore.getTeamB()));
        matchJSON.put("Team B Total Score", teamBTotalScore);
        matchJSON.put("Team B Scores", teamBScores);
        matchJSON.put("Team B Fouls", DataStore.getTeamBFouls());

        String charset = "UTF-8";
        Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
        try {
            //generate QR code
            Bitmap QRCode = generateQRcode(matchJSON.toString(), charset, hashMap, 1800, 1800);
            //Set image to display QR code and make it visible
            ImageView qrCodeHolder = binding.qrCodeHolder;
            //ImageView qrCodeDisplayLarge = requireView().findViewById(R.id.matchQRCodeHolderLarge);
            qrCodeHolder.setImageBitmap(QRCode);
            qrCodeHolder.setVisibility(View.VISIBLE);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static Bitmap generateQRcode(String data, String charset, Map map, int h, int w) throws WriterException, IOException {
        //Generate QR code
        BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, w, h);
        //Convert QR code
        BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
        Bitmap bitmap = barcodeEncoder.createBitmap(matrix);
        return bitmap;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}