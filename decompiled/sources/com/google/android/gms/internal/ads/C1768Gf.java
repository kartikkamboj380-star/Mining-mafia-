package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1768Gf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C1768Gf> CREATOR = new C1820Hf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ParcelFileDescriptor f19081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19085e;

    public C1768Gf() {
        this(null, false, false, 0L, false);
    }

    public final synchronized boolean J() {
        return this.f19083c;
    }

    public final synchronized long N() {
        return this.f19084d;
    }

    public final synchronized boolean Q() {
        return this.f19085e;
    }

    public final synchronized InputStream a() {
        if (this.f19081a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f19081a);
        this.f19081a = null;
        return autoCloseInputStream;
    }

    final synchronized ParcelFileDescriptor j() {
        return this.f19081a;
    }

    public final synchronized boolean v() {
        return this.f19082b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, j(), i10, false);
        SafeParcelWriter.writeBoolean(parcel, 3, v());
        SafeParcelWriter.writeBoolean(parcel, 4, J());
        SafeParcelWriter.writeLong(parcel, 5, N());
        SafeParcelWriter.writeBoolean(parcel, 6, Q());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final synchronized boolean zza() {
        return this.f19081a != null;
    }

    public C1768Gf(ParcelFileDescriptor parcelFileDescriptor, boolean z9, boolean z10, long j10, boolean z11) {
        this.f19081a = parcelFileDescriptor;
        this.f19082b = z9;
        this.f19083c = z10;
        this.f19084d = j10;
        this.f19085e = z11;
    }
}
