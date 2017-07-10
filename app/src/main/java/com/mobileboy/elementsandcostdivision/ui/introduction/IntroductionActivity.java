package com.mobileboy.elementsandcostdivision.ui.introduction;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.mobileboy.elementsandcostdivision.R;
import com.mobileboy.elementsandcostdivision.ui.circle_indicator.InkPageIndicator;
import com.mobileboy.elementsandcostdivision.ui.introduction.cif.CIFFragment;
import com.mobileboy.elementsandcostdivision.ui.introduction.ciff.CIFFFragment;
import com.mobileboy.elementsandcostdivision.ui.introduction.gaf.GAFFragment;
import com.mobileboy.elementsandcostdivision.ui.introduction.gvd.GVDFragment;
import com.mobileboy.elementsandcostdivision.ui.introduction.mod.MODFragment;
import com.mobileboy.elementsandcostdivision.ui.introduction.moi.MOIFragment;
import com.mobileboy.elementsandcostdivision.ui.introduction.mpd.MPDDialogFragment;
import com.mobileboy.elementsandcostdivision.ui.introduction.mpd.MPDFragment;
import com.mobileboy.elementsandcostdivision.ui.introduction.mpi.MPIFragment;

public class IntroductionActivity extends AppCompatActivity implements MPDDialogFragment.OnSelectOptionListener,
        ViewPager.OnPageChangeListener, View.OnClickListener{

    private ViewPager vpgIntroduction;
    private InkPageIndicator indicator;
    private AppCompatButton imgBtnNextActivity;

    private CIFFragment cifFragment;
    private CIFFFragment ciffFragment;
    private GAFFragment gafFragment;
    private GVDFragment gvdFragment;
    private MODFragment modFragment;
    private MOIFragment moiFragment;
    private MPDFragment mpdFragment;
    private MPIFragment mpiFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        vpgIntroduction = (ViewPager) findViewById(R.id.vpgIntroduction);
        indicator = (InkPageIndicator) findViewById(R.id.indicator);
        imgBtnNextActivity = (AppCompatButton) findViewById(R.id.imgBtnNextActivity);

        init();
    }

    private void init() {
        setupViewPager();
    }

    private void setupViewPager() {
        cifFragment = CIFFragment.newInstance();
        ciffFragment = CIFFFragment.newInstance();
        gafFragment = GAFFragment.newInstance();
        gvdFragment = GVDFragment.newInstance();
        modFragment = MODFragment.newInstance();
        moiFragment = MOIFragment.newInstance();
        mpdFragment = MPDFragment.newInstance();
        mpiFragment = MPIFragment.newInstance();

        IntroductionViewPagerAdapter introductionViewPagerAdapter = new IntroductionViewPagerAdapter(getSupportFragmentManager());
        introductionViewPagerAdapter.addFragment(mpdFragment, getString(R.string.title_mpd));
        introductionViewPagerAdapter.addFragment(mpiFragment, getString(R.string.title_mpi));
        introductionViewPagerAdapter.addFragment(modFragment, getString(R.string.title_mod));
        introductionViewPagerAdapter.addFragment(moiFragment, getString(R.string.title_moi));
        introductionViewPagerAdapter.addFragment(ciffFragment, getString(R.string.title_ciff));
        introductionViewPagerAdapter.addFragment(cifFragment, getString(R.string.title_cif));
        introductionViewPagerAdapter.addFragment(gafFragment, getString(R.string.title_gaf));
        introductionViewPagerAdapter.addFragment(gvdFragment, getString(R.string.title_gvd));

        vpgIntroduction.setOffscreenPageLimit(introductionViewPagerAdapter.getCount());
        vpgIntroduction.setAdapter(introductionViewPagerAdapter);
        indicator.setViewPager(vpgIntroduction);

        vpgIntroduction.addOnPageChangeListener(this);
        imgBtnNextActivity.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onAccept(String description, int quantity, String dimension, int unitPrice, int totalPrice) {
        Toast.makeText(this, "VEAMOS", Toast.LENGTH_SHORT).show();
        mpdFragment.addMPDItemEntity(description, quantity, dimension, unitPrice, totalPrice);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (position == 7) {
            imgBtnNextActivity.setText(getString(R.string.done));
        } else {
            imgBtnNextActivity.setText(getString(R.string.next));
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imgBtnNextActivity){
            if (vpgIntroduction.getCurrentItem() == 3) {


            } else {
                vpgIntroduction.setCurrentItem(vpgIntroduction.getCurrentItem() + 1);
            }
        }
    }
}
