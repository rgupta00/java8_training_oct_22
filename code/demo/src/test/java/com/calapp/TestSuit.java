package com.calapp;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
@SelectPackages({"com.calapp"})
@IncludeTags("production")
@Suite
public class TestSuit {

}
