package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class C6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z9 = false;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String strCreateString = "";
        String strCreateString2 = strCreateString;
        String strCreateString3 = strCreateString2;
        String strCreateString4 = strCreateString3;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        Boolean booleanObject = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString11 = null;
        String strCreateString12 = null;
        int i13 = 100;
        boolean z12 = true;
        boolean z13 = true;
        long j17 = -2147483648L;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    j17 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 33:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 14:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 15:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 18:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 21:
                    booleanObject = SafeParcelReader.readBooleanObject(parcel, header);
                    break;
                case 22:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 23:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 25:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 28:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 30:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    j15 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 35:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    j16 = SafeParcelReader.readLong(parcel, header);
                    break;
                case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new B6(strCreateString5, strCreateString6, strCreateString7, strCreateString8, j10, j11, strCreateString9, z12, z9, j17, strCreateString10, j12, i10, z13, z10, booleanObject, j13, arrayListCreateStringList, strCreateString, strCreateString2, strCreateString11, z11, j14, i13, strCreateString3, i11, j15, strCreateString12, strCreateString4, j16, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new B6[i10];
    }
}
