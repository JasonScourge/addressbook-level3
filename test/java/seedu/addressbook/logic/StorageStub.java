package seedu.addressbook.logic;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.Storage;
import seedu.addressbook.storage.Storage.StorageOperationException;


/**
 * 
 * Storage stub that has not much purpose
 *
 */
public class StorageStub extends Storage {
    /**
     * Saves all data to this storage file.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     */
    public void save(AddressBook addressBook) throws StorageOperationException {
        // Do not need to return anything
    }

    /**
     * Loads data from this storage file.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from file.
     */
    public AddressBook load() throws StorageOperationException {
        return null;
    }

    public String getPath(){
        return " ";
    }
}
