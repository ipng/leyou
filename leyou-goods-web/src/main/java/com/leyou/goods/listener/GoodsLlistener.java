package com.leyou.goods.listener;

import com.leyou.goods.service.GoodsHtmlService;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

/**
 * Created by Enzo Cotter on 2020/4/18.
 */
@Component
public class GoodsLlistener {

    @Autowired
    private GoodsHtmlService goodsHtmlService;

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "leyou.item.save.queue",durable = "true"),
            exchange = @Exchange(value = "leyou.item.exchange",ignoreDeclarationExceptions = "true",type = ExchangeTypes.TOPIC),
            key = {"item.insert","item.update"}
    ))
    public void save(Long id){
        if (id==null){
            return;
        }
        this.goodsHtmlService.createHtml(id);
    }
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "leyou.item.dalete.queue",durable = "true"),
            exchange = @Exchange(value = "leyou.item.exchange",ignoreDeclarationExceptions = "true",type = ExchangeTypes.TOPIC),
            key = {"item.dalete"}
    ))
    public void dalete(Long id){
        if (id==null){
            return;
        }
        this.goodsHtmlService.daleteHtml(id);
    }
}
