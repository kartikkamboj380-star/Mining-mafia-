package X8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements T8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T8.b f6796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V8.d f6797b;

    public m(T8.b serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f6796a = serializer;
        this.f6797b = new x(serializer.a());
    }

    @Override // T8.b, T8.e, T8.a
    public V8.d a() {
        return this.f6797b;
    }

    @Override // T8.e
    public void c(W8.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj == null) {
            encoder.i();
        } else {
            encoder.k();
            encoder.e(this.f6796a, obj);
        }
    }

    @Override // T8.a
    public Object d(W8.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.r() ? decoder.m(this.f6796a) : decoder.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m.class == obj.getClass() && Intrinsics.b(this.f6796a, ((m) obj).f6796a);
    }

    public int hashCode() {
        return this.f6796a.hashCode();
    }
}
