package I8;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
final class T0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f1744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0683n f1745b;

    public T0(K k10, InterfaceC0683n interfaceC0683n) {
        this.f1744a = k10;
        this.f1745b = interfaceC0683n;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1745b.e(this.f1744a, Unit.f45918a);
    }
}
