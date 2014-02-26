package com.nitin.healthcheck;

import org.apache.commons.lang3.StringUtils;

import com.yammer.metrics.core.HealthCheck;

public class TemplateHealthCheck extends HealthCheck{
	private final String template;
	
	

	public TemplateHealthCheck(String template) {
		super("template");
		this.template = template;
	}



	@Override
	protected Result check() throws Exception {
		final String saying = String.format(template, "TEST");
		if(!StringUtils.contains(saying, "TEST"))
		{
			return Result.unhealthy("Template Does not include a name");
		}
		
		return Result.healthy("Seems fine");
	}

}
