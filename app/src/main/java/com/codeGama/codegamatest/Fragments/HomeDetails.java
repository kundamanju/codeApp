package com.codeGama.codegamatest.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeGama.codegamatest.Adaptars.HomeVideosRecycleAdapter;
import com.codeGama.codegamatest.ModelClass.ClsVideosCategoryModel;
import com.codeGama.codegamatest.R;

import java.util.ArrayList;

public class HomeDetails extends Fragment {
    private Context context;
    private HomeVideosRecycleAdapter bAdapter;
    private ArrayList<ClsVideosCategoryModel> clsVideosCategoryModels;
    private View view;

    private Integer[] image = {
            Integer.valueOf(R.drawable.ic_home),
            Integer.valueOf(R.drawable.ic_home),
            Integer.valueOf(R.drawable.ic_home),
            Integer.valueOf(R.drawable.ic_home),
    };

    private RecyclerView recyclerView;

    public HomeDetails() {
      // empty Constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context = getContext();

        this.view = inflater.inflate(R.layout.fragment_home_details, container, false);
        this.recyclerView = this.view.findViewById(R.id.vidiosRecyclerview);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(context));
        this.recyclerView.setItemAnimator(new DefaultItemAnimator());
        this.clsVideosCategoryModels = new ArrayList<>();

            ClsVideosCategoryModel clsVideosCategoryModel1 =new ClsVideosCategoryModel(0);
            clsVideosCategoryModel1.setVideoID("VQd7lvcPek8");

            ClsVideosCategoryModel clsVideosCategoryModel2 =new ClsVideosCategoryModel(0);
            clsVideosCategoryModel2.setVideoID("9-AKLAfpjrI");

            ClsVideosCategoryModel clsVideosCategoryModel3 =new ClsVideosCategoryModel(0);
            clsVideosCategoryModel3.setVideoID("hLmfikS98z4");

            ClsVideosCategoryModel clsVideosCategoryModel4 =new ClsVideosCategoryModel(0);
            clsVideosCategoryModel4.setVideoID("2ow5B4VJdow");

            ClsVideosCategoryModel clsVideosCategoryModel5 =new ClsVideosCategoryModel(0);
            clsVideosCategoryModel5.setVideoID("455bakBxlgY");

            ClsVideosCategoryModel clsVideosCategoryModel6 =new ClsVideosCategoryModel(0);
            clsVideosCategoryModel6.setVideoID("pyKT8UBhCuk");

            ClsVideosCategoryModel clsVideosCategoryModel7 =new ClsVideosCategoryModel(0);
            clsVideosCategoryModel7.setVideoID("0G0vq3tVAKE");

            ClsVideosCategoryModel clsVideosCategoryModel8 =new ClsVideosCategoryModel(0);
            clsVideosCategoryModel8.setVideoID("IqggbopgqQA");

            ClsVideosCategoryModel clsVideosCategoryModel9 =new ClsVideosCategoryModel(0);
            clsVideosCategoryModel9.setVideoID("wbErZjLxlBM");

            ClsVideosCategoryModel clsVideosCategoryModel10 =new ClsVideosCategoryModel(0);
            clsVideosCategoryModel10.setVideoID("ugXwvZ1GTnQ");

            this.clsVideosCategoryModels.add(clsVideosCategoryModel1);
            this.clsVideosCategoryModels.add(clsVideosCategoryModel2);
            this.clsVideosCategoryModels.add(clsVideosCategoryModel3);
            this.clsVideosCategoryModels.add(clsVideosCategoryModel4);
            this.clsVideosCategoryModels.add(clsVideosCategoryModel5);
            this.clsVideosCategoryModels.add(clsVideosCategoryModel6);
            this.clsVideosCategoryModels.add(clsVideosCategoryModel7);
            this.clsVideosCategoryModels.add(clsVideosCategoryModel8);
            this.clsVideosCategoryModels.add(clsVideosCategoryModel9);
            this.clsVideosCategoryModels.add(clsVideosCategoryModel10);


        this.bAdapter = new HomeVideosRecycleAdapter(getActivity(), this.clsVideosCategoryModels);
        this.recyclerView.setAdapter(this.bAdapter);
       return view;
    }
}