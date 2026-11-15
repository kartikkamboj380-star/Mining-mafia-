package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3063c60 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6019zb0 f27039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PackageInfo f27040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0790q0 f27041c;

    public C3063c60(C6019zb0 c6019zb0, PackageInfo packageInfo, InterfaceC0790q0 interfaceC0790q0) {
        this.f27039a = c6019zb0;
        this.f27040b = packageInfo;
        this.f27041c = interfaceC0790q0;
    }

    private final void a(Bundle bundle) {
        int i10;
        C2191Oj c2191Oj = this.f27039a.f35801j;
        if (c2191Oj == null || (i10 = c2191Oj.f21652i) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", c2191Oj.f21653j);
        bundle.putInt("sccg_dir", i10);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        C6019zb0 c6019zb0 = this.f27039a;
        ArrayList<String> arrayList = c6019zb0.f35799h;
        AF af = (AF) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            af.f17275a.putInt("native_version", 0);
            return;
        }
        Bundle bundle = af.f17275a;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", c6019zb0.f35800i);
        C2191Oj c2191Oj = c6019zb0.f35801j;
        if (c2191Oj != null) {
            String str2 = "any";
            if (c2191Oj.f21644a > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i10 = c2191Oj.f21651h;
                if (i10 == 1) {
                    str = "any";
                } else if (i10 == 2) {
                    str = "landscape";
                } else if (i10 != 3) {
                    str = i10 != 4 ? "unknown" : "square";
                } else {
                    str = "portrait";
                }
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i11 = c2191Oj.f21646c;
            if (i11 != 0) {
                if (i11 != 1) {
                    str2 = i11 != 2 ? "unknown" : "landscape";
                } else {
                    str2 = "portrait";
                }
            }
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", c2191Oj.f21647d);
            bundle.putBoolean("use_custom_mute", c2191Oj.f21650g);
            a(bundle);
        }
        PackageInfo packageInfo = this.f27040b;
        int i12 = packageInfo != null ? packageInfo.versionCode : 0;
        InterfaceC0790q0 interfaceC0790q0 = this.f27041c;
        if (i12 > interfaceC0790q0.zzg()) {
            interfaceC0790q0.g();
            interfaceC0790q0.n(i12);
        }
        JSONObject jSONObjectF = interfaceC0790q0.f();
        String string = null;
        if (jSONObjectF != null && (jSONArrayOptJSONArray = jSONObjectF.optJSONArray(c6019zb0.f35798g)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i13 = c6019zb0.f35803l;
        if (i13 > 1) {
            bundle.putInt("max_num_ads", i13);
        }
        C2353Rm c2353Rm = c6019zb0.f35793b;
        if (c2353Rm != null) {
            String str3 = c2353Rm.f22909c;
            if (TextUtils.isEmpty(str3)) {
                String str4 = "p";
                if (c2353Rm.f22907a >= 2) {
                    int i14 = c2353Rm.f22910d;
                    if (i14 == 2 || i14 != 3) {
                        str4 = "l";
                    }
                } else {
                    int i15 = c2353Rm.f22908b;
                    if (i15 == 1) {
                        str4 = "l";
                    } else if (i15 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i15).length() + 41);
                        sb.append("Instream ad video aspect ratio ");
                        sb.append(i15);
                        sb.append(" is wrong.");
                        L4.p.c(sb.toString());
                        str4 = "l";
                    }
                }
                bundle.putString("ia_var", str4);
            } else {
                bundle.putString("ad_tag", str3);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.pd)).booleanValue() || c2191Oj == null) {
            return;
        }
        H4.a2 a2Var = c2191Oj.f21649f;
        if (a2Var != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", a2Var.f1258a);
            bundle2.putBoolean("clickToExpandRequested", a2Var.f1260c);
            bundle2.putBoolean("customControlsRequested", a2Var.f1259b);
            bundle.putBundle(MimeTypes.BASE_TYPE_VIDEO, bundle2);
        }
        bundle.putBoolean("disable_image_loading", c2191Oj.f21645b);
        bundle.putInt("preferred_ad_choices_position", c2191Oj.f21648e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.f27039a.f35799h;
        AF af = (AF) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        a(af.f17276b);
    }
}
