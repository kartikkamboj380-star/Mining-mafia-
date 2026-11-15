package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t extends z implements F8.j {
    public t() {
    }

    @Override // kotlin.jvm.internal.AbstractC7034d
    protected F8.b computeReflected() {
        return F.f(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public t(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
