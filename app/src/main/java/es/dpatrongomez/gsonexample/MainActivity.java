package es.dpatrongomez.gsonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        /*
        Address address = new Address("Spain", "Guadalajara");

        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 30));
        family.add(new FamilyMember("Daughter", 5));

        Employee employee = new Employee("Daniel", 20, "dpatrongomez@gmail.com", address, family);
        String json = gson.toJson(family);
        */


        String json = "[{\"age\":30,\"role\":\"Wife\"},{\"age\":5,\"role\":\"Daughter\"}]";

        Type familyType = new TypeToken<ArrayList<FamilyMember>>() {}.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json, familyType);


    }
}
