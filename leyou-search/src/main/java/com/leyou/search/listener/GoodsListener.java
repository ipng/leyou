package com.leyou.search.listener;

import com.leyou.search.service.SearchService;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by Enzo Cotter on 2020/4/18.
 */
@Component
public class GoodsListener {
    @Autowired
    private SearchService searchService;
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "leyou.search.save.queue",durable = "true"),
            exchange = @Exchange(value = "leyou.item.exchange",ignoreDeclarationExceptions = "true",type = ExchangeTypes.TOPIC),
            key = {"item.insert","item.upate"}
    ))
    public void save(Long id) throws IOException {
        if (id==null){
            return ;
        }
        this.searchService.save(id);

    }
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "leyou.search.delete.queue",durable = "true"),
            exchange = @Exchange(value = "leyou.item.exchange",ignoreDeclarationExceptions = "true",type = ExchangeTypes.TOPIC),
            key = {"item.delete"}
    ))
    public void delete(Long id) throws IOException {
        if (id==null){
            return ;
        }
        this.searchService.delete(id);

    }
}
