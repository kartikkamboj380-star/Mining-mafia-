package com.google.android.gms.internal.ads;

import H4.C0603h1;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2905ar implements Parcelable.Creator {
    public static final C2725Yq a(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        H4.h2 h2Var = null;
        H4.m2 m2Var = null;
        String strCreateString = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        L4.a aVar = null;
        Bundle bundleCreateBundle2 = null;
        ArrayList<String> arrayListCreateStringList = null;
        Bundle bundleCreateBundle3 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        ArrayList<String> arrayListCreateStringList2 = null;
        String strCreateString7 = null;
        C2191Oj c2191Oj = null;
        ArrayList<String> arrayListCreateStringList3 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        Bundle bundleCreateBundle4 = null;
        String strCreateString11 = null;
        C0603h1 c0603h1 = null;
        Bundle bundleCreateBundle5 = null;
        String strCreateString12 = null;
        String strCreateString13 = null;
        String strCreateString14 = null;
        ArrayList<Integer> arrayListCreateIntegerList = null;
        String strCreateString15 = null;
        ArrayList<String> arrayListCreateStringList4 = null;
        ArrayList<String> arrayListCreateStringList5 = null;
        String strCreateString16 = null;
        C2353Rm c2353Rm = null;
        String strCreateString17 = null;
        Bundle bundleCreateBundle6 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i16 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i17 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 3:
                    h2Var = (H4.h2) SafeParcelReader.createParcelable(parcel, header, H4.h2.CREATOR);
                    break;
                case 4:
                    m2Var = (H4.m2) SafeParcelReader.createParcelable(parcel, header, H4.m2.CREATOR);
                    break;
                case 5:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel, header, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel, header, PackageInfo.CREATOR);
                    break;
                case 8:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 11:
                    aVar = (L4.a) SafeParcelReader.createParcelable(parcel, header, L4.a.CREATOR);
                    break;
                case 12:
                    bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 13:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 15:
                    bundleCreateBundle3 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 16:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 17:
                case 22:
                case 23:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                case 62:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 18:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 19:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 21:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 26:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    arrayListCreateStringList2 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 28:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 29:
                    c2191Oj = (C2191Oj) SafeParcelReader.createParcelable(parcel, header, C2191Oj.CREATOR);
                    break;
                case 30:
                    arrayListCreateStringList3 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 33:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    f11 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 35:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 36:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 39:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 40:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 41:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 44:
                    bundleCreateBundle4 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 46:
                    c0603h1 = (C0603h1) SafeParcelReader.createParcelable(parcel, header, C0603h1.CREATOR);
                    break;
                case 47:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 48:
                    bundleCreateBundle5 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 49:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 50:
                    strCreateString13 = SafeParcelReader.createString(parcel, header);
                    break;
                case 51:
                    strCreateString14 = SafeParcelReader.createString(parcel, header);
                    break;
                case 52:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 53:
                    arrayListCreateIntegerList = SafeParcelReader.createIntegerList(parcel, header);
                    break;
                case 54:
                    strCreateString15 = SafeParcelReader.createString(parcel, header);
                    break;
                case 55:
                    arrayListCreateStringList4 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 56:
                    i17 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 57:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 58:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 59:
                    z17 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 60:
                    arrayListCreateStringList5 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 61:
                    strCreateString16 = SafeParcelReader.createString(parcel, header);
                    break;
                case 63:
                    c2353Rm = (C2353Rm) SafeParcelReader.createParcelable(parcel, header, C2353Rm.CREATOR);
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    strCreateString17 = SafeParcelReader.createString(parcel, header);
                    break;
                case 65:
                    bundleCreateBundle6 = SafeParcelReader.createBundle(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C2725Yq(i10, bundleCreateBundle, h2Var, m2Var, strCreateString, applicationInfo, packageInfo, strCreateString2, strCreateString3, strCreateString4, aVar, bundleCreateBundle2, i11, arrayListCreateStringList, bundleCreateBundle3, z9, i12, i13, f10, strCreateString5, j10, strCreateString6, arrayListCreateStringList2, strCreateString7, c2191Oj, arrayListCreateStringList3, j11, strCreateString8, f11, z10, i14, i15, z11, strCreateString9, strCreateString10, z12, i16, bundleCreateBundle4, strCreateString11, c0603h1, z13, bundleCreateBundle5, strCreateString12, strCreateString13, strCreateString14, z14, arrayListCreateIntegerList, strCreateString15, arrayListCreateStringList4, i17, z15, z16, z17, arrayListCreateStringList5, strCreateString16, c2353Rm, strCreateString17, bundleCreateBundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2725Yq[i10];
    }
}
