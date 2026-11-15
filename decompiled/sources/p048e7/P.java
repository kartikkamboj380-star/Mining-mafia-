package p048e7;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f43351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f43352b;

    public P(Z timeProvider, b0 uuidGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f43351a = timeProvider;
        this.f43352b = uuidGenerator;
    }

    private final String b() {
        String string = this.f43352b.next().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String lowerCase = StringsKt.F(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final J a(J j10) {
        String strA;
        String strB = b();
        if (j10 == null || (strA = j10.a()) == null) {
            strA = strB;
        }
        return new J(strB, strA, j10 != null ? j10.c() + 1 : 0, this.f43351a.a().b());
    }
}
