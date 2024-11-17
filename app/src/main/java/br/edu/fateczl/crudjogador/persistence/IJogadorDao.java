package br.edu.fateczl.crudjogador.persistence;

import java.sql.SQLException;

public interface IJogadorDao {

    public JogadorDao open() throws SQLException;
    public void close() throws SQLException;
}
