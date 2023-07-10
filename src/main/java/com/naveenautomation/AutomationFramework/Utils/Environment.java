package com.naveenautomation.AutomationFramework.Utils;

public enum Environment {

	DEV("Dev", "https://naveenautomationlabsDev.com/opencart/index.php?route=common/home"),
	QA("qa", "https://naveenautomationlabsQa.com/opencart/index.php?route=common/home"),
	STAGE("Stage", "https://naveenautomationlabsStage.com/opencart/index.php?route=common/home"),
	PROD("Production", "https://naveenautomationlabs.com/opencart/index.php?route=common/home");

	String env;
	String url;

	Environment(String env, String URL) {

		this.env = env;
		this.url = URL;
	}

	public String getUrl() {
		return url;
	}

	public String getEnv() {
		return env;
	}

}
