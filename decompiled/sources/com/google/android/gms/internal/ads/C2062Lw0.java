package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2062Lw0 extends AbstractC1959Jw0 {
    /* synthetic */ C2062Lw0(byte[] bArr) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    public final void a(C2218Ow0 c2218Ow0, Thread thread) {
        c2218Ow0.f21733a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final void b(C2218Ow0 c2218Ow0, C2218Ow0 c2218Ow1) {
        c2218Ow0.f21734b = c2218Ow1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final boolean c(AbstractC2270Pw0 abstractC2270Pw0, C2218Ow0 c2218Ow0, C2218Ow0 c2218Ow1) {
        synchronized (abstractC2270Pw0) {
            try {
                if (abstractC2270Pw0.f22233c != c2218Ow0) {
                    return false;
                }
                abstractC2270Pw0.f22233c = c2218Ow1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final boolean d(AbstractC2270Pw0 abstractC2270Pw0, C1751Fw0 c1751Fw0, C1751Fw0 c1751Fw1) {
        synchronized (abstractC2270Pw0) {
            try {
                if (abstractC2270Pw0.f22232b != c1751Fw0) {
                    return false;
                }
                abstractC2270Pw0.f22232b = c1751Fw1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final C2218Ow0 e(AbstractC2270Pw0 abstractC2270Pw0, C2218Ow0 c2218Ow0) {
        C2218Ow0 c2218Ow1;
        synchronized (abstractC2270Pw0) {
            try {
                c2218Ow1 = abstractC2270Pw0.f22233c;
                if (c2218Ow1 != c2218Ow0) {
                    abstractC2270Pw0.f22233c = c2218Ow0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2218Ow1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final C1751Fw0 f(AbstractC2270Pw0 abstractC2270Pw0, C1751Fw0 c1751Fw0) {
        C1751Fw0 c1751Fw1;
        synchronized (abstractC2270Pw0) {
            try {
                c1751Fw1 = abstractC2270Pw0.f22232b;
                if (c1751Fw1 != c1751Fw0) {
                    abstractC2270Pw0.f22232b = c1751Fw0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1751Fw1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final boolean g(AbstractC2270Pw0 abstractC2270Pw0, Object obj, Object obj2) {
        synchronized (abstractC2270Pw0) {
            try {
                if (abstractC2270Pw0.f22231a != obj) {
                    return false;
                }
                abstractC2270Pw0.f22231a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
