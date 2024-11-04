package com.spinny.BDD_framework;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("com.spinny.BDD_framework")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/report.html")
public class RunCucumberTest {
}
