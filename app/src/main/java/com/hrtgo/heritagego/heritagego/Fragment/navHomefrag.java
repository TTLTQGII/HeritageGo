package com.hrtgo.heritagego.heritagego.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hrtgo.heritagego.heritagego.Model.LocationHome;
import com.hrtgo.heritagego.heritagego.R;
import com.hrtgo.heritagego.heritagego.Adapter.navHomeAdapter;

import java.util.ArrayList;

public class navHomefrag extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    ArrayList<LocationHome> locationFamous;
    //homeTabFamous homeTabFamous;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_bottom_home_fragment, container, false);
//        Bundle bundle = new Bundle();
//        bundle.putSerializable("List", locationFamous);
        intitView(view);
        setEvent();

        return  view;
    }

    // create instance for bottom navigation home fragment
    private void intitView(View view){
        tabLayout = view.findViewById(R.id.home_fragment_tab_Layout);
        viewPager = view.findViewById(R.id.home_fragment_tab_viewpagger);
    }

    // Use viewpager with tablayout use FragmentStatePagerAdapter
    private void setEvent(){
        navHomeAdapter adapter = new navHomeAdapter(getActivity().getSupportFragmentManager());
        adapter.getItem(0);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(adapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //   appBarLayout.setExpanded(true,true);
            }

            @Override
            public void onPageSelected(int position) {
                //  appBarLayout.setExpanded(true,true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                //appBarLayout.setExpanded(true,true);
            }
        });
    }

//    private void initData(){
//        locationFamous = new ArrayList<>();
//        locationFamous.add(new LocationHome(R.drawable.benh_vien_da_khoa_sai_gon, "20", "Bệnh Viện Đa Khoa Sài Gòn"));
//        locationFamous.add(new LocationHome(R.drawable.cho_ben_thanh, "50", "Chợ Bến Thành"));
//        locationFamous.add(new LocationHome(R.drawable.ben_nha_rong, "1000000", "Bến Nhà Rồng"));
//        locationFamous.add(new LocationHome(R.drawable.dinh_doc_lap, "1000", "Dinh Độc Lập"));
//        locationFamous.add(new LocationHome(R.drawable.buu_dien_trung_tam_sai_gon, "10000000", "Bưu Điện Trung Tâm Sài Gòn ABCDEFGHIJK"));
//        locationFamous.add(new LocationHome(R.drawable.cau_mong_sai_gon, "100000", "Cầu Mòng Sài Gòn"));
//    }

}
