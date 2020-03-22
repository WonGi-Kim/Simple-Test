package com.example.wongi.a1to25;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {
    View[] include = new View[2];
    TextView now_number;
    RelativeLayout[] button = new RelativeLayout[25];
    TextView[] button_text = new TextView[25];
    RelativeLayout ok_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        all_view();
        include[0].setVisibility(View.VISIBLE);
        include[1].setVisibility(View.GONE);
        game();
        all_button_click();
    }
    int numGroup1, numGroup2;
    private void game() {
        now_number.setText(Integer.toString(matchNumber));//현재 입력해야 하는 숫자를 보여줌
        for(numGroup1 = 1; numGroup1 <= 2; numGroup1++) {
            for(numGroup2 = 1; numGroup2 <= 25; numGroup2++) {
                random();//그룹별로 숫자 생성
            }
        }
        for(int print_button_num = 0; print_button_num <= 24; print_button_num++) {
            button_text[print_button_num].setText(Integer.toString(buttonGroup1[print_button_num]));
        }
    }

    int matchNumber = 1;//현재 터치해야 하는 숫자 값
    int randomButton;
    int[] buttonGroup1 = new int[25];//숫자 1-25
    int[] buttonGroup2 = new int[25];//숫자 26-50 까지 두번을 저장하기 위해 1과 2로 그룹을 나눔
    private void random() {
        Random random = new Random();
        randomButton = random.nextInt(25);//랜덤으로 뽑힌 숫자를 저장
		
        if(numGroup1 == 1 && buttonGroup1[(randomButton)] == 0) {
            buttonGroup1[(randomButton)] = numGroup2;//버튼 그룹1에 있는 수를 넘버그룹2에 저장
        }else if(numGroup1 == 1 && numGroup2 <= 25){
            random();
        }
        if(numGroup1 == 2 && buttonGroup2[(randomButton)] == 0) {
            buttonGroup2[(randomButton)] = (numGroup2+25);// 똑같이 한 후에 25를 더해주고 밑에서 랜덤으로 버튼
        }else if(numGroup1 == 2 && numGroup2 <= 25){
            random();
        }
    }
	
    private void all_view() {
        include[0] = findViewById(R.id.include_game_view);
        include[1] = findViewById(R.id.include_success_view);
        now_number = (TextView)findViewById(R.id.now_number);
        button[0] = (RelativeLayout)findViewById(R.id.button_1);
        button[1] = (RelativeLayout)findViewById(R.id.button_2);
        button[2] = (RelativeLayout)findViewById(R.id.button_3);
        button[3] = (RelativeLayout)findViewById(R.id.button_4);
        button[4] = (RelativeLayout)findViewById(R.id.button_5);
        button[5] = (RelativeLayout)findViewById(R.id.button_6);
        button[6] = (RelativeLayout)findViewById(R.id.button_7);
        button[7] = (RelativeLayout)findViewById(R.id.button_8);
        button[8] = (RelativeLayout)findViewById(R.id.button_9);
        button[9] = (RelativeLayout)findViewById(R.id.button_10);
        button[10] = (RelativeLayout)findViewById(R.id.button_11);
        button[11] = (RelativeLayout)findViewById(R.id.button_12);
        button[12] = (RelativeLayout)findViewById(R.id.button_13);
        button[13] = (RelativeLayout)findViewById(R.id.button_14);
        button[14] = (RelativeLayout)findViewById(R.id.button_15);
        button[15] = (RelativeLayout)findViewById(R.id.button_16);
        button[16] = (RelativeLayout)findViewById(R.id.button_17);
        button[17] = (RelativeLayout)findViewById(R.id.button_18);
        button[18] = (RelativeLayout)findViewById(R.id.button_19);
        button[19] = (RelativeLayout)findViewById(R.id.button_20);
        button[20] = (RelativeLayout)findViewById(R.id.button_21);
        button[21] = (RelativeLayout)findViewById(R.id.button_22);
        button[22] = (RelativeLayout)findViewById(R.id.button_23);
        button[23] = (RelativeLayout)findViewById(R.id.button_24);
        button[24] = (RelativeLayout)findViewById(R.id.button_25);
        button_text[0] = (TextView)findViewById(R.id.button_text_1);
        button_text[1] = (TextView)findViewById(R.id.button_text_2);
        button_text[2] = (TextView)findViewById(R.id.button_text_3);
        button_text[3] = (TextView)findViewById(R.id.button_text_4);
        button_text[4] = (TextView)findViewById(R.id.button_text_5);
        button_text[5] = (TextView)findViewById(R.id.button_text_6);
        button_text[6] = (TextView)findViewById(R.id.button_text_7);
        button_text[7] = (TextView)findViewById(R.id.button_text_8);
        button_text[8] = (TextView)findViewById(R.id.button_text_9);
        button_text[9] = (TextView)findViewById(R.id.button_text_10);
        button_text[10] = (TextView)findViewById(R.id.button_text_11);
        button_text[11] = (TextView)findViewById(R.id.button_text_12);
        button_text[12] = (TextView)findViewById(R.id.button_text_13);
        button_text[13] = (TextView)findViewById(R.id.button_text_14);
        button_text[14] = (TextView)findViewById(R.id.button_text_15);
        button_text[15] = (TextView)findViewById(R.id.button_text_16);
        button_text[16] = (TextView)findViewById(R.id.button_text_17);
        button_text[17] = (TextView)findViewById(R.id.button_text_18);
        button_text[18] = (TextView)findViewById(R.id.button_text_19);
        button_text[19] = (TextView)findViewById(R.id.button_text_20);
        button_text[20] = (TextView)findViewById(R.id.button_text_21);
        button_text[21] = (TextView)findViewById(R.id.button_text_22);
        button_text[22] = (TextView)findViewById(R.id.button_text_23);
        button_text[23] = (TextView)findViewById(R.id.button_text_24);
        button_text[24] = (TextView)findViewById(R.id.button_text_25);
        ok_button = (RelativeLayout)findViewById(R.id.ok_button);
    }
    int button_num;
    private void all_button_click() {
        for (int i = 0; i < 25; i++) {
            final int j = i;
            button[j].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(matchNumber == 50) {//숫자가 50이면 sueccess.xml을 호출해서 성공화면을 보여줌
                        include[1].setVisibility(View.VISIBLE);
                        include[0].setVisibility(View.GONE);
                    }
                    int number = j;//맞는 번호를 입력해야 다음 번호를 작동할 수 있도록 함
					
                    if(matchNumber == buttonGroup1[number]) {
                        matchNumber += 1;//현재 터치 숫자를 1씩 증가시키고
                        button_text[number].setText(Integer.toString(buttonGroup2[number]));// 여기서 지정된 값을 출력시킴
                    }
                    if(matchNumber == buttonGroup2[number]) {
                        matchNumber += 1;
                        button_text[number].setVisibility(View.GONE);
                    }
                    now_number.setText(Integer.toString(matchNumber));
                }
            });
        }
        ok_button.setOnClickListener(new View.OnClickListener() {
			
            @Override
            public void onClick(View view) {//성공화면에서의 확인버튼을 위한 코드
                matchNumber = 1;
                for(int reset_button_number = 0; reset_button_number <= 24; reset_button_number++) {
                    buttonGroup1[reset_button_number] = 0;//확인버튼을 누르면 그룹1과
	
                    buttonGroup2[reset_button_number] = 0;//그룹2를 0으로 초기화시키고 위에서 다시 숫자를 입력
                    button_text[reset_button_number].setVisibility(View.VISIBLE);
                }
                include[0].setVisibility(View.VISIBLE);
                include[1].setVisibility(View.GONE);
                game();
            }
        });
    }
}
