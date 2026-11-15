package p022c1;

import kotlin.Unit;
import p192t1.E;
import r9.AbstractC7112o;
import r9.InterfaceC7107j;
import r9.L;
import r9.T;

/* JADX INFO: loaded from: classes.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f11790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC7112o f11791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AutoCloseable f11793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w.a f11794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f11795f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC7107j f11797h;

    public v(T t10, AbstractC7112o abstractC7112o, String str, AutoCloseable autoCloseable, w.a aVar) {
        this.f11790a = t10;
        this.f11791b = abstractC7112o;
        this.f11792c = str;
        this.f11793d = autoCloseable;
        this.f11794e = aVar;
    }

    private final void a() {
        if (this.f11796g) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // p022c1.w
    public T Z0() {
        return c();
    }

    public T c() {
        T t10;
        synchronized (this.f11795f) {
            a();
            t10 = this.f11790a;
        }
        return t10;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f11795f) {
            try {
                this.f11796g = true;
                InterfaceC7107j interfaceC7107j = this.f11797h;
                if (interfaceC7107j != null) {
                    E.h(interfaceC7107j);
                }
                AutoCloseable autoCloseable = this.f11793d;
                if (autoCloseable != null) {
                    E.i(autoCloseable);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p022c1.w
    public InterfaceC7107j e1() {
        synchronized (this.f11795f) {
            a();
            InterfaceC7107j interfaceC7107j = this.f11797h;
            if (interfaceC7107j != null) {
                return interfaceC7107j;
            }
            InterfaceC7107j interfaceC7107jD = L.d(getFileSystem().q(this.f11790a));
            this.f11797h = interfaceC7107jD;
            return interfaceC7107jD;
        }
    }

    @Override // p022c1.w
    public AbstractC7112o getFileSystem() {
        return this.f11791b;
    }

    @Override // p022c1.w
    public w.a getMetadata() {
        return this.f11794e;
    }

    public final String h() {
        return this.f11792c;
    }
}
