/*
 * Copyright IBM Corp. 2025
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms provided by IBM in the LICENSE file that accompanied
 * this code, including the "Classpath" Exception described therein.
 */

package ibm.jceplus.junit.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

/**
 * Utility class for generating test parameter variations.
 */
public class TestArguments {

    /**
     * Generates test combinations for each AES key size with the active OpenJCEPlus* providers.
     * 
     * @return Stream of Arguments containing AES key sizes and OpenJCEPlus* providers
     */ 
    public static Stream<Arguments> aesKeySizesAndJCEPlusProviders() {
        int[] aesKeySizesOpenJcePlus = {128, 192, 256};
        return keySizesAndJCEPlusProviders(aesKeySizesOpenJcePlus);
    }

    /**     
     * Generates test combinations for each AESGCM key size with the active OpenJCEPlus* providers.
     * 
     * @return Stream of Arguments containing AESGCM key sizes and OpenJCEPlus* providers
     */
    public static Stream<Arguments> aesgcmKeySizesAndJCEPlusProviders() {
        int[] aesgcmKeySizesOpenJcePlus = {128, 192, 256};
        return keySizesAndJCEPlusProviders(aesgcmKeySizesOpenJcePlus);
    }

    /**
     * Provides enabled OpenJCEPlus* providers for alias tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> testAliasesJCEPlusProviders() {
        List<TestProvider> testAliasesActiveProviders = getEnabledProviders();

        if (testAliasesActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return testAliasesActiveProviders.stream();
    }

    /**
     * Provides enabled OpenJCEPlus* providers for AESGCMCICOWithGCM tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> aesGcmCicoWithGcmJCEPlusProviders() {
        List<TestProvider> aesGcmCicoWithGcmActiveProviders = getEnabledProviders();

        if (aesGcmCicoWithGcmActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return aesGcmCicoWithGcmActiveProviders.stream();
    }

    /**
     * Provides enabled OpenJCEPlus* providers for AESGCMCICOWithGCMANDAAD tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> aesGcmCicoWithGcmAndAADJCEPlusProviders() {
        List<TestProvider> aesGcmCicoWithGcmAndAADActiveProviders = getEnabledProviders();

        if (aesGcmCicoWithGcmAndAADActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return aesGcmCicoWithGcmAndAADActiveProviders.stream();
    }

    /**
     * Provides enabled OpenJCEPlus* providers for AESCipherInputStreamExceptions tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> aesCipherInputStreamExceptionsJCEPlusProviders() {
        List<TestProvider> aesCipherInputStreamExceptionsActiveProviders = getEnabledProviders();

        if (aesCipherInputStreamExceptionsActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return aesCipherInputStreamExceptionsActiveProviders.stream();
    }

    /**
     * Provides enabled OpenJCEPlus* providers for AESCopySafe tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> aesCopySafeJCEPlusProviders() {
        List<TestProvider> aesCopySafeActiveProviders = getEnabledProviders();

        if (aesCopySafeActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return aesCopySafeActiveProviders.stream();
    }

    /**
     * Provides enabled OpenJCEPlus* providers for AESGCMLong tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> aesGcmLongJCEPlusProviders() {
        List<TestProvider> aesGcmLongActiveProviders = getEnabledProviders();

        if (aesGcmLongActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return aesGcmLongActiveProviders.stream();
    }
    
    /**
     * Provides enabled OpenJCEPlus* providers for AESGCMNonExpanding tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> aesGcmNonExpandingJCEPlusProviders() {
        List<TestProvider> aesGcmNonExpandingActiveProviders = getEnabledProviders();

        if (aesGcmNonExpandingActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return aesGcmNonExpandingActiveProviders.stream();
    }
    
    /**
     * Provides enabled OpenJCEPlus* providers for AESGCMSameBuffer tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> aesGcmSameBufferJCEPlusProviders() {
        List<TestProvider> aesGcmSameBufferActiveProviders = getEnabledProviders();

        if (aesGcmSameBufferActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return aesGcmSameBufferActiveProviders.stream();
    }
    
    /**
     * Provides enabled OpenJCEPlus* providers for AESGCMWithByteBuffer tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> aesGcmWithByteBufferJCEPlusProviders() {
        List<TestProvider> aesGcmWithByteBufferActiveProviders = getEnabledProviders();

        if (aesGcmWithByteBufferActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return aesGcmWithByteBufferActiveProviders.stream();
    }
    
    /**
     * Provides enabled OpenJCEPlus* providers for DESede tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> desEdeJCEPlusProviders() {
        List<TestProvider> desEdeActiveProviders = getEnabledProviders();

        if (desEdeActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return desEdeActiveProviders.stream();
    }
    
    /**
     * Provides enabled OpenJCEPlus* providers for MiniRSAPSS2 tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> miniRSAPSS2JCEPlusProviders() {
        List<TestProvider> miniRSAPSS2ActiveProviders = getEnabledProviders();

        if (miniRSAPSS2ActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return miniRSAPSS2ActiveProviders.stream();
    }

    /**
     * Provides enabled OpenJCEPlus* providers for ECDSASignature tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> ecdSaSignatureJCEPlusProviders() {
        List<TestProvider> ecdSaSignatureActiveProviders = getEnabledProviders();

        if (ecdSaSignatureActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return ecdSaSignatureActiveProviders.stream();
    }
        
    /**
     * Provides enabled OpenJCEPlus* providers for HmacSHA3_224 tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> hmacSHA3_224JCEPlusProviders() {
        List<TestProvider> hmacSHA3_224ActiveProviders = getEnabledProviders();

        if (hmacSHA3_224ActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return hmacSHA3_224ActiveProviders.stream();
    }
        
    /**
     * Provides enabled OpenJCEPlus* providers for HmacSHA3_256 tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> hmacSHA3_256JCEPlusProviders() {
        List<TestProvider> hmacSHA3_256ActiveProviders = getEnabledProviders();

        if (hmacSHA3_256ActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return hmacSHA3_256ActiveProviders.stream();
    }

    /**
     * Provides enabled OpenJCEPlus* providers for HmacSHA3_384 tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> hmacSHA3_384JCEPlusProviders() {
        List<TestProvider> hmacSHA3_384ActiveProviders = getEnabledProviders();

        if (hmacSHA3_384ActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return hmacSHA3_384ActiveProviders.stream();
    }

    /**
     * Provides enabled OpenJCEPlus* providers for HmacSHA3_512 tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> hmacSHA3_512JCEPlusProviders() {
        List<TestProvider> hmacSHA3_512ActiveProviders = getEnabledProviders();

        if (hmacSHA3_512ActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return hmacSHA3_512ActiveProviders.stream();
    }
 
    /**
     * Provides enabled OpenJCEPlus* providers for SHA3_224 tests
     *
     * @return A stream of enabled TestProvider.
     */
    public static Stream<TestProvider> sha3_224JCEPlusProviders() {
        List<TestProvider> sha3_224ActiveProviders = getEnabledProviders();

        if (sha3_224ActiveProviders.isEmpty()) {
            throw new IllegalArgumentException("No test providers found, unlikely this is what was asked for.");
        }
        return sha3_224ActiveProviders.stream();
    }
    
