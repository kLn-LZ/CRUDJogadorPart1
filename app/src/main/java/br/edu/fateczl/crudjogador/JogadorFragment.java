package br.edu.fateczl.crudjogador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class JogadorFragment extends Fragment {

    /*
     *@author: Kelvin Santos Guimarães
     */

    private View view;

    private EditText etIdJogador, etNomeJogador, etDataNascJogador, etAlturaJogador, etPesoJogador;
    private Spinner spTimeJogador;
    private Button btnBuscarJogador, btnListarJogador, btnInserirJogador, btnExcluirJogador, btnModificarJogador;
    private TextView tvListarJogador;

    public JogadorFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_jogador, container, false);

        etIdJogador = view.findViewById(R.id.etIdJogador);
        etNomeJogador = view.findViewById(R.id.etNomeJogador);
        etDataNascJogador = view.findViewById(R.id.etDataNascJogador);
        etAlturaJogador = view.findViewById(R.id.etAlturaJogador);
        etPesoJogador = view.findViewById(R.id.etPesoJogador);
        spTimeJogador = view.findViewById(R.id.spTimeJogador);
        btnBuscarJogador = view.findViewById(R.id.btnBuscarJogador);
        btnListarJogador = view.findViewById(R.id.btnListarJogador);
        btnInserirJogador = view.findViewById(R.id.btnInserirJogador);
        btnExcluirJogador = view.findViewById(R.id.btnExcluirJogador);
        btnModificarJogador = view.findViewById(R.id.btnModificarJogador);
        tvListarJogador = view.findViewById(R.id.tvListarJogador);
        tvListarJogador.setMovementMethod(new ScrollingMovementMethod());

        return view;

    }
}