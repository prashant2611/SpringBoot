package com.example.demo;
import java.lang.instrument.Instrumentation;


public class Calculate_Object_size 
{
	private static Instrumentation instrumentation;

public static void premain(String args, Instrumentation inst) {
    instrumentation = inst;
}

public static long getObjectSize(Object o) {
    return instrumentation.getObjectSize(o);
}
}
