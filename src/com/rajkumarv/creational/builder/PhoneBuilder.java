package com.rajkumarv.creational.builder;

public interface PhoneBuilder {
    public void addBluetooth();
    public void addExpandableMemory();
    public void addInternalStorage(Integer size);
    public Phone build();
}
