package info.ru_de.binaruhr;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;





public class MainActivity extends ActionBarActivity {

    TextView textView6_1;
    ImageView imageView5_9,
            imageView2_3,
            imageView2_6,
            imageView2_9,
            imageView3_3,
            imageView3_4,
            imageView3_6,
            imageView3_7,
            imageView3_9,
            imageView4_1,
            imageView4_3,
            imageView4_4,
            imageView4_6,
            imageView4_7,
            imageView4_9,
            imageView5_1,
            imageView5_3,
            imageView5_4,
            imageView5_6,
            imageView5_7;



    int dig1, dig2, dig3, dig4, dig5, dig6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView2_3 = (ImageView) findViewById(R.id.imageView2_3);
        imageView2_6 = (ImageView) findViewById(R.id.imageView2_6);
        imageView2_9 = (ImageView) findViewById(R.id.imageView2_9);
        imageView3_3 = (ImageView) findViewById(R.id.imageView3_3);
        imageView3_4 = (ImageView) findViewById(R.id.imageView3_4);
        imageView3_6 = (ImageView) findViewById(R.id.imageView3_6);
        imageView3_7 = (ImageView) findViewById(R.id.imageView3_7);
        imageView3_9 = (ImageView) findViewById(R.id.imageView3_9);
        imageView4_1 = (ImageView) findViewById(R.id.imageView4_1);
        imageView4_3 = (ImageView) findViewById(R.id.imageView4_3);
        imageView4_4 = (ImageView) findViewById(R.id.imageView4_4);
        imageView4_6 = (ImageView) findViewById(R.id.imageView4_6);
        imageView4_7 = (ImageView) findViewById(R.id.imageView4_7);
        imageView4_9 = (ImageView) findViewById(R.id.imageView4_9);
        imageView5_1 = (ImageView) findViewById(R.id.imageView5_1);
        imageView5_3 = (ImageView) findViewById(R.id.imageView5_3);
        imageView5_4 = (ImageView) findViewById(R.id.imageView5_4);
        imageView5_6 = (ImageView) findViewById(R.id.imageView5_6);
        imageView5_7 = (ImageView) findViewById(R.id.imageView5_7);
        imageView5_9 = (ImageView) findViewById(R.id.imageView5_9);
        Thread myThread = null;

        Runnable myRunnableThread = new CountDownRunner();
        myThread= new Thread(myRunnableThread);
        myThread.start();



    }

    public void clear (){
        imageView5_9.setColorFilter(null);
        imageView2_3.setColorFilter(null);
        imageView2_6.setColorFilter(null);
        imageView2_9.setColorFilter(null);
        imageView3_3.setColorFilter(null);
        imageView3_4.setColorFilter(null);
        imageView3_6.setColorFilter(null);
        imageView3_7.setColorFilter(null);
        imageView3_9.setColorFilter(null);
        imageView4_1.setColorFilter(null);
        imageView4_3.setColorFilter(null);
        imageView4_4.setColorFilter(null);
        imageView4_6.setColorFilter(null);
        imageView4_7.setColorFilter(null);
        imageView4_9.setColorFilter(null);
        imageView5_1.setColorFilter(null);
        imageView5_3.setColorFilter(null);
        imageView5_4.setColorFilter(null);
        imageView5_6.setColorFilter(null);
        imageView5_7.setColorFilter(null);

    }
    public void doWork() {
        runOnUiThread(new Runnable() {
            public void run() {
                try{
                    clear();
                    textView6_1 = (TextView)findViewById(R.id.textView6_1);
                    Calendar dt = Calendar.getInstance();
                    int hours = dt.get(Calendar.HOUR_OF_DAY);
                    int minutes = dt.get(Calendar.MINUTE);
                    int seconds = dt.get(Calendar.SECOND);
                    String curTime = hours + ":" + minutes + ":" + seconds;
                    textView6_1.setText(curTime);

                    dig1 = hours / 10;
                    dig2=hours%10;
                    dig3=minutes/10;
                    dig4=minutes%10;
                    dig5=seconds/10;
                    dig6=seconds%10;


                    if (dig1 == 1){imageView5_1.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig1 ==2) {imageView4_1.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig2 ==1) {imageView5_3.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig2 ==2) {imageView4_3.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig2 ==3) {imageView4_3.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_3.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig2 ==4) {imageView3_3.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig2 ==5) {imageView3_3.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_3.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig2 ==6) {imageView3_3.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView4_3.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig2 ==7) {imageView3_3.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView4_3.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_3.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig2 ==8) {imageView2_3.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig2 ==9) {imageView2_3.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_3.setColorFilter(Color.argb(255, 232, 19, 19));
                    }


                    if (dig3 == 1){imageView5_4.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig3 ==2) {imageView4_4.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig3 ==3) {imageView4_4.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_4.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig3 == 4){imageView3_4.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig3 ==5) {imageView3_4.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_4.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig3 ==6) {imageView3_4.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView4_4.setColorFilter(Color.argb(255, 232, 19, 19));
                    }


                    if (dig4 ==1) {imageView5_6.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig4 ==2) {imageView4_6.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig4 ==3) {imageView4_6.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_6.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig4 ==4) {imageView3_6.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig4 ==5) {imageView3_6.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_6.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig4 ==6) {imageView3_6.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView4_6.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig4 ==7) {imageView3_6.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView4_6.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_6.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig4 ==8) {imageView2_6.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig4 ==9) {imageView2_6.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_6.setColorFilter(Color.argb(255, 232, 19, 19));
                    }


                    if (dig5 == 1){imageView5_7.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig5 ==2) {imageView4_7.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig5 ==3) {imageView4_7.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_7.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig5 == 4){imageView3_7.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig5 ==5) {imageView3_7.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_7.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig5 ==6) {imageView3_7.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView4_7.setColorFilter(Color.argb(255, 232, 19, 19));
                    }


                    if (dig6 ==1) {imageView5_9.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig6 ==2) {imageView4_9.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig6 ==3) {imageView4_9.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_9.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig6 ==4) {imageView3_9.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig6 ==5) {imageView3_9.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_9.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig6 ==6) {imageView3_9.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView4_9.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig6 ==7) {imageView3_9.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView4_9.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_9.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig6 ==8) {imageView2_9.setColorFilter(Color.argb(255, 232, 19, 19));
                    }
                    if (dig6 ==9) {imageView2_9.setColorFilter(Color.argb(255, 232, 19, 19));
                        imageView5_9.setColorFilter(Color.argb(255, 232, 19, 19));
                    }



                }catch (Exception e) {}


            }
        });
    }


    class CountDownRunner implements Runnable{
        // @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    doWork();
                    Thread.sleep(1000);


                    // Pause of 1 Second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } catch (Exception e) {
                }
            }
        }}}

