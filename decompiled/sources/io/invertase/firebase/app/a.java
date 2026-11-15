package io.invertase.firebase.app;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f45179a;

    public static Context a() {
        return f45179a;
    }

    public static void b(Context context) {
        Log.d("ReactNativeFirebaseApp", "received application context.");
        f45179a = context;
    }
}
