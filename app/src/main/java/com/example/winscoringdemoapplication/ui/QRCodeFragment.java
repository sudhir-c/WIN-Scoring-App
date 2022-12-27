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
                displayQRCode();
            }
        });


//        Button re = binding.pressHere;
//        re.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String[] teamA = DataStore.getTeamA();
//                if (teamA != null) {
//                    for (int i = 0; i < teamA.length; i++) {
//                        System.out.println(teamA[i]);
//                    }
//                }
//            }
//        });
//
//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void displayQRCode() {

        String teamAScores = "TEAM_A:{{"+ DataStore.getTeamA()[0] + ":" + String.valueOf(DataStore.getPlayer1teamAScore()) + "}," + "{"+ DataStore.getTeamA()[1] + ":" + String.valueOf(DataStore.getPlayer2teamAScore()) + "}," + "{"+ DataStore.getTeamA()[2] + ":" + String.valueOf(DataStore.getPlayer3teamAScore()) + "}";
        String teamBScores = "TEAM_B:{{"+ DataStore.getTeamB()[0] + ":" + String.valueOf(DataStore.getPlayer1teamBScore()) + "}," + "{"+ DataStore.getTeamB()[1] + ":" + String.valueOf(DataStore.getPlayer2teamBScore()) + "}," + "{"+ DataStore.getTeamB()[2] + ":" + String.valueOf(DataStore.getPlayer3teamBScore()) + "}";
//                {
//                        DataStore.getTeamA()[0], String.valueOf(DataStore.getPlayer1teamAScore())
//                },
//                {
//                        DataStore.getTeamA()[1], String.valueOf(DataStore.getPlayer2teamAScore())
//                },
//                {
//                        DataStore.getTeamA()[2], String.valueOf(DataStore.getPlayer3teamAScore())
//                },
//
//        }";


//        String[][] teamBScores = {
//                {
//                        DataStore.getTeamB()[0], String.valueOf(DataStore.getPlayer1teamBScore()),
//                },
//                {
//                        DataStore.getTeamB()[1], String.valueOf(DataStore.getPlayer2teamBScore())
//                },
//                {
//                        DataStore.getTeamB()[2], String.valueOf(DataStore.getPlayer3teamBScore())
//                },
//
//        };


        String charset = "UTF-8";
        Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
        try {
            //generate QR code
            Bitmap QRCode = generateQRcode(teamAScores + "   " + teamBScores, charset, hashMap, 1800, 1800);
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