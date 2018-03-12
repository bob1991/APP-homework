package test.StackHeapsAndQueTests.SymbolCheckerTests;

import DataStructures.SymbolChecker.BalanceSymbolChecker;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by bobkuipers on 26/02/2018.
 */
public class BalancedSymbolCheckerTest {
    BalanceSymbolChecker sut = new BalanceSymbolChecker();

    @Test
    public void correctSymbolTest(){
        String symbols = "{()}";

        assertEquals(sut.testString(symbols),true);
    }
}
