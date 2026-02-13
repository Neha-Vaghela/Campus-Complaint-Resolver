package com.clg_complaint_Solver.quickresolve;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.clg_complaint_Solver.quickresolve.Fragment.DeshboardFragment;
import com.clg_complaint_Solver.quickresolve.Fragment.IssueFragment;
import com.clg_complaint_Solver.quickresolve.Fragment.ProfileFragment;
import com.clg_complaint_Solver.quickresolve.Fragment.SubmitFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainDeshboardActivity extends AppCompatActivity {

    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_deshboard);
        bnView = findViewById(R.id.bnView);
        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.deshboard){
                    loadFrag(new DeshboardFragment(),false);
                } else if (id==R.id.submit_complaint) {
                    loadFrag(new SubmitFragment(),false);
                } else if (id==R.id.issues) {
                    loadFrag(new IssueFragment(),false);
                }else {
                    loadFrag(new ProfileFragment(),true);
                }
                return true;
            }
        });
        bnView.setSelectedItemId(R.id.deshboard);

    }
    public void loadFrag(Fragment fragment , boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container,fragment);
        ft.commit();
    }
}