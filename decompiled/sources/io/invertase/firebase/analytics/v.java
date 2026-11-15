package io.invertase.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tenjin.android.config.TenjinConsts;
import java.util.EnumMap;
import java.util.Set;
import java.util.concurrent.Callable;
import p176r5.AbstractC7096m;

/* JADX INFO: loaded from: classes3.dex */
public class v extends io.invertase.firebase.common.b {
    v(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void o(String str, Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).c(str, bundle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void p() {
        FirebaseAnalytics.getInstance(a()).d();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void q(Boolean bool) {
        FirebaseAnalytics.getInstance(a()).e(bool.booleanValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void r(Bundle bundle) {
        boolean z9 = bundle.getBoolean("analytics_storage");
        boolean z10 = bundle.getBoolean("ad_storage");
        boolean z11 = bundle.getBoolean(TenjinConsts.TENJIN_GOOGLE_AD_USER_DATA);
        boolean z12 = bundle.getBoolean(TenjinConsts.TENJIN_GOOGLE_AD_PERSONALIZATION);
        EnumMap enumMap = new EnumMap(FirebaseAnalytics.b.class);
        enumMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, z9 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_STORAGE, z10 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_USER_DATA, z11 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_PERSONALIZATION, z12 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        FirebaseAnalytics.getInstance(a()).f(enumMap);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void s(Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).g(bundle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void t(long j10) {
        FirebaseAnalytics.getInstance(a()).h(j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void u(String str) {
        FirebaseAnalytics.getInstance(a()).i(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void v(Bundle bundle) {
        Set<String> setKeySet = bundle.keySet();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(a());
        for (String str : setKeySet) {
            firebaseAnalytics.j(str, (String) bundle.get(str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void w(String str, String str2) {
        FirebaseAnalytics.getInstance(a()).j(str, str2);
        return null;
    }

    Task A(final Bundle bundle) {
        return AbstractC7096m.c(new Callable() { // from class: io.invertase.firebase.analytics.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45163a.r(bundle);
            }
        });
    }

    Task B(final Bundle bundle) {
        return AbstractC7096m.c(new Callable() { // from class: io.invertase.firebase.analytics.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45175a.s(bundle);
            }
        });
    }

    Task C(final long j10) {
        return AbstractC7096m.c(new Callable() { // from class: io.invertase.firebase.analytics.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45177a.t(j10);
            }
        });
    }

    Task D(final String str) {
        return AbstractC7096m.c(new Callable() { // from class: io.invertase.firebase.analytics.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45167a.u(str);
            }
        });
    }

    Task E(final Bundle bundle) {
        return AbstractC7096m.c(new Callable() { // from class: io.invertase.firebase.analytics.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45160a.v(bundle);
            }
        });
    }

    Task F(final String str, final String str2) {
        return AbstractC7096m.c(new Callable() { // from class: io.invertase.firebase.analytics.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45172a.w(str, str2);
            }
        });
    }

    Task m() {
        return FirebaseAnalytics.getInstance(a()).a();
    }

    Task n() {
        return FirebaseAnalytics.getInstance(a()).b();
    }

    Task x(final String str, final Bundle bundle) {
        return AbstractC7096m.c(new Callable() { // from class: io.invertase.firebase.analytics.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45169a.o(str, bundle);
            }
        });
    }

    Task y() {
        return AbstractC7096m.c(new Callable() { // from class: io.invertase.firebase.analytics.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45162a.p();
            }
        });
    }

    Task z(final Boolean bool) {
        return AbstractC7096m.c(new Callable() { // from class: io.invertase.firebase.analytics.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45165a.q(bool);
            }
        });
    }
}
