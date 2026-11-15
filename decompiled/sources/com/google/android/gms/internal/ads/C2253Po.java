package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2253Po implements N4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f22188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f22190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Location f22192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f22193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f22194g;

    public C2253Po(Date date, int i10, Set set, Location location, boolean z9, int i11, boolean z10, int i12, String str) {
        this.f22188a = date;
        this.f22189b = i10;
        this.f22190c = set;
        this.f22192e = location;
        this.f22191d = z9;
        this.f22193f = i11;
        this.f22194g = z10;
    }

    @Override // N4.f
    public final int b() {
        return this.f22193f;
    }

    @Override // N4.f
    public final boolean c() {
        return this.f22194g;
    }

    @Override // N4.f
    public final boolean d() {
        return this.f22191d;
    }

    @Override // N4.f
    public final Set g() {
        return this.f22190c;
    }
}
