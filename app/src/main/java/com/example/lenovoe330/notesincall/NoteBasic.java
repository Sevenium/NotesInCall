package com.example.lenovoe330.notesincall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class NoteBasic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_basic);

        EditText contactEdit = (EditText) findViewById(R.id.Contact);
        EditText noteTexte = (EditText) findViewById(R.id.NoteTexte);
        TextView numContact = (TextView) findViewById(R.id.Num);
        TextView dateCreat = (TextView) findViewById(R.id.DateCreat);
        TextView dateModif = (TextView) findViewById(R.id.DateModif);

        //coucou
    }
}
