package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ew0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1699Ew0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final C1699Ew0 f18609b = new C1699Ew0(new a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Throwable f18610a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ew0$a */
    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    C1699Ew0(Throwable th) {
        th.getClass();
        this.f18610a = th;
    }
}
