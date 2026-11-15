package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4259ld extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C2179Od f31303i = new C2179Od();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f31304h;

    public C4259ld(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11, Context context) {
        super(c2645Xc, "BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", c1966Ka, i10, 29);
        this.f31304h = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        this.f21301d.E0("E");
        Context context = this.f31304h;
        AtomicReference atomicReferenceA = f31303i.a(context.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                try {
                    if (atomicReferenceA.get() == null) {
                        atomicReferenceA.set((String) this.f21302e.invoke(null, context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String str = (String) atomicReferenceA.get();
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            c1966Ka.E0(AbstractC1760Gb.a(str.getBytes(), true));
        }
    }
}
