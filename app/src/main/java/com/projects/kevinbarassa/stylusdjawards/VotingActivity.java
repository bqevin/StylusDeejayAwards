package com.projects.kevinbarassa.stylusdjawards;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VotingActivity extends AppCompatActivity {
    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 17;
    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;
    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);
        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new CatFragOne();
                case 1:
                    return new CatFragTwo();
                case 2:
                    return new CatFragThree();
                case 3:
                    return new CatFragFour();
                case 4:
                    return new CatFragFive();
                case 5:
                    return new CatFragSix();
                case 6:
                    return new CatFragSeven();
                case 7:
                    return new CatFragEight();
                case 8:
                    return new CatFragNine();
                case 9:
                    return new CatFragTen();
                case 10:
                    return new CatFragEleven();
                case 11:
                    return new CatFragTwelve();
                case 12:
                    return new CatFragThirteen();
                case 13 :
                    return new CatFragFourteen();
                case 14:
                    return new CatFragFifteen();
                case 15:
                    return new CatFragSixteen();
                case 16:
                    return new CatFragSeventeen();
                default:
                    return null;

            }

        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
