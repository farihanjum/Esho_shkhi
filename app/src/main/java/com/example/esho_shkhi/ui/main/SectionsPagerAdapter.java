package com.example.esho_shkhi.ui.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.esho_shkhi.R;
import com.example.esho_shkhi.con1;
import com.example.esho_shkhi.con10;
import com.example.esho_shkhi.con2;
import com.example.esho_shkhi.con3;
import com.example.esho_shkhi.con4;
import com.example.esho_shkhi.con5;
import com.example.esho_shkhi.con6;
import com.example.esho_shkhi.con7;
import com.example.esho_shkhi.con8;
import com.example.esho_shkhi.con9;
import com.example.esho_shkhi.v1;
import com.example.esho_shkhi.v10;
import com.example.esho_shkhi.v11;
import com.example.esho_shkhi.v2;
import com.example.esho_shkhi.v3;
import com.example.esho_shkhi.v4;
import com.example.esho_shkhi.v5;
import com.example.esho_shkhi.v6;
import com.example.esho_shkhi.v7;
import com.example.esho_shkhi.v8;
import com.example.esho_shkhi.v9;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TEXT = new int[]{R.string.tab_text_1,R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4,R.string.tab_text_5,R.string.tab_text_6,R.string.tab_text_7,R.string.tab_text_8,R.string.tab_text_9,R.string.tab,R.string.tab_text_11, R.string.tab_text_12,R.string.tab_text_13,R.string.tab_text_14,R.string.tab_text_15,R.string.tab_text_16,R.string.tab_text_17,R.string.tab_text_18,R.string.tab_text_19,R.string.tab_text_20,R.string.tab_text_21};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                v1 vowel1= new v1();
                return vowel1;
            case 1:
                v2 vowel2= new v2();
                return vowel2;
            case 2:
                v3 vowel3= new v3();
                return vowel3;
            case 3:
                v4 vowel4= new v4();
                return vowel4;

            case 4:
                v5 vowel5= new v5();
                return vowel5;
            case 5:
                v6 vowel6= new v6();
                return vowel6;

            case 6:
                v7 vowel7= new v7();
                return vowel7;

            case 7:
                v8 vowel8= new v8();
                return vowel8;

            case 8:
                v9 vowel9= new v9();
                return vowel9;

            case 9:
                v10 vowel10= new v10();
                return vowel10;

            case 10:
                v11 vowel11= new v11();
                return vowel11;

            case 11:
                con1 conso1=new con1();
                return conso1;


            case 12:
                con2 conso2=new con2();
                return conso2;

            case 13:
                con3 conso3=new con3();
                return conso3;

            case 14:
                con4 conso4=new con4();
                return conso4;

            case 15:
                con5 conso5=new con5();
                return conso5;

            case 16:
                con6 conso6=new con6();
                return conso6;

            case 17:
                con7 conso7=new con7();
                return conso7;

            case 18:
                con8 conso8=new con8();
                return conso8;

            case 19:
                con9 conso9=new con9();
                return conso9;

            case 20:
                con10 conso10=new con10();
                return conso10;

                default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TEXT[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 21;
    }
}