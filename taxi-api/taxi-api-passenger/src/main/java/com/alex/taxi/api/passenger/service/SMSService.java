package com.alex.taxi.api.passenger.service;

import com.alex.taxi.dto.ResponseResult;
import com.alex.taxi.dto.sms.SmsSendRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "sms-service")
public interface SMSService {
    @RequestMapping(value = "/sms/send",method = RequestMethod.POST)
    public ResponseResult<SmsSendRequest> forecast(@RequestBody SmsSendRequest smsSendRequest);

}
