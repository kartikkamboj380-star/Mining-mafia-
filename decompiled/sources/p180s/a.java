package p180s;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f48510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f48511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f48512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f48513d;

    /* JADX INFO: renamed from: s.a$a, reason: collision with other inner class name */
    public static final class C0526a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f48514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f48515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f48516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f48517d;

        public a a() {
            return new a(this.f48514a, this.f48515b, this.f48516c, this.f48517d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f48510a = num;
        this.f48511b = num2;
        this.f48512c = num3;
        this.f48513d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f48510a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f48511b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f48512c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f48513d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
