package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends z implements F8.l {
    public x() {
    }

    @Override // kotlin.jvm.internal.AbstractC7034d
    protected F8.b computeReflected() {
        return F.h(this);
    }

    @Override // F8.l
    public F8.l.a getGetter() {
        ((F8.l) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return l(obj, obj2);
    }

    public x(Class cls, String str, String str2, int i10) {
        super(AbstractC7034d.NO_RECEIVER, cls, str, str2, i10);
    }
}
