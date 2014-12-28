package com.back;

import net.sf.json.JSONObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: HuangYan
 * Time:   2014-12-25 17:07
 */
public class JsonTest {

    @Test
    public void testJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.accumulate("hello","hello");
        assertEquals("hello", jsonObject.get("hello"));
    }
}
