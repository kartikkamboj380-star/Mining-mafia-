package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class v implements p008a7.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f40680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p008a7.m f40682c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f40683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p008a7.m f40685c;

        public v a() {
            return new v(this.f40683a, this.f40684b, this.f40685c);
        }

        b b(p008a7.m mVar) {
            this.f40685c = mVar;
            return this;
        }

        b c(int i10) {
            this.f40684b = i10;
            return this;
        }

        public b d(long j10) {
            this.f40683a = j10;
            return this;
        }

        private b() {
        }
    }

    static b b() {
        return new b();
    }

    @Override // p008a7.k
    public int a() {
        return this.f40681b;
    }

    private v(long j10, int i10, p008a7.m mVar) {
        this.f40680a = j10;
        this.f40681b = i10;
        this.f40682c = mVar;
    }
}
