package A2;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42a = new a();

    private a() {
    }

    @Override // A2.c
    public Uri a(Uri uri, Object obj) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return uri;
    }
}
