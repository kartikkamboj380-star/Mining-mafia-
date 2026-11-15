package I8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N8.D f1719a = new N8.D("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N8.D f1720b = new N8.D("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final N8.D f1721c = new N8.D("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final N8.D f1722d = new N8.D("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final N8.D f1723e = new N8.D("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0676j0 f1724f = new C0676j0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C0676j0 f1725g = new C0676j0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC0701w0 ? new C0703x0((InterfaceC0701w0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC0701w0 interfaceC0701w0;
        C0703x0 c0703x0 = obj instanceof C0703x0 ? (C0703x0) obj : null;
        return (c0703x0 == null || (interfaceC0701w0 = c0703x0.f1820a) == null) ? obj : interfaceC0701w0;
    }
}
