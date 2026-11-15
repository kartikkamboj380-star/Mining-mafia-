package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f40265d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f40268c;

    private g0(String str, String str2) {
        this.f40266a = d(str2, str);
        this.f40267b = str;
        this.f40268c = str + "!" + str2;
    }

    static g0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new g0(strArrSplit[0], strArrSplit[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f40265d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static g0 f(String str) {
        return new g0("S", str);
    }

    public static g0 g(String str) {
        return new g0("U", str);
    }

    public String b() {
        return this.f40267b;
    }

    public String c() {
        return this.f40266a;
    }

    public String e() {
        return this.f40268c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f40266a.equals(g0Var.f40266a) && this.f40267b.equals(g0Var.f40267b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f40267b, this.f40266a);
    }
}
