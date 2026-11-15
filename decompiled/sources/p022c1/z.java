package p022c1;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p192t1.E;
import r9.AbstractC7112o;
import r9.InterfaceC7107j;
import r9.L;
import r9.T;

/* JADX INFO: loaded from: classes.dex */
public final class z implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC7112o f11801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.a f11802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f11803c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC7107j f11805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private T f11806f;

    public z(InterfaceC7107j interfaceC7107j, AbstractC7112o abstractC7112o, w.a aVar) {
        this.f11801a = abstractC7112o;
        this.f11802b = aVar;
        this.f11805e = interfaceC7107j;
    }

    private final void a() {
        if (this.f11804d) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // p022c1.w
    public T Z0() {
        T t10;
        synchronized (this.f11803c) {
            a();
            t10 = this.f11806f;
        }
        return t10;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f11803c) {
            try {
                this.f11804d = true;
                InterfaceC7107j interfaceC7107j = this.f11805e;
                if (interfaceC7107j != null) {
                    E.h(interfaceC7107j);
                }
                T t10 = this.f11806f;
                if (t10 != null) {
                    getFileSystem().h(t10);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p022c1.w
    public InterfaceC7107j e1() {
        synchronized (this.f11803c) {
            a();
            InterfaceC7107j interfaceC7107j = this.f11805e;
            if (interfaceC7107j != null) {
                return interfaceC7107j;
            }
            AbstractC7112o fileSystem = getFileSystem();
            T t10 = this.f11806f;
            Intrinsics.c(t10);
            InterfaceC7107j interfaceC7107jD = L.d(fileSystem.q(t10));
            this.f11805e = interfaceC7107jD;
            return interfaceC7107jD;
        }
    }

    @Override // p022c1.w
    public AbstractC7112o getFileSystem() {
        return this.f11801a;
    }

    @Override // p022c1.w
    public w.a getMetadata() {
        return this.f11802b;
    }
}
