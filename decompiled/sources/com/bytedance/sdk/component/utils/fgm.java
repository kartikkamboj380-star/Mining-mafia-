package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fgm {
    private static final HashMap<Class<?>, Class<?>> bob;
    public static final Class<?>[] kq;
    private static Map<String, Method> oq = new HashMap();

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        bob = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        kq = new Class[0];
    }

    public static int kq(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int kq(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
