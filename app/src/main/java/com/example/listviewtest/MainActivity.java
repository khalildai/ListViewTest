package com.example.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listview = (ListView) findViewById(R.id.list_view);
        listview.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.img_1);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.img_2);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.img_3);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.img_4);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.drawable.img_5);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.drawable.img_6);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.img_7);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.img_8);
            fruitList.add(strawberry);
            Fruit stephen = new Fruit("Stephen", R.drawable.img_9);
            fruitList.add(stephen);
            Fruit curry = new Fruit("Curry", R.drawable.img_10);
            fruitList.add(curry);
            Fruit curry2 = new Fruit("Curry2", R.drawable.img_11);
            fruitList.add(curry2);
        }
    }
}
