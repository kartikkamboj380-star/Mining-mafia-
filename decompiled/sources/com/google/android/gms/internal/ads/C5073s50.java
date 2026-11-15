package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5073s50 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f33108b;

    C5073s50(Context context, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        this.f33107a = context;
        this.f33108b = interfaceExecutorServiceC1805Gx0;
    }

    final /* synthetic */ C4822q50 a() {
        Bundle bundle;
        G4.t.g();
        String string = !((Boolean) H4.B.c().d(AbstractC3892ii.f29746Y6)).booleanValue() ? "" : this.f33107a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) H4.B.c().d(AbstractC3892ii.f29767a7)).booleanValue() ? this.f33107a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        G4.t.g();
        Context context = this.f33107a;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29756Z6)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new C4822q50(string, string2, bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f33108b.e0(new Callable() { // from class: com.google.android.gms.internal.ads.r50
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f32782a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 18;
    }
}
