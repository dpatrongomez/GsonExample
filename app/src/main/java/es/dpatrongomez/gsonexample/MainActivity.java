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
        Address address = new Address("Spain", "Guadalajara");

        Employee employee = new Employee("Daniel", 20, "dpatrongomez@gmail.com", address);
        String json = gson.toJson(employee);
        */


        String json = "{\"address\":{\"city\":\"Guadalajara\",\"country\":\"Spain\"},\"age\":20,\"first_name\":\"Daniel\",\"mail\":\"dpatrongomez@gmail.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);

    }
}
