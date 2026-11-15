package com.facebook.react.devsupport;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.react.AbstractC1315p;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.devsupport.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1295q implements p124m3.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14743d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f14744e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f14745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f14746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PopupWindow f14747c;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1295q(l0 reactInstanceDevHelper) {
        Intrinsics.checkNotNullParameter(reactInstanceDevHelper, "reactInstanceDevHelper");
        this.f14745a = reactInstanceDevHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C1295q c1295q) {
        c1295q.h();
    }

    private final void h() {
        PopupWindow popupWindow = this.f14747c;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.f14747c = null;
            this.f14746b = null;
        }
    }

    private final void i(String str) {
        PopupWindow popupWindow = this.f14747c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity activityH = this.f14745a.h();
            if (activityH == null) {
                Z1.a.m("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            try {
                Rect rect = new Rect();
                activityH.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i10 = rect.top;
                Object systemService = activityH.getSystemService("layout_inflater");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(AbstractC1315p.f15069b, (ViewGroup) null);
                Intrinsics.d(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewInflate;
                textView.setText(str);
                PopupWindow popupWindow2 = new PopupWindow(textView, -1, -2);
                popupWindow2.setTouchable(false);
                popupWindow2.showAtLocation(activityH.getWindow().getDecorView(), 0, 0, i10);
                this.f14746b = textView;
                this.f14747c = popupWindow2;
            } catch (WindowManager.BadTokenException unused) {
                Z1.a.m("ReactNative", "Unable to display loading message because react activity isn't active, message: " + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C1295q c1295q, String str) {
        c1295q.i(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Integer num, Integer num2, C1295q c1295q, String str) {
        String str2;
        if (num == null || num2 == null || num2.intValue() <= 0) {
            str2 = "";
        } else {
            kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f45976a;
            str2 = String.format(Locale.getDefault(), " %.1f%%", Arrays.copyOf(new Object[]{Float.valueOf((num.intValue() / num2.intValue()) * 100)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        TextView textView = c1295q.f14746b;
        if (textView != null) {
            if (str == null) {
                str = "Loading";
            }
            textView.setText(str + str2 + "…");
        }
    }

    @Override // p124m3.c
    public void a(final String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (f14744e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.o
                @Override // java.lang.Runnable
                public final void run() {
                    C1295q.j(this.f14723a, message);
                }
            });
        }
    }

    @Override // p124m3.c
    public void b(final String str, final Integer num, final Integer num2) {
        if (f14744e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.p
                @Override // java.lang.Runnable
                public final void run() {
                    C1295q.k(num, num2, this, str);
                }
            });
        }
    }

    @Override // p124m3.c
    public void d() {
        if (f14744e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.n
                @Override // java.lang.Runnable
                public final void run() {
                    C1295q.g(this.f14721a);
                }
            });
        }
    }
}
