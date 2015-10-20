package lbycp24_everreadygroup.shakeysapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


class ShakeysDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "Shakeys";
    private static final int DB_VERSION = 1;

    ShakeysDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE PIZZA ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "DESCRIPTION TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER);");

        insertPizza(db, "Classic Cheese", "Fully loaded for that sumptuous pepperoni taste you'll love.", R.drawable.cheese);
        insertPizza(db, "Pepperoni", "Back to basics, but still full of flavor.", R.drawable.pepperoni);
        insertPizza(db, "Shakey's Special", "An all-time favorite, loaded with beef, Italian sausage, pepperoni, salami, mushrooms, green bell pepper and onions.", R.drawable.sspecial);

        db.execSQL("CREATE TABLE Chicken ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "DESCRIPTION TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER);");

        insertChicken(db, "Solo Pack", "Comes with 3 pieces chicken", R.drawable.chickensolo);
        insertChicken(db, "Buddy Pack", "Comes with 5 pieces chicken", R.drawable.chickenbuddy);
        insertChicken(db, "Family Pack", "Comes with 7 pieces chicken", R.drawable.chickenfamily);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

        private static void insertPizza(SQLiteDatabase db, String name, String description, int resourceId) {

            ContentValues PizzaValues = new ContentValues();

            PizzaValues.put("NAME", name);
            PizzaValues.put("DESCRIPTION", description);
            PizzaValues.put("IMAGE_RESOURCE_ID", resourceId);
            db.insert("Pizza", null, PizzaValues);
        }

        private static void insertChicken(SQLiteDatabase db, String name, String description, int resourceId) {

            ContentValues ChickenValues = new ContentValues();

            ChickenValues.put("NAME", name);
            ChickenValues.put("DESCRIPTION", description);
            ChickenValues.put("IMAGE_RESOURCE_ID", resourceId);
            db.insert("Pizza", null, ChickenValues);
    }
    }

