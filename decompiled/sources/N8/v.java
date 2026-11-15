package N8;

import I8.InterfaceC0670g0;
import I8.InterfaceC0683n;
import I8.V;
import I8.Y;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends I8.K implements Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Y f3730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I8.K f3731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3732d;

    /* JADX WARN: Multi-variable type inference failed */
    public v(I8.K k10, String str) {
        Y y9 = k10 instanceof Y ? (Y) k10 : null;
        this.f3730b = y9 == null ? V.a() : y9;
        this.f3731c = k10;
        this.f3732d = str;
    }

    @Override // I8.Y
    public void M(long j10, InterfaceC0683n interfaceC0683n) {
        this.f3730b.M(j10, interfaceC0683n);
    }

    @Override // I8.Y
    public InterfaceC0670g0 R(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f3730b.R(j10, runnable, coroutineContext);
    }

    @Override // I8.K
    public void l1(CoroutineContext coroutineContext, Runnable runnable) {
        this.f3731c.l1(coroutineContext, runnable);
    }

    @Override // I8.K
    public void m1(CoroutineContext coroutineContext, Runnable runnable) {
        this.f3731c.m1(coroutineContext, runnable);
    }

    @Override // I8.K
    public boolean n1(CoroutineContext coroutineContext) {
        return this.f3731c.n1(coroutineContext);
    }

    @Override // I8.K
    public String toString() {
        return this.f3732d;
    }
}
