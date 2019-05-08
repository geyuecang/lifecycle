package com.c.fragmentadapterlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * author : geyuecang
 * date   : 2019/5/7 18:05
 * desc   : desc
 */
public class MFragment extends Fragment {

    private String TAG = "MFragment";
    private int ags;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, TAG + "----------" + ags + "------" + "onCreate");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        ags = arguments.getInt("ags");
        Log.d(TAG, TAG + "----------" + ags + "------" + "onAttach");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.layout_fragment_m, container, false);
        Log.d(TAG, TAG + "----------" + ags + "------" + "onCreateView");
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, TAG + "----------" + ags + "------" + "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, TAG + "----------" + ags + "------" + "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, TAG + "----------" + ags + "------" + "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, TAG + "----------" + ags + "------" + "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, TAG + "----------" + ags + "------" + "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, TAG + "----------" + ags + "------" + "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, TAG + "----------" + ags + "------" + "onDetach");
    }
}
