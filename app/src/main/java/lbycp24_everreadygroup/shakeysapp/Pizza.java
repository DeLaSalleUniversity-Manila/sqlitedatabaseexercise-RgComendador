package lbycp24_everreadygroup.shakeysapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Pizza extends Activity {

    public static final String EXTRA_PIZZANO = "PizzaNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza);
    /*
        //Get the drink from the intent
        int PizzaNo = (Integer)getIntent().getExtras().get(EXTRA_PIZZANO);
        Pizza pizza = Pizza.pizza[PizzaNo];

//Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(pizza.getImageResourceId());
        photo.setContentDescription(pizza.getName);

//Populate the drink name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(pizza.getName());

//Populate the drink description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(pizza.getDescription());*/
    }
}