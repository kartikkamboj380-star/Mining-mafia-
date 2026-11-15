package X8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements T8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f6775a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V8.d f6776b = new w("kotlin.Boolean", V8.c.a.f6142a);

    private b() {
    }

    @Override // T8.b, T8.e, T8.a
    public V8.d a() {
        return f6776b;
    }

    @Override // T8.e
    public /* bridge */ /* synthetic */ void c(W8.f fVar, Object obj) {
        g(fVar, ((Boolean) obj).booleanValue());
    }

    @Override // T8.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean d(W8.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.l());
    }

    public void g(W8.f encoder, boolean z9) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.j(z9);
    }
}
