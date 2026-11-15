package D2;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f439a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f454p;

    static {
        c cVar = new c("JPEG", "jpeg");
        f440b = cVar;
        c cVar2 = new c("PNG", "png");
        f441c = cVar2;
        c cVar3 = new c("GIF", "gif");
        f442d = cVar3;
        c cVar4 = new c("BMP", "bmp");
        f443e = cVar4;
        c cVar5 = new c("ICO", "ico");
        f444f = cVar5;
        c cVar6 = new c("WEBP_SIMPLE", "webp");
        f445g = cVar6;
        c cVar7 = new c("WEBP_LOSSLESS", "webp");
        f446h = cVar7;
        c cVar8 = new c("WEBP_EXTENDED", "webp");
        f447i = cVar8;
        c cVar9 = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
        f448j = cVar9;
        c cVar10 = new c("WEBP_ANIMATED", "webp");
        f449k = cVar10;
        c cVar11 = new c("HEIF", "heif");
        f450l = cVar11;
        f451m = new c("DNG", "dng");
        c cVar12 = new c("BINARY_XML", "xml");
        f452n = cVar12;
        c cVar13 = new c("AVIF", "avif");
        f453o = cVar13;
        f454p = CollectionsKt.l(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13);
    }

    private b() {
    }

    public static final boolean a(c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == f445g || imageFormat == f446h || imageFormat == f447i || imageFormat == f448j;
    }

    public static final boolean b(c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return a(imageFormat) || imageFormat == f449k;
    }
}
