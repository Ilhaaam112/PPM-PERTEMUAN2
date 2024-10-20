package ac.id.unsera.tugas1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MotorListFragment extends Fragment {

    private String[] motorNames = {"Motor CBR", "Motor R15", "Motor R25"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_motor_list, container, false);

        ListView motorListView = view.findViewById(R.id.motor_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, motorNames);
        motorListView.setAdapter(adapter);

        motorListView.setOnItemClickListener((parent, view1, position, id) -> {
            String motorName = motorNames[position];
            MotorDetailFragment detailFragment = MotorDetailFragment.newInstance(motorName);
            ((MainActivity) getActivity()).loadFragment(detailFragment);
        });

        return view;
    }
}