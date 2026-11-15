package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4544nt0 implements InterfaceC4166kt0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC4166kt0 f31902d = C4418mt0.f31585a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5173st0 f31903a = new C5173st0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile InterfaceC4166kt0 f31904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f31905c;

    C4544nt0(InterfaceC4166kt0 interfaceC4166kt0) {
        this.f31904b = interfaceC4166kt0;
    }

    public final String toString() {
        Object string = this.f31904b;
        if (string == f31902d) {
            String strValueOf = String.valueOf(this.f31905c);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
    public final Object zza() {
        InterfaceC4166kt0 interfaceC4166kt0 = this.f31904b;
        InterfaceC4166kt0 interfaceC4166kt1 = f31902d;
        if (interfaceC4166kt0 != interfaceC4166kt1) {
            synchronized (this.f31903a) {
                try {
                    if (this.f31904b != interfaceC4166kt1) {
                        Object objZza = this.f31904b.zza();
                        this.f31905c = objZza;
                        this.f31904b = interfaceC4166kt1;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f31905c;
    }
}
