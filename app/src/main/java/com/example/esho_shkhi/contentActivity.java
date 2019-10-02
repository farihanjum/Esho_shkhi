package com.example.esho_shkhi;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class contentActivity extends AppCompatActivity {

    ListView contentsListView;

    String[] contentGula = {" স্বরবর্ণ "," ব্যঞ্জনবর্ণ "," চলো শিখি  "," Capital letter "," Small letter "," স্বরচিহ্ন  "," সংখ্যা  "," Numbers "};

    int[] imageGula={R.drawable.v1,R.drawable.c_1,R.drawable.cholo_shikhi_pic,R.drawable.capital_a_for_contents,R.drawable.small_a_for_contents,R.drawable.aaa_kar_for_contents,R.drawable.ek_for_contents,R.drawable.one_for_contents};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);

        contentsListView= (ListView)findViewById(R.id.listViewContentsId);

        myAdapterForContents adapterForContents = new myAdapterForContents(this,contentGula,imageGula);
        contentsListView.setAdapter(adapterForContents);

     /*   contentsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  if(position==0){
                      Toast.makeText(contentActivity.this,"a normal text",Toast.LENGTH_SHORT);
                  }
                if(position==0){
                    Toast.makeText(contentActivity.this,"a normal text___2",Toast.LENGTH_SHORT);
                }
            }
        });*/

        contentsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if(position==0)
                {
                    Intent content1Intent =new Intent(contentActivity.this,content_1.class);
                    startActivity(content1Intent);
                }

                if(position==1)
                {
                    Intent content2Intent =new Intent(contentActivity.this,content_2.class);
                    startActivity(content2Intent);
                }

                if(position==2)
                {
                    Intent content3Intent =new Intent(contentActivity.this,content_3.class);
                    startActivity(content3Intent);
                }


            }
        });
    }

    class myAdapterForContents extends ArrayAdapter<String>{

        Context context;
        String[] contentsGula2;
        int[] imageGula2;

        myAdapterForContents(Context c,String[] sArr,int[] imgArr)
        {
            super(c,R.layout.row,R.id.textView1,sArr);

            this.context =c ;
            this.contentsGula2 = sArr;
            this.imageGula2= imgArr;

        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflaterForContentsPage = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflaterForContentsPage.inflate(R.layout.row,parent,false );

            ImageView image= row.findViewById(R.id.imageView1);
            TextView textForContent = row.findViewById(R.id.textView1);

            image.setImageResource(imageGula2[position]);

            textForContent.setText(contentsGula2[position]);
            return row;
        }
    }



}
