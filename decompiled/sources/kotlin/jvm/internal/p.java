package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p extends r implements F8.h {
    public p() {
    }

    @Override // kotlin.jvm.internal.AbstractC7034d
    protected F8.b computeReflected() {
        return F.e(this);
    }

    @Override // F8.k
    public Object getDelegate(Object obj) {
        return ((F8.h) getReflected()).getDelegate(obj);
    }

    @Override // F8.k
    /* JADX INFO: renamed from: getGetter */
    public F8.k.a mo166getGetter() {
        ((F8.h) getReflected()).mo166getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public p(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
