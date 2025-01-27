package com.agomez.nicestart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.agomez.nicestart.ui.main.SectionsPagerAdapter;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainBn extends AppCompatActivity {

    private MenuItem prevMenuItem;                                  
    private SectionsPagerAdapter sectionsPagerAdapter;                                                      //IMPORTANTE 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainbn);                                                           //IMPORTANTE

        //Solo pasamos getSupportFragmentManager al adaptador
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());         //IMPORTANTE

        ViewPager viewPager = findViewById(R.id.view_pager);                                               //IMPORTANTE
        viewPager.setAdapter(sectionsPagerAdapter);                                                        //IMPORTANTE

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        setupBadges(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            handleNavigationSelection(item, viewPager);
            return true;
        });


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                MenuItem selectedItem = bottomNavigationView.getMenu().getItem(position);
                selectedItem.setChecked(true);
                prevMenuItem = selectedItem;
                removeBadge(bottomNavigationView, selectedItem.getItemId());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void setupBadges(BottomNavigationView bottomNavigationView){
        //Configura los badges para cada elemento
        BadgeDrawable badge = bottomNavigationView.getOrCreateBadge(R.id.likes);
        badge.setVisible(true); //Medalla, puntito rojo
        badge.setNumber(5); //Numero dentro del puntito rojo

        badge = bottomNavigationView.getOrCreateBadge(R.id.add);
        badge.setVisible(true);
        badge.setNumber(2);

        badge = bottomNavigationView.getOrCreateBadge(R.id.browse); //Cambiar por id de los logos del
        badge.setVisible(true);

        badge = bottomNavigationView.getOrCreateBadge(R.id.personal);
        badge.setVisible(false);
    }

    private void handleNavigationSelection(@NonNull MenuItem item, ViewPager viewPager){
        int position = -1;

        if (item.getItemId() == R.id.likes){
            position = 0; //Pagina 1
        } else if (item.getItemId() == R.id.add) {
            position = 1; //Pagina 2
        } else if (item.getItemId() == R.id.browse) {
            position = 2; //Pagina 3
        } else if (item.getItemId() == R.id.personal) {
            position = 3; //Pagina 4
        }

        if (position != -1){
            viewPager.setCurrentItem(position);
            item.setChecked(true);

            BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
            if (bottomNavigationView != null){
                removeBadge(bottomNavigationView, item.getItemId());
            }
        }

        viewPager.setCurrentItem(position);
        item.setChecked(true);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        if (bottomNavigationView != null){
            removeBadge(bottomNavigationView, item.getItemId());
        }
    }



    public static void removeBadge(BottomNavigationView bottomNavigationView, int itemId) {
        BadgeDrawable badge = bottomNavigationView.getBadge(itemId);
        if (badge != null) {
            badge.setVisible(false);
            badge.clearNumber();
        }
    }

}