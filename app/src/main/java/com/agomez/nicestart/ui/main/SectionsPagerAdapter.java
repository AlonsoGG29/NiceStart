package com.agomez.nicestart.ui.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.agomez.nicestart.fragments.Page1;
import com.agomez.nicestart.fragments.Page2;
import com.agomez.nicestart.fragments.Page3;
import com.agomez.nicestart.fragments.Page4;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Page1();
        } else if (position == 1) {
            return new Page2();
        } else if (position == 2) {
            return new Page3();
        } else if (position == 3) {
            return new Page4();
        } else {
            throw new IllegalArgumentException("Invalid position: " + position);
        }
    }

    @Override
    public int getCount() {
        return 4; // Número total de páginas
    }
}