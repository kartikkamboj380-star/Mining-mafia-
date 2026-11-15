package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends r implements F8.g {
    public n() {
    }

    @Override // kotlin.jvm.internal.AbstractC7034d
    protected F8.b computeReflected() {
        return F.d(this);
    }

    @Override // F8.j
    public Object getDelegate() {
        return ((F8.g) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ F8.i.a getGetter() {
        mo164getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ F8.f getSetter() {
        mo165getSetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public n(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // F8.j
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public F8.j.a mo164getGetter() {
        ((F8.g) getReflected()).mo164getGetter();
        return null;
    }

    @Override // F8.g
    /* JADX INFO: renamed from: getSetter, reason: collision with other method in class */
    public F8.g.a mo165getSetter() {
        ((F8.g) getReflected()).mo165getSetter();
        return null;
    }
}
