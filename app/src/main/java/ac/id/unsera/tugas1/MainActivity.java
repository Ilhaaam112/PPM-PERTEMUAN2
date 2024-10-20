package ac.id.unsera.tugas1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMotorList = findViewById(R.id.btn_motor_list);
        Button btnContactUs = findViewById(R.id.btn_contact_us);

        // Menampilkan fragment daftar motor secara default
        loadFragment(new MotorListFragment());

        btnMotorList.setOnClickListener(v -> loadFragment(new MotorListFragment()));
        btnContactUs.setOnClickListener(v -> loadFragment(new ContactUsFragment()));
    }

    public void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
