package com.facebook.hermes.intl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public enum a {
        BOOLEAN,
        STRING
    }

    public static Object a(String str, Object obj, Object obj2, Object obj3, Object obj4) throws B2.f {
        if (B2.d.n(obj)) {
            return obj4;
        }
        if (!B2.d.k(obj)) {
            throw new B2.f(str + " value is invalid.");
        }
        double dF = B2.d.f(obj);
        if (!Double.isNaN(dF) && dF <= B2.d.f(obj3) && dF >= B2.d.f(obj2)) {
            return obj;
        }
        throw new B2.f(str + " value is invalid.");
    }

    public static Object b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return a(str, B2.d.a(obj, str), obj2, obj3, obj4);
    }

    public static Object c(Object obj, String str, a aVar, Object obj2, Object obj3) throws B2.f {
        Object objA = B2.d.a(obj, str);
        if (B2.d.n(objA)) {
            return obj3;
        }
        if (B2.d.j(objA)) {
            objA = "";
        }
        if (aVar == a.BOOLEAN && !B2.d.i(objA)) {
            throw new B2.f("Boolean option expected but not found");
        }
        if (aVar == a.STRING && !B2.d.m(objA)) {
            throw new B2.f("String option expected but not found");
        }
        if (B2.d.n(obj2) || Arrays.asList((Object[]) obj2).contains(objA)) {
            return objA;
        }
        throw new B2.f("String option expected but not found");
    }

    public static Enum d(Class cls, Object obj) {
        try {
            if (B2.d.n(obj)) {
                return Enum.valueOf(cls, "UNDEFINED");
            }
            if (B2.d.j(obj)) {
                return null;
            }
            String strH = B2.d.h(obj);
            if (strH.equals("2-digit")) {
                return Enum.valueOf(cls, "DIGIT2");
            }
            for (Enum r10 : (Enum[]) cls.getEnumConstants()) {
                if (r10.name().compareToIgnoreCase(strH) == 0) {
                    return r10;
                }
            }
            return null;
        } catch (IllegalArgumentException unused) {
        }
    }
}
