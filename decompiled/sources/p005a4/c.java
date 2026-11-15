package p005a4;

import E.h;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7277a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f7278b = new HashMap();

    private c() {
    }

    private final int a(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        f7278b.put(str, Integer.valueOf(identifier));
        return identifier;
    }

    public static final synchronized void b() {
        f7278b.clear();
    }

    public static final c c() {
        return f7277a;
    }

    public static final Drawable d(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iE = e(context, str);
        if (iE > 0) {
            return h.f(context.getResources(), iE, null);
        }
        return null;
    }

    public static final int e(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null || str.length() == 0) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strF = StringsKt.F(lowerCase, "-", "_", false, 4, null);
        try {
            return Integer.parseInt(strF);
        } catch (NumberFormatException unused) {
            synchronized (f7277a) {
                try {
                    Integer num = (Integer) f7278b.get(strF);
                    return num != null ? num.intValue() : f7277a.a(context, strF);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final Uri f(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iE = e(context, str);
        if (iE > 0) {
            Uri uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(iE)).build();
            Intrinsics.c(uriBuild);
            return uriBuild;
        }
        Uri uri = Uri.EMPTY;
        Intrinsics.c(uri);
        return uri;
    }
}
