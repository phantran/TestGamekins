package org.example;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses( { AnstrengendTest.class, SimpleExampleTest.class } )
@SelectPackages("org.example")
public class JUnit5TestSuiteExample {
}