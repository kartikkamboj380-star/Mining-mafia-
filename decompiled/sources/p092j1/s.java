package p092j1;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p129m8.a;
import p169q8.b;
import r9.AbstractC7112o;
import r9.InterfaceC7106i;
import r9.InterfaceC7107j;
import r9.L;
import r9.T;

/* JADX INFO: loaded from: classes.dex */
final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7107j f45479a;

    private /* synthetic */ s(InterfaceC7107j interfaceC7107j) {
        this.f45479a = interfaceC7107j;
    }

    public static Object G(InterfaceC7107j interfaceC7107j, AbstractC7112o abstractC7112o, T t10, b bVar) throws Throwable {
        InterfaceC7106i interfaceC7106iC = L.c(abstractC7112o.p(t10, false));
        try {
            kotlin.coroutines.jvm.internal.b.d(interfaceC7107j.s0(interfaceC7106iC));
            if (interfaceC7106iC != null) {
                try {
                    interfaceC7106iC.close();
                } catch (Throwable th) {
                    th = th;
                }
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC7106iC != null) {
                try {
                    interfaceC7106iC.close();
                } catch (Throwable th3) {
                    a.a(th, th3);
                }
            }
        }
        if (th == null) {
            return Unit.f45918a;
        }
        throw th;
    }

    public static final /* synthetic */ s a(InterfaceC7107j interfaceC7107j) {
        return new s(interfaceC7107j);
    }

    public static void c(InterfaceC7107j interfaceC7107j) {
        interfaceC7107j.close();
    }

    public static boolean j(InterfaceC7107j interfaceC7107j, Object obj) {
        return (obj instanceof s) && Intrinsics.b(interfaceC7107j, ((s) obj).w());
    }

    public static int n(InterfaceC7107j interfaceC7107j) {
        return interfaceC7107j.hashCode();
    }

    public static String v(InterfaceC7107j interfaceC7107j) {
        return "SourceResponseBody(source=" + interfaceC7107j + ')';
    }

    public static Object x(InterfaceC7107j interfaceC7107j, InterfaceC7106i interfaceC7106i, b bVar) {
        interfaceC7107j.s0(interfaceC7106i);
        return Unit.f45918a;
    }

    @Override // p092j1.r
    public Object P0(AbstractC7112o abstractC7112o, T t10, b bVar) {
        return G(this.f45479a, abstractC7112o, t10, bVar);
    }

    @Override // p092j1.r
    public Object T0(InterfaceC7106i interfaceC7106i, b bVar) {
        return x(this.f45479a, interfaceC7106i, bVar);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        c(this.f45479a);
    }

    public boolean equals(Object obj) {
        return j(this.f45479a, obj);
    }

    public int hashCode() {
        return n(this.f45479a);
    }

    public String toString() {
        return v(this.f45479a);
    }

    public final /* synthetic */ InterfaceC7107j w() {
        return this.f45479a;
    }

    public static InterfaceC7107j h(InterfaceC7107j interfaceC7107j) {
        return interfaceC7107j;
    }
}
