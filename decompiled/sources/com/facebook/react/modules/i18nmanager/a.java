package com.facebook.react.modules.i18nmanager;

import M.p;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0342a f14969a = new C0342a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f14970b = new a();

    /* JADX INFO: renamed from: com.facebook.react.modules.i18nmanager.a$a, reason: collision with other inner class name */
    public static final class C0342a {
        public /* synthetic */ C0342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f14970b;
        }

        private C0342a() {
        }
    }

    private a() {
    }

    private final boolean c(Context context) {
        return (context.getApplicationInfo().flags & 4194304) != 0;
    }

    public static final a f() {
        return f14969a.a();
    }

    private final boolean g() {
        return p.a(Locale.getDefault()) == 1;
    }

    private final boolean h(Context context, String str, boolean z9) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z9);
    }

    private final boolean j(Context context) {
        return h(context, "RCTI18nUtil_allowRTL", true);
    }

    private final boolean k(Context context) {
        return h(context, "RCTI18nUtil_forceRTL", false) || StringsKt.y(System.getProperty("FORCE_RTL_FOR_TESTING", "false"), "true", true);
    }

    private final void l(Context context, String str, boolean z9) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        editorEdit.putBoolean(str, z9);
        editorEdit.apply();
    }

    public final void b(Context context, boolean z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        l(context, "RCTI18nUtil_allowRTL", z9);
    }

    public final boolean d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return h(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public final void e(Context context, boolean z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        l(context, "RCTI18nUtil_forceRTL", z9);
    }

    public final boolean i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!c(context)) {
            return false;
        }
        if (k(context)) {
            return true;
        }
        return j(context) && g();
    }

    public final void m(Context context, boolean z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        l(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z9);
    }
}
