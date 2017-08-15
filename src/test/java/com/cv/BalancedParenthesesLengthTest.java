package com.cv;

import com.cv.document.DocumentService;
import com.cv.scanner.ParenthesesScanner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BalancedParenthesesLengthTest {

    private DocumentService documentService;
    private ParenthesesScanner parenthesesScanner;

    @BeforeMethod
    public void setUp() throws Exception {
        documentService = new DocumentService();
        parenthesesScanner = new ParenthesesScanner();
    }

    @Test
    public void testForNonBalancedParenthesesInSecondSubArray() throws Exception {
        Integer[] data = {1, -1, 2, -3, -2};

        documentService.setData(data);
        parenthesesScanner.setData(data);

        int serviceResult = documentService.getCount();
        int scannerResult = parenthesesScanner.getCount();

        assertEquals(serviceResult, 2);
        assertEquals(scannerResult, 2);
    }

    @Test
    public void testForBalancedParentheses() throws Exception {
        Integer[] data = {1, -1, 2, 3, -3, -2};
        documentService.setData(data);
        parenthesesScanner.setData(data);

        int serviceResult = documentService.getCount();
        int scannerResult = parenthesesScanner.getCount();

        assertEquals(serviceResult, 4);
        assertEquals(scannerResult, 4);
    }

    @Test
    public void testForBalancedParenthesesWithFiveLevels() throws Exception {

        Integer[] data = {1, 2, 3, 4, 5, -5, -4, -3, -2, -1};
        documentService.setData(data);
        parenthesesScanner.setData(data);

        int serviceResult = documentService.getCount();
        int scannerResult = parenthesesScanner.getCount();

        assertEquals(serviceResult, 10);
        assertEquals(scannerResult, 10);
    }

    @Test
    public void testForNonBalancedParenthesesOnFourthLevel() throws Exception {

        Integer[] data = {1, 2, 3, 4, 2, 3, 1, 3, -2, -1};
        documentService.setData(data);
        parenthesesScanner.setData(data);

        int serviceResult = documentService.getCount();
        int scannerResult = parenthesesScanner.getCount();

        assertEquals(serviceResult, 0);
        assertEquals(scannerResult, 0);
    }

    @Test
    public void testMissingOpenParenthesesOnSecondLevel() throws Exception {

        Integer[] data = {1, -2, -3, -4, -2, -3, -3, -2, -1};
        documentService.setData(data);
        parenthesesScanner.setData(data);

        int serviceResult = documentService.getCount();
        int scannerResult = parenthesesScanner.getCount();

        assertEquals(serviceResult, 0);
        assertEquals(scannerResult, 0);
    }

    @Test
    public void testForOnlyOneCloseParenthesis() throws Exception {

        Integer[] data = {-1};
        documentService.setData(data);
        parenthesesScanner.setData(data);

        int serviceResult = documentService.getCount();
        int scannerResult = parenthesesScanner.getCount();

        assertEquals(serviceResult, 0);
        assertEquals(scannerResult, 0);
    }

    @Test
    public void testForOnlyOneOpenParenthesis() throws Exception {
        Integer[] data = {1};

        documentService.setData(data);
        parenthesesScanner.setData(data);

        int serviceResult = documentService.getCount();
        int scannerResult = parenthesesScanner.getCount();

        assertEquals(serviceResult, 0);
        assertEquals(scannerResult, 0);
    }

    @Test
    public void testBalancedParenthesesWithSameName() throws Exception {

        Integer[] data = {1, 1, 1, 1, -1, -1, -1, -1};
        documentService.setData(data);
        parenthesesScanner.setData(data);

        int serviceResult = documentService.getCount();
        int scannerResult = parenthesesScanner.getCount();

        assertEquals(serviceResult, 8);
        assertEquals(scannerResult, 8);
    }

    @Test
    public void testBalancedParenthesesMultiLevelStructure() throws Exception {

        Integer[] data = {1, -1, 2, 3, 4, -4, 5, 6, 7, -7, -6, -5, -3, -2, -1};

        documentService.setData(data);
        parenthesesScanner.setData(data);

        int serviceResult = documentService.getCount();
        int scannerResult = parenthesesScanner.getCount();

        assertEquals(serviceResult, 12);
        assertEquals(scannerResult, 12);
    }

    @Test
    public void testSecondLevelContainsBalancedAndNotBalancedParentheses() throws Exception {

        Integer[] data = {1, 2, 3, -2, 5, 6, 7, -7, -6, -5, -1};
        documentService.setData(data);
        parenthesesScanner.setData(data);

        int serviceResult = documentService.getCount();
        int scannerResult = parenthesesScanner.getCount();

        assertEquals(serviceResult, 0);
        assertEquals(scannerResult, 0);
    }
}

