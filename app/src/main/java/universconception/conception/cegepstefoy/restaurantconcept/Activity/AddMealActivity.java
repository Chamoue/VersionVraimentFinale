package universconception.conception.cegepstefoy.restaurantconcept.Activity;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import universconception.conception.cegepstefoy.restaurantconcept.Data.DataBase;
import universconception.conception.cegepstefoy.restaurantconcept.Model.Mets;
import universconception.conception.cegepstefoy.restaurantconcept.R;

public class AddMealActivity extends AppCompatActivity {

    private EditText nameInput;
    private EditText priceInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meal);

        this.nameInput = findViewById(R.id.nameInput);
        this.priceInput = findViewById(R.id.priceInput);
    }

    public void onCancelButtonClicked(View view) {
        backToMenu();
    }

    public void onAcceptButtonClicked(View view) {
        Mets met = new Mets(this.nameInput.getText().toString(), Float.parseFloat(this.priceInput.getText().toString()));
        DataBase.getInstance().addToMenu(met);
        backToMenu();
    }

    private void backToMenu() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
