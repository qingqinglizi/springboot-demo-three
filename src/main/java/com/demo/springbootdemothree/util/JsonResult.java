//package com.demo.springbootdemothree.util;
//
//import lombok.Data;
//
//import java.util.HashMap;
//
///**
// * @Auther: Lee
// * @Date 2020/6/19 14:29
// * @Description:
// */
//@Data
//public class JsonResult extends HashMap{
//
//    private boolean success;
//    private String message;
//    private Object data;
//
//    public JsonResult(boolean success) {
//        this.success = success;
//        this.message = success == true ? "操作成功" : "操作失败";
//        super.put("success", success);
//        super.put("message", message);
//    }
//
//    public JsonResult(boolean success, String message) {
//        this.success = success;
//        this.message = message;
//        super.put("success", success);
//        super.put("message", message);
//    }
//
//    public JsonResult(boolean success, String message, Object data) {
//        this.success = success;
//        this.message = message;
//        this.data = data;
//        super.put("success", success);
//        super.put("message", message);
//        super.put("data", data);
//    }
//
//    public static acc.JsonResult successResult() {
//        return new acc.JsonResult(true);
//    }
//
//    public static acc.JsonResult successResult(Object data) {
//        return new acc.JsonResult(true, "操作成功", data);
//    }
//
//    public static acc.JsonResult successResult(String message, Object data) {
//        return new acc.JsonResult(true, message, data);
//    }
//
//    public static acc.JsonResult failResult() {
//        return new acc.JsonResult(false);
//    }
//
//    public static acc.JsonResult failResult(String message) {
//        return new acc.JsonResult(false, message);
//    }
//}
