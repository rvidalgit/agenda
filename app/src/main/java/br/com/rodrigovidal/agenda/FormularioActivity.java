package br.com.rodrigovidal.agenda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.rodrigovidal.agenda.DAO.AlunoDao;
import br.com.rodrigovidal.agenda.modelo.Aluno;

import static android.widget.Toast.makeText;

public class FormularioActivity extends AppCompatActivity {

    FormularioHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_formulario, menu);
        helper = new FormularioHelper(this);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_formulario_ok :
                Aluno aluno = helper.pegaAluno();
                AlunoDao dao = new AlunoDao(this);
                makeText(FormularioActivity.this, "Aluno " + aluno.getNome() + " salvo com sucesso!", Toast.LENGTH_SHORT).show();
                dao.insere();
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
