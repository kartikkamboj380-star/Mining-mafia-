package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C6194e3;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6194e3 f38385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f38387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p136n5.G f38388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f38389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f38390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f38391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f38392i;

    /* synthetic */ t6(long j10, C6194e3 c6194e3, String str, Map map, p136n5.G g10, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f38384a = j10;
        this.f38385b = c6194e3;
        this.f38386c = str;
        this.f38387d = map;
        this.f38388e = g10;
        this.f38389f = j11;
        this.f38390g = j12;
        this.f38391h = j13;
        this.f38392i = i10;
    }

    public final C6510c6 a() {
        return new C6510c6(this.f38386c, this.f38387d, this.f38388e, null);
    }

    public final X5 b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f38387d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f38384a;
        C6194e3 c6194e3 = this.f38385b;
        String str = this.f38386c;
        p136n5.G g10 = this.f38388e;
        return new X5(j10, c6194e3.a(), str, bundle, g10.zza(), this.f38390g, "");
    }

    public final long c() {
        return this.f38384a;
    }

    public final C6194e3 d() {
        return this.f38385b;
    }

    public final String e() {
        return this.f38386c;
    }

    public final p136n5.G f() {
        return this.f38388e;
    }

    public final long g() {
        return this.f38389f;
    }

    public final long h() {
        return this.f38391h;
    }

    public final int i() {
        return this.f38392i;
    }
}
