package L8;

/* JADX INFO: renamed from: L8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0810k {
    public static final InterfaceC0804e a(InterfaceC0804e interfaceC0804e, int i10, K8.a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != K8.a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = K8.a.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        K8.a aVar2 = aVar;
        if (interfaceC0804e instanceof M8.p) {
            return M8.p.a.a((M8.p) interfaceC0804e, null, i11, aVar2, 1, null);
        }
        return new M8.h(interfaceC0804e, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ InterfaceC0804e b(InterfaceC0804e interfaceC0804e, int i10, K8.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = K8.a.SUSPEND;
        }
        return AbstractC0806g.c(interfaceC0804e, i10, aVar);
    }

    public static final InterfaceC0804e c(InterfaceC0804e interfaceC0804e) {
        return b(interfaceC0804e, -1, null, 2, null);
    }
}
