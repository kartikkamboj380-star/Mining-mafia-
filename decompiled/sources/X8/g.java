package X8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements T8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f6785a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V8.d f6786b = new w("kotlin.Int", V8.c.C0097c.f6144a);

    private g() {
    }

    @Override // T8.b, T8.e, T8.a
    public V8.d a() {
        return f6786b;
    }

    @Override // T8.e
    public /* bridge */ /* synthetic */ void c(W8.f fVar, Object obj) {
        g(fVar, ((Number) obj).intValue());
    }

    @Override // T8.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer d(W8.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.e());
    }

    public void g(W8.f encoder, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.o(i10);
    }
}
