package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5014rd extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile String f32995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f32996i = new Object();

    public C5014rd(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11) {
        super(c2645Xc, "r3bKg5w0nz7IjZtWNMiPOsvB0VlHAYkN7VnU6Stu7HeDf3C1E2T8lLdAdxjkOACh", "v3VfjQtThhKzeCR8emHmzxqnaN2SnNbSp/OAufPeGKA=", c1966Ka, i10, 82);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        if (f32995h == null) {
            synchronized (f32996i) {
                try {
                    if (f32995h == null) {
                        f32995h = (String) this.f21302e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            c1966Ka.a0(f32995h);
        }
    }
}
