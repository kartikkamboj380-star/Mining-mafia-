package c9;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1220h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f12052b;

    public C1220h(String scheme, Map authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f12051a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f12052b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f12052b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return (String) this.f12052b.get("realm");
    }

    public final String c() {
        return this.f12051a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1220h)) {
            return false;
        }
        C1220h c1220h = (C1220h) obj;
        return Intrinsics.b(c1220h.f12051a, this.f12051a) && Intrinsics.b(c1220h.f12052b, this.f12052b);
    }

    public int hashCode() {
        return ((899 + this.f12051a.hashCode()) * 31) + this.f12052b.hashCode();
    }

    public String toString() {
        return this.f12051a + " authParams=" + this.f12052b;
    }
}