    /**
     * Generates combinations of all key sizes and OpenJCEPlus* providers under test.
     * 
     * If no tags are found, all variations are returned.
     *
     * @return Stream of Arguments containing key sizes and OpenJCEPlus* providers
     */
    public static Stream<Arguments> keySizesAndJCEPlusProviders(int[] keySizes) {

        // Check if provider tags are present and build a list. Defaults to all providers.
        List<TestProvider> activeProviders = getEnabledProviders();

        // Generate all combinations of key sizes and providers determined above.
        List<Arguments> arguments = new ArrayList<>();
        for (TestProvider provider : activeProviders) {
            for (int keySize : keySizes) {
                arguments.add(Arguments.of(keySize, provider));
            }
        }

        if (arguments.isEmpty()) {
            throw new IllegalArgumentException("No test arguments, unlikey this is what was asked for.");
        }
        return arguments.stream();
    }

    /**
     * Resolves enabled OpenJCEPlus* providers from -Dgroups, defaulting to all when none are specified.
     *
     * @return A list of enabled TestProvider.
     */ 
    private static List<TestProvider> getEnabledProviders(){

        // Get active provider tags from -Dgroups system property
        String[] groupPropertyTags = BaseTest.getTagsPropertyAsArray();

        //retrieve enabled providers based on tags
        List<TestProvider> enabledProviders = new ArrayList<>();
        if (groupPropertyTags.length == 0) {
            enabledProviders.add(TestProvider.OpenJCEPlus);
            enabledProviders.add(TestProvider.OpenJCEPlusFIPS);
        } else {
            for (String tag : groupPropertyTags) {
                if (TestProvider.OpenJCEPlus.getProviderName().equalsIgnoreCase(tag)) {
                    enabledProviders.add(TestProvider.OpenJCEPlus);
                } else if (TestProvider.OpenJCEPlusFIPS.getProviderName().equalsIgnoreCase(tag)) {
                    enabledProviders.add(TestProvider.OpenJCEPlusFIPS);
                }
            }
        }
        return enabledProviders;
    }        
    
}
