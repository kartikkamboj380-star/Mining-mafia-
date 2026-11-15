package C8;

import F8.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f415a;

    public b(Object obj) {
        this.f415a = obj;
    }

    @Override // C8.d, C8.c
    public Object a(Object obj, i property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f415a;
    }

    @Override // C8.d
    public void b(Object obj, i property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.f415a;
        if (d(property, obj3, obj2)) {
            this.f415a = obj2;
            c(property, obj3, obj2);
        }
    }

    protected abstract void c(i iVar, Object obj, Object obj2);

    protected boolean d(i property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f415a + ')';
    }
}
