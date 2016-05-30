package com.example.haibeiapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


import com.example.haibeiapp.DB.DBHelper;
import com.example.haibeiapp.DB.dao.SearchDAO;
import com.example.haibeiapp.R;
import com.example.haibeiapp.bean.Search;


import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    private EditText etsearch;
    private ListView lvSearch;
    private TextView tvQuXiao,tvClear;
    private boolean falg ;
    private DBHelper helper;
    private SearchDAO dao;
    private List<Search> data = new ArrayList<>();
    private List<String> list;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        initView();
        helper = new DBHelper(this);
        dao = new SearchDAO(helper);
        data = dao.queryAll();
        list = new ArrayList<>();

        for (int i = 0; i <data.size() ; i++) {
            list.add(data.get(i).getTitle());
        }
        if (data.size()==0){
            list.add("没有搜索历史");
        }
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        lvSearch.setAdapter(adapter);

        tvQuXiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (falg){
                    String s1 = etsearch.getText().toString();
                    Intent intent = new Intent(getApplicationContext(),FoundActivity.class);
                    intent.putExtra("id",s1);
                    Search search = new Search(s1);
                    dao.add(search);
                    startActivity(intent);
                }else {
                    finish();
                }
                list.clear();
                data = dao.queryAll();
                for (int i = 0; i <data.size() ; i++) {
                    list.add(data.get(i).getTitle());
                }
                adapter.notifyDataSetChanged();
            }

        });
        tvClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.clear();
                data = dao.queryAll();
                for (int i = 0; i < data.size(); i++) {
                    dao.del(data.get(i).getId());
                }
                adapter.notifyDataSetChanged();
            }
        });
        etsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length()>0){
                    tvQuXiao.setText("搜索");
                    falg = true;
                }else {
                    tvQuXiao.setText("取消");
                    falg = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        lvSearch.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = list.get(position);
                Intent intent = new Intent(getApplicationContext(),FoundActivity.class);
                intent.putExtra("id",s);
                Search search = new Search(s);
                dao.add(search);
                startActivity(intent);
            }
        });
    }


    private void initView() {
        etsearch = (EditText) findViewById(R.id.et_search);
        tvQuXiao = (TextView) findViewById(R.id.tv_search_quxiao);
        tvClear = (TextView) findViewById(R.id.tv_delrecode);
        lvSearch = (ListView) findViewById(R.id.lv_oldsearch);
    }
}
