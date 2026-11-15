package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u {
    public static Object a(Class cls, String str, t... tVarArr) {
        return b(cls, "isIsolated", null, false, tVarArr);
    }

    private static Object b(Class cls, String str, Object obj, boolean z9, t... tVarArr) {
        int length = tVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        Object obj2 = null;
        if (tVarArr.length <= 0) {
            return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
        }
        t tVar = tVarArr[0];
        obj2.getClass();
        throw null;
    }
}
