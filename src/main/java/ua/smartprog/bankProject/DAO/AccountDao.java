package ua.smartprog.bankProject.DAO;

import ua.smartprog.bankProject.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountDao {
    public Account create();
    public Account read(int key)throws SQLException;
    public void update(Account account);
    public void delete(Account account);
    public List<Account> getAll()throws SQLException;
}
