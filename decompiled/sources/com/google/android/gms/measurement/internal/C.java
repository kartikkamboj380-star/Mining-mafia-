package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f37435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f37436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f37437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f37438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f37439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f37440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f37441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Long f37442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Long f37443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Long f37444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Boolean f37445k;

    C(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j10 >= 0);
        Preconditions.checkArgument(j11 >= 0);
        Preconditions.checkArgument(j12 >= 0);
        Preconditions.checkArgument(j14 >= 0);
        this.f37435a = str;
        this.f37436b = str2;
        this.f37437c = j10;
        this.f37438d = j11;
        this.f37439e = j12;
        this.f37440f = j13;
        this.f37441g = j14;
        this.f37442h = l10;
        this.f37443i = l11;
        this.f37444j = l12;
        this.f37445k = bool;
    }

    final C a(long j10) {
        return new C(this.f37435a, this.f37436b, this.f37437c, this.f37438d, this.f37439e, j10, this.f37441g, this.f37442h, this.f37443i, this.f37444j, this.f37445k);
    }

    final C b(long j10, long j11) {
        return new C(this.f37435a, this.f37436b, this.f37437c, this.f37438d, this.f37439e, this.f37440f, j10, Long.valueOf(j11), this.f37443i, this.f37444j, this.f37445k);
    }

    final C c(Long l10, Long l11, Boolean bool) {
        return new C(this.f37435a, this.f37436b, this.f37437c, this.f37438d, this.f37439e, this.f37440f, this.f37441g, this.f37442h, l10, l11, bool);
    }
}
