package p132n1;

import I8.B0;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.InterfaceC1158d;
import androidx.lifecycle.r;
import kotlin.Unit;
import p169q8.b;
import p192t1.q;

/* JADX INFO: loaded from: classes.dex */
public final class k implements p, InterfaceC1158d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1164j f46646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B0 f46647b;

    public k(AbstractC1164j abstractC1164j, B0 b10) {
        this.f46646a = abstractC1164j;
        this.f46647b = b10;
    }

    @Override // p132n1.p
    public Object b(b bVar) throws Throwable {
        Object objA = q.a(this.f46646a, bVar);
        return objA == p179r8.b.e() ? objA : Unit.f45918a;
    }

    public void e() {
        B0.a.a(this.f46647b, null, 1, null);
    }

    @Override // p132n1.p
    public void h() {
        this.f46646a.d(this);
    }

    @Override // p132n1.p
    public void start() {
        this.f46646a.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC1158d
    public void w(r rVar) {
        e();
    }
}
