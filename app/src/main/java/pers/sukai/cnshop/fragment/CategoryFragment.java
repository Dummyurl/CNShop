package pers.sukai.cnshop.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pers.sukai.cnshop.R;

/**
 * Created by sukaidev on 2018/12/4.
 *
 */

public class CategoryFragment extends Fragment {




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, null,false);


        return view;
    }

}