package com.google.android.gms.internal.consent_sdk;

import W5.c;
import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaq {
    static final zzdw zza = zzdw.zzj(AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    private final Application zzb;
    private final SharedPreferences zzc;
    private final Set zzd;

    zzaq(Application application) {
        this.zzb = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = sharedPreferences;
        this.zzd = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    public final c.EnumC0110c zzb() {
        return c.EnumC0110c.valueOf(this.zzc.getString("privacy_options_requirement_status", c.EnumC0110c.UNKNOWN.name()));
    }

    public final Map zzc() {
        String string;
        Set<String> stringSet = this.zzc.getStringSet("stored_info", zzdw.zzi());
        if (stringSet.isEmpty()) {
            stringSet = zza;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.zzb;
            zzcu zzcuVarZza = zzcw.zza(application, str);
            if (zzcuVarZza == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str)));
            } else {
                Object obj = application.getSharedPreferences(zzcuVarZza.zza, 0).getAll().get(zzcuVarZza.zzb);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str)));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str)));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public final Set zzd() {
        return this.zzd;
    }

    public final void zze() {
        Application application = this.zzb;
        Set set = this.zzd;
        zzcw.zzb(application, set);
        set.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
    }

    public final void zzf() {
        this.zzc.edit().putStringSet("written_values", this.zzd).commit();
    }

    public final void zzg(int i10) {
        this.zzc.edit().putInt("consent_status", i10).commit();
    }

    public final void zzh(boolean z9) {
        this.zzc.edit().putBoolean("is_pub_misconfigured", z9).commit();
    }

    public final void zzi(c.EnumC0110c enumC0110c) {
        this.zzc.edit().putString("privacy_options_requirement_status", enumC0110c.name()).commit();
    }

    public final void zzj(Set set) {
        this.zzc.edit().putStringSet("stored_info", set).commit();
    }

    public final boolean zzk() {
        return this.zzc.getBoolean("is_pub_misconfigured", false);
    }
}
