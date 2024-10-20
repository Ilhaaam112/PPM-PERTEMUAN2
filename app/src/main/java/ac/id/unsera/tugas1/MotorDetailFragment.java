package ac.id.unsera.tugas1;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MotorDetailFragment extends Fragment {

    private static final String ARG_MOTOR_NAME = "motor_name";

    public static MotorDetailFragment newInstance(String motorName) {
        MotorDetailFragment fragment = new MotorDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_MOTOR_NAME, motorName);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_motor_detail, container, false);

        TextView motorNameTextView = view.findViewById(R.id.motor_name);
        TextView motorDescriptionTextView = view.findViewById(R.id.motor_description);

        if (getArguments() != null) {
            String motorName = getArguments().getString(ARG_MOTOR_NAME);
            motorNameTextView.setText(motorName);
            motorDescriptionTextView.setText("KATAGORI MOTOR SPORT HARGA MURAH DAN TERJANGKAU DAN PALING DI PASARAN INDONESIA " + motorName);
        }

        return view;
    }
}
