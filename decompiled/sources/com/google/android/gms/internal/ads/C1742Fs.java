package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1742Fs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C1742Fs> CREATOR = new C1794Gs();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f18857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f18860h;

    public C1742Fs(String str, String str2, boolean z9, boolean z10, List list, boolean z11, boolean z12, List list2) {
        this.f18853a = str;
        this.f18854b = str2;
        this.f18855c = z9;
        this.f18856d = z10;
        this.f18857e = list;
        this.f18858f = z11;
        this.f18859g = z12;
        this.f18860h = list2 == null ? new ArrayList() : list2;
    }

    public static C1742Fs a(JSONObject jSONObject) {
        return new C1742Fs(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), K4.S.a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), K4.S.a(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f18853a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.f18854b, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f18855c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f18856d);
        SafeParcelWriter.writeStringList(parcel, 6, this.f18857e, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f18858f);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f18859g);
        SafeParcelWriter.writeStringList(parcel, 9, this.f18860h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
