package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p190t.k f36142a;

    r(p190t.k kVar) {
        this.f36142a = kVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        p190t.k kVar;
        if (uri != null) {
            kVar = (p190t.k) this.f36142a.get(uri.toString());
        } else {
            kVar = null;
        }
        if (kVar == null) {
            return null;
        }
        return (String) kVar.get("".concat(str3));
    }
}
