package com.common.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UrlFilter implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String path = request.getContextPath();
		String uri = request.getRequestURI();
//		if (uri.contains("/back/")) {
//			if (request.getSession().getAttribute("userinfo") == null) {
//				Share.print_writer("<html><script>window.parent.parent.location.href='" + path + "/login.html'</script></html>", response);
//				return;
//			}
//		}
		// Set browser no cache.
//		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
//		response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
//		response.setDateHeader("Expires", 0); // Proxies.
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {

	}
}
