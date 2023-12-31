package org.algorithmcontestdatacollect.crawlerendpoint2.Handlers.ErrorHandlers;

import com.alibaba.fastjson.JSONObject;
import org.algorithmcontestdatacollect.crawlerendpoint2.Handlers.AbstractHandler;
import org.algorithmcontestdatacollect.crawlerendpoint2.Repositories.SpiderLogRepository;
import org.algorithmcontestdatacollect.crawlerendpoint2.Services.ErrorAnalyseService;
import org.algorithmcontestdatacollect.crawlerendpoint2.TableEntity.SpiderLogEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ProcessErrorHandler")
public class ProcessErrorHandler extends AbstractHandler {
    @Autowired
    ErrorAnalyseService errorAnalyseService;

    @Autowired
    SpiderLogRepository spiderLogRepository;
    private Logger logger = LoggerFactory.getLogger(ProcessErrorHandler.class);
    @Override
    public void handle(String result) {
        var fault = errorAnalyseService.getFaultFromResult(result);
        var requestParams = errorAnalyseService.getRequestParamsFromResult(result);
        var spiderName = JSONObject.parseObject(result).getString("spiderName");
        var log = SpiderLogEntity.fromFaultAndRequestParam(fault,requestParams,spiderName);
        spiderLogRepository.saveAndFlush(log);
    }
}
