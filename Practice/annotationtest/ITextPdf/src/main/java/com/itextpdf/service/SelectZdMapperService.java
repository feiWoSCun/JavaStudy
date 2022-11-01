package com.itextpdf.service;

import com.itextpdf.entity.Rsvo;

import java.util.List;

public interface SelectZdMapperService {
    public <K> List<K> transListIntoEntity(String sheetName,Class<K> c) throws Exception;

    public String[] getSheetNames();
}
