package br.edu.fateczl.crudjogador.controller;

import java.sql.SQLException;
import java.util.List;

import br.edu.fateczl.crudjogador.model.Time;
import br.edu.fateczl.crudjogador.persistence.TimeDao;

public class TimeController implements IController<Time>{

    private final TimeDao tDao;

    public TimeController(TimeDao tDao) {
        this.tDao = tDao;
    }

    @Override
    public void inserir(Time time) throws SQLException {
        if (tDao.open() == null) {
            tDao.open();
        }
        tDao.insert(time);
    }

    @Override
    public void modificar(Time time) throws SQLException {
        if (tDao.open() == null) {
            tDao.open();
        }
        tDao.update(time);
    }

    @Override
    public void deletar(Time time) throws SQLException {
        if (tDao.open() == null) {
            tDao.open();
        }
        tDao.delete(time);
    }

    @Override
    public Time buscar(Time time) throws SQLException {
        if (tDao.open() == null) {
            tDao.open();
        }
        return tDao.findOne(time);
    }

    @Override
    public List listar() throws SQLException {
        if (tDao.open() == null) {
            tDao.open();
        }
        return tDao.findAll();
    }
}
