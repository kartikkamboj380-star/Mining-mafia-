package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6513d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p136n5.u f37903a;

    C6513d1(p136n5.u uVar) {
        this.f37903a = uVar;
    }

    static C6513d1 c(String str) {
        return new C6513d1((TextUtils.isEmpty(str) || str.length() > 1) ? p136n5.u.UNINITIALIZED : E3.j(str.charAt(0)));
    }

    final p136n5.u a() {
        return this.f37903a;
    }

    final String b() {
        return String.valueOf(E3.m(this.f37903a));
    }
}
