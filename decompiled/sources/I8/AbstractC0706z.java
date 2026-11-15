package I8;

/* JADX INFO: renamed from: I8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0706z {
    public static final InterfaceC0702x a(B0 b10) {
        return new C0704y(b10);
    }

    public static /* synthetic */ InterfaceC0702x b(B0 b10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b10 = null;
        }
        return a(b10);
    }

    public static final boolean c(InterfaceC0702x interfaceC0702x, Object obj) {
        Throwable thD = p129m8.m.d(obj);
        return thD == null ? interfaceC0702x.X(obj) : interfaceC0702x.W(thD);
    }
}
