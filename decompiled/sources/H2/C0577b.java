package H2;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: H2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0577b implements S1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I2.g f1127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I2.h f1128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I2.d f1129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S1.d f1130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f1131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f1132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f1134i;

    public C0577b(String sourceString, I2.g gVar, I2.h rotationOptions, I2.d imageDecodeOptions, S1.d dVar, String str) {
        Intrinsics.checkNotNullParameter(sourceString, "sourceString");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(imageDecodeOptions, "imageDecodeOptions");
        this.f1126a = sourceString;
        this.f1127b = gVar;
        this.f1128c = rotationOptions;
        this.f1129d = imageDecodeOptions;
        this.f1130e = dVar;
        this.f1131f = str;
        this.f1133h = (((((((((sourceString.hashCode() * 31) + (gVar != null ? gVar.hashCode() : 0)) * 31) + rotationOptions.hashCode()) * 31) + imageDecodeOptions.hashCode()) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        this.f1134i = RealtimeSinceBootClock.get().now();
    }

    @Override // S1.d
    public String a() {
        return this.f1126a;
    }

    @Override // S1.d
    public boolean b(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String strA = a();
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.P(strA, string, false, 2, null);
    }

    @Override // S1.d
    public boolean c() {
        return false;
    }

    public final void d(Object obj) {
        this.f1132g = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(C0577b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C0577b c0577b = (C0577b) obj;
        return Intrinsics.b(this.f1126a, c0577b.f1126a) && Intrinsics.b(this.f1127b, c0577b.f1127b) && Intrinsics.b(this.f1128c, c0577b.f1128c) && Intrinsics.b(this.f1129d, c0577b.f1129d) && Intrinsics.b(this.f1130e, c0577b.f1130e) && Intrinsics.b(this.f1131f, c0577b.f1131f);
    }

    public int hashCode() {
        return this.f1133h;
    }

    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f1126a + ", resizeOptions=" + this.f1127b + ", rotationOptions=" + this.f1128c + ", imageDecodeOptions=" + this.f1129d + ", postprocessorCacheKey=" + this.f1130e + ", postprocessorName=" + this.f1131f + ")";
    }
}
