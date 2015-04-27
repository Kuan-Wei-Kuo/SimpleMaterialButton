package com.kuo.materiallistitem;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar;
    private SimpleMaterialButton simpleMaterialButton_1, simpleMaterialButton_2, simpleMaterialButton_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        simpleMaterialButton_1 = (SimpleMaterialButton) findViewById(R.id.simpleMaterialButton_1);
        simpleMaterialButton_2 = (SimpleMaterialButton) findViewById(R.id.simpleMaterialButton_2);
        simpleMaterialButton_3 = (SimpleMaterialButton) findViewById(R.id.simpleMaterialButton_3);

        toolbar.setTitle("SimpleMaterialButtonDemo");

        simpleMaterialButton_1.setText("MaterialButton_1");
        simpleMaterialButton_2.setText("MaterialButton_2");
        simpleMaterialButton_3.setText("MaterialButton_3");
        simpleMaterialButton_2.setTextSize(50);
        simpleMaterialButton_3.setTextSize(30);
        simpleMaterialButton_1.setTextColor(getResources().getColor(R.color.PINKY_500));
        simpleMaterialButton_2.setTextColor(getResources().getColor(R.color.BLUE_A400));
        simpleMaterialButton_3.setTextColor(getResources().getColor(R.color.GREEN_500));


        simpleMaterialButton_2.setCricleBackgroundColor(getResources().getColor(R.color.GREEN_500));
        simpleMaterialButton_3.setCricleBackgroundColor(getResources().getColor(R.color.PINKY_500));

        simpleMaterialButton_1.setAnimationEndListener(buttonAnimationListener);
        simpleMaterialButton_2.setAnimationEndListener(buttonAnimationListener);
        simpleMaterialButton_3.setAnimationEndListener(buttonAnimationListener);
    }

    private SimpleMaterialButton.onAnimationEnd buttonAnimationListener = new SimpleMaterialButton.onAnimationEnd() {
        @Override
        public void onAnimationEnd(SimpleMaterialButton simpleMaterialButton) {
            switch (simpleMaterialButton.getId()){
                case R.id.simpleMaterialButton_1:
                    Toast.makeText(simpleMaterialButton.getContext(), "simpleMaterialButton_1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.simpleMaterialButton_2:
                    Toast.makeText(simpleMaterialButton.getContext(), "simpleMaterialButton_2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.simpleMaterialButton_3:
                    Toast.makeText(simpleMaterialButton.getContext(), "simpleMaterialButton_3", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
