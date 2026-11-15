package androidx.room;

import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z implements A0.h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f10940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f10941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A0.h.c f10942d;

    public z(String str, File file, Callable callable, A0.h.c mDelegate) {
        Intrinsics.checkNotNullParameter(mDelegate, "mDelegate");
        this.f10939a = str;
        this.f10940b = file;
        this.f10941c = callable;
        this.f10942d = mDelegate;
    }

    @Override // A0.h.c
    public A0.h a(A0.h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new y(configuration.f25a, this.f10939a, this.f10940b, this.f10941c, configuration.f27c.f23a, this.f10942d.a(configuration));
    }
}
