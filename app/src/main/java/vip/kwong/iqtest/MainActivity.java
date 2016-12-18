package vip.kwong.iqtest;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int iq = 0;
    EditText e38;
    AlertDialog dialog;
    RadioGroup r1, r2, r3, r4, r5, r6, r7, r8, r9, r10,
            r11, r12, r13, r14, r15, r16, r17, r18, r19, r20,
            r21, r22, r23, r24, r25, r26, r27, r28, r29, r30,
            r31, r32, r33, r34, r35, r36, r37, r38, r39, r40,
            r41, r42, r43, r44, r45, r46, r47, r48, r49, r50,
            r51, r52, r53, r54, r55, r56, r57, r58, r59, r60;
    RadioButton r1a, r2a, r3a, r4a, r5a, r6a, r7a, r8a, r9a, r10a,
            r11a, r12a, r13a, r14a, r15a, r16a, r17a, r18a, r19a, r20a,
            r21a, r22a, r23a, r24a, r25a, r26a, r27a, r28a, r29a, r30a,
            r31a, r32a, r33a, r34a, r35a, r36a, r37a, r38a, r39a, r40a,
            r41a, r42a, r43a, r44a, r45a, r46a, r47a, r48a, r49a, r50a,
            r51a, r52a, r53a, r54a, r55a, r56a, r57a, r58a, r59a, r60a;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RadioGroup) findViewById(R.id.r1);
        r1a = (RadioButton) findViewById(R.id.r1a);
        r2 = (RadioGroup) findViewById(R.id.r2);
        r2a = (RadioButton) findViewById(R.id.r2a);
        r3 = (RadioGroup) findViewById(R.id.r3);
        r3a = (RadioButton) findViewById(R.id.r3a);
        r4 = (RadioGroup) findViewById(R.id.r4);
        r4a = (RadioButton) findViewById(R.id.r4a);
        r5 = (RadioGroup) findViewById(R.id.r5);
        r5a = (RadioButton) findViewById(R.id.r5a);
        r6 = (RadioGroup) findViewById(R.id.r6);
        r6a = (RadioButton) findViewById(R.id.r6a);
        r7 = (RadioGroup) findViewById(R.id.r7);
        r7a = (RadioButton) findViewById(R.id.r7a);
        r8 = (RadioGroup) findViewById(R.id.r8);
        r8a = (RadioButton) findViewById(R.id.r8a);
        r9 = (RadioGroup) findViewById(R.id.r9);
        r9a = (RadioButton) findViewById(R.id.r9a);
        r10 = (RadioGroup) findViewById(R.id.r10);
        r10a = (RadioButton) findViewById(R.id.r10a);
        r11 = (RadioGroup) findViewById(R.id.r11);
        r11a = (RadioButton) findViewById(R.id.r11a);
        r12 = (RadioGroup) findViewById(R.id.r12);
        r12a = (RadioButton) findViewById(R.id.r12a);
        r13 = (RadioGroup) findViewById(R.id.r13);
        r13a = (RadioButton) findViewById(R.id.r13a);
        r14 = (RadioGroup) findViewById(R.id.r14);
        r14a = (RadioButton) findViewById(R.id.r14a);
        r15 = (RadioGroup) findViewById(R.id.r15);
        r15a = (RadioButton) findViewById(R.id.r15a);
        r16 = (RadioGroup) findViewById(R.id.r16);
        r16a = (RadioButton) findViewById(R.id.r16a);
        r17 = (RadioGroup) findViewById(R.id.r17);
        r17a = (RadioButton) findViewById(R.id.r17a);
        r18 = (RadioGroup) findViewById(R.id.r18);
        r18a = (RadioButton) findViewById(R.id.r18a);
        r19 = (RadioGroup) findViewById(R.id.r19);
        r19a = (RadioButton) findViewById(R.id.r19a);
        r20 = (RadioGroup) findViewById(R.id.r20);
        r20a = (RadioButton) findViewById(R.id.r20a);
        r21 = (RadioGroup) findViewById(R.id.r21);
        r21a = (RadioButton) findViewById(R.id.r21a);
        r22 = (RadioGroup) findViewById(R.id.r22);
        r22a = (RadioButton) findViewById(R.id.r22a);
        r23 = (RadioGroup) findViewById(R.id.r23);
        r23a = (RadioButton) findViewById(R.id.r23a);
        r24 = (RadioGroup) findViewById(R.id.r24);
        r24a = (RadioButton) findViewById(R.id.r24a);
        r25 = (RadioGroup) findViewById(R.id.r25);
        r25a = (RadioButton) findViewById(R.id.r25a);
        r26 = (RadioGroup) findViewById(R.id.r26);
        r26a = (RadioButton) findViewById(R.id.r26a);
        r27 = (RadioGroup) findViewById(R.id.r27);
        r27a = (RadioButton) findViewById(R.id.r27a);
        r28 = (RadioGroup) findViewById(R.id.r28);
        r28a = (RadioButton) findViewById(R.id.r28a);
        r29 = (RadioGroup) findViewById(R.id.r29);
        r29a = (RadioButton) findViewById(R.id.r29a);
        r30 = (RadioGroup) findViewById(R.id.r30);
        r30a = (RadioButton) findViewById(R.id.r30a);
        r31 = (RadioGroup) findViewById(R.id.r31);
        r31a = (RadioButton) findViewById(R.id.r31a);
        r32 = (RadioGroup) findViewById(R.id.r32);
        r32a = (RadioButton) findViewById(R.id.r32a);
        r33 = (RadioGroup) findViewById(R.id.r33);
        r33a = (RadioButton) findViewById(R.id.r33a);
        r34 = (RadioGroup) findViewById(R.id.r34);
        r34a = (RadioButton) findViewById(R.id.r34a);
        r35 = (RadioGroup) findViewById(R.id.r35);
        r35a = (RadioButton) findViewById(R.id.r35a);
        r36 = (RadioGroup) findViewById(R.id.r36);
        r36a = (RadioButton) findViewById(R.id.r36a);
        r37 = (RadioGroup) findViewById(R.id.r37);
        r37a = (RadioButton) findViewById(R.id.r37a);

        r39 = (RadioGroup) findViewById(R.id.r39);
        r39a = (RadioButton) findViewById(R.id.r39a);
        r40 = (RadioGroup) findViewById(R.id.r40);
        r40a = (RadioButton) findViewById(R.id.r40a);
        r41 = (RadioGroup) findViewById(R.id.r41);
        r41a = (RadioButton) findViewById(R.id.r41a);
        r42 = (RadioGroup) findViewById(R.id.r42);
        r42a = (RadioButton) findViewById(R.id.r42a);
        r43 = (RadioGroup) findViewById(R.id.r43);
        r43a = (RadioButton) findViewById(R.id.r43a);
        r44 = (RadioGroup) findViewById(R.id.r44);
        r44a = (RadioButton) findViewById(R.id.r44a);
        r45 = (RadioGroup) findViewById(R.id.r45);
        r45a = (RadioButton) findViewById(R.id.r45a);
        r46 = (RadioGroup) findViewById(R.id.r46);
        r46a = (RadioButton) findViewById(R.id.r46a);
        r47 = (RadioGroup) findViewById(R.id.r47);
        r47a = (RadioButton) findViewById(R.id.r47a);
        r48 = (RadioGroup) findViewById(R.id.r48);
        r48a = (RadioButton) findViewById(R.id.r48a);
        r49 = (RadioGroup) findViewById(R.id.r49);
        r49a = (RadioButton) findViewById(R.id.r49a);
        r50 = (RadioGroup) findViewById(R.id.r50);
        r50a = (RadioButton) findViewById(R.id.r50a);
        r51 = (RadioGroup) findViewById(R.id.r51);
        r51a = (RadioButton) findViewById(R.id.r51a);
        r52 = (RadioGroup) findViewById(R.id.r52);
        r52a = (RadioButton) findViewById(R.id.r52a);
        r53 = (RadioGroup) findViewById(R.id.r53);
        r53a = (RadioButton) findViewById(R.id.r53a);
        r54 = (RadioGroup) findViewById(R.id.r54);
        r54a = (RadioButton) findViewById(R.id.r54a);
        r55 = (RadioGroup) findViewById(R.id.r55);
        r55a = (RadioButton) findViewById(R.id.r55a);
        r56 = (RadioGroup) findViewById(R.id.r56);
        r56a = (RadioButton) findViewById(R.id.r56a);
        r57 = (RadioGroup) findViewById(R.id.r57);
        r57a = (RadioButton) findViewById(R.id.r57a);
        r58 = (RadioGroup) findViewById(R.id.r58);
        r58a = (RadioButton) findViewById(R.id.r58a);
        r59 = (RadioGroup) findViewById(R.id.r59);
        r59a = (RadioButton) findViewById(R.id.r59a);
        r60 = (RadioGroup) findViewById(R.id.r60);
        r60a = (RadioButton) findViewById(R.id.r60a);


        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r1a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，答对啦,真聪明！" + score);
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });

        r2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r2a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r3a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r4a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r5a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r6a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r7a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r8a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r9a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r10a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r11a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });

        r12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r12a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r13a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r14a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r15a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r16a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r17a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r18a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r19a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r20a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r21a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });

        r22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r22a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r23a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r24a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r25a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r26a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r27a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r28a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r29a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r30a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r31a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });

        r32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r32a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r33a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r34a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r35a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r36a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r37a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });


        r39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r39a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r40a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r41a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });

        r42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r42a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r43a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r44a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r45a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r46a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r47a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r48a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r49a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r50a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r51a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });

        r52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r52a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r53a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r54a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r55a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r56a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r57a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r58.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r58a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r59.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r59a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });
        r60.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == r60a.getId()) {
                    score = score + 1;
                    DisplayToast("哈哈，你答对啦,真聪明！");
                } else {
                    score = score;
                    DisplayToast("哼，知道错了吧");
                }
            }
        });


    }

    public void click(View v) {
        if (e38.getText().toString() == "月") {
            score = score + 1;
        }
        switch (score) {
            case 19:
                DisplayToast("你的IQ为80");
                break;
            case 20:
                DisplayToast("你的IQ为82");
                break;
            case 21:
                DisplayToast("你的IQ为84");
                break;
            case 22:
                DisplayToast("你的IQ为86");
                break;
            case 23:
                DisplayToast("你的IQ为88");
                break;
            case 24:
                DisplayToast("你的IQ为90");
                break;
            case 25:
                DisplayToast("你的IQ为92");
                break;
            case 26:
                DisplayToast("你的IQ为94");
                break;
            case 27:
                DisplayToast("你的IQ为96");
                break;
            case 29:
                DisplayToast("你的IQ为100");
                break;
            case 30:
                DisplayToast("你的IQ为102");
                break;
            case 31:
                DisplayToast("你的IQ为104");
                break;
            case 32:
                DisplayToast("你的IQ为106");
                break;
            case 33:
                DisplayToast("你的IQ为108");
                break;
            case 34:
                DisplayToast("你的IQ为110");
                break;
            case 35:
                DisplayToast("你的IQ为112");
                break;
            case 36:
                DisplayToast("你的IQ为114");
                break;
            case 37:
                DisplayToast("你的IQ为116");
                break;
            case 38:
                DisplayToast("你的IQ为118");
                break;
            case 39:
                DisplayToast("你的IQ为120");
                break;
            case 40:
                DisplayToast("你的IQ为122");
                break;
            case 41:
                DisplayToast("你的IQ为124");
                break;
            case 42:
                DisplayToast("你的IQ为126");
                break;
            case 43:
                DisplayToast("你的IQ为128");
                break;
            case 44:
                DisplayToast("你的IQ为130");
                break;
            case 45:
                DisplayToast("你的IQ为132");
                break;
            case 46:
                DisplayToast("你的IQ为134");
                break;
            case 47:
                DisplayToast("你的IQ为136");
                break;
            case 48:
                DisplayToast("你的IQ为138");
                break;
            case 49:
                DisplayToast("你的IQ为140");
                break;
            case 50:
                DisplayToast("你的IQ为142");
                break;
            case 51:
                DisplayToast("你的IQ为144");
                break;
            case 52:
                DisplayToast("你的IQ为146");
                break;
            case 53:
                DisplayToast("你的IQ为148");
                break;
            case 54:
                DisplayToast("你的IQ为150");
                break;
            case 55:
                DisplayToast("你的IQ为154");
                break;
            case 56:
                DisplayToast("你的IQ为158");
                break;
            case 57:
                DisplayToast("你的IQ为160");
                break;
            case 58:
                DisplayToast("你的IQ为165+");
                break;
            case 59:
                DisplayToast("你的IQ为165+");
                break;
            case 60:
                DisplayToast("你的IQ为165+");
                break;
            default:
                DisplayToast("额。。。你还是不要知道的好。。。");

        }

    }


    public void DisplayToast(String str) {
        Toast toast = Toast.makeText(this, str, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0, 220);
        toast.show();
    }

}
