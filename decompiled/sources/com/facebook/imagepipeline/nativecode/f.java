package com.facebook.imagepipeline.nativecode;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f13968a;

    public static synchronized void a() {
        if (!f13968a) {
            p035d4.a.d("native-imagetranscoder");
            f13968a = true;
        }
    }
}
