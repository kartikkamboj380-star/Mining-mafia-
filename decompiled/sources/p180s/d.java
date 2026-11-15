package p180s;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f48557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f48558b;

    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    private static class c {
        static void a(ActivityOptions activityOptions, boolean z9) {
            activityOptions.setShareIdentityEnabled(z9);
        }
    }

    /* JADX INFO: renamed from: s.d$d, reason: collision with other inner class name */
    private static class C0529d {
        static void a(ActivityOptions activityOptions, boolean z9) {
            activityOptions.setAllowPassThroughOnTouchOutside(z9);
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f48557a = intent;
        this.f48558b = bundle;
    }

    public static boolean a(Intent intent) {
        return !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false);
    }

    public void b(Context context, Uri uri) {
        this.f48557a.setData(uri);
        C.b.n(context, this.f48557a, this.f48558b);
    }

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList f48561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ActivityOptions f48562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList f48563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SparseArray f48564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f48565g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f48568j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ArrayList f48569k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f48559a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p180s.a.C0526a f48560b = new p180s.a.C0526a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f48566h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f48567i = true;

        public e() {
        }

        private void c() {
            if (this.f48562d == null) {
                this.f48562d = a.a();
            }
            C0529d.a(this.f48562d, d.a(this.f48559a));
        }

        private void g() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f48559a.hasExtra("com.android.browser.headers") ? this.f48559a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f48559a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void m(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f48559a.putExtras(bundle);
        }

        private void n() {
            if (this.f48562d == null) {
                this.f48562d = a.a();
            }
            c.a(this.f48562d, this.f48568j);
        }

        public e a() {
            o(1);
            return this;
        }

        public d b() {
            if (!this.f48559a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f48561c;
            if (arrayList != null) {
                this.f48559a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f48563e;
            if (arrayList2 != null) {
                this.f48559a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f48559a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f48567i);
            this.f48559a.putExtras(this.f48560b.a().a());
            Bundle bundle = this.f48565g;
            if (bundle != null) {
                this.f48559a.putExtras(bundle);
            }
            if (this.f48564f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f48564f);
                this.f48559a.putExtras(bundle2);
            }
            this.f48559a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f48566h);
            ArrayList arrayList3 = this.f48569k;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f48559a.putParcelableArrayListExtra("androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS", this.f48569k);
            }
            int i10 = Build.VERSION.SDK_INT;
            g();
            if (i10 >= 34) {
                n();
            }
            if (i10 >= 36) {
                c();
            }
            ActivityOptions activityOptions = this.f48562d;
            return new d(this.f48559a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public e d(boolean z9) {
            this.f48559a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", !z9);
            return this;
        }

        public e e(Bitmap bitmap) {
            this.f48559a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
            return this;
        }

        public e f(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f48559a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
            return this;
        }

        public e h(boolean z9) {
            this.f48559a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", !z9);
            return this;
        }

        public e i(Context context, int i10, int i11) {
            this.f48559a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", androidx.core.app.c.a(context, i10, i11).b());
            return this;
        }

        public e j(int i10) {
            return k(i10, 0);
        }

        public e k(int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f48559a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
            this.f48559a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
            return this;
        }

        public e l(f fVar) {
            this.f48559a.setPackage(fVar.e().getPackageName());
            m(fVar.d(), fVar.f());
            return this;
        }

        public e o(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f48566h = i10;
            if (i10 == 1) {
                this.f48559a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                return this;
            }
            if (i10 == 2) {
                this.f48559a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                return this;
            }
            this.f48559a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            return this;
        }

        public e p(boolean z9) {
            this.f48559a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z9 ? 1 : 0);
            return this;
        }

        public e q(Context context, int i10, int i11) {
            this.f48562d = ActivityOptions.makeCustomAnimation(context, i10, i11);
            return this;
        }

        public e r(boolean z9) {
            this.f48559a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z9);
            return this;
        }

        public e(f fVar) {
            if (fVar != null) {
                l(fVar);
            }
        }
    }
}
