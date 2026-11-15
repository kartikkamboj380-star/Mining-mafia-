package com.tenjin.android.utils;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class Reflection {
    private static final String TAG = "TenjinReflection";

    public static Class forName(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object newInstance(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Object runInstanceMethod(Object obj, String str, Class[] clsArr, Object... objArr) {
        if (obj != null && str != null) {
            try {
                return runMethod(obj.getClass(), str, obj, clsArr, objArr);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            } catch (Exception e10) {
                Log.e(TAG, "Error running instance method " + str + " on " + obj.toString() + " : " + e10.getLocalizedMessage());
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object runMethod(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) throws NoSuchMethodException {
        if (cls == 0 || str == null) {
            return null;
        }
        if (clsArr == null) {
            clsArr = new Class[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        Method method = cls.getMethod(str, clsArr);
        if (method == null) {
            return null;
        }
        return method.invoke(obj, objArr);
    }

    public static Object runStaticMethod(String str, String str2, Class[] clsArr, Object... objArr) {
        try {
            return runMethod(Class.forName(str), str2, null, clsArr, objArr);
        } catch (ClassNotFoundException e10) {
            e = e10;
            Log.e(TAG, "Error running static method " + str2 + " on " + str + " : " + e.getMessage());
            return null;
        } catch (IllegalAccessException e11) {
            e = e11;
            Log.e(TAG, "Error running static method " + str2 + " on " + str + " : " + e.getMessage());
            return null;
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.e(TAG, "Error running static method " + str2 + " on " + str + " : " + e.getMessage());
            return null;
        } catch (InvocationTargetException e13) {
            e = e13;
            Log.e(TAG, "Error running static method " + str2 + " on " + str + " : " + e.getMessage());
            return null;
        } catch (Exception e14) {
            Log.e(TAG, "Error running static method " + str2 + " on " + str + " : " + e14.getLocalizedMessage());
            return null;
        }
    }
}
