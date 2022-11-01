package com.itextpdf.service.impl;

import com.itextpdf.entity.Rsvo;
import com.itextpdf.entity.StuInfo;
import com.itextpdf.entity.UserData;
import com.itextpdf.mapper.SelectZdMapper;
import com.itextpdf.service.SelectZdMapperService;
import com.itextpdf.utils.ReflectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class selectZdMapperServiceImpl implements SelectZdMapperService {
    @Autowired
    SelectZdMapper mapper;

    /**
     * @param sheetName 表名
     * @param c
     * @param <K>       对应的entity
     * @return list集合，里面包含实体类
     * @throws Exception
     */
    @Override
    public <K> List<K> transListIntoEntity(String sheetName, Class<K> c) throws Exception {
        //根据表单名拿到所有的字段数据
        List<Rsvo> rsvos = mapper.selectAll(sheetName);
        //查询数据有很多，自动对应，一一映射到每个类
        List<K> trans = ReflectUtils.trans(rsvos, c);
        return trans;
    }

    public List[] transListIntoEntity(String str[]) throws Exception {
        List[] lists = new List[str.length];
        for (int i = 0; i < str.length; i++) {
            if ("学生信息".equals(str[i])) {
                List<StuInfo> stuInfos = transListIntoEntity(str[i], StuInfo.class);
                lists[i] = stuInfos;
            } else if ("用户数据".equals(str[i])) {
                List<UserData> userData = transListIntoEntity(str[i], UserData.class);
                lists[i] = userData;
            }
        }
        return lists;
    }

    public String[] getColumn() {

        List<Map<String, String>> maps = mapper.selectBdName();
        String str[] = new String[maps.size()];
        int i = 0;
        for (Map<String, String> map : maps) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str[i++] = entry.getValue();
            }
        }
        return str;
    }

    @Override
    public String[] getSheetNames() {
        //得到所有的表单名
        List<Map<String, String>> maps = mapper.selectBdName();
        String str[] = new String[maps.size()];
        int i = 0;
        for (Map<String, String> map : maps) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str[i++] = entry.getValue();
            }
        }
        return str;
    }

}
