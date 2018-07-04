package com.richard.tdd.test.two_number_count_verse;

import com.richard.tdd.two_number_count_verse.AddTwoNumberCount;
import com.richard.tdd.two_number_count_verse.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddTwoNumberCountTest {

    ListNode list1 = null;
    ListNode list2 = null;

    @Before
    public void initializeData() {
        list1 = generateTestData(new int[]{2, 4, 3});
        list2 = generateTestData(new int[]{5, 6, 4});
    }

    private ListNode generateTestData(int[] array) {
        ListNode head = null;
        ListNode handler1 = null;
        for(int i = 0; i < array.length; i++) {
            if(i == 0) {
                handler1 = new ListNode(array[i]);
                head = handler1;
            } else {
                ListNode temp = new ListNode(array[i]);
                handler1.next = temp;
                handler1 = temp;
            }
        }
        return head;
    }

    @Test
    public void testAddTwoNumberCount() {
        AddTwoNumberCount test = new AddTwoNumberCount();
        ListNode result = generateTestData(new int[]{7,0,8});
        ListNode addResult = test.addTwoNumbers(list1, list2);
        Assert.assertEquals(result.val, addResult.val);
        Assert.assertEquals(result.next.val, addResult.next.val);
    }
}
