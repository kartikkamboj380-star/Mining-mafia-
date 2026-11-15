package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p190t.a f35895a = new p190t.a();

    public static synchronized Uri a(String str) {
        p190t.a aVar = f35895a;
        Uri uri = (Uri) aVar.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        aVar.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
