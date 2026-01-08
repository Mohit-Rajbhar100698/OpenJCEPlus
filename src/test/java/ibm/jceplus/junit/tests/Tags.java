/*
 * Copyright IBM Corp. 2026
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms provided by IBM in the LICENSE file that accompanied
 * this code, including the "Classpath" Exception described therein.
 */

package ibm.jceplus.junit.tests;

/**
 * Enumeration of test tags used to categorize tests.
 */
public enum Tags {

    OPENJCEPLUS("OpenJCEPlus"),
    OPENJCEPLUS_FIPS("OpenJCEPlusFIPS"),
    OPENJCEPLUS_MULTITHREAD("OpenJCEPlusMultithread"),
    OPENJCEPLUS_FIPS_MULTITHREAD("OpenJCEPlusFIPSMultithread");

    // Constants for tag names (can be used in annotations where compiler couldn't use a runtime method)
    public static final String OPENJCEPLUS_NAME = "OpenJCEPlus";
    public static final String OPENJCEPLUS_FIPS_NAME = "OpenJCEPlusFIPS";
    public static final String OPENJCEPLUS_MULTITHREAD_NAME = "OpenJCEPlusMultithread";
    public static final String OPENJCEPLUS_FIPS_MULTITHREAD_NAME = "OpenJCEPlusFIPSMultithread";

    private final String tag;

    Tags(String tag) {
        this.tag = tag;
    }

    /**
     * Gets the tag value.
     *
     * @return the tag value
     */
    public String getTag() {
        return tag;
    }
}
