package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v extends z implements F8.k {
    public v() {
    }

    @Override // kotlin.jvm.internal.AbstractC7034d
    protected F8.b computeReflected() {
        return F.g(this);
    }

    @Override // F8.k
    public Object getDelegate(Object obj) {
        return ((F8.k) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ F8.i.a getGetter() {
        mo166getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public v(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // F8.k
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public F8.k.a mo166getGetter() {
        ((F8.k) getReflected()).mo166getGetter();
        return null;
    }
}
