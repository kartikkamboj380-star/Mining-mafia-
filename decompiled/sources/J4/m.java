package J4;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends AbstractSafeParcelable {
    public static final Parcelable.Creator<m> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f2283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC0739b f2284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f2286k;

    public m(Intent intent, InterfaceC0739b interfaceC0739b) {
        this(null, null, null, null, null, null, null, intent, com.google.android.gms.dynamic.b.N0(interfaceC0739b).asBinder(), false, new Bundle());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f2276a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.f2277b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f2278c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f2279d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f2280e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f2281f, false);
        SafeParcelWriter.writeString(parcel, 8, this.f2282g, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f2283h, i10, false);
        SafeParcelWriter.writeIBinder(parcel, 10, com.google.android.gms.dynamic.b.N0(this.f2284i).asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f2285j);
        SafeParcelWriter.writeBundle(parcel, 12, this.f2286k, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z9, Bundle bundle) {
        this.f2276a = str;
        this.f2277b = str2;
        this.f2278c = str3;
        this.f2279d = str4;
        this.f2280e = str5;
        this.f2281f = str6;
        this.f2282g = str7;
        this.f2283h = intent;
        this.f2284i = (InterfaceC0739b) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder));
        this.f2285j = z9;
        this.f2286k = bundle;
    }

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC0739b interfaceC0739b) {
        this(str, str2, str3, str4, str5, str6, str7, null, com.google.android.gms.dynamic.b.N0(interfaceC0739b).asBinder(), false, new Bundle());
    }
}
