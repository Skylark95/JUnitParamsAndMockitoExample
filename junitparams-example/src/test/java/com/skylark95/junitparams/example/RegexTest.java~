package com.skylark95.junitparams.example;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import com.skylark95.junitparams.runner.JUnitParamsMockitoRunner;


/**
 * Tesing out how JUnitParams works with Mockito
 * 
 * See Also:
 * https://code.google.com/p/junitparams/
 * http://docs.mockito.googlecode.com/hg/org/mockito/MockitoAnnotations.html
 *
 */
@RunWith(JUnitParamsMockitoRunner.class)
public class RegexTest {
    
    @Mock private RegexProvider regexProvider;
    private Regex regex;
    
    @Before
    public void setUp() {
        when(regexProvider.provide(Alpha.class)).thenReturn(new Alpha());
        when(regexProvider.provide(Num.class)).thenReturn(new Num());
        
    }
    
    @Test
    @Parameters({"a!a", "b@b", "c#c"})
    public void alphaThatWillPassForAllConditions(String value) {
        regex = regexProvider.provide(Alpha.class);
        assertThat(regex.matches(value)).isFalse();
    }
    
    @Test
    @Parameters({"a!a", "b@b", "ccc"})
    public void alphaTestThatWillFailForLastCondition(String value) {
        regex = regexProvider.provide(Alpha.class);
        assertThat(regex.matches(value)).isFalse();
    }
    
    @Test
    @Parameters({"a1", "b2", "c3"})
    public void numThatWillPassForAllConditions(String value) {
        regex = regexProvider.provide(Num.class);
        assertThat(regex.matches(value)).isFalse();
    }
    
    @Test
    @Parameters({"11111111", "2b", "3c"})
    public void numTestThatWillFailForFirstConditionWithCustomMessage(String value) {
        String message = "value \"%s\" passed when it should not have!!!";
        regex = regexProvider.provide(Num.class);
        assertThat(regex.matches(value)).overridingErrorMessage(message, value).isFalse();
    }

}
