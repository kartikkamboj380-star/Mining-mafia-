package X8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements T8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f6821a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V8.d f6822b = new w("kotlin.String", V8.c.e.f6146a);

    private z() {
    }

    @Override // T8.b, T8.e, T8.a
    public V8.d a() {
        return f6822b;
    }

    @Override // T8.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String d(W8.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.o();
    }

    @Override // T8.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(W8.f encoder, String value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.r(value);
    }
}
