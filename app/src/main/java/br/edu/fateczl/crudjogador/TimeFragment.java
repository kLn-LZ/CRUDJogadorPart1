package br.edu.fateczl.crudjogador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TimeFragment extends Fragment {

    /*
     *@author: Kelvin Santos Guimarães
     */

    private View view;

    private EditText etCodigoTime, etNomeTime, etCidadeTime;
    private Button btnBuscarTime, btnInserirTime, btnModificarTime, btnExcluirTime, btnListarTime;
    private TextView tvListarTime;

    public TimeFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_time, container, false);

        etCodigoTime = view.findViewById(R.id.etCodigoTime);
        etNomeTime = view.findViewById(R.id.etNomeTime);
        etCidadeTime = view.findViewById(R.id.etCidadeTime);
        btnBuscarTime = view.findViewById(R.id.btnBuscarTime);
        btnInserirTime = view.findViewById(R.id.btnInserirTime);
        btnModificarTime = view.findViewById(R.id.btnModificarTime);
        btnExcluirTime = view.findViewById(R.id.btnExcluirTime);
        btnListarTime = view.findViewById(R.id.btnListarTime);
        tvListarTime = view.findViewById(R.id.tvListarTime);
        tvListarTime.setMovementMethod(new ScrollingMovementMethod());

        return view;
    }
}