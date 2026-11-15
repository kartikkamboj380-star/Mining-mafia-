package p074h3;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f44757c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f44758d = {"", "_bold", "_italic", "_bold_italic"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f44759e = {".ttf", ".otf"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f44760f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f44761a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f44762b = new LinkedHashMap();

    /* JADX INFO: renamed from: h3.a$a, reason: collision with other inner class name */
    private static final class C0434a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f44763a = new SparseArray(4);

        public final Typeface a(int i10) {
            return (Typeface) this.f44763a.get(i10);
        }

        public final void b(int i10, Typeface typeface) {
            this.f44763a.put(i10, typeface);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Typeface b(String str, int i10, AssetManager assetManager) {
            if (assetManager != null) {
                String str2 = a.f44758d[i10];
                for (String str3 : a.f44759e) {
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
                        Intrinsics.checkNotNullExpressionValue(typefaceCreateFromAsset, "createFromAsset(...)");
                        return typefaceCreateFromAsset;
                    } catch (RuntimeException unused) {
                    }
                }
            }
            Typeface typefaceCreate = Typeface.create(str, i10);
            Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(...)");
            return typefaceCreate;
        }

        public final a c() {
            return a.f44760f;
        }

        private b() {
        }
    }

    public final Typeface d(String fontFamilyName, int i10, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        return f(fontFamilyName, new c(i10, 0, 2, null), assetManager);
    }

    public final Typeface e(String fontFamilyName, int i10, boolean z9, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        return f(fontFamilyName, new c(i10, z9), assetManager);
    }

    public final Typeface f(String fontFamilyName, c typefaceStyle, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(typefaceStyle, "typefaceStyle");
        if (this.f44762b.containsKey(fontFamilyName)) {
            return typefaceStyle.a((Typeface) this.f44762b.get(fontFamilyName));
        }
        Map map = this.f44761a;
        Object c0434a = map.get(fontFamilyName);
        if (c0434a == null) {
            c0434a = new C0434a();
            map.put(fontFamilyName, c0434a);
        }
        C0434a c0434a2 = (C0434a) c0434a;
        int iB = typefaceStyle.b();
        Typeface typefaceA = c0434a2.a(iB);
        if (typefaceA != null) {
            return typefaceA;
        }
        Typeface typefaceB = f44757c.b(fontFamilyName, iB, assetManager);
        c0434a2.b(iB, typefaceB);
        return typefaceB;
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0435a f44764c = new C0435a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f44765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f44766b;

        /* JADX INFO: renamed from: h3.a$c$a, reason: collision with other inner class name */
        public static final class C0435a {
            public /* synthetic */ C0435a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0435a() {
            }
        }

        public c(int i10, boolean z9) {
            this.f44765a = z9;
            this.f44766b = i10 == -1 ? CommonGatewayClient.CODE_400 : i10;
        }

        public final Typeface a(Typeface typeface) {
            if (Build.VERSION.SDK_INT < 28) {
                Typeface typefaceCreate = Typeface.create(typeface, b());
                Intrinsics.c(typefaceCreate);
                return typefaceCreate;
            }
            Typeface typefaceCreate2 = Typeface.create(typeface, this.f44766b, this.f44765a);
            Intrinsics.c(typefaceCreate2);
            return typefaceCreate2;
        }

        public final int b() {
            if (this.f44766b < 700) {
                return this.f44765a ? 2 : 0;
            }
            return this.f44765a ? 3 : 1;
        }

        public /* synthetic */ c(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? -1 : i11);
        }

        public c(int i10, int i11) {
            i10 = i10 == -1 ? 0 : i10;
            this.f44765a = (i10 & 2) != 0;
            this.f44766b = i11 == -1 ? (i10 & 1) != 0 ? 700 : CommonGatewayClient.CODE_400 : i11;
        }
    }
}
