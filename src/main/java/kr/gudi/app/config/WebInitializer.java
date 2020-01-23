package kr.gudi.app.config;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import kr.gudi.app.config.filter.UTF8Filter;
import kr.gudi.app.config.mybatis.MybatisConfig;
import kr.gudi.app.config.spring.AOPConfig;
import kr.gudi.app.config.spring.SecurityConfig;
import kr.gudi.app.config.spring.SpringConfig;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {SecurityConfig.class, MybatisConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringConfig.class, AOPConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	@Override
    protected Filter[] getServletFilters() {
        return new Filter[] {new UTF8Filter()};
    }
	
}
