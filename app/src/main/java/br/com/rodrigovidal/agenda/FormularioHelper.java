package br.com.rodrigovidal.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.rodrigovidal.agenda.modelo.Aluno;

/**
 * Created by rodrigo.silva on 19/10/2016.
 */

public class FormularioHelper {

    Aluno aluno;
    private EditText campoNome;
    private EditText campoEndereco;
    private EditText campoTelefone;
    private EditText campoSite;
    private RatingBar campoNota;


    public FormularioHelper(FormularioActivity activity) {
        campoNome = (EditText) activity.findViewById(R.id.form_nome);
        campoEndereco = (EditText) activity.findViewById(R.id.form_nome);
        campoTelefone = (EditText) activity.findViewById(R.id.form_nome);
        campoSite = (EditText) activity.findViewById(R.id.form_nome);
        campoNota = (RatingBar) activity.findViewById(R.id.form_nota);
    }

    public Aluno pegaAluno(){
        aluno = new Aluno();

        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));

        return aluno;
    }
}
