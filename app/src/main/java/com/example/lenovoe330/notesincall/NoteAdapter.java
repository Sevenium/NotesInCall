package com.example.lenovoe330.notesincall;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Lenovo E330 on 08/09/2017.
 */

public class NoteAdapter extends ArrayAdapter<Note> {
    Context context;
    int layoutResourceId;
    ArrayList<Note> notes=null;

    public NoteAdapter(Context context,int layoutResourceId, ArrayList<Note> notes) {
        super(context, layoutResourceId, notes);
        this.layoutResourceId=layoutResourceId;
        this.context = context;
        this.notes = notes;



    }
}
