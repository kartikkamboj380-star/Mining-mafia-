package X8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements T8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6777a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V8.d f6778b = new w("kotlin.Double", V8.c.b.f6143a);

    private d() {
    }

    @Override // T8.b, T8.e, T8.a
    public V8.d a() {
        return f6778b;
    }

    @Override // T8.e
    public /* bridge */ /* synthetic */ void c(W8.f fVar, Object obj) {
        g(fVar, ((Number) obj).doubleValue());
    }

    @Override // T8.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double d(W8.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.k());
    }

    public void g(W8.f encoder, double d10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.c(d10);
    }
}
