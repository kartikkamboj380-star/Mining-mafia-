package p003a2;

import java.util.Locale;
import java.util.Map;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p129m8.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7263a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f7264b = E.j(q.a("mkv", "video/x-matroska"), q.a("glb", "model/gltf-binary"));

    private a() {
    }

    private final String a(String str) {
        int iE0 = StringsKt.e0(str, '.', 0, false, 6, null);
        if (iE0 < 0 || iE0 == str.length() - 1) {
            return null;
        }
        String strSubstring = str.substring(iE0 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String b(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String strA = f7263a.a(path);
        if (strA == null) {
            return null;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strA.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return null;
        }
        String strA2 = b.a(lowerCase);
        return strA2 == null ? (String) f7264b.get(lowerCase) : strA2;
    }

    public static final boolean c(String str) {
        if (str != null) {
            return StringsKt.J(str, "video/", false, 2, null);
        }
        return false;
    }
}
