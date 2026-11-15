package com.google.android.gms.internal.ads;

import K4.AbstractC0763d;
import K4.AbstractC0786o0;
import K4.InterfaceC0790q0;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1950Js implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f20009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0790q0 f20010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f20011d = "-1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20012e = -1;

    SharedPreferencesOnSharedPreferenceChangeListenerC1950Js(Context context, InterfaceC0790q0 interfaceC0790q0) {
        this.f20009b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f20010c = interfaceC0790q0;
        this.f20008a = context;
    }

    private final void b(String str, int i10) {
        Context context;
        boolean z9 = true;
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29816f1)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z9 = false;
        }
        this.f20010c.Q(z9);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29822f7)).booleanValue() && z9 && (context = this.f20008a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    private final void c() {
        this.f20010c.Q(true);
        AbstractC0763d.a(this.f20008a);
    }

    final void a() {
        SharedPreferences sharedPreferences = this.f20009b;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29838h1)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, AndroidTcfDataSource.TCF_TCSTRING_KEY);
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        byte b10;
        try {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29838h1)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    InterfaceC0790q0 interfaceC0790q0 = this.f20010c;
                    if (i10 != interfaceC0790q0.A()) {
                        c();
                    }
                    interfaceC0790q0.D0(i10);
                    return;
                }
                if (Objects.equals(str, AndroidTcfDataSource.TCF_TCSTRING_KEY)) {
                    String string = sharedPreferences.getString(str, "-1");
                    InterfaceC0790q0 interfaceC0790q1 = this.f20010c;
                    if (!Objects.equals(string, interfaceC0790q1.y())) {
                        c();
                    }
                    interfaceC0790q1.M0(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i11 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (strValueOf.equals("IABTCF_PurposeConsents")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                if (string2.equals("-1") || this.f20011d.equals(string2)) {
                    return;
                }
                this.f20011d = string2;
                b(string2, i11);
                return;
            }
            if (b10 != 1) {
                return;
            }
            if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29816f1)).booleanValue() || i11 == -1 || this.f20012e == i11) {
                return;
            }
            this.f20012e = i11;
            b(string2, i11);
        } catch (Throwable th) {
            G4.t.l().j(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            AbstractC0786o0.l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
