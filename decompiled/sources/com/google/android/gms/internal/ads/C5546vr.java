package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5546vr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z9 = false;
        boolean z10 = false;
        int i10 = 0;
        Bundle bundleCreateBundle = null;
        L4.a aVar = null;
        ApplicationInfo applicationInfo = null;
        String strCreateString = null;
        ArrayList<String> arrayListCreateStringList = null;
        PackageInfo packageInfo = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        C5769xc0 c5769xc0 = null;
        String strCreateString4 = null;
        Bundle bundleCreateBundle2 = null;
        Bundle bundleCreateBundle3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 2:
                    aVar = (L4.a) SafeParcelReader.createParcelable(parcel, header, L4.a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel, header, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel, header, PackageInfo.CREATOR);
                    break;
                case 7:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 9:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    c5769xc0 = (C5769xc0) SafeParcelReader.createParcelable(parcel, header, C5769xc0.CREATOR);
                    break;
                case 11:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 12:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 14:
                    bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 15:
                    bundleCreateBundle3 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 16:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C5420ur(bundleCreateBundle, aVar, applicationInfo, strCreateString, arrayListCreateStringList, packageInfo, strCreateString2, strCreateString3, c5769xc0, strCreateString4, z9, z10, bundleCreateBundle2, bundleCreateBundle3, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5420ur[i10];
    }
}
