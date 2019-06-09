package com.example.myapplication;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Random;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Friend extends Activity {
    ListView listView;
    ArrayList<String> list=new ArrayList<String>();
    ArrayList<String> list2=new ArrayList<String>();
    String str2= new String();
    Button btnAdd;
    private Random m_rand = new Random();
    Button btnDel;
    Button btnR;
    ArrayAdapter<String> adapter;
    TextView textView;
    Button btn_ani;
    Button btn_stop;
    ImageView img_ani;
    Animation ani;
    ImageView img_ani2;
    ImageButton button2;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend);

        listView=(ListView)findViewById(R.id.listView1);


//        img_ani= (ImageView)findViewById(R.drawable.dd);
//        img_ani2= (ImageView)findViewById(R.drawable.lucky);


        //어댑터객체 생성
        adapter=
                new ArrayAdapter<String>(this,//Context객체
                        android.R.layout.simple_list_item_single_choice,//보여질레이아웃형태
                        list //보여질데이터를 담고있는 배열
                );



        //하나의 항목을 선택할 수 있는 모드 설정
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);


        //어댑터와 리스트뷰 연결하기
        listView.setAdapter(adapter);


        //항목을 선택했을때 수행할 동작 처리(이벤트 처리)
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,//이벤트가 발생된 뷰
                                    View v,//이벤트가 발생된 차일드 뷰
                                    int position,//이벤트가 발생된 항목의 위치
                                    long id//이벤트가 발생된 뷰 id
            ){
                //ArrayList에서 position에 해당하는 데이터 얻어오기
                String item=list.get(position);
                //토스트로  출력하기
                Toast.makeText(Friend.this,
                        "선택항목:"+item,
                        Toast.LENGTH_SHORT).show();
            }
        });














//        btn_ani.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v) {
//
//                ani = AnimationUtils.loadAnimation(Friend.this, R.anim.animation);
//
//                //레이아웃을 포함한 모든 위젯은 시스템 에니메이션의 대상이 된다.
//
//
//                img_ani.startAnimation(ani);
//            }
//        });
//
//        btn_stop.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v) {
//
//
//                Animation ani = AnimationUtils.loadAnimation(Friend.this, R.anim.animation);
//                //레이아웃을 포함한 모든 위젯은 시스템 에니메이션의 대상이 된다.
//
//                img_ani.clearAnimation();
//                str2 = list.get(m_rand.nextInt(list.size()));
//                textView.setText(str2);
//                adapter.notifyDataSetChanged();
//
//                //   img_ani.startAnimation(ani);
//            }
//        });
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Friend.this,Category.class);
//                startActivity(intent);
//            }
//        });
    }

}
