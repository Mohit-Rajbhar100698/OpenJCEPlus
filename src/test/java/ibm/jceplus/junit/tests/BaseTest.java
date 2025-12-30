/*
 * Copyright IBM Corp. 2025
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms provided by IBM in the LICENSE file that accompanied
 * this code, including the "Classpath" Exception described therein.
 */

package ibm.jceplus.junit.tests;

import java.security.Provider;

abstract public class BaseTest {

    private String providerName;

    private int keysize = -1;

    private String algo = null;

    /**
     * Sets the provider name that is to be used to execute this test.
     * 
     * @param providerName the provider name associated with this test case for use.
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public void setAndInsertProvider(TestProvider provider) throws Exception {
        this.providerName = provider.getProviderName();
        switch (provider) {
            case BC:
                loadProvider(TestProvider.BC);
                break;
            case SUN:
                loadProvider(TestProvider.SUN);
                break;
            case SunJCE:
                loadProvider(TestProvider.SunJCE);
                break;
            case SunRsaSign:
                loadProvider(TestProvider.SunRsaSign);
                break;
            case SunEC:
                loadProvider(TestProvider.SunEC);
                break;
            case OpenJCEPlus:
                loadProvider(TestProvider.OpenJCEPlus);
                break;
            case OpenJCEPlusFIPS:
                loadProvider(TestProvider.OpenJCEPlusFIPS);
                break;
            default:
                throw new Exception("Provider not supported: " + provider.getProviderName());
        }
    }

    private static Provider loadProvider(TestProvider testProvider) throws Exception {
        String providerName = testProvider.getProviderName();
        String providerClassName = testProvider.getProviderClassName();
        
        Provider provider = java.security.Security.getProvider(providerName);
        if (provider == null) {
            provider = (Provider) Class.forName(providerClassName).getDeclaredConstructor().newInstance();
            java.security.Security.insertProviderAt(provider, 0);
        }

        return provider;
    }

    /**
     * Gets the provider name that is to be used to execute this test.
     * 
     * @return The provider name associated with this test case for use.
     */
    public String getProviderName() {
        if (this.providerName == null) {
            throw new RuntimeException("Provider name is null.");
        }
        return this.providerName;
    }

    /**
     * Sets the algorithm associated with this test.
     * @param algorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algo = algorithm;
    }

    /**
     * Gets the algorithm associated with this test.
     * @return
     */
    public String getAlgorithm() {
        if (this.algo == null) {
            throw new RuntimeException("Algorithm name is null.");
        }
        return this.algo;
    }

    /**
     * Sets the key size associated with this test.
     * @param keySize
     */
    public void setKeySize(int keySize) {
        this.keysize = keySize;
    }

    /**
     * Gets the key size associated with this test.
     * @return
     */
    public int getKeySize() {
        if (this.keysize == -1) {
            throw new RuntimeException("Key size is not correct.");
        }
        return this.keysize;
    }

    /**
     * Returns the tags from the -Dgroups system property.
     * If no groups property is set, returns an empty array.
     * @return String array of tag names from the groups property
     */
    public static String[] getTagsPropertyAsArray() {
        String groupsProperty = System.getProperty("groups");
        if (groupsProperty != null && !groupsProperty.trim().isEmpty()) {
            // Parse the comma-delimited list of groups and return as array
            String[] groups = groupsProperty.split(",");
            String[] trimmedGroups = new String[groups.length];
            for (int i = 0; i < groups.length; i++) {
                trimmedGroups[i] = groups[i].trim();
            }
            return trimmedGroups;
        } else {
            // If no -Dgroups specified, return empty
            return new String[0];
        }
    }

    /**
     * Converts a byte array to a hex string.   
     * @param input the byte array to convert
     * @return the hex string
     */
    public static String bytesToHex(byte[] input) {
        if (input == null) {
            return "<NULL>";
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length; ++i) {
            sb.append(String.format("%02x", input[i] & 0xff));
        }

        return sb.toString();
    }

    /**
     * Generates a byte array of the specified length with sequential byte values.
     * @param length the length of the byte array to generate
     * @return the generated byte array
     */
    public static byte[] generateBytes(int length) {
        byte[] bytes = new byte[length];
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (i % 256);
        }
        return bytes;
    }

    /**
     * Converts a hex string to a byte array.
     * @param string the hex string to convert
     * @return the byte array
     */
    public static byte[] hexStringToByteArray(String string) {
        String s = string.trim().replaceAll(" +", ""); // remove all spaces

        byte[] b = new byte[s.length() / 2];
        for (int i = 0; i < b.length; i++) {
            int index = i * 2;
            int v = Integer.parseInt(s.substring(index, index + 2), 16);
            b[i] = (byte) v;
        }
        return b;
    }
        
}
