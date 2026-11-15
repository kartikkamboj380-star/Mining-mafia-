package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f38536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f38537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f38538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f38539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f38540e;

    x6(String str, String str2, String str3, long j10, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.f38536a = str;
        this.f38537b = str2;
        this.f38538c = str3;
        this.f38539d = j10;
        this.f38540e = obj;
    }
}
