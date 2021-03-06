package com.springmvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by RajuY on 5/2/2017.
 */
public class WebServletConfiguration implements WebApplicationInitializer {
     public void onStartup(ServletContext ctx) throws ServletException {
         AnnotationConfigWebApplicationContext webctx=new AnnotationConfigWebApplicationContext();
         webctx.register(SpringConfig.class);
         webctx.setServletContext(ctx);
         ServletRegistration.Dynamic servlet=ctx.addServlet("dispatcher",new DispatcherServlet(webctx));
         servlet.setLoadOnStartup(1);
         servlet.addMapping("/");

    }
}
