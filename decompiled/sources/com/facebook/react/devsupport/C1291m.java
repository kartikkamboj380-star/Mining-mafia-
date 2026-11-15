package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.devsupport.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1291m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14716d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f14717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WindowManager f14718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f14719c;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(Context context, Intent intent) {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || intent.resolveActivity(packageManager) == null) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(Context context) {
            return Settings.canDrawOverlays(context);
        }

        public final void d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (Settings.canDrawOverlays(context)) {
                return;
            }
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            Z1.a.I("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
            if (b(context, intent)) {
                context.startActivity(intent);
            }
        }

        private a() {
        }
    }

    public C1291m(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f14717a = reactContext;
        Object systemService = reactContext.getSystemService("window");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f14718b = (WindowManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z9, C1291m c1291m) {
        FrameLayout frameLayout;
        if (z9 && c1291m.f14719c == null) {
            if (!f14716d.c(c1291m.f14717a)) {
                Z1.a.b("ReactNative", "Wait for overlay permission to be set");
                return;
            } else {
                c1291m.f14719c = new V(c1291m.f14717a);
                c1291m.f14718b.addView(c1291m.f14719c, new WindowManager.LayoutParams(-1, -1, v0.f14802b, 24, -3));
                return;
            }
        }
        if (z9 || (frameLayout = c1291m.f14719c) == null) {
            return;
        }
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        c1291m.f14718b.removeView(c1291m.f14719c);
        c1291m.f14719c = null;
    }

    public final void b(final boolean z9) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.l
            @Override // java.lang.Runnable
            public final void run() {
                C1291m.c(z9, this);
            }
        });
    }
}
