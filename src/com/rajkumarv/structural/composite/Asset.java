package com.rajkumarv.structural.composite;

public interface Asset {
    public String getName();
    public Integer getCost();
    public void AddAsset(Asset a);
    public void RemoveAsset(Asset a);
}
