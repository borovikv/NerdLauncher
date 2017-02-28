package com.github.borovic.nerdlauncher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vborovic on 2/28/17.
 */

public class NerdLauncherFragment extends Fragment{

    public static Fragment newInstance() {
        return new NerdLauncherFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_nerd_launcher, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.fragment_nerd_launcher_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;
    }
}
