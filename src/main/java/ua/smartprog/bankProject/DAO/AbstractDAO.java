package ua.smartprog.bankProject.DAO;


import ua.smartprog.bankProject.Account;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAO<T extends Identified<PK>, PK extends Integer> implements GenericDao<T, PK> {
    private Connection connection;

    public AbstractDAO(Connection connection) {
        this.connection = connection;
    }

    public abstract String getSelectQuery();
    public abstract String getCreateQuery();
    public abstract String getUpdateQuery();
    public abstract String getDeleteQuery();

    public abstract List<T> parsingResultSet(ResultSet rs) throws DAOownException;


    @Override
    public T create() throws SQLException {
        return null;
    }

    @Override
    public T extCreate(T obj) throws SQLException {
        return null;
    }

    @Override
    public T getByPK(int id) throws SQLException {
        return null;
    }

    @Override
    public void update(T obj) throws SQLException {

    }

    @Override
    public void delete(T obj) throws SQLException {

    }

    @Override
    public List<T> getAll() throws DAOownException {
        List<T> someList;
        String query = getSelectQuery();
        try(PreparedStatement prSt = connection.prepareStatement(query)){
            ResultSet rs = prSt.executeQuery();
            someList = parsingResultSet(rs);
        }catch (Exception e){
            throw new DAOownException(e);
        }
        return someList;
    }
}
