package com.example.finalmapproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.net.Uri;


/**
 * A simple {@link Fragment} subclass.
 */
public class Videosfrag extends Fragment {


    public Videosfrag() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_videosfrag, container, false);
        VideoView videoView = view.findViewById(R.id.videoplayer);
        //Uri uri= Uri.parse("android.resource://com.example.finalmapproject/"+R.raw.video);
        //videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(getActivity());
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        return view;
    }


}
