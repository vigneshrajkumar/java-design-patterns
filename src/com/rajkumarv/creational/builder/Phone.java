package com.rajkumarv.creational.builder;

public class Phone {
    Boolean hasExpandableStorage;
    Boolean hasBluetooth;
    Integer internalStorage;

    public Boolean getHasExpandableStorage() {
        return hasExpandableStorage;
    }

    public Boolean getHasBluetooth() {
        return hasBluetooth;
    }

    public Integer getInternalStorage() {
        return internalStorage;
    }

    public Phone(Boolean hasExpandableStorage, Boolean hasBluetooth, Integer internalStorage) {
        this.hasExpandableStorage = hasExpandableStorage;
        this.hasBluetooth = hasBluetooth;
        this.internalStorage = internalStorage;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "hasExpandableStorage=" + hasExpandableStorage +
                ", hasBluetooth=" + hasBluetooth +
                ", internalStorage=" + internalStorage +
                '}';
    }
}
