package ua.smartprog.bankProject.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.Serializable;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public abstract class GenericDaoTest<Context> {
    protected Class daoClass;
    protected Identified DaoObject;

    public abstract GenericDao dao();
    public abstract Context context();

    public GenericDaoTest(Class daoClass, Identified<Integer> daoObject) {
        this.daoClass = daoClass;
        DaoObject = daoObject;
    }

    @Test
    public void create() throws Exception {
        Identified dto = dao().create();
        Assert.assertNotNull(dto);
        Assert.assertNotNull(dto.getId());
    }

    @Test
    public void extCreate() throws Exception {
        Assert.assertNull("ID BEFORE extCreate must be null", DaoObject.getId());
        DaoObject = dao().extCreate(DaoObject);
        Assert.assertNotNull("ID After extCreate must be not null", DaoObject.getId());
    }

    @Test
    public void getByPK() throws Exception {
        Serializable id = dao().create().getId();
        Identified dto = dao().getByPK(id);
        Assert.assertNotNull(dto);
    }


    @Test
    public void delete() throws Exception {
        Identified dto = dao().create();
        Assert.assertNotNull(dto);

        List list = dao().getAll();
        Assert.assertNotNull(list);

        int oldSize = list.size();

        dao().delete(dto);
        list = dao().getAll();
        Assert.assertNotNull(list);

        int newSize = list.size();

        Assert.assertEquals(1, oldSize - newSize);
    }

    @Test
    public void getAll() throws Exception {
        List list = dao().getAll();
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

}