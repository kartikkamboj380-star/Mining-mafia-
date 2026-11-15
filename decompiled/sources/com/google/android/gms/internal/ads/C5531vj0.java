package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5531vj0 implements W.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5531vj0 f34151a = new C5531vj0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C5027rj0 f34152b;

    static {
        C5027rj0 c5027rj0G0 = C5027rj0.g0();
        Intrinsics.checkNotNullExpressionValue(c5027rj0G0, "getDefaultInstance(...)");
        f34152b = c5027rj0G0;
    }

    private C5531vj0() {
    }

    @Override // W.E
    public final /* synthetic */ Object getDefaultValue() {
        return f34152b;
    }

    @Override // W.E
    public final Object readFrom(InputStream inputStream, p169q8.b bVar) {
        try {
            C5027rj0 c5027rj0F0 = C5027rj0.f0(inputStream);
            Intrinsics.c(c5027rj0F0);
            return c5027rj0F0;
        } catch (Exception unused) {
            return f34152b;
        }
    }

    @Override // W.E
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, p169q8.b bVar) {
        ((C5027rj0) obj).c(outputStream);
        return Unit.f45918a;
    }
}
