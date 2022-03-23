package com.crm.testcases;

import org.testng.annotations.Test;

public class PassParameterFromCmdTest {
@Test
public void Data()
{
	String browser = System.getProperty("browser");
	String url = System.getProperty("url");
	String username = System.getProperty("username");
	String password = System.getProperty("password");
}
}
