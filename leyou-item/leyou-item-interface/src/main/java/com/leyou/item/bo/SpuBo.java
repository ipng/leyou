package com.leyou.item.bo;

import com.leyou.item.pojo.*;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/22.
 */
public class SpuBo extends Spu {
    private String cname;
    private String bname;
    private SpuDetail spuDetail;
    private List<Sku> skus;

    public SpuDetail getSpuDetail() {
        return spuDetail;
    }

    public void setSpuDetail(SpuDetail spuDetail) {
        this.spuDetail = spuDetail;
    }

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
