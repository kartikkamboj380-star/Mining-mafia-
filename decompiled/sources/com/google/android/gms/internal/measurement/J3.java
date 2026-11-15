package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final L3 f36310a;

    static {
        Uri uri = K3.f36319a;
        f36310a = M3.b();
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        return f36310a.a(contentResolver, str, null);
    }
}
