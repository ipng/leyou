package com.leyou.item.service;

import com.leyou.item.mapper.*;
import com.leyou.item.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/22.
 */
@Service
public class SpecificationService {
    @Autowired
    private SpecGroupMapper groupMapper;
    @Autowired
    private SpecParamMapper paramMapper;

    public List<SpecGroup> queryGroupsByCid(Long cid) {
        SpecGroup record=new SpecGroup();
        record.setCid(cid);
        return this.groupMapper.select(record);
    }

    public List<SpecParam> queryParams(Long gid,Long cid,Boolean generic,Boolean searching) {
        SpecParam record=new SpecParam();
        record.setGroupId(gid);
        record.setCid(cid);
        record.setGeneric(generic);
        record.setSearching(searching);
        return this.paramMapper.select(record);
    }
}
