package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class W3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p190t.k f36529a;

    W3(p190t.k kVar) {
        this.f36529a = kVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        p190t.k kVar = uri != null ? (p190t.k) this.f36529a.get(uri.toString()) : null;
        if (kVar == null) {
            return null;
        }
        return (String) kVar.get("".concat(str3));
    }
}
