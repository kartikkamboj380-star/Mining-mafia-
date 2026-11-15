package X8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements T8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f6788a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V8.d f6789b = new w("kotlin.Long", V8.c.d.f6145a);

    private j() {
    }

    @Override // T8.b, T8.e, T8.a
    public V8.d a() {
        return f6789b;
    }

    @Override // T8.e
    public /* bridge */ /* synthetic */ void c(W8.f fVar, Object obj) {
        g(fVar, ((Number) obj).longValue());
    }

    @Override // T8.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long d(W8.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.g());
    }

    public void g(W8.f encoder, long j10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(j10);
    }
}
