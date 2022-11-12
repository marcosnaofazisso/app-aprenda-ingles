package com.example.aprendaingles.fragment;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private ImageView one, two, three, four, five, six;


    public NumerosFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        one = view.findViewById(R.id.buttonOne);
        two = view.findViewById(R.id.buttonTwo);
        three = view.findViewById(R.id.buttonThree);
        four = view.findViewById(R.id.buttonFour);
        five = view.findViewById(R.id.buttonFive);
        six = view.findViewById(R.id.buttonSix);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.buttonOne:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
                playSound();
                break;
            case R.id.buttonTwo:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
                playSound();
                break;
            case R.id.buttonThree:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
                playSound();
                break;
            case R.id.buttonFour:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
                playSound();
                break;
            case R.id.buttonFive:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
                playSound();
                break;
            case R.id.buttonSix:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
                playSound();
                break;
        }


    }

    public void playSound() {
        if (mediaPlayer != null) {
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }
}


