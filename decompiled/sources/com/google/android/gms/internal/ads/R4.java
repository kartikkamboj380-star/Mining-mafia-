package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class R4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f22695a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f22696b = "media3.common";

    public static synchronized String a() {
        return f22696b;
    }

    public static synchronized void b(String str) {
        if (f22695a.add(str)) {
            String str2 = f22696b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb.append(str2);
            sb.append(", ");
            sb.append(str);
            f22696b = sb.toString();
        }
    }
}
