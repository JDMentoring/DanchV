package ua.smartprog.bankProject.DAO;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public interface GenericDao<T, PK> extends Serializable {
    public T create() throws SQLException;

    public T getByPK(int id) throws SQLException;

    public void update(T obj) throws SQLException;

    public void delete(T obj) throws SQLException;

    public List<T> getAll() throws Exception;

}
