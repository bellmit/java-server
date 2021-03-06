package com.iotexample.demo.result;

public class CodeMsg {
  private int code;
  private String msg;

  /**
   * 通用异常
   */
  public static CodeMsg SUCCESS = new CodeMsg(0, "success");
  public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");
  public static CodeMsg INVALID_PARAM_ERROR = new CodeMsg(500101, "Invalid Parameters");
  public static CodeMsg DB_ERROR = new CodeMsg(500200, "数据库异常");
  /**
   * 没获取到挂号的session
   */
  public static CodeMsg SESSION_ERROR = new CodeMsg(500300, "请先挂号");
  /**
   * 去了错误的检查地点
   */
  public static CodeMsg CHECK_ERROR = new CodeMsg(500400, "错误的检查地点");
  public static CodeMsg NO_ACTIVE_CHECK_ERROR = new CodeMsg(500401, "没有活跃的检查");
  /**
   * 重复挂号
   */
  public static CodeMsg DUPLICATE_ERROR = new CodeMsg(500500, "不能重复挂号");
  /**
   * 支付失败
   */
  public static CodeMsg BALANCE_ERROR = new CodeMsg(500600, "支付失败，余额不足");
  public static CodeMsg REPEAT_PAY_ERROR = new CodeMsg(500601, "支付失败，不能重复付款");




  private CodeMsg(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public CodeMsg fillArgs(Object... args) {
    int code = this.code;
    String message = String.format(this.msg, args);
    return new CodeMsg(code, message);
  }

  public int getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }
}
