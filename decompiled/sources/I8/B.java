package I8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0681m f1695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p259z8.n f1696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f1698e;

    public B(Object obj, InterfaceC0681m interfaceC0681m, p259z8.n nVar, Object obj2, Throwable th) {
        this.f1694a = obj;
        this.f1695b = interfaceC0681m;
        this.f1696c = nVar;
        this.f1697d = obj2;
        this.f1698e = th;
    }

    public static /* synthetic */ B b(B b10, Object obj, InterfaceC0681m interfaceC0681m, p259z8.n nVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = b10.f1694a;
        }
        if ((i10 & 2) != 0) {
            interfaceC0681m = b10.f1695b;
        }
        if ((i10 & 4) != 0) {
            nVar = b10.f1696c;
        }
        if ((i10 & 8) != 0) {
            obj2 = b10.f1697d;
        }
        if ((i10 & 16) != 0) {
            th = b10.f1698e;
        }
        Throwable th2 = th;
        p259z8.n nVar2 = nVar;
        return b10.a(obj, interfaceC0681m, nVar2, obj2, th2);
    }

    public final B a(Object obj, InterfaceC0681m interfaceC0681m, p259z8.n nVar, Object obj2, Throwable th) {
        return new B(obj, interfaceC0681m, nVar, obj2, th);
    }

    public final boolean c() {
        return this.f1698e != null;
    }

    public final void d(C0687p c0687p, Throwable th) {
        InterfaceC0681m interfaceC0681m = this.f1695b;
        if (interfaceC0681m != null) {
            c0687p.p(interfaceC0681m, th);
        }
        p259z8.n nVar = this.f1696c;
        if (nVar != null) {
            c0687p.q(nVar, th, this.f1694a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return Intrinsics.b(this.f1694a, b10.f1694a) && Intrinsics.b(this.f1695b, b10.f1695b) && Intrinsics.b(this.f1696c, b10.f1696c) && Intrinsics.b(this.f1697d, b10.f1697d) && Intrinsics.b(this.f1698e, b10.f1698e);
    }

    public int hashCode() {
        Object obj = this.f1694a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0681m interfaceC0681m = this.f1695b;
        int iHashCode2 = (iHashCode + (interfaceC0681m == null ? 0 : interfaceC0681m.hashCode())) * 31;
        p259z8.n nVar = this.f1696c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj2 = this.f1697d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1698e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f1694a + ", cancelHandler=" + this.f1695b + ", onCancellation=" + this.f1696c + ", idempotentResume=" + this.f1697d + ", cancelCause=" + this.f1698e + ')';
    }

    public /* synthetic */ B(Object obj, InterfaceC0681m interfaceC0681m, p259z8.n nVar, Object obj2, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC0681m, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
