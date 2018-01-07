package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyText;
    private Button topButton;
    private Button bottomButton;

    private int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryIndex = 1;

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        if (mStoryIndex == 1) {
            //T1_Ans1 Clicked
            topButton.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 storyText.setText(R.string.T3_Story);
                                                 topButton.setText(R.string.T3_Ans1);
                                                 bottomButton.setText(R.string.T3_Ans2);
                                                 mStoryIndex = 3;

                                                 if (mStoryIndex == 3) {
                                                     //T3_Ans1 Clicked
                                                     topButton.setOnClickListener(new View.OnClickListener() {
                                                         @Override
                                                         public void onClick(View view) {
                                                             storyText.setText(R.string.T6_End);
                                                             topButton.setVisibility(View.GONE);
                                                             bottomButton.setVisibility(View.GONE);
                                                             mStoryIndex = 6;

                                                             if (mStoryIndex == 6) {

                                                                 storyText.setText(R.string.T6_End);
                                                                 topButton.setVisibility(View.GONE);
                                                                 bottomButton.setVisibility(View.GONE);
                                                             }
                                                         }
                                                     });

                                                     //T3_Ans2 Clicked
                                                     bottomButton.setOnClickListener(new View.OnClickListener() {
                                                         @Override
                                                         public void onClick(View view) {
                                                             storyText.setText(R.string.T5_End);
                                                             topButton.setVisibility(View.GONE);
                                                             bottomButton.setVisibility(View.GONE);
                                                             mStoryIndex = 5;

                                                             if (mStoryIndex == 5) {

                                                                 storyText.setText(R.string.T5_End);
                                                                 topButton.setVisibility(View.GONE);
                                                                 bottomButton.setVisibility(View.GONE);
                                                             }
                                                         }
                                                     });
                                                 }
                                             }
                                         });


                    }


            // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            //T1_Ans2 clicked
            bottomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    storyText.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;

                    if (mStoryIndex == 2) {
                        //T2_Ans1 clicked
                        topButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                storyText.setText(R.string.T3_Story);
                                topButton.setText(R.string.T3_Ans1);
                                bottomButton.setText(R.string.T3_Ans2);
                                mStoryIndex = 3;

                                if (mStoryIndex == 3) {
                                    //T3_Ans1 Clicked
                                    topButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            storyText.setText(R.string.T6_End);
                                            topButton.setVisibility(View.GONE);
                                            bottomButton.setVisibility(View.GONE);
                                            mStoryIndex = 6;
                                        }
                                    });

                                    //T3_Ans2 Clicked
                                    bottomButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            storyText.setText(R.string.T5_End);
                                            topButton.setVisibility(View.GONE);
                                            bottomButton.setVisibility(View.GONE);
                                            mStoryIndex = 5;

                                            if (mStoryIndex == 5) {

                                                storyText.setText(R.string.T5_End);
                                                topButton.setVisibility(View.GONE);
                                                bottomButton.setVisibility(View.GONE);
                                            }
                                        }
                                    });

                                }
                            }
                        });

                        bottomButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                storyText.setText(R.string.T4_End);
                                topButton.setVisibility(View.GONE);
                                bottomButton.setVisibility(View.GONE);
                            }
                        });


                    }

                }
            });

    }
}
