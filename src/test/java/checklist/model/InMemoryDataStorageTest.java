package checklist.model;

public class InMemoryDataStorageTest extends AbstractDataStorageTest{

    @Override
    DataStorage createDataStorage() {
        return new InMemoryDataStorage();
    }
}