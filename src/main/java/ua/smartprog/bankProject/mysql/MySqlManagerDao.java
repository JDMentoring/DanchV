package ua.smartprog.bankProject.mysql;

import ua.smartprog.bankProject.dao.AbstractDAO;
import ua.smartprog.bankProject.dao.DAOownException;
import ua.smartprog.bankProject.domain.Manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Тарас on 10.05.2017.
 */
public class MySqlManagerDao extends AbstractDAO<Manager, Integer> {

    private class ExtManager extends Manager{
        public void setID(int id){ super.setId(id);}
        public void setTax(int tax){super.setTax(tax);}
        public void setDepartment(String department){super.setBankDepartment(department);}
    }

    @Override
    public String getSelectQuery() {
        return "SELECT * FROM manager;";
    }

    @Override
    public String getCreateQuery() {
        return "INSERT INTO manager (id, tax, bankDepartment) VALUES(?, ?, ?);";
    }

    @Override
    public String getUpdateQuery() {
        return null;
    }

    @Override
    public String getDeleteQuery() {
        return null;
    }

    @Override
    public void prepareStInsert(PreparedStatement stm, Manager obj) throws DAOownException {
        int managerID = (obj.getId() == null) ? 0 : obj.getId();

        try {
            stm.setInt(1, managerID);
            stm.setInt(2, obj.getTax());
            stm.setString(3, obj.getBankDepartment()));
        } catch (Exception e) {
            throw new DAOownException(e);
        }
    }

    @Override
    public List<Manager> parsingResultSet(ResultSet rs) throws DAOownException {
        LinkedList<Manager> result = new LinkedList<Manager>();
        try {
            while (rs.next()) {
                ExtManager mng = new ExtManager();
                mng.setID(rs.getInt("id"));
                mng.setTax(rs.getInt("tax"));
                mng.setDepartment(rs.getString("department"));
                result.add(mng);
            }

        } catch (Exception e) {
            throw new DAOownException(e);
        }
        return result;
    }

    @Override
    public Manager create() throws DAOownException {
        Manager manag = new Manager();
        return extCreate(manag);
    }
}

