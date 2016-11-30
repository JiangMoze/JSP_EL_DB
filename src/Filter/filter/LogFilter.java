package Filter.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by zhang on 2016/11/20.
 */
@WebFilter(filterName = "LogFilter",urlPatterns = {"/*"})
public class LogFilter implements Filter {
    private FilterConfig config;

    public void destroy() {
        this.config=null;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        ServletContext context=config.getServletContext();
        HttpServletRequest hrequest=(HttpServletRequest)req;
        long start=System.currentTimeMillis();
        System.out.println("�û���ַ��"+hrequest.getRemoteAddr());
        System.out.println("�������Դ��"+hrequest.getRequestURI());
        context.log("�������Դ��"+hrequest.getRequestURI());
        context.log("�û���ַ��"+hrequest.getRemoteAddr());
        chain.doFilter(req, resp);
        long end=System.currentTimeMillis();
        System.out.println("�������ʱ�䣺"+(end-start)+"����");
        context.log("�������ʱ�䣺"+(end-start)+"����");
    }

    public void init(FilterConfig fconfig) throws ServletException {
        this.config=fconfig;
    }

}
