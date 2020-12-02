package checklist.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataBaseDataStorageTest extends AbstractDataStorageTest{

    @Override
    DataStorage createDataStorage() {
        return new DataBaseDataStorage();
    }
}