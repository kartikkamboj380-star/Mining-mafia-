package p192t1;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f49516a = new u();

    private u() {
    }

    public final String a(String str) {
        if (StringsKt.b0(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = (String) v.f49517a.get(lowerCase);
        return str2 == null ? w.a(lowerCase) : str2;
    }

    public final String b(String str) {
        if (StringsKt.b0(str)) {
            return null;
        }
        return a(StringsKt.I0(StringsKt.K0(StringsKt.S0(StringsKt.S0(str, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }
}
