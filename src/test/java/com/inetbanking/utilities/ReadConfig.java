package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {

		File src = new File("/Users/milinpatel/Documents/workspace/inetBankingV1/Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);

		} catch (IOException e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}

	public String getApplicationURL() {

		String url = prop.getProperty("baseURL");
		return url;

	}

	public String getUserName() {
		String username = prop.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = prop.getProperty("password");
		return password;

	}

	public String getChromePath() {
		String ChromePath = prop.getProperty("Chromepath");
		return ChromePath;
	}
	
	public String getFireFixPath(){
		String FireFoxPath = prop.getProperty("Firefoxpath");	
		return FireFoxPath;
	}

}
