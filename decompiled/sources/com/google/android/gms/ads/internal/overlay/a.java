package com.google.android.gms.ads.internal.overlay;

import G4.l;
import J4.m;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        boolean z9 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        m mVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String strCreateString = null;
        String strCreateString2 = null;
        IBinder iBinder5 = null;
        String strCreateString3 = null;
        L4.a aVar = null;
        String strCreateString4 = null;
        l lVar = null;
        IBinder iBinder6 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    mVar = (m) SafeParcelReader.createParcelable(parcel, header, m.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 7:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 11:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                    aVar = (L4.a) SafeParcelReader.createParcelable(parcel, header, L4.a.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 16:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    lVar = (l) SafeParcelReader.createParcelable(parcel, header, l.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 19:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    iBinder7 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    iBinder8 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 28:
                    iBinder9 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 29:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 30:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new AdOverlayInfoParcel(mVar, iBinder, iBinder2, iBinder3, iBinder4, strCreateString, z9, strCreateString2, iBinder5, i10, i11, strCreateString3, aVar, strCreateString4, lVar, iBinder6, strCreateString5, strCreateString6, strCreateString7, iBinder7, iBinder8, iBinder9, z10, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
