package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class YP0 {
    public static YP0 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new TP0(cls.getSimpleName()) : new VP0(cls.getSimpleName());
    }

    public abstract void a(String str);
}
