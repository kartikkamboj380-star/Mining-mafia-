package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1924Jf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C1924Jf> CREATOR = new C1976Kf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f19959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f19962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19963j;

    C1924Jf(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z9, long j11, String str5, int i10) {
        this.f19954a = str;
        this.f19955b = j10;
        this.f19956c = str2 == null ? "" : str2;
        this.f19957d = str3 == null ? "" : str3;
        this.f19958e = str4 == null ? "" : str4;
        this.f19959f = bundle == null ? new Bundle() : bundle;
        this.f19960g = z9;
        this.f19961h = j11;
        this.f19962i = str5;
        this.f19963j = i10;
    }

    public static C1924Jf a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                String string = sb.toString();
                int i10 = AbstractC0786o0.f2696b;
                L4.p.f(string);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j10 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new C1924Jf(queryParameter, j10, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e10) {
            e = e10;
            int i11 = AbstractC0786o0.f2696b;
            L4.p.g("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e11) {
            e = e11;
            int i12 = AbstractC0786o0.f2696b;
            L4.p.g("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f19954a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f19955b);
        SafeParcelWriter.writeString(parcel, 4, this.f19956c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f19957d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f19958e, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f19959f, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f19960g);
        SafeParcelWriter.writeLong(parcel, 9, this.f19961h);
        SafeParcelWriter.writeString(parcel, 10, this.f19962i, false);
        SafeParcelWriter.writeInt(parcel, 11, this.f19963j);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
