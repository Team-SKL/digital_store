package com.project.digital_store.base;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/asdf")//说明本过滤器将拦截所有的请求
public class SecurityFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse resp = (HttpServletResponse)servletResponse;



        /*
         * 禁用浏览器缓存
         */
        resp.addHeader("Pragma", "no-cache");
        resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        resp.addHeader("Cache-Control", "pre-check=0, post-check=0");
        resp.setDateHeader("Expires", 0);


        //获得请求路径
        String path = req.getServletPath();

        if(path.startsWith("/security/login")) {
            //放行通过
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        HttpSession session = req.getSession();//通过request获得session
        Object currUser = session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
        if(currUser != null) {//已经登录
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        /*
         * 接受跨域访问
         */
        resp.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
        resp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT, HEAD");
        resp.setHeader("Access-Control-Max-Age", "0");
        resp.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
        resp.setHeader("Access-Control-Allow-Credentials", "true");
        resp.setHeader("XDomainRequestAllowed","1");

        //非法访问，向客户端发送表达未登录的json信息
        PrintWriter out = resp.getWriter();//获得向浏览器输出信息的字符流
        out.print("{\"logined\":false}");
        out.flush();
        out.close();

        //System.out.println("=========>"+path);
    }

    @Override
    public void destroy() {

    }
}
