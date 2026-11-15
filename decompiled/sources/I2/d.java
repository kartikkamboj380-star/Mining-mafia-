package I2;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final d f1584m = b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f1592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bitmap.Config f1593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M2.c f1594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ColorSpace f1595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f1596l;

    public d(e eVar) {
        this.f1585a = eVar.l();
        this.f1586b = eVar.k();
        this.f1587c = eVar.h();
        this.f1588d = eVar.n();
        this.f1589e = eVar.m();
        this.f1590f = eVar.g();
        this.f1591g = eVar.j();
        this.f1592h = eVar.c();
        this.f1593i = eVar.b();
        this.f1594j = eVar.f();
        eVar.d();
        this.f1595k = eVar.e();
        this.f1596l = eVar.i();
    }

    public static d a() {
        return f1584m;
    }

    public static e b() {
        return new e();
    }

    protected Y1.i.a c() {
        return Y1.i.b(this).a("minDecodeIntervalMs", this.f1585a).a("maxDimensionPx", this.f1586b).c("decodePreviewFrame", this.f1587c).c("useLastFrameForPreview", this.f1588d).c("useEncodedImageForPreview", this.f1589e).c("decodeAllFrames", this.f1590f).c("forceStaticImage", this.f1591g).b("bitmapConfigName", this.f1592h.name()).b("animatedBitmapConfigName", this.f1593i.name()).b("customImageDecoder", this.f1594j).b("bitmapTransformation", null).b("colorSpace", this.f1595k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1585a != dVar.f1585a || this.f1586b != dVar.f1586b || this.f1587c != dVar.f1587c || this.f1588d != dVar.f1588d || this.f1589e != dVar.f1589e || this.f1590f != dVar.f1590f || this.f1591g != dVar.f1591g) {
            return false;
        }
        boolean z9 = this.f1596l;
        if (z9 || this.f1592h == dVar.f1592h) {
            return (z9 || this.f1593i == dVar.f1593i) && this.f1594j == dVar.f1594j && this.f1595k == dVar.f1595k;
        }
        return false;
    }

    public int hashCode() {
        int iOrdinal = (((((((((((this.f1585a * 31) + this.f1586b) * 31) + (this.f1587c ? 1 : 0)) * 31) + (this.f1588d ? 1 : 0)) * 31) + (this.f1589e ? 1 : 0)) * 31) + (this.f1590f ? 1 : 0)) * 31) + (this.f1591g ? 1 : 0);
        if (!this.f1596l) {
            iOrdinal = (iOrdinal * 31) + this.f1592h.ordinal();
        }
        if (!this.f1596l) {
            int i10 = iOrdinal * 31;
            Bitmap.Config config = this.f1593i;
            iOrdinal = i10 + (config != null ? config.ordinal() : 0);
        }
        int i11 = iOrdinal * 31;
        M2.c cVar = this.f1594j;
        int iHashCode = (i11 + (cVar != null ? cVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f1595k;
        return iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}
