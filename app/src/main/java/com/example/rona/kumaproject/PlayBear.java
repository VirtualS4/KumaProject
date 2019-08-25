package com.example.rona.kumaproject;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayBear extends AppCompatActivity {
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    ImageView img10;
    ImageView img11;
    ImageView img12;
    ImageView img13;
    ImageView img14;
    ImageView img15;
    Bearblock block1;
    Bearblock block2;
    Bearblock block3;
    Bearblock block4;
    Bearblock block5;
    Bearblock block6;
    Bearblock block7;
    Bearblock block8;
    Bearblock block9;
    Bearblock block10;
    Bearblock block11;
    Bearblock block12;
    Bearblock block13;
    Bearblock block14;
    Bearblock block15;
    ArrayList<Bearblock> listblock;
    Button leftbtn;
    Button rightbtn;
    Button upbtn;
    Button downbtn;
    int[] currentpos = new int[]{3,3};
    int[] leftpos = new int[]{2,3};
    int[] rightpos = new int[]{4,3};
    int[] uppos = new int[]{3,2};
    int[] downpos = new int[]{3,4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_bear);

        initblock();
        leftbtn = findViewById(R.id.Left);
        rightbtn = findViewById(R.id.Right);
        upbtn = findViewById(R.id.Up);
        downbtn = findViewById(R.id.Down);
        Bearmove();
//        MovementMethod
//        bloc1.set
    }
    private void Bearmove(){

        if(leftpos[0]>=0){
            for(int i = 0;i<15;i++) {
                if (leftpos[0] == listblock.get(i).getPosition()[0]&&leftpos[1] == listblock.get(i).getPosition()[1]) {
                    Run(listblock.get(i),leftbtn,180,0,"left");
                    System.out.print("Its Left");
                }
            }
        }else{
            EmptyButtonOnClick(leftbtn);
        }
        if(rightpos[0]<=3){
            for(int i = 0;i<15;i++) {
                if (rightpos[0] == listblock.get(i).getPosition()[0]&&rightpos[1] == listblock.get(i).getPosition()[1]) {
                    Run(listblock.get(i),rightbtn,-180,0,"right");
                    System.out.print("Its Right");
                }
            }
        }else{
            EmptyButtonOnClick(rightbtn);
        }

        if(uppos[1]>=0){
            for(int i = 0;i<15;i++) {
                if (uppos[0] == listblock.get(i).getPosition()[0]&&uppos[1] == listblock.get(i).getPosition()[1]) {
                    Run(listblock.get(i),upbtn,0,180,"up");
                    System.out.print("Its Up");
                }
            }
        }else{
            EmptyButtonOnClick(upbtn);
        }

        if(downpos[1]<=3){
            for(int i = 0;i<15;i++) {
                if (downpos[0] == listblock.get(i).getPosition()[0]&&downpos[1] == listblock.get(i).getPosition()[1]) {
                    Run(listblock.get(i),downbtn,0,-180,"down");
                    System.out.print("Its Down");
                }
            }
        }else{
            EmptyButtonOnClick(downbtn);
        }

    }
    private void EmptyButtonOnClick(Button btn){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void Run(Bearblock block,Button btn,int x, int y,String change){
        ImageView img = block.getBlock();
        int[] cur = new int[2];
        cur[0] = (block.getPosition()[0]-block.getStartposition()[0])*180+x;
        cur[1] = (block.getPosition()[1]-block.getStartposition()[1])*180+y;
        int[] next = new int[2];
        next[0] = (block.getPosition()[0]-block.getStartposition()[0])*180;
        next[1] = (block.getPosition()[1]-block.getStartposition()[1])*180;
        initbtn(btn,img,cur,next,block,change);
    }
    private void initblock(){
        img1 = findViewById(R.id.block1);
        block1 = new Bearblock();
        block1.setPosition(new int[]{0,0});
        block1.initDeltaposition();
        block1.setBlock(img1);

        img2 = findViewById(R.id.block2);
        block2 = new Bearblock();
        block2.setPosition(new int[]{1,0});
        block2.initDeltaposition();
        block2.setBlock(img2);

        img3 = findViewById(R.id.block3);
        block3 = new Bearblock();
        block3.setPosition(new int[]{2,0});
        block3.initDeltaposition();
        block3.setBlock(img3);

        img4 = findViewById(R.id.block4);
        block4 = new Bearblock();
        block4.setPosition(new int[]{3,0});
        block4.initDeltaposition();
        block4.setBlock(img4);

        img5 = findViewById(R.id.block5);
        block5 = new Bearblock();
        block5.setPosition(new int[]{0,1});
        block5.initDeltaposition();
        block5.setBlock(img5);

        img6 = findViewById(R.id.block6);
        block6 = new Bearblock();
        block6.setPosition(new int[]{1,1});
        block6.initDeltaposition();
        block6.setBlock(img6);

        img7 = findViewById(R.id.block7);
        block7 = new Bearblock();
        block7.setPosition(new int[]{2,1});
        block7.initDeltaposition();
        block7.setBlock(img7);

        img8 = findViewById(R.id.block8);
        block8 = new Bearblock();
        block8.setPosition(new int[]{3,1});
        block8.initDeltaposition();
        block8.setBlock(img8);

        img9 = findViewById(R.id.block9);
        block9 = new Bearblock();
        block9.setPosition(new int[]{0,2});
        block9.initDeltaposition();
        block9.setBlock(img9);

        img10 = findViewById(R.id.block10);
        block10 = new Bearblock();
        block10.setPosition(new int[]{1,2});
        block10.initDeltaposition();
        block10.setBlock(img10);

        img11 = findViewById(R.id.block11);
        block11 = new Bearblock();
        block11.setPosition(new int[]{2,2});
        block11.initDeltaposition();
        block11.setBlock(img11);

        img12 = findViewById(R.id.block12);
        block12 = new Bearblock();
        block12.setPosition(new int[]{3,2});
        block12.initDeltaposition();
        block12.setBlock(img12);

        img13 = findViewById(R.id.block13);
        block13 = new Bearblock();
        block13.setPosition(new int[]{0,3});
        block13.initDeltaposition();
        block13.setBlock(img13);

        img14 = findViewById(R.id.block14);
        block14 = new Bearblock();
        block14.setPosition(new int[]{1,3});
        block14.initDeltaposition();
        block14.setBlock(img14);

        img15 = findViewById(R.id.block15);
        block15 = new Bearblock();
        block15.setPosition(new int[]{2,3});
        block15.initDeltaposition();
        block15.setBlock(img15);

        block1.setStartposition();
        block2.setStartposition();
        block3.setStartposition();
        block4.setStartposition();
        block5.setStartposition();
        block6.setStartposition();
        block7.setStartposition();
        block8.setStartposition();
        block9.setStartposition();
        block10.setStartposition();
        block11.setStartposition();
        block12.setStartposition();
        block13.setStartposition();
        block14.setStartposition();
        block15.setStartposition();

        listblock = new ArrayList<Bearblock>();
        listblock.add(block1);
        listblock.add(block2);
        listblock.add(block3);
        listblock.add(block4);
        listblock.add(block5);
        listblock.add(block6);
        listblock.add(block7);
        listblock.add(block8);
        listblock.add(block9);
        listblock.add(block10);
        listblock.add(block11);
        listblock.add(block12);
        listblock.add(block13);
        listblock.add(block14);
        listblock.add(block15);
    }

    private void initbtn(Button btn, final ImageView img, final int[] pos,final int[]next, final Bearblock block, final String change){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = new TranslateAnimation(next[0],pos[0],next[1], pos[1]);
                System.out.println((pos[0])+","+(pos[1]));
                System.out.println(change);
                animation.setDuration(1000);
                animation.setFillAfter(true);
                img.startAnimation(animation);
                Change(change,block);
                Bearmove();
            }
        });
    }
    private void Change(String change,Bearblock block){
        if(change.equals("left")){
            int[] blockpos = block.getPosition();
            block.setPosition(currentpos);
            currentpos = blockpos;
            rightpos[0] = rightpos[0]-1;
            leftpos[0] = leftpos[0]-1;
            uppos[0] = uppos[0]-1;
            downpos[0] = downpos[0]-1;
        }else if(change.equals("right")){
            int[] blockpos = block.getPosition();
            block.setPosition(currentpos);
            currentpos = blockpos;
            rightpos[0] = rightpos[0]+1;
            leftpos[0] = leftpos[0]+1;
            uppos[0] = uppos[0]+1;
            downpos[0] = downpos[0]+1;
        }else if(change.equals("up")){
            int[] blockpos = block.getPosition();
            block.setPosition(currentpos);
            currentpos = blockpos;
            rightpos[1] = rightpos[1]-1;
            leftpos[1] = leftpos[1]-1;
            uppos[1] = uppos[1]-1;
            downpos[1] = downpos[1]-1;
        }else if(change.equals("down")){
            int[] blockpos = block.getPosition();
            block.setPosition(currentpos);
            currentpos = blockpos;
            rightpos[1] = rightpos[1]+1;
            leftpos[1] = leftpos[1]+1;
            uppos[1] = uppos[1]+1;
            downpos[1] = downpos[1]+1;
        }
    }
}
