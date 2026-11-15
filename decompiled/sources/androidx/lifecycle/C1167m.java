package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1167m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1167m f10230a = new C1167m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f10231b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.m$a */
    public static final class a extends AbstractC1160f {
        @Override // androidx.lifecycle.AbstractC1160f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            F.f10152b.c(activity);
        }
    }

    private C1167m() {
    }

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f10231b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
