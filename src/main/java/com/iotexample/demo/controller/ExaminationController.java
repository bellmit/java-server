package com.iotexample.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.iotexample.demo.RequestEntity.RequestAddExaminationOrder;
import com.iotexample.demo.model.Examinationorder;
import com.iotexample.demo.result.CodeMsg;
import com.iotexample.demo.result.Result;
import com.iotexample.demo.service.ExaminationOrderService;
import com.iotexample.demo.service.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: iotdemo
 * @description: 检查的controller
 * @author: WenYuan
 * @create: 2019-06-02 22:25
 **/

@RestController
@RequestMapping("/examination")
public class ExaminationController {
  @Autowired
  ExaminationOrderService examinationOrderService;

  @Autowired
  ExaminationService examinationService;

  /** 
  * @Description: 根据examinationOrderId获得详细的检查信息 
  * @Param: [examinationOrderId] 
  * @return: com.iotexample.demo.result.Result<com.alibaba.fastjson.JSON> 
  * @Author: WenYuan
  * @Date: 2019/6/2 
  */
  @GetMapping
  @CrossOrigin
  public Result<JSONObject> getExamination(@RequestParam("examinationOrderId") long examinationOrderId) {
    Examinationorder examinationorder = examinationOrderService.getExaminationOrderById(examinationOrderId);
    long examinationId = examinationorder.getExaminationId();
    String examinationType = examinationorder.getExaminationType();

    JSONObject json = examinationService.getExaminationByTypeAndId(examinationId, examinationType);

    return Result.success(json);
  }

  /** 
  * @Description: 根据userId和payState来返回所有的examination 
  * @Param: [payState, userId] 
  * @return: com.iotexample.demo.result.Result<java.util.List<com.iotexample.demo.model.Examinationorder>> 
  * @Author: WenYuan
  * @Date: 2019-06-04 
  */
  @GetMapping("/{userId}")
  public Result<List<Examinationorder>> getAllExamination(@RequestParam("payState")int payState, @PathVariable("userId")long userId) {
    List<Examinationorder> list = examinationOrderService.getExaminationOrderByUserIdAndPayState(userId, payState);
    return Result.success(list);
  }

  /**
  * @Description: 获取所有检查的项目
  * @Param: []
  * @return: com.iotexample.demo.result.Result<com.alibaba.fastjson.JSON>
  * @Author: WenYuan
  * @Date: 2019/6/21
  */
  @GetMapping("/all")
  @CrossOrigin
  public Result<JSON> getAllExamination() {
    JSON str = examinationService.getAllExamination();
    return Result.success(str);
  }

  /** 
  * @Description: 增加examinationOrder记录 
  * @Param: [requestAddExaminationOrders] 
  * @return: com.iotexample.demo.result.Result<java.lang.String> 
  * @Author: WenYuan
  * @Date: 2019/6/21 
  */
  @PostMapping("/add")
  @CrossOrigin
  public Result<String> addExaminationOrder(@RequestBody RequestAddExaminationOrder[] requestAddExaminationOrders) {
    int res = examinationOrderService.addAllExamination(requestAddExaminationOrders);
    if (res == 0) {
      return Result.success("success");
    }
    return Result.error(CodeMsg.SERVER_ERROR);
  }
}