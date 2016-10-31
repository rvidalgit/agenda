package br.com.rodrigovidal.agenda.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.rodrigovidal.agenda.modelo.Aluno;

/**
 * Created by rodrigo.silva on 20/10/2016.
 */

public class AlunoDao extends SQLiteOpenHelper {
    public AlunoDao(Context context) {
        super(context, "Agenda", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table Alunos(id integer primary key, nome text not null, endereco text, telefone text, site text, nota real);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Alunos";
        db.execSQL(sql);
        onCreate(db);
    }

    public void insere(Aluno aluno) {

        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = new ContentValues();

        db.insert("Alunos",null,dados);
    }
}
