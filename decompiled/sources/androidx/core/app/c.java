package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    private static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ActivityOptions f9112a;

        a(ActivityOptions activityOptions) {
            this.f9112a = activityOptions;
        }

        @Override // androidx.core.app.c
        public Bundle b() {
            return this.f9112a.toBundle();
        }
    }

    protected c() {
    }

    public static c a(Context context, int i10, int i11) {
        return new a(ActivityOptions.makeCustomAnimation(context, i10, i11));
    }

    public abstract Bundle b();
}
