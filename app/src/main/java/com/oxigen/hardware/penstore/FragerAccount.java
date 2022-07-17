package com.oxigen.hardware.penstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FragerAccount extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_account, container, false);
        ListView listView1 = view.findViewById(R.id.view_listview1);
//        ListView listView2 = view.findViewById(R.id.view_listview2);


//        HashMap<String, String> itemProfile = new HashMap<>();
//        itemProfile.put("Profile photo", "Change");
//        itemProfile.put("Username", "mluthfie");
//        itemProfile.put("Email address", "mluthfie@gmail.com");
//        itemProfile.put("Full name", "Muhamad Luthfi");
//        itemProfile.put("Address", "Jl. Karang Kb. Utara, Sarirejo, Semarang Timur, Kota Semarang, Jawa Tengah 50124");
//        itemProfile.put("Phone number", "+62 813345675");
//        itemProfile.put("History", "Last: 16/07/2022 14:35");
        List<String> list = new ArrayList<>();

        list.add("Change Profile photo");
        list.add("Username");
        list.add("Email address");
        list.add("Full name");
        list.add("Address");
        list.add("Phone number");
        list.add("History");
        list.add("Security");
        list.add("Setting");
        list.add("Log out");
        list.add("Delete account");

//        List<HashMap<String, String>> listItems = new ArrayList<>();
//        SimpleAdapter adapter = new SimpleAdapter(getContext(), listItems, R.layout.list_item,
//                new String[]{"Key Items", "Value Items"},
//                new int[]{R.id.item_key, R.id.item_value});
//
//        Iterator iterator = itemProfile.entrySet().iterator();
//        while (iterator.hasNext()){
//            HashMap<String, String> resultMap = new HashMap<>();
//            Map.Entry pair = (Map.Entry) iterator.next();
//            resultMap.put("Key items", pair.getKey().toString());
//            resultMap.put("Value items", pair.getValue().toString());
//            listItems.add(resultMap);
//        }
//        listView1.setAdapter(adapter);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, list);
        listView1.setAdapter(arrayAdapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0){
                    // apply
                } else if (position == 1){
                    Intent intent = new Intent(FragerAccount.this.getActivity(), UserName.class);
                    startActivity(intent);
                } else if (position == 2){
                    startActivity(new Intent(FragerAccount.this.getActivity(), UserEmail.class));
                } else if (position == 3){
                    startActivity(new Intent(FragerAccount.this.getActivity(), UserFullName.class));
                } else if (position == 4){
                    startActivity(new Intent(FragerAccount.this.getActivity(), UserAddress.class));
                } else if (position == 5){
                    startActivity(new Intent(FragerAccount.this.getActivity(), UserPhone.class));
                } else if (position == 6){
                    startActivity(new Intent(FragerAccount.this.getActivity(), UserHistory.class));
                } else if (position == 7){
                    startActivity(new Intent(FragerAccount.this.getActivity(), UserSecurity.class));
                } else if (position == 8){
                    startActivity(new Intent(FragerAccount.this.getActivity(), UserSettings.class));
                } else if (position == 9){
                    //apply
                } else if (position == 10){
                    //apply
                }
            }
        });

        return view;
    }
}
