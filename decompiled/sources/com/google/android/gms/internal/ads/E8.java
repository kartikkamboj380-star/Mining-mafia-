package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class E8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3821i8 f18422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H8 f18423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18424d;

    private E8(H8 h10) {
        this.f18424d = false;
        this.f18421a = null;
        this.f18422b = null;
        this.f18423c = h10;
    }

    public static E8 a(Object obj, C3821i8 c3821i8) {
        return new E8(obj, c3821i8);
    }

    public static E8 b(H8 h10) {
        return new E8(h10);
    }

    public final boolean c() {
        return this.f18423c == null;
    }

    private E8(Object obj, C3821i8 c3821i8) {
        this.f18424d = false;
        this.f18421a = obj;
        this.f18422b = c3821i8;
        this.f18423c = null;
    }
}
