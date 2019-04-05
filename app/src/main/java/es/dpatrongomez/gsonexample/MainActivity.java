package es.dpatrongomez.gsonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        /*
        Employee employee = new Employee("Daniel", 20, "dpatrongomez@gmail.com");
        String json = gson.toJson(employee);
        */

        String json = "{\"first_name\":\"Daniel\",\"age\":20,\"mail\":\"dpatrongomez@gmail.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);
    }
}
