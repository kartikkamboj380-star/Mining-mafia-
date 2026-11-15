package com.tenjin.android.utils.adnetwork;

import android.util.Log;
import com.tenjin.android.utils.Reflection;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAdNetworkHelper {
    protected static String helperObjectName = null;
    protected static String logTag = null;
    protected static boolean useFields = false;

    protected static double getDouble(Object obj, String str, String str2) {
        Object object = getObject(obj, str, str2);
        if (object != null) {
            return ((Double) object).doubleValue();
        }
        return 0.0d;
    }

    protected static int getInt(Object obj, String str, String str2) {
        Object object = getObject(obj, str, str2);
        if (object != null) {
            return ((Integer) object).intValue();
        }
        return 0;
    }

    protected static int getIntFromEnum(Object obj, String str, String str2) {
        Object object = getObject(obj, str, str2);
        if (object == null) {
            return 0;
        }
        try {
            Object objInvoke = object.getClass().getMethod("toFlag", null).invoke(object, null);
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue();
            }
            return 0;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    protected static long getLong(Object obj, String str, String str2) {
        Object object = getObject(obj, str, str2);
        if (object != null) {
            return ((Long) object).longValue();
        }
        return 0L;
    }

    protected static Object getObject(Object obj, String str, String str2) {
        Object objRunInstanceMethod = null;
        try {
            objRunInstanceMethod = Reflection.runInstanceMethod(obj, str, null, new Object[0]);
        } catch (Exception e10) {
            Log.e(logTag, "Error in method " + str + " while getting " + str2 + " data from " + helperObjectName + " object", e10);
        }
        if (objRunInstanceMethod != null || !useFields) {
            return objRunInstanceMethod;
        }
        try {
            return obj.getClass().getDeclaredField(str).get(obj);
        } catch (IllegalAccessException | NoSuchFieldException e11) {
            Log.e(logTag, "Error in field " + str + " while getting data from " + helperObjectName + " object", e11);
            return objRunInstanceMethod;
        }
    }

    protected static String getString(Object obj, String str, String str2) {
        return (String) getObject(obj, str, str2);
    }
}
