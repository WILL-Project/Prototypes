package com.sbo.jumblingsencance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("teacher");

    private Button addBtn, viewBtn;
    private EditText correctEdit;
    private EditText incorrectEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correctEdit = findViewById(R.id.Correct_editText);
        incorrectEdit = findViewById(R.id.Incorrect_editText2);
        addBtn = findViewById(R.id.add_button);
        viewBtn = findViewById(R.id.viewbtn2);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddTeacherData();
            }
        });
        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendToNextPage();
            }
        });
    }
    private void AddTeacherData(){
        TeacherData teacherData = new TeacherData();
        String correctsentence, incorrectsentence, id;

        id = myRef.push().getKey();
        correctsentence = correctEdit.getText() + "";
        incorrectsentence = incorrectEdit.getText() + "";

        teacherData.setTeacherID(id);
        teacherData.setCorrectSentance(correctsentence);
        teacherData.setIncorrectSenctance(incorrectsentence);

        myRef.push().setValue(teacherData);
    }

    private void SendToNextPage() {
        Intent intent = new Intent(getApplicationContext(), Sentences.class);
        startActivity(intent);
    }
}
