package com.example.myapplication.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.R;
import com.example.myapplication.con1;
import com.example.myapplication.con10;
import com.example.myapplication.con11;
import com.example.myapplication.con12;
import com.example.myapplication.con13;
import com.example.myapplication.con14;
import com.example.myapplication.con15;
import com.example.myapplication.con16;
import com.example.myapplication.con17;
import com.example.myapplication.con18;
import com.example.myapplication.con19;
import com.example.myapplication.con2;
import com.example.myapplication.con20;
import com.example.myapplication.con21;
import com.example.myapplication.con22;
import com.example.myapplication.con23;
import com.example.myapplication.con24;
import com.example.myapplication.con25;
import com.example.myapplication.con26;
import com.example.myapplication.con27;
import com.example.myapplication.con28;
import com.example.myapplication.con29;
import com.example.myapplication.con3;
import com.example.myapplication.con30;
import com.example.myapplication.con31;
import com.example.myapplication.con32;
import com.example.myapplication.con33;
import com.example.myapplication.con34;
import com.example.myapplication.con35;
import com.example.myapplication.con36;
import com.example.myapplication.con37;
import com.example.myapplication.con38;
import com.example.myapplication.con39;
import com.example.myapplication.con4;
import com.example.myapplication.con5;
import com.example.myapplication.con6;
import com.example.myapplication.con7;
import com.example.myapplication.con8;
import com.example.myapplication.con9;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1,R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4,R.string.tab_text_5,R.string.tab_text_6,R.string.tab_text_7,R.string.tab_text_8,R.string.tab_text_9,R.string.tab_text_10,R.string.tab_text_11,R.string.tab_text_12,R.string.tab_text_13,R.string.tab_text_14,R.string.tab_text_15,R.string.tab_text_16,R.string.tab_text_17,R.string.tab_text_18,R.string.tab_text_19,R.string.tab_text_20,R.string.tab_text_21,R.string.tab_text_22,R.string.tab_text_23,R.string.tab_text_24,R.string.tab_text_25,R.string.tab_text_26,R.string.tab_text_27,R.string.tab_text_28,R.string.tab_text_29,R.string.tab_text_30 ,R.string.tab_text_31,R.string.tab_text_32,R.string.tab_text_33,R.string.tab_text_34,R.string.tab_text_35,R.string.tab_text_36,R.string.tab_text_37,R.string.tab_text_38,R.string.tab_text_39 };
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                con1 conso1 = new con1();
                return conso1;


            case 1:
                con2 conso2 = new con2();
                return conso2;

            case 2:
                con3 conso3 = new con3();
                return conso3;

            case 3:
                con4 conso4 = new con4();
                return conso4;

            case 4:
                con5 conso5 = new con5();
                return conso5;

            case 5:
                con6 conso6 = new con6();
                return conso6;

            case 6:
                con7 conso7 = new con7();
                return conso7;

            case 7:
                con8 conso8 = new con8();
                return conso8;

            case 8:
                con9 conso9 = new con9();
                return conso9;

            case 9:
                con10 conso10 = new con10();
                return conso10;


            case 10:
                con11 conso11 = new con11();
                return conso11;


            case 11:
                con12 conso12 = new con12();
                return conso12;

            case 12:
                con13 conso13 = new con13();
                return conso13;

            case 13:
                con14 conso14 = new con14();
                return conso14;

            case 14:
                con15 conso15 = new con15();
                return conso15;

            case 15:
                con16 conso16 = new con16();
                return conso16;

            case 16:
                con17 conso17 = new con17();
                return conso17;

            case 17:
                con18 conso18 = new con18();
                return conso18;

            case 18:
                con19 conso19 = new con19();
                return conso19;

            case 19:
                con20 conso20 = new con20();
                return conso20;

            case 20:
                con21 conso21 = new con21();
                return conso21;


            case 21:
                con22 conso22 = new con22();
                return conso22;

            case 22:
                con23 conso23 = new con23();
                return conso23;

            case 23:
                con24 conso24 = new con24();
                return conso24;

            case 24:
                con25 conso25 = new con25();
                return conso25;

            case 25:
                con26 conso26 = new con26();
                return conso26;

            case 26:
                con27 conso27 = new con27();
                return conso27;

            case 27:
                con28 conso28 = new con28();
                return conso28;

            case 28:
                con29 conso29 = new con29();
                return conso29;

            case 29:
                con30 conso30 = new con30();
                return conso30;

            case 30:
                con31 conso31 = new con31();
                return conso31;


            case 31:
                con32 conso32 = new con32();
                return conso32;

            case 32:
                con33 conso33 = new con33();
                return conso33;

            case 33:
                con34 conso34 = new con34();
                return conso34;

            case 34:
                con35 conso35 = new con35();
                return conso35;

            case 35:
                con36 conso36 = new con36();
                return conso36;

            case 36:
                con37 conso37 = new con37();
                return conso37;

            case 37:
                con38 conso38 = new con38();
                return conso38;

            case 38:
                con39 conso39 = new con39();
                return conso39;



            default:
                return null;
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 40;
    }
}