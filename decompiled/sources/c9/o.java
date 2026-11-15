package c9;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import r9.C7108k;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f12218a = new o();

    private o() {
    }

    public static final String a(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + C7108k.f48467d.f(username + ':' + password, charset).d();
    }
}
