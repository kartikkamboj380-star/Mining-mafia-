package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6204f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p190t.a f36680a = new p190t.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f36681b = 0;

    public static synchronized Uri a(String str) {
        p190t.a aVar = f36680a;
        Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        aVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
