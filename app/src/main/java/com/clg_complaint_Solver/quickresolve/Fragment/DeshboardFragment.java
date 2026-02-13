package com.clg_complaint_Solver.quickresolve.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.clg_complaint_Solver.quickresolve.Adapter.ActivityAdapter;
import com.clg_complaint_Solver.quickresolve.Model.ActivityModel;
import com.clg_complaint_Solver.quickresolve.R;

import java.util.ArrayList;
import java.util.List;

public class DeshboardFragment extends Fragment {

    private RecyclerView recyclerView;
    private ActivityAdapter adapter;
    private List<ActivityModel> activityList;



    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_deshboard, container, false);

        // 1. Initialize the UI component
        recyclerView = view.findViewById(R.id.rvRecentActivity);
        addSampleData(); // Logic to fill the list

        return  view;
    }
    private void addSampleData() {

        // 2. Set the LayoutManager (Vertical list)
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // 3. Prepare your data list
        activityList = new ArrayList<>();
        activityList.add(new ActivityModel(
                "INFRASTRUCTURE", "3d ago", "In Progress",
                "Wi-Fi connectivity issues in Block C",
                "The Wi-Fi in Block C has been consistently dropping...",
                "High", "Dr. Sharma"));

        activityList.add(new ActivityModel(
                "MAINTENANCE", "1d ago", "Pending",
                "Water leakage in Lab 4",
                "Pipe burst near the AC unit...",
                "Medium", "Mr. Verma"));

        activityList.add(new ActivityModel(
                "INFRASTRUCTURE", "3d ago", "In Progress",
                "Wi-Fi connectivity issues in Block C",
                "The Wi-Fi in Block C has been consistently dropping...",
                "High", "Dr. Sharma"));

        activityList.add(new ActivityModel(
                "MAINTENANCE", "1d ago", "Pending",
                "Water leakage in Lab 4",
                "Pipe burst near the AC unit...",
                "Medium", "Mr. Verma"));
        activityList.add(new ActivityModel(
                "INFRASTRUCTURE", "3d ago", "In Progress",
                "Wi-Fi connectivity issues in Block C",
                "The Wi-Fi in Block C has been consistently dropping...",
                "High", "Dr. Sharma"));

        activityList.add(new ActivityModel(
                "MAINTENANCE", "1d ago", "Pending",
                "Water leakage in Lab 4",
                "Pipe burst near the AC unit...",
                "Medium", "Mr. Verma"));


        // 4. Set the Adapter
        adapter = new ActivityAdapter(activityList);
        recyclerView.setAdapter(adapter);
    }
}