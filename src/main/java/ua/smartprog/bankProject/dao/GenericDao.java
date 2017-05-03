package ua.smartprog.bankProject.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T extends Identified<PK>, PK extends Serializable> {
    public T create() throws DAOownException;

    public T extCreate(T obj) throws DAOownException;

    public T getByPK(PK id) throws DAOownException;

    public void update(T obj) throws DAOownException;

    public void delete(T obj) throws DAOownException;

    public List<T> getAll() throws DAOownException;

}
