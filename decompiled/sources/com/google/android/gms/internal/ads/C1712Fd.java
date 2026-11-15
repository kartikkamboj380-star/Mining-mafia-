package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1712Fd extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final StackTraceElement[] f18799h;

    public C1712Fd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(c2645Xc, "TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", c1966Ka, i10, 45);
        this.f18799h = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.f18799h;
        if (stackTraceElementArr != null) {
            C2177Oc c2177Oc = new C2177Oc((String) this.f21302e.invoke(null, stackTraceElementArr));
            C1966Ka c1966Ka = this.f21301d;
            synchronized (c1966Ka) {
                try {
                    c1966Ka.C(c2177Oc.f21606b.longValue());
                    if (c2177Oc.f21607c.booleanValue()) {
                        c1966Ka.m0(true != c2177Oc.f21608d.booleanValue() ? 2 : 1);
                    } else {
                        c1966Ka.m0(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
