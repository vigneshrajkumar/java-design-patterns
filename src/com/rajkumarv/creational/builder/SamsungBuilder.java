package com.rajkumarv.creational.builder;

public class SamsungBuilder implements PhoneBuilder {

    Boolean hasBluetooth;
    Boolean hasExpandableStorage;
    Integer internalStorage;

    public SamsungBuilder() {
        hasBluetooth = false;
        hasExpandableStorage = false;
        internalStorage = 0;
    }

    @Override
    public void addBluetooth() {
        hasBluetooth = true;
    }

    @Override
    public void addExpandableMemory() {
        hasExpandableStorage = true;
    }

    @Override
    public void addInternalStorage(Integer size) {
        internalStorage = size;
    }

    public Phone build() {
        return new Phone(hasExpandableStorage, hasBluetooth, internalStorage);
    }
}
