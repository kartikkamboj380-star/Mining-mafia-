package p122m1;

import I8.InterfaceC0683n;
import c9.D;
import c9.InterfaceC1217e;
import c9.InterfaceC1218f;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p129m8.m;
import p129m8.n;

/* JADX INFO: loaded from: classes.dex */
final class c implements InterfaceC1218f, Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1217e f46350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0683n f46351b;

    public c(InterfaceC1217e interfaceC1217e, InterfaceC0683n interfaceC0683n) {
        this.f46350a = interfaceC1217e;
        this.f46351b = interfaceC0683n;
    }

    public void a(Throwable th) {
        try {
            this.f46350a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.f45918a;
    }

    @Override // c9.InterfaceC1218f
    public void onFailure(InterfaceC1217e interfaceC1217e, IOException iOException) {
        if (interfaceC1217e.Q()) {
            return;
        }
        InterfaceC0683n interfaceC0683n = this.f46351b;
        m.a aVar = m.f46450b;
        interfaceC0683n.resumeWith(m.b(n.a(iOException)));
    }

    @Override // c9.InterfaceC1218f
    public void onResponse(InterfaceC1217e interfaceC1217e, D d10) {
        this.f46351b.resumeWith(m.b(d10));
    }
}
