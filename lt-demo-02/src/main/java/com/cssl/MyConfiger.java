package com.cssl;

import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cssl.interceptor.MyInterceptor;

// 组件
@Component
public class MyConfiger implements WebMvcConfigurer {

	/**
	 * 添加拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor())
				//.addPathPatterns("/*","/image/*");
				.addPathPatterns("/**")
				.excludePathPatterns("/image/*");
	}

	// 信息转换器
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
	    //调用父类的配置
		WebMvcConfigurer.super.configureMessageConverters(converters);
	}

}
