package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3646gk0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f28720h = new UUID(0, 0).toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f28725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final C3520fk0 f28726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final C3394ek0 f28727g;

    AbstractC3646gk0(Context context, String str, String str2, String str3) {
        this.f28726f = C3520fk0.a(context);
        this.f28727g = C3394ek0.a(context);
        this.f28721a = str;
        this.f28722b = str.concat("_3p");
        this.f28723c = str2;
        this.f28724d = str2.concat("_3p");
        this.f28725e = str3;
    }

    private final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length() + str3.length());
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            return UUID.nameUUIDFromBytes(sb.toString().getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f28725e;
        String str5 = str2 == null ? "null" : "not null";
        int length = str5.length();
        String str6 = str3 == null ? "null" : "not null";
        StringBuilder sb2 = new StringBuilder(length + 120 + str6.length());
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str5);
        sb2.append(", hashKey is ");
        sb2.append(str6);
        throw new IllegalArgumentException(sb2.toString());
    }

    final C3269dk0 a(String str, String str2, long j10, boolean z9) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f28720h)) {
                    String strE = e(true);
                    String strC = this.f28726f.c("paid_3p_hash_key", null);
                    if (strE != null && strC != null && !strE.equals(h(str, str2, strC))) {
                        return b(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new C3269dk0();
        }
        boolean z10 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f28725e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jD = d(z10);
        if (jD != -1) {
            if (jCurrentTimeMillis < jD) {
                this.f28726f.b(z10 ? this.f28724d : this.f28723c, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jD + j10) {
                return b(str, str2);
            }
        }
        String strE2 = e(z10);
        return (strE2 != null || z9) ? new C3269dk0(strE2, d(z10)) : b(str, str2);
    }

    final C3269dk0 b(String str, String str2) throws IOException {
        if (str == null) {
            return f(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f28726f.b("paid_3p_hash_key", string);
        return f(h(str, str2, string), true);
    }

    final void c(boolean z9) throws IOException {
        String str = z9 ? this.f28724d : this.f28723c;
        C3520fk0 c3520fk0 = this.f28726f;
        c3520fk0.f(str);
        c3520fk0.f(z9 ? this.f28722b : this.f28721a);
    }

    final long d(boolean z9) {
        return this.f28726f.d(z9 ? this.f28724d : this.f28723c, -1L);
    }

    final String e(boolean z9) {
        return this.f28726f.c(z9 ? this.f28722b : this.f28721a, null);
    }

    final C3269dk0 f(String str, boolean z9) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f28725e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        C3520fk0 c3520fk0 = this.f28726f;
        c3520fk0.b(z9 ? this.f28724d : this.f28723c, Long.valueOf(jCurrentTimeMillis));
        c3520fk0.b(z9 ? this.f28722b : this.f28721a, str);
        return new C3269dk0(str, jCurrentTimeMillis);
    }

    final boolean g(boolean z9) {
        return this.f28726f.g(this.f28721a);
    }
}
