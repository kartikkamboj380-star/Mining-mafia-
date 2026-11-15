package W2;

import J2.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f6554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f6555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6556e;

    public f(int i10, boolean z9, d dVar, Integer num, boolean z10) {
        this.f6552a = i10;
        this.f6553b = z9;
        this.f6554c = dVar;
        this.f6555d = num;
        this.f6556e = z10;
    }

    private final c a(D2.c cVar, boolean z9) {
        d dVar = this.f6554c;
        if (dVar != null) {
            return dVar.createImageTranscoder(cVar, z9);
        }
        return null;
    }

    private final c b(D2.c cVar, boolean z9) {
        Integer num = this.f6555d;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return c(cVar, z9);
        }
        if (num == null || num.intValue() != 1) {
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return d(cVar, z9);
    }

    private final c c(D2.c cVar, boolean z9) {
        return com.facebook.imagepipeline.nativecode.e.a(this.f6552a, this.f6553b, this.f6556e).createImageTranscoder(cVar, z9);
    }

    private final c d(D2.c cVar, boolean z9) {
        c cVarCreateImageTranscoder = new h(this.f6552a).createImageTranscoder(cVar, z9);
        Intrinsics.checkNotNullExpressionValue(cVarCreateImageTranscoder, "createImageTranscoder(...)");
        return cVarCreateImageTranscoder;
    }

    @Override // W2.d
    public c createImageTranscoder(D2.c imageFormat, boolean z9) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        c cVarA = a(imageFormat, z9);
        if (cVarA == null) {
            cVarA = b(imageFormat, z9);
        }
        if (cVarA == null && z.a()) {
            cVarA = c(imageFormat, z9);
        }
        return cVarA == null ? d(imageFormat, z9) : cVarA;
    }
}
