//package com.demo.springbootdemothree.util;
//
//import acc.AccProperties;
//import acc.HttpUtil;
//import acc.JsonResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @Auther: Lee
// * @Date 2020/6/17 16:54
// * @Description:
// */
//@Component
//public class DealAuthTicket {
//
//    @Autowired
//    private AccProperties accProperties;
//
//    //为 public 不然没有权限
//    public static acc.DealAuthTicket dealAuthTicket;
//
//    //被@PostConstruct修饰的方法会在服务器加载Servlet的时候运行，并且只会被服务器调用一次，类似于Serclet的inti()方法。
//    // 被@PostConstruct修饰的方法会在构造函数之后，init()方法之前运行。
//    @PostConstruct //通过@PostConstruct实现初始化bean之前进行的操作
//    public void init() {
//        dealAuthTicket = this;
//    }
//
//    private DealAuthTicket() {
//    }
//
//    public static acc.DealAuthTicket getInstance() {
//        if (dealAuthTicket == null) {
//            dealAuthTicket = new acc.DealAuthTicket();
//        }
//        return dealAuthTicket;
//    }
//
//    public boolean checkLoginInfo(HttpServletRequest request, HttpServletResponse response) {
//        Cookie[] cookies = request.getCookies();
//        if (cookies == null) {
//            return false;
//        }
//        boolean flag = false;
//        for (Cookie cookie : cookies) {
//            if ("ST".equals(cookie.getName())) {
//                //校验ST
//                JsonResult validateResult = HttpUtil.doGet(dealAuthTicket.accProperties.getService() + "/certification/checkSecondTicket", cookie);
//                System.out.println("校验ST结果：" + validateResult.toString());
//                if (validateResult.isSuccess() && "true".equals(validateResult.getData())) {
//                    flag = true;
//                    break;
//                }
//            }
//        }
//        return flag;
//    }
//
//}
