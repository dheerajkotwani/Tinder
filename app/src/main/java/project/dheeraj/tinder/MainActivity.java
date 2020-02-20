package project.dheeraj.tinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView name;
    private ImageView imageView;
    private ImageView iconCross;
    private ImageView iconTick;
    private int i = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        imageView = findViewById(R.id.tinder_image);
        iconCross = findViewById(R.id.cross);
        iconTick = findViewById(R.id.tick);

        final ArrayList<ModalClass> names = new ArrayList<>();

        names.add( new ModalClass(R.drawable.shirley,"Shirley Setia"));
        names.add( new ModalClass(R.drawable.alia_bhatt,"Alia Bhatt"));
        names.add( new ModalClass(R.drawable.anushka,"Anushka Sharma"));
        names.add( new ModalClass(R.drawable.kriti_sanon,"Kriti Sanon"));
        names.add( new ModalClass(R.drawable.tapsee,"Tapsee Pannu"));
        names.add( new ModalClass(R.drawable.deepika,"Deepika Padukone"));

        iconTick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(names.get(i).image);
                name.setText(names.get(i).name);
                if (i!=names.size()-1)
                  i++;
                else {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                Toast.makeText(MainActivity.this, "You Liked it!", Toast.LENGTH_SHORT).show();
            }
        });
        iconCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(names.get(i).image);
                name.setText(names.get(i).name);
                if (i!=names.size()-1)
                    i++;
                else {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                Toast.makeText(MainActivity.this, "You disliked it!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
