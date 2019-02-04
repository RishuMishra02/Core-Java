package com.rahul.collection;

import java.util.HashMap;

import java.util.Map;

import java.util.WeakHashMap;

public class WeakMapTest {

public static void main(String[] args) {

Map weak = new WeakHashMap();

Map map = new HashMap();

{

String weakkey = new String("weakkey");

weak.put(weakkey,new Object());

String key = new String("key");

map.put(key, new Object());

weakkey = null;

key = null;

}

//System.gc();

}

}


